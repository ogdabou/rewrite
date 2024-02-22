package org.openrewrite.jsonschema.internal.grammar;// Generated from /home/acouty/git/personnal/rewrite/rewrite-jsonschema/src/main/antlr/JSONSchemaParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JSONSchemaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JSONSchemaParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JSONSchemaParser#jsonSchema}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonSchema(JSONSchemaParser.JsonSchemaContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSONSchemaParser#schemaObject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchemaObject(JSONSchemaParser.SchemaObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSONSchemaParser#schemaElements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchemaElements(JSONSchemaParser.SchemaElementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSONSchemaParser#schemaElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchemaElement(JSONSchemaParser.SchemaElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSONSchemaParser#idElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdElement(JSONSchemaParser.IdElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSONSchemaParser#schemaAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchemaAttribute(JSONSchemaParser.SchemaAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSONSchemaParser#titleElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTitleElement(JSONSchemaParser.TitleElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSONSchemaParser#containsElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContainsElement(JSONSchemaParser.ContainsElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSONSchemaParser#descriptionElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescriptionElement(JSONSchemaParser.DescriptionElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSONSchemaParser#dynamicAnchorElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDynamicAnchorElement(JSONSchemaParser.DynamicAnchorElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code STRING_LITERAL}
	 * labeled alternative in {@link JSONSchemaParser#dynamicRefElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSTRING_LITERAL(JSONSchemaParser.STRING_LITERALContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSONSchemaParser#typeElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeElement(JSONSchemaParser.TypeElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSONSchemaParser#propertiesElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertiesElement(JSONSchemaParser.PropertiesElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSONSchemaParser#additionalPropertiesElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditionalPropertiesElement(JSONSchemaParser.AdditionalPropertiesElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSONSchemaParser#itemsElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItemsElement(JSONSchemaParser.ItemsElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSONSchemaParser#enumElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumElement(JSONSchemaParser.EnumElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSONSchemaParser#formatElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormatElement(JSONSchemaParser.FormatElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSONSchemaParser#minimumElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinimumElement(JSONSchemaParser.MinimumElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSONSchemaParser#maximumElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaximumElement(JSONSchemaParser.MaximumElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSONSchemaParser#multipleOfElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleOfElement(JSONSchemaParser.MultipleOfElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSONSchemaParser#minLengthElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinLengthElement(JSONSchemaParser.MinLengthElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSONSchemaParser#maxLengthElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaxLengthElement(JSONSchemaParser.MaxLengthElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSONSchemaParser#patternElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPatternElement(JSONSchemaParser.PatternElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSONSchemaParser#refElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRefElement(JSONSchemaParser.RefElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSONSchemaParser#definitionsElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinitionsElement(JSONSchemaParser.DefinitionsElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSONSchemaParser#defsElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefsElement(JSONSchemaParser.DefsElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSONSchemaParser#dependenciesElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDependenciesElement(JSONSchemaParser.DependenciesElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSONSchemaParser#constElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstElement(JSONSchemaParser.ConstElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSONSchemaParser#nullableElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullableElement(JSONSchemaParser.NullableElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSONSchemaParser#requiredElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRequiredElement(JSONSchemaParser.RequiredElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSONSchemaParser#oneOfElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOneOfElement(JSONSchemaParser.OneOfElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSONSchemaParser#allOfElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllOfElement(JSONSchemaParser.AllOfElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSONSchemaParser#anyOfElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnyOfElement(JSONSchemaParser.AnyOfElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSONSchemaParser#unionTypeElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnionTypeElement(JSONSchemaParser.UnionTypeElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSONSchemaParser#nullType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullType(JSONSchemaParser.NullTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSONSchemaParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(JSONSchemaParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSONSchemaParser#object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject(JSONSchemaParser.ObjectContext ctx);
}