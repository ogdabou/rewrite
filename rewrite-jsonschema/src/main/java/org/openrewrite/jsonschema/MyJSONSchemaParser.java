package org.openrewrite.jsonschema;

import org.antlr.v4.runtime.*;
import org.openrewrite.ExecutionContext;
import org.openrewrite.Parser;
import org.openrewrite.SourceFile;
import org.openrewrite.Tree;
import org.openrewrite.internal.lang.Nullable;
import org.openrewrite.jsonschema.internal.grammar.JSONSChemaLexer;
import org.openrewrite.jsonschema.internal.grammar.JSONSchemaParser;
import org.openrewrite.jsonschema.internal.grammar.JSONSchemaParserVisitor;
import org.openrewrite.jsonschema.tree.JsonSchema;
import org.openrewrite.jsonschema.tree.MyJsonSchemaVisitor;
import org.openrewrite.tree.ParseError;
import org.openrewrite.tree.ParsingEventListener;
import org.openrewrite.tree.ParsingExecutionContextView;

import java.io.InputStream;
import java.nio.file.Path;
import java.util.stream.Stream;

public class MyJSONSchemaParser implements Parser {

    @Override
    public Stream<SourceFile> parseInputs(Iterable<Input> sources, @Nullable Path relativeTo, ExecutionContext ctx) {
        ParsingEventListener parsingEventListener = ParsingExecutionContextView.view(ctx).getParsingListener();

        return acceptedInputs(sources).map(input -> {
//           parsingEventListener.startedParsing(input);
            try (InputStream sourceStream = input.getSource(ctx)) {
                JSONSchemaParser parser = new JSONSchemaParser(new CommonTokenStream(new JSONSChemaLexer(
                        CharStreams.fromStream(sourceStream))));

                new MyJsonSchemaVisitor().visitJsonSchema(parser.jsonSchema());

                // check json schema draft version
                return null;



            } catch (Throwable t) {
                ctx.getOnError().accept(t);
                return ParseError.build(this, input, relativeTo, ctx, t);
            }
        });

//        return null;
    }


    @Override
    public boolean accept(Path path) {
        return path.toString().endsWith(".json");
    }

    @Override
    public Path sourcePathFromSourceText(Path prefix, String sourceCode) {
        return null;
    }
}
