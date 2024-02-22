import org.ajoberstar.grgit.Grgit

plugins {
    id("org.openrewrite.build.language-library")
    id("org.ajoberstar.grgit.service") version ("5.2.2")
}

tasks.register("cloneJsonschemaTestSuite", CloneJsonSchemaTestSuiteRepositoryTask::class) {
    group = "generate-test-resources"
    description = "Fetches JsonSchema test suite to test the parser"
}

open class CloneJsonSchemaTestSuiteRepositoryTask : DefaultTask() {
    @TaskAction
    fun run() {
        val destination = project.file("src/test/resources/jsonschema-test-suite")
         if (destination.exists()) {
             Grgit.clone {
                 uri = "https://github.com/json-schema-org/JSON-Schema-Test-Suite.git"
                 dir = destination
             }
             println("Cloned jsonschema test suite")
         }
    }
}

tasks.register<JavaExec>("generateAntlrSources") {
    mainClass.set("org.antlr.v4.Tool")

    args = listOf(
            "-o", "src/main/java/org/openrewrite/protobuf/internal/grammar",
            "-package", "org.openrewrite.protobuf.internal.grammar",
            "-visitor"
    ) + fileTree("src/main/antlr").matching { include("**/*.g4") }.map { it.path }

    classpath = sourceSets["main"].runtimeClasspath
}

dependencies {
    api(project(":rewrite-core"))
    api("org.jetbrains:annotations:latest.release")
    api("com.fasterxml.jackson.core:jackson-annotations")

    compileOnly(project(":rewrite-test"))

    implementation("org.antlr:antlr4-runtime:4.11.1")
    implementation("io.micrometer:micrometer-core:1.9.+")

    testImplementation(project(":rewrite-test"))
}
