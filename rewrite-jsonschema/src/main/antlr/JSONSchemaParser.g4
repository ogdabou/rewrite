parser grammar JSONSchemaParser;

options {
  tokenVocab=JSONSChemaLexer;
}

jsonSchema: schemaObject;

schemaObject: LBRACE schemaElements? RBRACE;

schemaElements: schemaElement (COMMA schemaElement)*;

schemaElement: idElement
            | schemaAttribute
            | titleElement
            | containsElement
            | dynamicAnchorElement
            | dynamicRefElement
            | descriptionElement
            | typeElement
            | propertiesElement
            | additionalPropertiesElement
            | itemsElement
            | enumElement
            | formatElement
            | minimumElement
            | maximumElement
            | multipleOfElement
            | minLengthElement
            | maxLengthElement
            | patternElement
            | requiredElement
            | refElement
            | defsElement
            | definitionsElement
            | dependenciesElement
            | constElement
            | oneOfElement
            | anyOfElement
            | allOfElement
            | nullableElement
            | unionTypeElement
            ;

idElement: ID COLON STRING_LITERAL;

schemaAttribute: SCHEMA COLON STRING_LITERAL;

titleElement: TITLE COLON STRING_LITERAL;

containsElement: CONTAINS COLON schemaElement;

descriptionElement: DESCRIPTION COLON STRING_LITERAL;

dynamicAnchorElement: DYNAMIC_ANCHOR COLON STRING_LITERAL;

dynamicRefElement: DYNAMIC_REF COLON #STRING_LITERAL;

typeElement: TYPE COLON (schemaObject | unionTypeElement | nullType);

propertiesElement: PROPERTIES COLON object;

additionalPropertiesElement: ADDITIONAL_PROPERTIES COLON (schemaObject | TRUE | FALSE);

itemsElement: ITEMS COLON (schemaObject | array);

enumElement: ENUM COLON array;

formatElement: FORMAT COLON STRING_LITERAL;

minimumElement: MINIMUM COLON NUMBER;

maximumElement: MAXIMUM COLON NUMBER;

multipleOfElement: MULTIPLE_OF COLON NUMBER;

minLengthElement: MIN_LENGTH COLON NUMBER;

maxLengthElement: MAX_LENGTH COLON NUMBER;

patternElement: PATTERN COLON STRING_LITERAL;

refElement: REF COLON STRING_LITERAL;

definitionsElement: DEFINITIONS COLON object;
defsElement: DEFS COLON object;
dependenciesElement: DEPENDENCIES COLON object;

constElement: CONST COLON (NUMBER | STRING_LITERAL | TRUE | FALSE | NULL);

nullableElement: STRING_LITERAL COLON ('[' schemaObject ',' NULL | nullType ']');

requiredElement: REQUIRED COLON array;

oneOfElement: ONE_OF COLON array;

allOfElement: ALL_OF COLON array;

anyOfElement: ANY_OF COLON array;

unionTypeElement: TYPE COLON (oneOfElement | allOfElement | anyOfElement | array);

nullType: LBRACE TYPE COLON NULL RBRACE;

array: LBRACKET (schemaObject (COMMA schemaObject)*)? RBRACKET;

object: LBRACE (STRING_LITERAL COLON schemaObject (COMMA STRING_LITERAL COLON schemaObject)*)? RBRACE;