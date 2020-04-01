package org.openrewrite.git;

import io.micrometer.core.instrument.Metrics;
import io.micrometer.core.instrument.Timer;
import org.kohsuke.github.GHContent;
import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;
import org.openrewrite.Change;
import org.openrewrite.ChangePublisher;
import org.openrewrite.Metadata;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.Map;

/**
 * Uses the GitHub update content API, which posts a commit for each changed file per repository.
 * This publisher is best suited for changes to a single file per repository. Otherwise, multiple commits
 * are generated, one for each changed file.
 */
public class GithubChangePublisher implements ChangePublisher {
    private static final Logger logger = LoggerFactory.getLogger(GithubChangePublisher.class);

    private final GitHub github;
    private final String commitMessage;
    private final boolean verifyOriginal;

    public GithubChangePublisher(GitHub github, String commitMessage) {
        this(github, commitMessage, true);
    }

    public GithubChangePublisher(GitHub github, String commitMessage, boolean verifyOriginal) {
        this.github = github;
        this.commitMessage = commitMessage;
        this.verifyOriginal = verifyOriginal;
    }

    @Override
    public void publish(Collection<Change<?>> changes) {
        changes.forEach(this::publishEach);
    }

    public void publishEach(Change<?> change) {
        Timer.Sample sample = Timer.start();
        Map<Metadata, String> metadata = change.getFixed().getMetadata();
        String organization = metadata.getOrDefault(GithubMetadata.ORGANIZATION, null);
        String repository = metadata.getOrDefault(GithubMetadata.REPOSITORY, null);

        if(organization == null || repository == null) {
            return;
        }

        Timer.Builder timer = Timer.builder("rewrite.publish.github")
                .description("Individual source file changes published directly to the GitHub 'Create or update a file' API")
                .tag("organization", organization)
                .tag("repository", repository)
                .tag("file.type", change.getFixed().getFileType());

        try {
            GHRepository ghRepo = github.getRepository(organization + "/" + repository);

            try {
                GHContent fileContent = ghRepo.getFileContent(change.getFixed().getSourcePath());

                if (verifyOriginal && change.getOriginal() != null) {
                    if(!change.getOriginal().print().equals(new String(fileContent.read().readAllBytes(), StandardCharsets.UTF_8))) {
                        logger.warn("Attempting to make a change to " + organization +
                                "/" + repository + ":" + change.getOriginal().getSourcePath() +
                                " in repository, but the contents in GitHub do not match the original source");
                        sample.stop(timer.tag("outcome", "Original not up-to-date").register(Metrics.globalRegistry));
                        return;
                    }
                    else {
                        logger.info("Change is already present in " + organization + "/" + repository + ":" + change.getFixed().getSourcePath() + " in GitHub");
                        sample.stop(timer.tag("outcome", "Already changed").register(Metrics.globalRegistry));
                        return;
                    }
                }

                fileContent.update(change.getFixed().print(), commitMessage);
                logger.info("Published change " + organization + "/" + repository + ":" + change.getFixed().getSourcePath() + " to GitHub");
                sample.stop(timer.tag("outcome", "Updated").register(Metrics.globalRegistry));
            } catch (FileNotFoundException ignored) {
                if (verifyOriginal && change.getOriginal() != null) {
                    logger.warn("Attempting to make a change to " + organization +
                            "/" + repository + ":" + change.getOriginal().getSourcePath() +
                            " in repository, but the file unexpectedly does not exist in GitHub");
                    sample.stop(timer.tag("outcome", "Original does not exist in remote").register(Metrics.globalRegistry));
                    return;
                }

                ghRepo.createContent()
                        .branch("master")
                        .path(change.getFixed().getSourcePath())
                        .content(change.getFixed().print())
                        .message(commitMessage)
                        .commit();
                logger.info("Published change " + organization + "/" + repository + ":" + change.getFixed().getSourcePath() + " to GitHub");
                sample.stop(timer.tag("outcome", "Success").register(Metrics.globalRegistry));
            }
        } catch (IOException e) {
            logger.warn("Unable to connect to GitHub repository " + organization + "/" + repository, e);
            sample.stop(timer.tag("outcome", "Failed to connect to repository").register(Metrics.globalRegistry));
        }
    }
}
