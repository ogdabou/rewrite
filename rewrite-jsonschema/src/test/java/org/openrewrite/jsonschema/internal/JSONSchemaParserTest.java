package org.openrewrite.jsonschema.internal;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.openrewrite.jsonschema.internal.grammar.JSONSChemaLexer;
import org.openrewrite.jsonschema.internal.grammar.JSONSchemaParser;
import org.openrewrite.jsonschema.tree.MyJsonSchemaVisitor;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

public class JSONSchemaParserTest {


    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class JsonSchemaTestSuite {
        private String description;
        private String schema;
        private String tests;
    }

    private static Stream<Arguments> providePathsToTest() throws IOException {
        return Files.walk(Paths.get("src/test/resources/jsonschema-test-suite/tests/draft2020-12"))
          .filter(path -> path.toFile().isFile())
          .filter(path -> path.toString().endsWith(".json"))
          .map(Arguments::of);
    }

    @ParameterizedTest
    @MethodSource("providePathsToTest")
    public void jsonSchemaTestSuite(Path input) throws IOException {
        System.out.println(input);

        ObjectMapper mapper = new ObjectMapper();

        JsonNode inputTestJsonDef =  mapper.readTree(input.toFile());
        while(inputTestJsonDef.iterator().hasNext()) {
            JsonNode testSuite = inputTestJsonDef.iterator().next();

            JSONSchemaParser parser = new JSONSchemaParser(new CommonTokenStream(new JSONSChemaLexer(
              CharStreams.fromString(testSuite.get("schema").toString()))));

            new MyJsonSchemaVisitor().visitJsonSchema(parser.jsonSchema());
        }

    }

}
