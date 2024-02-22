package org.openrewrite.protobuf.internal.grammar;// Generated from /home/acouty/git/personnal/rewrite/rewrite-jsonschema/src/main/antlr/JSONSchemaParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JSONSchemaParser}.
 */
public interface JSONSchemaParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JSONSchemaParser#jsonSchema}.
	 * @param ctx the parse tree
	 */
	void enterJsonSchema(JSONSchemaParser.JsonSchemaContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONSchemaParser#jsonSchema}.
	 * @param ctx the parse tree
	 */
	void exitJsonSchema(JSONSchemaParser.JsonSchemaContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONSchemaParser#schemaObject}.
	 * @param ctx the parse tree
	 */
	void enterSchemaObject(JSONSchemaParser.SchemaObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONSchemaParser#schemaObject}.
	 * @param ctx the parse tree
	 */
	void exitSchemaObject(JSONSchemaParser.SchemaObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONSchemaParser#schemaElements}.
	 * @param ctx the parse tree
	 */
	void enterSchemaElements(JSONSchemaParser.SchemaElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONSchemaParser#schemaElements}.
	 * @param ctx the parse tree
	 */
	void exitSchemaElements(JSONSchemaParser.SchemaElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONSchemaParser#schemaElement}.
	 * @param ctx the parse tree
	 */
	void enterSchemaElement(JSONSchemaParser.SchemaElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONSchemaParser#schemaElement}.
	 * @param ctx the parse tree
	 */
	void exitSchemaElement(JSONSchemaParser.SchemaElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONSchemaParser#idElement}.
	 * @param ctx the parse tree
	 */
	void enterIdElement(JSONSchemaParser.IdElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONSchemaParser#idElement}.
	 * @param ctx the parse tree
	 */
	void exitIdElement(JSONSchemaParser.IdElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONSchemaParser#schemaAttribute}.
	 * @param ctx the parse tree
	 */
	void enterSchemaAttribute(JSONSchemaParser.SchemaAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONSchemaParser#schemaAttribute}.
	 * @param ctx the parse tree
	 */
	void exitSchemaAttribute(JSONSchemaParser.SchemaAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONSchemaParser#titleElement}.
	 * @param ctx the parse tree
	 */
	void enterTitleElement(JSONSchemaParser.TitleElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONSchemaParser#titleElement}.
	 * @param ctx the parse tree
	 */
	void exitTitleElement(JSONSchemaParser.TitleElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONSchemaParser#containsElement}.
	 * @param ctx the parse tree
	 */
	void enterContainsElement(JSONSchemaParser.ContainsElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONSchemaParser#containsElement}.
	 * @param ctx the parse tree
	 */
	void exitContainsElement(JSONSchemaParser.ContainsElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONSchemaParser#descriptionElement}.
	 * @param ctx the parse tree
	 */
	void enterDescriptionElement(JSONSchemaParser.DescriptionElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONSchemaParser#descriptionElement}.
	 * @param ctx the parse tree
	 */
	void exitDescriptionElement(JSONSchemaParser.DescriptionElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONSchemaParser#dynamicAnchorElement}.
	 * @param ctx the parse tree
	 */
	void enterDynamicAnchorElement(JSONSchemaParser.DynamicAnchorElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONSchemaParser#dynamicAnchorElement}.
	 * @param ctx the parse tree
	 */
	void exitDynamicAnchorElement(JSONSchemaParser.DynamicAnchorElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code STRING_LITERAL}
	 * labeled alternative in {@link JSONSchemaParser#dynamicRefElement}.
	 * @param ctx the parse tree
	 */
	void enterSTRING_LITERAL(JSONSchemaParser.STRING_LITERALContext ctx);
	/**
	 * Exit a parse tree produced by the {@code STRING_LITERAL}
	 * labeled alternative in {@link JSONSchemaParser#dynamicRefElement}.
	 * @param ctx the parse tree
	 */
	void exitSTRING_LITERAL(JSONSchemaParser.STRING_LITERALContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONSchemaParser#typeElement}.
	 * @param ctx the parse tree
	 */
	void enterTypeElement(JSONSchemaParser.TypeElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONSchemaParser#typeElement}.
	 * @param ctx the parse tree
	 */
	void exitTypeElement(JSONSchemaParser.TypeElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONSchemaParser#propertiesElement}.
	 * @param ctx the parse tree
	 */
	void enterPropertiesElement(JSONSchemaParser.PropertiesElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONSchemaParser#propertiesElement}.
	 * @param ctx the parse tree
	 */
	void exitPropertiesElement(JSONSchemaParser.PropertiesElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONSchemaParser#additionalPropertiesElement}.
	 * @param ctx the parse tree
	 */
	void enterAdditionalPropertiesElement(JSONSchemaParser.AdditionalPropertiesElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONSchemaParser#additionalPropertiesElement}.
	 * @param ctx the parse tree
	 */
	void exitAdditionalPropertiesElement(JSONSchemaParser.AdditionalPropertiesElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONSchemaParser#itemsElement}.
	 * @param ctx the parse tree
	 */
	void enterItemsElement(JSONSchemaParser.ItemsElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONSchemaParser#itemsElement}.
	 * @param ctx the parse tree
	 */
	void exitItemsElement(JSONSchemaParser.ItemsElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONSchemaParser#enumElement}.
	 * @param ctx the parse tree
	 */
	void enterEnumElement(JSONSchemaParser.EnumElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONSchemaParser#enumElement}.
	 * @param ctx the parse tree
	 */
	void exitEnumElement(JSONSchemaParser.EnumElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONSchemaParser#formatElement}.
	 * @param ctx the parse tree
	 */
	void enterFormatElement(JSONSchemaParser.FormatElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONSchemaParser#formatElement}.
	 * @param ctx the parse tree
	 */
	void exitFormatElement(JSONSchemaParser.FormatElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONSchemaParser#minimumElement}.
	 * @param ctx the parse tree
	 */
	void enterMinimumElement(JSONSchemaParser.MinimumElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONSchemaParser#minimumElement}.
	 * @param ctx the parse tree
	 */
	void exitMinimumElement(JSONSchemaParser.MinimumElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONSchemaParser#maximumElement}.
	 * @param ctx the parse tree
	 */
	void enterMaximumElement(JSONSchemaParser.MaximumElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONSchemaParser#maximumElement}.
	 * @param ctx the parse tree
	 */
	void exitMaximumElement(JSONSchemaParser.MaximumElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONSchemaParser#multipleOfElement}.
	 * @param ctx the parse tree
	 */
	void enterMultipleOfElement(JSONSchemaParser.MultipleOfElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONSchemaParser#multipleOfElement}.
	 * @param ctx the parse tree
	 */
	void exitMultipleOfElement(JSONSchemaParser.MultipleOfElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONSchemaParser#minLengthElement}.
	 * @param ctx the parse tree
	 */
	void enterMinLengthElement(JSONSchemaParser.MinLengthElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONSchemaParser#minLengthElement}.
	 * @param ctx the parse tree
	 */
	void exitMinLengthElement(JSONSchemaParser.MinLengthElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONSchemaParser#maxLengthElement}.
	 * @param ctx the parse tree
	 */
	void enterMaxLengthElement(JSONSchemaParser.MaxLengthElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONSchemaParser#maxLengthElement}.
	 * @param ctx the parse tree
	 */
	void exitMaxLengthElement(JSONSchemaParser.MaxLengthElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONSchemaParser#patternElement}.
	 * @param ctx the parse tree
	 */
	void enterPatternElement(JSONSchemaParser.PatternElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONSchemaParser#patternElement}.
	 * @param ctx the parse tree
	 */
	void exitPatternElement(JSONSchemaParser.PatternElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONSchemaParser#refElement}.
	 * @param ctx the parse tree
	 */
	void enterRefElement(JSONSchemaParser.RefElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONSchemaParser#refElement}.
	 * @param ctx the parse tree
	 */
	void exitRefElement(JSONSchemaParser.RefElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONSchemaParser#definitionsElement}.
	 * @param ctx the parse tree
	 */
	void enterDefinitionsElement(JSONSchemaParser.DefinitionsElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONSchemaParser#definitionsElement}.
	 * @param ctx the parse tree
	 */
	void exitDefinitionsElement(JSONSchemaParser.DefinitionsElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONSchemaParser#defsElement}.
	 * @param ctx the parse tree
	 */
	void enterDefsElement(JSONSchemaParser.DefsElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONSchemaParser#defsElement}.
	 * @param ctx the parse tree
	 */
	void exitDefsElement(JSONSchemaParser.DefsElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONSchemaParser#dependenciesElement}.
	 * @param ctx the parse tree
	 */
	void enterDependenciesElement(JSONSchemaParser.DependenciesElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONSchemaParser#dependenciesElement}.
	 * @param ctx the parse tree
	 */
	void exitDependenciesElement(JSONSchemaParser.DependenciesElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONSchemaParser#constElement}.
	 * @param ctx the parse tree
	 */
	void enterConstElement(JSONSchemaParser.ConstElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONSchemaParser#constElement}.
	 * @param ctx the parse tree
	 */
	void exitConstElement(JSONSchemaParser.ConstElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONSchemaParser#nullableElement}.
	 * @param ctx the parse tree
	 */
	void enterNullableElement(JSONSchemaParser.NullableElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONSchemaParser#nullableElement}.
	 * @param ctx the parse tree
	 */
	void exitNullableElement(JSONSchemaParser.NullableElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONSchemaParser#requiredElement}.
	 * @param ctx the parse tree
	 */
	void enterRequiredElement(JSONSchemaParser.RequiredElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONSchemaParser#requiredElement}.
	 * @param ctx the parse tree
	 */
	void exitRequiredElement(JSONSchemaParser.RequiredElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONSchemaParser#oneOfElement}.
	 * @param ctx the parse tree
	 */
	void enterOneOfElement(JSONSchemaParser.OneOfElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONSchemaParser#oneOfElement}.
	 * @param ctx the parse tree
	 */
	void exitOneOfElement(JSONSchemaParser.OneOfElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONSchemaParser#allOfElement}.
	 * @param ctx the parse tree
	 */
	void enterAllOfElement(JSONSchemaParser.AllOfElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONSchemaParser#allOfElement}.
	 * @param ctx the parse tree
	 */
	void exitAllOfElement(JSONSchemaParser.AllOfElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONSchemaParser#anyOfElement}.
	 * @param ctx the parse tree
	 */
	void enterAnyOfElement(JSONSchemaParser.AnyOfElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONSchemaParser#anyOfElement}.
	 * @param ctx the parse tree
	 */
	void exitAnyOfElement(JSONSchemaParser.AnyOfElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONSchemaParser#unionTypeElement}.
	 * @param ctx the parse tree
	 */
	void enterUnionTypeElement(JSONSchemaParser.UnionTypeElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONSchemaParser#unionTypeElement}.
	 * @param ctx the parse tree
	 */
	void exitUnionTypeElement(JSONSchemaParser.UnionTypeElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONSchemaParser#nullType}.
	 * @param ctx the parse tree
	 */
	void enterNullType(JSONSchemaParser.NullTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONSchemaParser#nullType}.
	 * @param ctx the parse tree
	 */
	void exitNullType(JSONSchemaParser.NullTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONSchemaParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(JSONSchemaParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONSchemaParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(JSONSchemaParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONSchemaParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(JSONSchemaParser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONSchemaParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(JSONSchemaParser.ObjectContext ctx);
}