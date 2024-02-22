package org.openrewrite.jsonschema.tree;

import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.openrewrite.jsonschema.internal.grammar.JSONSchemaParser;
import org.openrewrite.jsonschema.internal.grammar.JSONSchemaParserBaseVisitor;

public class MyJsonSchemaVisitor extends JSONSchemaParserBaseVisitor<JsonSchema> {

    @Override
    public JsonSchema visitJsonSchema(JSONSchemaParser.JsonSchemaContext ctx) {
        return super.visitJsonSchema(ctx);
    }

    @Override
    public JsonSchema visitSchemaObject(JSONSchemaParser.SchemaObjectContext ctx) {
        return super.visitSchemaObject(ctx);
    }

    @Override
    public JsonSchema visitSchemaElements(JSONSchemaParser.SchemaElementsContext ctx) {
        return super.visitSchemaElements(ctx);
    }

    @Override
    public JsonSchema visitSchemaElement(JSONSchemaParser.SchemaElementContext ctx) {
        return super.visitSchemaElement(ctx);
    }

    @Override
    public JsonSchema visitIdElement(JSONSchemaParser.IdElementContext ctx) {
        return super.visitIdElement(ctx);
    }

    @Override
    public JsonSchema visitSchemaAttribute(JSONSchemaParser.SchemaAttributeContext ctx) {
        return super.visitSchemaAttribute(ctx);
    }

    @Override
    public JsonSchema visitTitleElement(JSONSchemaParser.TitleElementContext ctx) {
        return super.visitTitleElement(ctx);
    }

    @Override
    public JsonSchema visitContainsElement(JSONSchemaParser.ContainsElementContext ctx) {
        return super.visitContainsElement(ctx);
    }

    @Override
    public JsonSchema visitDescriptionElement(JSONSchemaParser.DescriptionElementContext ctx) {
        return super.visitDescriptionElement(ctx);
    }

    @Override
    public JsonSchema visitDynamicAnchorElement(JSONSchemaParser.DynamicAnchorElementContext ctx) {
        return super.visitDynamicAnchorElement(ctx);
    }

    @Override
    public JsonSchema visitSTRING_LITERAL(JSONSchemaParser.STRING_LITERALContext ctx) {
        return super.visitSTRING_LITERAL(ctx);
    }

    @Override
    public JsonSchema visitTypeElement(JSONSchemaParser.TypeElementContext ctx) {
        return super.visitTypeElement(ctx);
    }

    @Override
    public JsonSchema visitPropertiesElement(JSONSchemaParser.PropertiesElementContext ctx) {
        return super.visitPropertiesElement(ctx);
    }

    @Override
    public JsonSchema visitAdditionalPropertiesElement(JSONSchemaParser.AdditionalPropertiesElementContext ctx) {
        return super.visitAdditionalPropertiesElement(ctx);
    }

    @Override
    public JsonSchema visitItemsElement(JSONSchemaParser.ItemsElementContext ctx) {
        return super.visitItemsElement(ctx);
    }

    @Override
    public JsonSchema visitEnumElement(JSONSchemaParser.EnumElementContext ctx) {
        return super.visitEnumElement(ctx);
    }

    @Override
    public JsonSchema visitFormatElement(JSONSchemaParser.FormatElementContext ctx) {
        return super.visitFormatElement(ctx);
    }

    @Override
    public JsonSchema visitMinimumElement(JSONSchemaParser.MinimumElementContext ctx) {
        return super.visitMinimumElement(ctx);
    }

    @Override
    public JsonSchema visitMaximumElement(JSONSchemaParser.MaximumElementContext ctx) {
        return super.visitMaximumElement(ctx);
    }

    @Override
    public JsonSchema visitMultipleOfElement(JSONSchemaParser.MultipleOfElementContext ctx) {
        return super.visitMultipleOfElement(ctx);
    }

    @Override
    public JsonSchema visitMinLengthElement(JSONSchemaParser.MinLengthElementContext ctx) {
        return super.visitMinLengthElement(ctx);
    }

    @Override
    public JsonSchema visitMaxLengthElement(JSONSchemaParser.MaxLengthElementContext ctx) {
        return super.visitMaxLengthElement(ctx);
    }

    @Override
    public JsonSchema visitPatternElement(JSONSchemaParser.PatternElementContext ctx) {
        return super.visitPatternElement(ctx);
    }

    @Override
    public JsonSchema visitRefElement(JSONSchemaParser.RefElementContext ctx) {
        return super.visitRefElement(ctx);
    }

    @Override
    public JsonSchema visitDefinitionsElement(JSONSchemaParser.DefinitionsElementContext ctx) {
        return super.visitDefinitionsElement(ctx);
    }

    @Override
    public JsonSchema visitDefsElement(JSONSchemaParser.DefsElementContext ctx) {
        return super.visitDefsElement(ctx);
    }

    @Override
    public JsonSchema visitDependenciesElement(JSONSchemaParser.DependenciesElementContext ctx) {
        return super.visitDependenciesElement(ctx);
    }

    @Override
    public JsonSchema visitConstElement(JSONSchemaParser.ConstElementContext ctx) {
        return super.visitConstElement(ctx);
    }

    @Override
    public JsonSchema visitNullableElement(JSONSchemaParser.NullableElementContext ctx) {
        return super.visitNullableElement(ctx);
    }

    @Override
    public JsonSchema visitRequiredElement(JSONSchemaParser.RequiredElementContext ctx) {
        return super.visitRequiredElement(ctx);
    }

    @Override
    public JsonSchema visitOneOfElement(JSONSchemaParser.OneOfElementContext ctx) {
        return super.visitOneOfElement(ctx);
    }

    @Override
    public JsonSchema visitAllOfElement(JSONSchemaParser.AllOfElementContext ctx) {
        return super.visitAllOfElement(ctx);
    }

    @Override
    public JsonSchema visitAnyOfElement(JSONSchemaParser.AnyOfElementContext ctx) {
        return super.visitAnyOfElement(ctx);
    }

    @Override
    public JsonSchema visitUnionTypeElement(JSONSchemaParser.UnionTypeElementContext ctx) {
        return super.visitUnionTypeElement(ctx);
    }

    @Override
    public JsonSchema visitNullType(JSONSchemaParser.NullTypeContext ctx) {
        return super.visitNullType(ctx);
    }

    @Override
    public JsonSchema visitArray(JSONSchemaParser.ArrayContext ctx) {
        return super.visitArray(ctx);
    }

    @Override
    public JsonSchema visitObject(JSONSchemaParser.ObjectContext ctx) {
        return super.visitObject(ctx);
    }

    @Override
    public JsonSchema visit(ParseTree tree) {
        return super.visit(tree);
    }

    @Override
    public JsonSchema visitChildren(RuleNode node) {
        return super.visitChildren(node);
    }

    @Override
    public JsonSchema visitTerminal(TerminalNode node) {
        return super.visitTerminal(node);
    }

    @Override
    public JsonSchema visitErrorNode(ErrorNode node) {
        return super.visitErrorNode(node);
    }
}
