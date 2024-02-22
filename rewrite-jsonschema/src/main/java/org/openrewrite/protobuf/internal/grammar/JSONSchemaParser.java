package org.openrewrite.protobuf.internal.grammar;// Generated from /home/acouty/git/personnal/rewrite/rewrite-jsonschema/src/main/antlr/JSONSchemaParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class JSONSchemaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TYPE=1, ID=2, REF=3, DEFS=4, SCHEMA=5, EXAMPLES=6, PROPERTIES=7, ADDITIONAL_PROPERTIES=8, 
		DYNAMIC_ANCHOR=9, DYNAMIC_REF=10, CONTAINS=11, UNEVALUATED_ITEMS=12, ONE_OF=13, 
		ALL_OF=14, TITLE=15, DEFINITIONS=16, DESCRIPTION=17, ANY_OF=18, ENUM=19, 
		ITEMS=20, PREFIXITEMS=21, CONST=22, REQUIRED=23, MINIMUM=24, MAXIMUM=25, 
		DEPENDENCIES=26, MULTIPLE_OF=27, MIN_LENGTH=28, MAX_LENGTH=29, PATTERN=30, 
		FORMAT=31, TRUE=32, FALSE=33, NULL=34, STRING_LITERAL=35, NUMBER=36, COLON=37, 
		COMMA=38, LBRACE=39, RBRACE=40, LBRACKET=41, RBRACKET=42, WS=43;
	public static final int
		RULE_jsonSchema = 0, RULE_schemaObject = 1, RULE_schemaElements = 2, RULE_schemaElement = 3, 
		RULE_idElement = 4, RULE_schemaAttribute = 5, RULE_titleElement = 6, RULE_containsElement = 7, 
		RULE_descriptionElement = 8, RULE_dynamicAnchorElement = 9, RULE_dynamicRefElement = 10, 
		RULE_typeElement = 11, RULE_propertiesElement = 12, RULE_additionalPropertiesElement = 13, 
		RULE_itemsElement = 14, RULE_enumElement = 15, RULE_formatElement = 16, 
		RULE_minimumElement = 17, RULE_maximumElement = 18, RULE_multipleOfElement = 19, 
		RULE_minLengthElement = 20, RULE_maxLengthElement = 21, RULE_patternElement = 22, 
		RULE_refElement = 23, RULE_definitionsElement = 24, RULE_defsElement = 25, 
		RULE_dependenciesElement = 26, RULE_constElement = 27, RULE_nullableElement = 28, 
		RULE_requiredElement = 29, RULE_oneOfElement = 30, RULE_allOfElement = 31, 
		RULE_anyOfElement = 32, RULE_unionTypeElement = 33, RULE_nullType = 34, 
		RULE_array = 35, RULE_object = 36;
	private static String[] makeRuleNames() {
		return new String[] {
			"jsonSchema", "schemaObject", "schemaElements", "schemaElement", "idElement", 
			"schemaAttribute", "titleElement", "containsElement", "descriptionElement", 
			"dynamicAnchorElement", "dynamicRefElement", "typeElement", "propertiesElement", 
			"additionalPropertiesElement", "itemsElement", "enumElement", "formatElement", 
			"minimumElement", "maximumElement", "multipleOfElement", "minLengthElement", 
			"maxLengthElement", "patternElement", "refElement", "definitionsElement", 
			"defsElement", "dependenciesElement", "constElement", "nullableElement", 
			"requiredElement", "oneOfElement", "allOfElement", "anyOfElement", "unionTypeElement", 
			"nullType", "array", "object"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'type'", "'$id'", "'$ref'", "'$defs'", "'$schema'", "'examples'", 
			"'properties'", "'additionalProperties'", "'$dynamicAnchor'", "'$dynamicRef'", 
			"'contains'", "'unevaluatedITems'", "'oneOf'", "'allOf'", "'title'", 
			"'definitions'", "'description'", "'anyOf'", "'enum'", "'items'", "'prefixItems'", 
			"'const'", "'required'", "'minimum'", "'maximum'", "'dependencies'", 
			"'multipleOf'", "'minLength'", "'maxLength'", "'pattern'", "'format'", 
			"'true'", "'false'", "'null'", null, null, "':'", "','", "'{'", "'}'", 
			"'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TYPE", "ID", "REF", "DEFS", "SCHEMA", "EXAMPLES", "PROPERTIES", 
			"ADDITIONAL_PROPERTIES", "DYNAMIC_ANCHOR", "DYNAMIC_REF", "CONTAINS", 
			"UNEVALUATED_ITEMS", "ONE_OF", "ALL_OF", "TITLE", "DEFINITIONS", "DESCRIPTION", 
			"ANY_OF", "ENUM", "ITEMS", "PREFIXITEMS", "CONST", "REQUIRED", "MINIMUM", 
			"MAXIMUM", "DEPENDENCIES", "MULTIPLE_OF", "MIN_LENGTH", "MAX_LENGTH", 
			"PATTERN", "FORMAT", "TRUE", "FALSE", "NULL", "STRING_LITERAL", "NUMBER", 
			"COLON", "COMMA", "LBRACE", "RBRACE", "LBRACKET", "RBRACKET", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "JSONSchemaParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JSONSchemaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JsonSchemaContext extends ParserRuleContext {
		public SchemaObjectContext schemaObject() {
			return getRuleContext(SchemaObjectContext.class,0);
		}
		public JsonSchemaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsonSchema; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONSchemaParserListener) ((JSONSchemaParserListener)listener).enterJsonSchema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONSchemaParserListener) ((JSONSchemaParserListener)listener).exitJsonSchema(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSONSchemaParserVisitor) return ((JSONSchemaParserVisitor<? extends T>)visitor).visitJsonSchema(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsonSchemaContext jsonSchema() throws RecognitionException {
		JsonSchemaContext _localctx = new JsonSchemaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_jsonSchema);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			schemaObject();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SchemaObjectContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(JSONSchemaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JSONSchemaParser.RBRACE, 0); }
		public SchemaElementsContext schemaElements() {
			return getRuleContext(SchemaElementsContext.class,0);
		}
		public SchemaObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schemaObject; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONSchemaParserListener) ((JSONSchemaParserListener)listener).enterSchemaObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONSchemaParserListener) ((JSONSchemaParserListener)listener).exitSchemaObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSONSchemaParserVisitor) return ((JSONSchemaParserVisitor<? extends T>)visitor).visitSchemaObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SchemaObjectContext schemaObject() throws RecognitionException {
		SchemaObjectContext _localctx = new SchemaObjectContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_schemaObject);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(LBRACE);
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 38652604350L) != 0)) {
				{
				setState(77);
				schemaElements();
				}
			}

			setState(80);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SchemaElementsContext extends ParserRuleContext {
		public List<SchemaElementContext> schemaElement() {
			return getRuleContexts(SchemaElementContext.class);
		}
		public SchemaElementContext schemaElement(int i) {
			return getRuleContext(SchemaElementContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JSONSchemaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JSONSchemaParser.COMMA, i);
		}
		public SchemaElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schemaElements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONSchemaParserListener) ((JSONSchemaParserListener)listener).enterSchemaElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONSchemaParserListener) ((JSONSchemaParserListener)listener).exitSchemaElements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSONSchemaParserVisitor) return ((JSONSchemaParserVisitor<? extends T>)visitor).visitSchemaElements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SchemaElementsContext schemaElements() throws RecognitionException {
		SchemaElementsContext _localctx = new SchemaElementsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_schemaElements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			schemaElement();
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(83);
				match(COMMA);
				setState(84);
				schemaElement();
				}
				}
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SchemaElementContext extends ParserRuleContext {
		public IdElementContext idElement() {
			return getRuleContext(IdElementContext.class,0);
		}
		public SchemaAttributeContext schemaAttribute() {
			return getRuleContext(SchemaAttributeContext.class,0);
		}
		public TitleElementContext titleElement() {
			return getRuleContext(TitleElementContext.class,0);
		}
		public ContainsElementContext containsElement() {
			return getRuleContext(ContainsElementContext.class,0);
		}
		public DynamicAnchorElementContext dynamicAnchorElement() {
			return getRuleContext(DynamicAnchorElementContext.class,0);
		}
		public DynamicRefElementContext dynamicRefElement() {
			return getRuleContext(DynamicRefElementContext.class,0);
		}
		public DescriptionElementContext descriptionElement() {
			return getRuleContext(DescriptionElementContext.class,0);
		}
		public TypeElementContext typeElement() {
			return getRuleContext(TypeElementContext.class,0);
		}
		public PropertiesElementContext propertiesElement() {
			return getRuleContext(PropertiesElementContext.class,0);
		}
		public AdditionalPropertiesElementContext additionalPropertiesElement() {
			return getRuleContext(AdditionalPropertiesElementContext.class,0);
		}
		public ItemsElementContext itemsElement() {
			return getRuleContext(ItemsElementContext.class,0);
		}
		public EnumElementContext enumElement() {
			return getRuleContext(EnumElementContext.class,0);
		}
		public FormatElementContext formatElement() {
			return getRuleContext(FormatElementContext.class,0);
		}
		public MinimumElementContext minimumElement() {
			return getRuleContext(MinimumElementContext.class,0);
		}
		public MaximumElementContext maximumElement() {
			return getRuleContext(MaximumElementContext.class,0);
		}
		public MultipleOfElementContext multipleOfElement() {
			return getRuleContext(MultipleOfElementContext.class,0);
		}
		public MinLengthElementContext minLengthElement() {
			return getRuleContext(MinLengthElementContext.class,0);
		}
		public MaxLengthElementContext maxLengthElement() {
			return getRuleContext(MaxLengthElementContext.class,0);
		}
		public PatternElementContext patternElement() {
			return getRuleContext(PatternElementContext.class,0);
		}
		public RequiredElementContext requiredElement() {
			return getRuleContext(RequiredElementContext.class,0);
		}
		public RefElementContext refElement() {
			return getRuleContext(RefElementContext.class,0);
		}
		public DefsElementContext defsElement() {
			return getRuleContext(DefsElementContext.class,0);
		}
		public DefinitionsElementContext definitionsElement() {
			return getRuleContext(DefinitionsElementContext.class,0);
		}
		public DependenciesElementContext dependenciesElement() {
			return getRuleContext(DependenciesElementContext.class,0);
		}
		public ConstElementContext constElement() {
			return getRuleContext(ConstElementContext.class,0);
		}
		public OneOfElementContext oneOfElement() {
			return getRuleContext(OneOfElementContext.class,0);
		}
		public AnyOfElementContext anyOfElement() {
			return getRuleContext(AnyOfElementContext.class,0);
		}
		public AllOfElementContext allOfElement() {
			return getRuleContext(AllOfElementContext.class,0);
		}
		public NullableElementContext nullableElement() {
			return getRuleContext(NullableElementContext.class,0);
		}
		public UnionTypeElementContext unionTypeElement() {
			return getRuleContext(UnionTypeElementContext.class,0);
		}
		public SchemaElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schemaElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONSchemaParserListener) ((JSONSchemaParserListener)listener).enterSchemaElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONSchemaParserListener) ((JSONSchemaParserListener)listener).exitSchemaElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSONSchemaParserVisitor) return ((JSONSchemaParserVisitor<? extends T>)visitor).visitSchemaElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SchemaElementContext schemaElement() throws RecognitionException {
		SchemaElementContext _localctx = new SchemaElementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_schemaElement);
		try {
			setState(120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				idElement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				schemaAttribute();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(92);
				titleElement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(93);
				containsElement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(94);
				dynamicAnchorElement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(95);
				dynamicRefElement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(96);
				descriptionElement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(97);
				typeElement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(98);
				propertiesElement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(99);
				additionalPropertiesElement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(100);
				itemsElement();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(101);
				enumElement();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(102);
				formatElement();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(103);
				minimumElement();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(104);
				maximumElement();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(105);
				multipleOfElement();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(106);
				minLengthElement();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(107);
				maxLengthElement();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(108);
				patternElement();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(109);
				requiredElement();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(110);
				refElement();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(111);
				defsElement();
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(112);
				definitionsElement();
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(113);
				dependenciesElement();
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(114);
				constElement();
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(115);
				oneOfElement();
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(116);
				anyOfElement();
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(117);
				allOfElement();
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(118);
				nullableElement();
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(119);
				unionTypeElement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdElementContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JSONSchemaParser.ID, 0); }
		public TerminalNode COLON() { return getToken(JSONSchemaParser.COLON, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(JSONSchemaParser.STRING_LITERAL, 0); }
		public IdElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONSchemaParserListener) ((JSONSchemaParserListener)listener).enterIdElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONSchemaParserListener) ((JSONSchemaParserListener)listener).exitIdElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSONSchemaParserVisitor) return ((JSONSchemaParserVisitor<? extends T>)visitor).visitIdElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdElementContext idElement() throws RecognitionException {
		IdElementContext _localctx = new IdElementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_idElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(ID);
			setState(123);
			match(COLON);
			setState(124);
			match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SchemaAttributeContext extends ParserRuleContext {
		public TerminalNode SCHEMA() { return getToken(JSONSchemaParser.SCHEMA, 0); }
		public TerminalNode COLON() { return getToken(JSONSchemaParser.COLON, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(JSONSchemaParser.STRING_LITERAL, 0); }
		public SchemaAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schemaAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONSchemaParserListener) ((JSONSchemaParserListener)listener).enterSchemaAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONSchemaParserListener) ((JSONSchemaParserListener)listener).exitSchemaAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSONSchemaParserVisitor) return ((JSONSchemaParserVisitor<? extends T>)visitor).visitSchemaAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SchemaAttributeContext schemaAttribute() throws RecognitionException {
		SchemaAttributeContext _localctx = new SchemaAttributeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_schemaAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(SCHEMA);
			setState(127);
			match(COLON);
			setState(128);
			match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TitleElementContext extends ParserRuleContext {
		public TerminalNode TITLE() { return getToken(JSONSchemaParser.TITLE, 0); }
		public TerminalNode COLON() { return getToken(JSONSchemaParser.COLON, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(JSONSchemaParser.STRING_LITERAL, 0); }
		public TitleElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_titleElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONSchemaParserListener) ((JSONSchemaParserListener)listener).enterTitleElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONSchemaParserListener) ((JSONSchemaParserListener)listener).exitTitleElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSONSchemaParserVisitor) return ((JSONSchemaParserVisitor<? extends T>)visitor).visitTitleElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TitleElementContext titleElement() throws RecognitionException {
		TitleElementContext _localctx = new TitleElementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_titleElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(TITLE);
			setState(131);
			match(COLON);
			setState(132);
			match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ContainsElementContext extends ParserRuleContext {
		public TerminalNode CONTAINS() { return getToken(JSONSchemaParser.CONTAINS, 0); }
		public TerminalNode COLON() { return getToken(JSONSchemaParser.COLON, 0); }
		public SchemaElementContext schemaElement() {
			return getRuleContext(SchemaElementContext.class,0);
		}
		public ContainsElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_containsElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONSchemaParserListener) ((JSONSchemaParserListener)listener).enterContainsElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONSchemaParserListener) ((JSONSchemaParserListener)listener).exitContainsElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSONSchemaParserVisitor) return ((JSONSchemaParserVisitor<? extends T>)visitor).visitContainsElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContainsElementContext containsElement() throws RecognitionException {
		ContainsElementContext _localctx = new ContainsElementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_containsElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(CONTAINS);
			setState(135);
			match(COLON);
			setState(136);
			schemaElement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DescriptionElementContext extends ParserRuleContext {
		public TerminalNode DESCRIPTION() { return getToken(JSONSchemaParser.DESCRIPTION, 0); }
		public TerminalNode COLON() { return getToken(JSONSchemaParser.COLON, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(JSONSchemaParser.STRING_LITERAL, 0); }
		public DescriptionElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_descriptionElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONSchemaParserListener) ((JSONSchemaParserListener)listener).enterDescriptionElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONSchemaParserListener) ((JSONSchemaParserListener)listener).exitDescriptionElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSONSchemaParserVisitor) return ((JSONSchemaParserVisitor<? extends T>)visitor).visitDescriptionElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescriptionElementContext descriptionElement() throws RecognitionException {
		DescriptionElementContext _localctx = new DescriptionElementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_descriptionElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(DESCRIPTION);
			setState(139);
			match(COLON);
			setState(140);
			match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DynamicAnchorElementContext extends ParserRuleContext {
		public TerminalNode DYNAMIC_ANCHOR() { return getToken(JSONSchemaParser.DYNAMIC_ANCHOR, 0); }
		public TerminalNode COLON() { return getToken(JSONSchemaParser.COLON, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(JSONSchemaParser.STRING_LITERAL, 0); }
		public DynamicAnchorElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dynamicAnchorElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONSchemaParserListener) ((JSONSchemaParserListener)listener).enterDynamicAnchorElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONSchemaParserListener) ((JSONSchemaParserListener)listener).exitDynamicAnchorElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSONSchemaParserVisitor) return ((JSONSchemaParserVisitor<? extends T>)visitor).visitDynamicAnchorElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DynamicAnchorElementContext dynamicAnchorElement() throws RecognitionException {
		DynamicAnchorElementContext _localctx = new DynamicAnchorElementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_dynamicAnchorElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(DYNAMIC_ANCHOR);
			setState(143);
			match(COLON);
			setState(144);
			match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DynamicRefElementContext extends ParserRuleContext {
		public DynamicRefElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dynamicRefElement; }
	 
		public DynamicRefElementContext() { }
		public void copyFrom(DynamicRefElementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class STRING_LITERALContext extends DynamicRefElementContext {
		public TerminalNode DYNAMIC_REF() { return getToken(JSONSchemaParser.DYNAMIC_REF, 0); }
		public TerminalNode COLON() { return getToken(JSONSchemaParser.COLON, 0); }
		public STRING_LITERALContext(DynamicRefElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONSchemaParserListener) ((JSONSchemaParserListener)listener).enterSTRING_LITERAL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONSchemaParserListener) ((JSONSchemaParserListener)listener).exitSTRING_LITERAL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSONSchemaParserVisitor) return ((JSONSchemaParserVisitor<? extends T>)visitor).visitSTRING_LITERAL(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DynamicRefElementContext dynamicRefElement() throws RecognitionException {
		DynamicRefElementContext _localctx = new DynamicRefElementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_dynamicRefElement);
		try {
			_localctx = new STRING_LITERALContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(DYNAMIC_REF);
			setState(147);
			match(COLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeElementContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(JSONSchemaParser.TYPE, 0); }
		public TerminalNode COLON() { return getToken(JSONSchemaParser.COLON, 0); }
		public SchemaObjectContext schemaObject() {
			return getRuleContext(SchemaObjectContext.class,0);
		}
		public UnionTypeElementContext unionTypeElement() {
			return getRuleContext(UnionTypeElementContext.class,0);
		}
		public NullTypeContext nullType() {
			return getRuleContext(NullTypeContext.class,0);
		}
		public TypeElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONSchemaParserListener) ((JSONSchemaParserListener)listener).enterTypeElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONSchemaParserListener) ((JSONSchemaParserListener)listener).exitTypeElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSONSchemaParserVisitor) return ((JSONSchemaParserVisitor<? extends T>)visitor).visitTypeElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeElementContext typeElement() throws RecognitionException {
		TypeElementContext _localctx = new TypeElementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_typeElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(TYPE);
			setState(150);
			match(COLON);
			setState(154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(151);
				schemaObject();
				}
				break;
			case 2:
				{
				setState(152);
				unionTypeElement();
				}
				break;
			case 3:
				{
				setState(153);
				nullType();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PropertiesElementContext extends ParserRuleContext {
		public TerminalNode PROPERTIES() { return getToken(JSONSchemaParser.PROPERTIES, 0); }
		public TerminalNode COLON() { return getToken(JSONSchemaParser.COLON, 0); }
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public PropertiesElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertiesElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONSchemaParserListener) ((JSONSchemaParserListener)listener).enterPropertiesElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONSchemaParserListener) ((JSONSchemaParserListener)listener).exitPropertiesElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSONSchemaParserVisitor) return ((JSONSchemaParserVisitor<? extends T>)visitor).visitPropertiesElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertiesElementContext propertiesElement() throws RecognitionException {
		PropertiesElementContext _localctx = new PropertiesElementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_propertiesElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(PROPERTIES);
			setState(157);
			match(COLON);
			setState(158);
			object();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AdditionalPropertiesElementContext extends ParserRuleContext {
		public TerminalNode ADDITIONAL_PROPERTIES() { return getToken(JSONSchemaParser.ADDITIONAL_PROPERTIES, 0); }
		public TerminalNode COLON() { return getToken(JSONSchemaParser.COLON, 0); }
		public SchemaObjectContext schemaObject() {
			return getRuleContext(SchemaObjectContext.class,0);
		}
		public TerminalNode TRUE() { return getToken(JSONSchemaParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(JSONSchemaParser.FALSE, 0); }
		public AdditionalPropertiesElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additionalPropertiesElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONSchemaParserListener) ((JSONSchemaParserListener)listener).enterAdditionalPropertiesElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONSchemaParserListener) ((JSONSchemaParserListener)listener).exitAdditionalPropertiesElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSONSchemaParserVisitor) return ((JSONSchemaParserVisitor<? extends T>)visitor).visitAdditionalPropertiesElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditionalPropertiesElementContext additionalPropertiesElement() throws RecognitionException {
		AdditionalPropertiesElementContext _localctx = new AdditionalPropertiesElementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_additionalPropertiesElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(ADDITIONAL_PROPERTIES);
			setState(161);
			match(COLON);
			setState(165);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(162);
				schemaObject();
				}
				break;
			case TRUE:
				{
				setState(163);
				match(TRUE);
				}
				break;
			case FALSE:
				{
				setState(164);
				match(FALSE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ItemsElementContext extends ParserRuleContext {
		public TerminalNode ITEMS() { return getToken(JSONSchemaParser.ITEMS, 0); }
		public TerminalNode COLON() { return getToken(JSONSchemaParser.COLON, 0); }
		public SchemaObjectContext schemaObject() {
			return getRuleContext(SchemaObjectContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public ItemsElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_itemsElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONSchemaParserListener) ((JSONSchemaParserListener)listener).enterItemsElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONSchemaParserListener) ((JSONSchemaParserListener)listener).exitItemsElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSONSchemaParserVisitor) return ((JSONSchemaParserVisitor<? extends T>)visitor).visitItemsElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ItemsElementContext itemsElement() throws RecognitionException {
		ItemsElementContext _localctx = new ItemsElementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_itemsElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(ITEMS);
			setState(168);
			match(COLON);
			setState(171);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(169);
				schemaObject();
				}
				break;
			case LBRACKET:
				{
				setState(170);
				array();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EnumElementContext extends ParserRuleContext {
		public TerminalNode ENUM() { return getToken(JSONSchemaParser.ENUM, 0); }
		public TerminalNode COLON() { return getToken(JSONSchemaParser.COLON, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public EnumElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONSchemaParserListener) ((JSONSchemaParserListener)listener).enterEnumElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONSchemaParserListener) ((JSONSchemaParserListener)listener).exitEnumElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSONSchemaParserVisitor) return ((JSONSchemaParserVisitor<? extends T>)visitor).visitEnumElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumElementContext enumElement() throws RecognitionException {
		EnumElementContext _localctx = new EnumElementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_enumElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(ENUM);
			setState(174);
			match(COLON);
			setState(175);
			array();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FormatElementContext extends ParserRuleContext {
		public TerminalNode FORMAT() { return getToken(JSONSchemaParser.FORMAT, 0); }
		public TerminalNode COLON() { return getToken(JSONSchemaParser.COLON, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(JSONSchemaParser.STRING_LITERAL, 0); }
		public FormatElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formatElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONSchemaParserListener) ((JSONSchemaParserListener)listener).enterFormatElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONSchemaParserListener) ((JSONSchemaParserListener)listener).exitFormatElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSONSchemaParserVisitor) return ((JSONSchemaParserVisitor<? extends T>)visitor).visitFormatElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormatElementContext formatElement() throws RecognitionException {
		FormatElementContext _localctx = new FormatElementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_formatElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(FORMAT);
			setState(178);
			match(COLON);
			setState(179);
			match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MinimumElementContext extends ParserRuleContext {
		public TerminalNode MINIMUM() { return getToken(JSONSchemaParser.MINIMUM, 0); }
		public TerminalNode COLON() { return getToken(JSONSchemaParser.COLON, 0); }
		public TerminalNode NUMBER() { return getToken(JSONSchemaParser.NUMBER, 0); }
		public MinimumElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_minimumElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONSchemaParserListener) ((JSONSchemaParserListener)listener).enterMinimumElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONSchemaParserListener) ((JSONSchemaParserListener)listener).exitMinimumElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSONSchemaParserVisitor) return ((JSONSchemaParserVisitor<? extends T>)visitor).visitMinimumElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MinimumElementContext minimumElement() throws RecognitionException {
		MinimumElementContext _localctx = new MinimumElementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_minimumElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(MINIMUM);
			setState(182);
			match(COLON);
			setState(183);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MaximumElementContext extends ParserRuleContext {
		public TerminalNode MAXIMUM() { return getToken(JSONSchemaParser.MAXIMUM, 0); }
		public TerminalNode COLON() { return getToken(JSONSchemaParser.COLON, 0); }
		public TerminalNode NUMBER() { return getToken(JSONSchemaParser.NUMBER, 0); }
		public MaximumElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_maximumElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONSchemaParserListener) ((JSONSchemaParserListener)listener).enterMaximumElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONSchemaParserListener) ((JSONSchemaParserListener)listener).exitMaximumElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSONSchemaParserVisitor) return ((JSONSchemaParserVisitor<? extends T>)visitor).visitMaximumElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MaximumElementContext maximumElement() throws RecognitionException {
		MaximumElementContext _localctx = new MaximumElementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_maximumElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(MAXIMUM);
			setState(186);
			match(COLON);
			setState(187);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MultipleOfElementContext extends ParserRuleContext {
		public TerminalNode MULTIPLE_OF() { return getToken(JSONSchemaParser.MULTIPLE_OF, 0); }
		public TerminalNode COLON() { return getToken(JSONSchemaParser.COLON, 0); }
		public TerminalNode NUMBER() { return getToken(JSONSchemaParser.NUMBER, 0); }
		public MultipleOfElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipleOfElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONSchemaParserListener) ((JSONSchemaParserListener)listener).enterMultipleOfElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONSchemaParserListener) ((JSONSchemaParserListener)listener).exitMultipleOfElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSONSchemaParserVisitor) return ((JSONSchemaParserVisitor<? extends T>)visitor).visitMultipleOfElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultipleOfElementContext multipleOfElement() throws RecognitionException {
		MultipleOfElementContext _localctx = new MultipleOfElementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_multipleOfElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(MULTIPLE_OF);
			setState(190);
			match(COLON);
			setState(191);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MinLengthElementContext extends ParserRuleContext {
		public TerminalNode MIN_LENGTH() { return getToken(JSONSchemaParser.MIN_LENGTH, 0); }
		public TerminalNode COLON() { return getToken(JSONSchemaParser.COLON, 0); }
		public TerminalNode NUMBER() { return getToken(JSONSchemaParser.NUMBER, 0); }
		public MinLengthElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_minLengthElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONSchemaParserListener) ((JSONSchemaParserListener)listener).enterMinLengthElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONSchemaParserListener) ((JSONSchemaParserListener)listener).exitMinLengthElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSONSchemaParserVisitor) return ((JSONSchemaParserVisitor<? extends T>)visitor).visitMinLengthElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MinLengthElementContext minLengthElement() throws RecognitionException {
		MinLengthElementContext _localctx = new MinLengthElementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_minLengthElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(MIN_LENGTH);
			setState(194);
			match(COLON);
			setState(195);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MaxLengthElementContext extends ParserRuleContext {
		public TerminalNode MAX_LENGTH() { return getToken(JSONSchemaParser.MAX_LENGTH, 0); }
		public TerminalNode COLON() { return getToken(JSONSchemaParser.COLON, 0); }
		public TerminalNode NUMBER() { return getToken(JSONSchemaParser.NUMBER, 0); }
		public MaxLengthElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_maxLengthElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONSchemaParserListener) ((JSONSchemaParserListener)listener).enterMaxLengthElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONSchemaParserListener) ((JSONSchemaParserListener)listener).exitMaxLengthElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSONSchemaParserVisitor) return ((JSONSchemaParserVisitor<? extends T>)visitor).visitMaxLengthElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MaxLengthElementContext maxLengthElement() throws RecognitionException {
		MaxLengthElementContext _localctx = new MaxLengthElementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_maxLengthElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(MAX_LENGTH);
			setState(198);
			match(COLON);
			setState(199);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PatternElementContext extends ParserRuleContext {
		public TerminalNode PATTERN() { return getToken(JSONSchemaParser.PATTERN, 0); }
		public TerminalNode COLON() { return getToken(JSONSchemaParser.COLON, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(JSONSchemaParser.STRING_LITERAL, 0); }
		public PatternElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patternElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONSchemaParserListener) ((JSONSchemaParserListener)listener).enterPatternElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONSchemaParserListener) ((JSONSchemaParserListener)listener).exitPatternElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSONSchemaParserVisitor) return ((JSONSchemaParserVisitor<? extends T>)visitor).visitPatternElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatternElementContext patternElement() throws RecognitionException {
		PatternElementContext _localctx = new PatternElementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_patternElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(PATTERN);
			setState(202);
			match(COLON);
			setState(203);
			match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RefElementContext extends ParserRuleContext {
		public TerminalNode REF() { return getToken(JSONSchemaParser.REF, 0); }
		public TerminalNode COLON() { return getToken(JSONSchemaParser.COLON, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(JSONSchemaParser.STRING_LITERAL, 0); }
		public RefElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_refElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONSchemaParserListener) ((JSONSchemaParserListener)listener).enterRefElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONSchemaParserListener) ((JSONSchemaParserListener)listener).exitRefElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSONSchemaParserVisitor) return ((JSONSchemaParserVisitor<? extends T>)visitor).visitRefElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RefElementContext refElement() throws RecognitionException {
		RefElementContext _localctx = new RefElementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_refElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(REF);
			setState(206);
			match(COLON);
			setState(207);
			match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DefinitionsElementContext extends ParserRuleContext {
		public TerminalNode DEFINITIONS() { return getToken(JSONSchemaParser.DEFINITIONS, 0); }
		public TerminalNode COLON() { return getToken(JSONSchemaParser.COLON, 0); }
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public DefinitionsElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definitionsElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONSchemaParserListener) ((JSONSchemaParserListener)listener).enterDefinitionsElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONSchemaParserListener) ((JSONSchemaParserListener)listener).exitDefinitionsElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSONSchemaParserVisitor) return ((JSONSchemaParserVisitor<? extends T>)visitor).visitDefinitionsElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinitionsElementContext definitionsElement() throws RecognitionException {
		DefinitionsElementContext _localctx = new DefinitionsElementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_definitionsElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(DEFINITIONS);
			setState(210);
			match(COLON);
			setState(211);
			object();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DefsElementContext extends ParserRuleContext {
		public TerminalNode DEFS() { return getToken(JSONSchemaParser.DEFS, 0); }
		public TerminalNode COLON() { return getToken(JSONSchemaParser.COLON, 0); }
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public DefsElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defsElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONSchemaParserListener) ((JSONSchemaParserListener)listener).enterDefsElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONSchemaParserListener) ((JSONSchemaParserListener)listener).exitDefsElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSONSchemaParserVisitor) return ((JSONSchemaParserVisitor<? extends T>)visitor).visitDefsElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefsElementContext defsElement() throws RecognitionException {
		DefsElementContext _localctx = new DefsElementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_defsElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(DEFS);
			setState(214);
			match(COLON);
			setState(215);
			object();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DependenciesElementContext extends ParserRuleContext {
		public TerminalNode DEPENDENCIES() { return getToken(JSONSchemaParser.DEPENDENCIES, 0); }
		public TerminalNode COLON() { return getToken(JSONSchemaParser.COLON, 0); }
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public DependenciesElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dependenciesElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONSchemaParserListener) ((JSONSchemaParserListener)listener).enterDependenciesElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONSchemaParserListener) ((JSONSchemaParserListener)listener).exitDependenciesElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSONSchemaParserVisitor) return ((JSONSchemaParserVisitor<? extends T>)visitor).visitDependenciesElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DependenciesElementContext dependenciesElement() throws RecognitionException {
		DependenciesElementContext _localctx = new DependenciesElementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_dependenciesElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(DEPENDENCIES);
			setState(218);
			match(COLON);
			setState(219);
			object();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstElementContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(JSONSchemaParser.CONST, 0); }
		public TerminalNode COLON() { return getToken(JSONSchemaParser.COLON, 0); }
		public TerminalNode NUMBER() { return getToken(JSONSchemaParser.NUMBER, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(JSONSchemaParser.STRING_LITERAL, 0); }
		public TerminalNode TRUE() { return getToken(JSONSchemaParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(JSONSchemaParser.FALSE, 0); }
		public TerminalNode NULL() { return getToken(JSONSchemaParser.NULL, 0); }
		public ConstElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONSchemaParserListener) ((JSONSchemaParserListener)listener).enterConstElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONSchemaParserListener) ((JSONSchemaParserListener)listener).exitConstElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSONSchemaParserVisitor) return ((JSONSchemaParserVisitor<? extends T>)visitor).visitConstElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstElementContext constElement() throws RecognitionException {
		ConstElementContext _localctx = new ConstElementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_constElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(CONST);
			setState(222);
			match(COLON);
			setState(223);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 133143986176L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NullableElementContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(JSONSchemaParser.STRING_LITERAL, 0); }
		public TerminalNode COLON() { return getToken(JSONSchemaParser.COLON, 0); }
		public TerminalNode LBRACKET() { return getToken(JSONSchemaParser.LBRACKET, 0); }
		public SchemaObjectContext schemaObject() {
			return getRuleContext(SchemaObjectContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(JSONSchemaParser.COMMA, 0); }
		public TerminalNode NULL() { return getToken(JSONSchemaParser.NULL, 0); }
		public NullTypeContext nullType() {
			return getRuleContext(NullTypeContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(JSONSchemaParser.RBRACKET, 0); }
		public NullableElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullableElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONSchemaParserListener) ((JSONSchemaParserListener)listener).enterNullableElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONSchemaParserListener) ((JSONSchemaParserListener)listener).exitNullableElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSONSchemaParserVisitor) return ((JSONSchemaParserVisitor<? extends T>)visitor).visitNullableElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NullableElementContext nullableElement() throws RecognitionException {
		NullableElementContext _localctx = new NullableElementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_nullableElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(STRING_LITERAL);
			setState(226);
			match(COLON);
			setState(235);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACKET:
				{
				setState(227);
				match(LBRACKET);
				setState(228);
				schemaObject();
				setState(229);
				match(COMMA);
				setState(230);
				match(NULL);
				}
				break;
			case LBRACE:
				{
				setState(232);
				nullType();
				setState(233);
				match(RBRACKET);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RequiredElementContext extends ParserRuleContext {
		public TerminalNode REQUIRED() { return getToken(JSONSchemaParser.REQUIRED, 0); }
		public TerminalNode COLON() { return getToken(JSONSchemaParser.COLON, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public RequiredElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_requiredElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONSchemaParserListener) ((JSONSchemaParserListener)listener).enterRequiredElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONSchemaParserListener) ((JSONSchemaParserListener)listener).exitRequiredElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSONSchemaParserVisitor) return ((JSONSchemaParserVisitor<? extends T>)visitor).visitRequiredElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RequiredElementContext requiredElement() throws RecognitionException {
		RequiredElementContext _localctx = new RequiredElementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_requiredElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(REQUIRED);
			setState(238);
			match(COLON);
			setState(239);
			array();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OneOfElementContext extends ParserRuleContext {
		public TerminalNode ONE_OF() { return getToken(JSONSchemaParser.ONE_OF, 0); }
		public TerminalNode COLON() { return getToken(JSONSchemaParser.COLON, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public OneOfElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oneOfElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONSchemaParserListener) ((JSONSchemaParserListener)listener).enterOneOfElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONSchemaParserListener) ((JSONSchemaParserListener)listener).exitOneOfElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSONSchemaParserVisitor) return ((JSONSchemaParserVisitor<? extends T>)visitor).visitOneOfElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OneOfElementContext oneOfElement() throws RecognitionException {
		OneOfElementContext _localctx = new OneOfElementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_oneOfElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(ONE_OF);
			setState(242);
			match(COLON);
			setState(243);
			array();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AllOfElementContext extends ParserRuleContext {
		public TerminalNode ALL_OF() { return getToken(JSONSchemaParser.ALL_OF, 0); }
		public TerminalNode COLON() { return getToken(JSONSchemaParser.COLON, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public AllOfElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_allOfElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONSchemaParserListener) ((JSONSchemaParserListener)listener).enterAllOfElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONSchemaParserListener) ((JSONSchemaParserListener)listener).exitAllOfElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSONSchemaParserVisitor) return ((JSONSchemaParserVisitor<? extends T>)visitor).visitAllOfElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AllOfElementContext allOfElement() throws RecognitionException {
		AllOfElementContext _localctx = new AllOfElementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_allOfElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(ALL_OF);
			setState(246);
			match(COLON);
			setState(247);
			array();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AnyOfElementContext extends ParserRuleContext {
		public TerminalNode ANY_OF() { return getToken(JSONSchemaParser.ANY_OF, 0); }
		public TerminalNode COLON() { return getToken(JSONSchemaParser.COLON, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public AnyOfElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anyOfElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONSchemaParserListener) ((JSONSchemaParserListener)listener).enterAnyOfElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONSchemaParserListener) ((JSONSchemaParserListener)listener).exitAnyOfElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSONSchemaParserVisitor) return ((JSONSchemaParserVisitor<? extends T>)visitor).visitAnyOfElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnyOfElementContext anyOfElement() throws RecognitionException {
		AnyOfElementContext _localctx = new AnyOfElementContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_anyOfElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(ANY_OF);
			setState(250);
			match(COLON);
			setState(251);
			array();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnionTypeElementContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(JSONSchemaParser.TYPE, 0); }
		public TerminalNode COLON() { return getToken(JSONSchemaParser.COLON, 0); }
		public OneOfElementContext oneOfElement() {
			return getRuleContext(OneOfElementContext.class,0);
		}
		public AllOfElementContext allOfElement() {
			return getRuleContext(AllOfElementContext.class,0);
		}
		public AnyOfElementContext anyOfElement() {
			return getRuleContext(AnyOfElementContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public UnionTypeElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unionTypeElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONSchemaParserListener) ((JSONSchemaParserListener)listener).enterUnionTypeElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONSchemaParserListener) ((JSONSchemaParserListener)listener).exitUnionTypeElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSONSchemaParserVisitor) return ((JSONSchemaParserVisitor<? extends T>)visitor).visitUnionTypeElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnionTypeElementContext unionTypeElement() throws RecognitionException {
		UnionTypeElementContext _localctx = new UnionTypeElementContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_unionTypeElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(TYPE);
			setState(254);
			match(COLON);
			setState(259);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ONE_OF:
				{
				setState(255);
				oneOfElement();
				}
				break;
			case ALL_OF:
				{
				setState(256);
				allOfElement();
				}
				break;
			case ANY_OF:
				{
				setState(257);
				anyOfElement();
				}
				break;
			case LBRACKET:
				{
				setState(258);
				array();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NullTypeContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(JSONSchemaParser.LBRACE, 0); }
		public TerminalNode TYPE() { return getToken(JSONSchemaParser.TYPE, 0); }
		public TerminalNode COLON() { return getToken(JSONSchemaParser.COLON, 0); }
		public TerminalNode NULL() { return getToken(JSONSchemaParser.NULL, 0); }
		public TerminalNode RBRACE() { return getToken(JSONSchemaParser.RBRACE, 0); }
		public NullTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONSchemaParserListener) ((JSONSchemaParserListener)listener).enterNullType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONSchemaParserListener) ((JSONSchemaParserListener)listener).exitNullType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSONSchemaParserVisitor) return ((JSONSchemaParserVisitor<? extends T>)visitor).visitNullType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NullTypeContext nullType() throws RecognitionException {
		NullTypeContext _localctx = new NullTypeContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_nullType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(LBRACE);
			setState(262);
			match(TYPE);
			setState(263);
			match(COLON);
			setState(264);
			match(NULL);
			setState(265);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(JSONSchemaParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(JSONSchemaParser.RBRACKET, 0); }
		public List<SchemaObjectContext> schemaObject() {
			return getRuleContexts(SchemaObjectContext.class);
		}
		public SchemaObjectContext schemaObject(int i) {
			return getRuleContext(SchemaObjectContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JSONSchemaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JSONSchemaParser.COMMA, i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONSchemaParserListener) ((JSONSchemaParserListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONSchemaParserListener) ((JSONSchemaParserListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSONSchemaParserVisitor) return ((JSONSchemaParserVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(LBRACKET);
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(268);
				schemaObject();
				setState(273);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(269);
					match(COMMA);
					setState(270);
					schemaObject();
					}
					}
					setState(275);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(278);
			match(RBRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(JSONSchemaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JSONSchemaParser.RBRACE, 0); }
		public List<TerminalNode> STRING_LITERAL() { return getTokens(JSONSchemaParser.STRING_LITERAL); }
		public TerminalNode STRING_LITERAL(int i) {
			return getToken(JSONSchemaParser.STRING_LITERAL, i);
		}
		public List<TerminalNode> COLON() { return getTokens(JSONSchemaParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(JSONSchemaParser.COLON, i);
		}
		public List<SchemaObjectContext> schemaObject() {
			return getRuleContexts(SchemaObjectContext.class);
		}
		public SchemaObjectContext schemaObject(int i) {
			return getRuleContext(SchemaObjectContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JSONSchemaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JSONSchemaParser.COMMA, i);
		}
		public ObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONSchemaParserListener) ((JSONSchemaParserListener)listener).enterObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONSchemaParserListener) ((JSONSchemaParserListener)listener).exitObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSONSchemaParserVisitor) return ((JSONSchemaParserVisitor<? extends T>)visitor).visitObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectContext object() throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_object);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			match(LBRACE);
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING_LITERAL) {
				{
				setState(281);
				match(STRING_LITERAL);
				setState(282);
				match(COLON);
				setState(283);
				schemaObject();
				setState(290);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(284);
					match(COMMA);
					setState(285);
					match(STRING_LITERAL);
					setState(286);
					match(COLON);
					setState(287);
					schemaObject();
					}
					}
					setState(292);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(295);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001+\u012a\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0003\u0001O\b\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0005\u0002V\b\u0002\n\u0002\f\u0002Y\t\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"y\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b"+
		"\u009b\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0003\r\u00a6\b\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0003\u000e\u00ac\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c"+
		"\u00ec\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0003!\u0104\b!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001#\u0001#\u0001#\u0001#\u0005#\u0110\b#\n#\f#\u0113\t#\u0003#\u0115"+
		"\b#\u0001#\u0001#\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0005$\u0121\b$\n$\f$\u0124\t$\u0003$\u0126\b$\u0001$\u0001$\u0001$"+
		"\u0000\u0000%\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFH\u0000\u0001\u0001\u0000"+
		" $\u0130\u0000J\u0001\u0000\u0000\u0000\u0002L\u0001\u0000\u0000\u0000"+
		"\u0004R\u0001\u0000\u0000\u0000\u0006x\u0001\u0000\u0000\u0000\bz\u0001"+
		"\u0000\u0000\u0000\n~\u0001\u0000\u0000\u0000\f\u0082\u0001\u0000\u0000"+
		"\u0000\u000e\u0086\u0001\u0000\u0000\u0000\u0010\u008a\u0001\u0000\u0000"+
		"\u0000\u0012\u008e\u0001\u0000\u0000\u0000\u0014\u0092\u0001\u0000\u0000"+
		"\u0000\u0016\u0095\u0001\u0000\u0000\u0000\u0018\u009c\u0001\u0000\u0000"+
		"\u0000\u001a\u00a0\u0001\u0000\u0000\u0000\u001c\u00a7\u0001\u0000\u0000"+
		"\u0000\u001e\u00ad\u0001\u0000\u0000\u0000 \u00b1\u0001\u0000\u0000\u0000"+
		"\"\u00b5\u0001\u0000\u0000\u0000$\u00b9\u0001\u0000\u0000\u0000&\u00bd"+
		"\u0001\u0000\u0000\u0000(\u00c1\u0001\u0000\u0000\u0000*\u00c5\u0001\u0000"+
		"\u0000\u0000,\u00c9\u0001\u0000\u0000\u0000.\u00cd\u0001\u0000\u0000\u0000"+
		"0\u00d1\u0001\u0000\u0000\u00002\u00d5\u0001\u0000\u0000\u00004\u00d9"+
		"\u0001\u0000\u0000\u00006\u00dd\u0001\u0000\u0000\u00008\u00e1\u0001\u0000"+
		"\u0000\u0000:\u00ed\u0001\u0000\u0000\u0000<\u00f1\u0001\u0000\u0000\u0000"+
		">\u00f5\u0001\u0000\u0000\u0000@\u00f9\u0001\u0000\u0000\u0000B\u00fd"+
		"\u0001\u0000\u0000\u0000D\u0105\u0001\u0000\u0000\u0000F\u010b\u0001\u0000"+
		"\u0000\u0000H\u0118\u0001\u0000\u0000\u0000JK\u0003\u0002\u0001\u0000"+
		"K\u0001\u0001\u0000\u0000\u0000LN\u0005\'\u0000\u0000MO\u0003\u0004\u0002"+
		"\u0000NM\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000OP\u0001\u0000"+
		"\u0000\u0000PQ\u0005(\u0000\u0000Q\u0003\u0001\u0000\u0000\u0000RW\u0003"+
		"\u0006\u0003\u0000ST\u0005&\u0000\u0000TV\u0003\u0006\u0003\u0000US\u0001"+
		"\u0000\u0000\u0000VY\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000"+
		"WX\u0001\u0000\u0000\u0000X\u0005\u0001\u0000\u0000\u0000YW\u0001\u0000"+
		"\u0000\u0000Zy\u0003\b\u0004\u0000[y\u0003\n\u0005\u0000\\y\u0003\f\u0006"+
		"\u0000]y\u0003\u000e\u0007\u0000^y\u0003\u0012\t\u0000_y\u0003\u0014\n"+
		"\u0000`y\u0003\u0010\b\u0000ay\u0003\u0016\u000b\u0000by\u0003\u0018\f"+
		"\u0000cy\u0003\u001a\r\u0000dy\u0003\u001c\u000e\u0000ey\u0003\u001e\u000f"+
		"\u0000fy\u0003 \u0010\u0000gy\u0003\"\u0011\u0000hy\u0003$\u0012\u0000"+
		"iy\u0003&\u0013\u0000jy\u0003(\u0014\u0000ky\u0003*\u0015\u0000ly\u0003"+
		",\u0016\u0000my\u0003:\u001d\u0000ny\u0003.\u0017\u0000oy\u00032\u0019"+
		"\u0000py\u00030\u0018\u0000qy\u00034\u001a\u0000ry\u00036\u001b\u0000"+
		"sy\u0003<\u001e\u0000ty\u0003@ \u0000uy\u0003>\u001f\u0000vy\u00038\u001c"+
		"\u0000wy\u0003B!\u0000xZ\u0001\u0000\u0000\u0000x[\u0001\u0000\u0000\u0000"+
		"x\\\u0001\u0000\u0000\u0000x]\u0001\u0000\u0000\u0000x^\u0001\u0000\u0000"+
		"\u0000x_\u0001\u0000\u0000\u0000x`\u0001\u0000\u0000\u0000xa\u0001\u0000"+
		"\u0000\u0000xb\u0001\u0000\u0000\u0000xc\u0001\u0000\u0000\u0000xd\u0001"+
		"\u0000\u0000\u0000xe\u0001\u0000\u0000\u0000xf\u0001\u0000\u0000\u0000"+
		"xg\u0001\u0000\u0000\u0000xh\u0001\u0000\u0000\u0000xi\u0001\u0000\u0000"+
		"\u0000xj\u0001\u0000\u0000\u0000xk\u0001\u0000\u0000\u0000xl\u0001\u0000"+
		"\u0000\u0000xm\u0001\u0000\u0000\u0000xn\u0001\u0000\u0000\u0000xo\u0001"+
		"\u0000\u0000\u0000xp\u0001\u0000\u0000\u0000xq\u0001\u0000\u0000\u0000"+
		"xr\u0001\u0000\u0000\u0000xs\u0001\u0000\u0000\u0000xt\u0001\u0000\u0000"+
		"\u0000xu\u0001\u0000\u0000\u0000xv\u0001\u0000\u0000\u0000xw\u0001\u0000"+
		"\u0000\u0000y\u0007\u0001\u0000\u0000\u0000z{\u0005\u0002\u0000\u0000"+
		"{|\u0005%\u0000\u0000|}\u0005#\u0000\u0000}\t\u0001\u0000\u0000\u0000"+
		"~\u007f\u0005\u0005\u0000\u0000\u007f\u0080\u0005%\u0000\u0000\u0080\u0081"+
		"\u0005#\u0000\u0000\u0081\u000b\u0001\u0000\u0000\u0000\u0082\u0083\u0005"+
		"\u000f\u0000\u0000\u0083\u0084\u0005%\u0000\u0000\u0084\u0085\u0005#\u0000"+
		"\u0000\u0085\r\u0001\u0000\u0000\u0000\u0086\u0087\u0005\u000b\u0000\u0000"+
		"\u0087\u0088\u0005%\u0000\u0000\u0088\u0089\u0003\u0006\u0003\u0000\u0089"+
		"\u000f\u0001\u0000\u0000\u0000\u008a\u008b\u0005\u0011\u0000\u0000\u008b"+
		"\u008c\u0005%\u0000\u0000\u008c\u008d\u0005#\u0000\u0000\u008d\u0011\u0001"+
		"\u0000\u0000\u0000\u008e\u008f\u0005\t\u0000\u0000\u008f\u0090\u0005%"+
		"\u0000\u0000\u0090\u0091\u0005#\u0000\u0000\u0091\u0013\u0001\u0000\u0000"+
		"\u0000\u0092\u0093\u0005\n\u0000\u0000\u0093\u0094\u0005%\u0000\u0000"+
		"\u0094\u0015\u0001\u0000\u0000\u0000\u0095\u0096\u0005\u0001\u0000\u0000"+
		"\u0096\u009a\u0005%\u0000\u0000\u0097\u009b\u0003\u0002\u0001\u0000\u0098"+
		"\u009b\u0003B!\u0000\u0099\u009b\u0003D\"\u0000\u009a\u0097\u0001\u0000"+
		"\u0000\u0000\u009a\u0098\u0001\u0000\u0000\u0000\u009a\u0099\u0001\u0000"+
		"\u0000\u0000\u009b\u0017\u0001\u0000\u0000\u0000\u009c\u009d\u0005\u0007"+
		"\u0000\u0000\u009d\u009e\u0005%\u0000\u0000\u009e\u009f\u0003H$\u0000"+
		"\u009f\u0019\u0001\u0000\u0000\u0000\u00a0\u00a1\u0005\b\u0000\u0000\u00a1"+
		"\u00a5\u0005%\u0000\u0000\u00a2\u00a6\u0003\u0002\u0001\u0000\u00a3\u00a6"+
		"\u0005 \u0000\u0000\u00a4\u00a6\u0005!\u0000\u0000\u00a5\u00a2\u0001\u0000"+
		"\u0000\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a5\u00a4\u0001\u0000"+
		"\u0000\u0000\u00a6\u001b\u0001\u0000\u0000\u0000\u00a7\u00a8\u0005\u0014"+
		"\u0000\u0000\u00a8\u00ab\u0005%\u0000\u0000\u00a9\u00ac\u0003\u0002\u0001"+
		"\u0000\u00aa\u00ac\u0003F#\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ab"+
		"\u00aa\u0001\u0000\u0000\u0000\u00ac\u001d\u0001\u0000\u0000\u0000\u00ad"+
		"\u00ae\u0005\u0013\u0000\u0000\u00ae\u00af\u0005%\u0000\u0000\u00af\u00b0"+
		"\u0003F#\u0000\u00b0\u001f\u0001\u0000\u0000\u0000\u00b1\u00b2\u0005\u001f"+
		"\u0000\u0000\u00b2\u00b3\u0005%\u0000\u0000\u00b3\u00b4\u0005#\u0000\u0000"+
		"\u00b4!\u0001\u0000\u0000\u0000\u00b5\u00b6\u0005\u0018\u0000\u0000\u00b6"+
		"\u00b7\u0005%\u0000\u0000\u00b7\u00b8\u0005$\u0000\u0000\u00b8#\u0001"+
		"\u0000\u0000\u0000\u00b9\u00ba\u0005\u0019\u0000\u0000\u00ba\u00bb\u0005"+
		"%\u0000\u0000\u00bb\u00bc\u0005$\u0000\u0000\u00bc%\u0001\u0000\u0000"+
		"\u0000\u00bd\u00be\u0005\u001b\u0000\u0000\u00be\u00bf\u0005%\u0000\u0000"+
		"\u00bf\u00c0\u0005$\u0000\u0000\u00c0\'\u0001\u0000\u0000\u0000\u00c1"+
		"\u00c2\u0005\u001c\u0000\u0000\u00c2\u00c3\u0005%\u0000\u0000\u00c3\u00c4"+
		"\u0005$\u0000\u0000\u00c4)\u0001\u0000\u0000\u0000\u00c5\u00c6\u0005\u001d"+
		"\u0000\u0000\u00c6\u00c7\u0005%\u0000\u0000\u00c7\u00c8\u0005$\u0000\u0000"+
		"\u00c8+\u0001\u0000\u0000\u0000\u00c9\u00ca\u0005\u001e\u0000\u0000\u00ca"+
		"\u00cb\u0005%\u0000\u0000\u00cb\u00cc\u0005#\u0000\u0000\u00cc-\u0001"+
		"\u0000\u0000\u0000\u00cd\u00ce\u0005\u0003\u0000\u0000\u00ce\u00cf\u0005"+
		"%\u0000\u0000\u00cf\u00d0\u0005#\u0000\u0000\u00d0/\u0001\u0000\u0000"+
		"\u0000\u00d1\u00d2\u0005\u0010\u0000\u0000\u00d2\u00d3\u0005%\u0000\u0000"+
		"\u00d3\u00d4\u0003H$\u0000\u00d41\u0001\u0000\u0000\u0000\u00d5\u00d6"+
		"\u0005\u0004\u0000\u0000\u00d6\u00d7\u0005%\u0000\u0000\u00d7\u00d8\u0003"+
		"H$\u0000\u00d83\u0001\u0000\u0000\u0000\u00d9\u00da\u0005\u001a\u0000"+
		"\u0000\u00da\u00db\u0005%\u0000\u0000\u00db\u00dc\u0003H$\u0000\u00dc"+
		"5\u0001\u0000\u0000\u0000\u00dd\u00de\u0005\u0016\u0000\u0000\u00de\u00df"+
		"\u0005%\u0000\u0000\u00df\u00e0\u0007\u0000\u0000\u0000\u00e07\u0001\u0000"+
		"\u0000\u0000\u00e1\u00e2\u0005#\u0000\u0000\u00e2\u00eb\u0005%\u0000\u0000"+
		"\u00e3\u00e4\u0005)\u0000\u0000\u00e4\u00e5\u0003\u0002\u0001\u0000\u00e5"+
		"\u00e6\u0005&\u0000\u0000\u00e6\u00e7\u0005\"\u0000\u0000\u00e7\u00ec"+
		"\u0001\u0000\u0000\u0000\u00e8\u00e9\u0003D\"\u0000\u00e9\u00ea\u0005"+
		"*\u0000\u0000\u00ea\u00ec\u0001\u0000\u0000\u0000\u00eb\u00e3\u0001\u0000"+
		"\u0000\u0000\u00eb\u00e8\u0001\u0000\u0000\u0000\u00ec9\u0001\u0000\u0000"+
		"\u0000\u00ed\u00ee\u0005\u0017\u0000\u0000\u00ee\u00ef\u0005%\u0000\u0000"+
		"\u00ef\u00f0\u0003F#\u0000\u00f0;\u0001\u0000\u0000\u0000\u00f1\u00f2"+
		"\u0005\r\u0000\u0000\u00f2\u00f3\u0005%\u0000\u0000\u00f3\u00f4\u0003"+
		"F#\u0000\u00f4=\u0001\u0000\u0000\u0000\u00f5\u00f6\u0005\u000e\u0000"+
		"\u0000\u00f6\u00f7\u0005%\u0000\u0000\u00f7\u00f8\u0003F#\u0000\u00f8"+
		"?\u0001\u0000\u0000\u0000\u00f9\u00fa\u0005\u0012\u0000\u0000\u00fa\u00fb"+
		"\u0005%\u0000\u0000\u00fb\u00fc\u0003F#\u0000\u00fcA\u0001\u0000\u0000"+
		"\u0000\u00fd\u00fe\u0005\u0001\u0000\u0000\u00fe\u0103\u0005%\u0000\u0000"+
		"\u00ff\u0104\u0003<\u001e\u0000\u0100\u0104\u0003>\u001f\u0000\u0101\u0104"+
		"\u0003@ \u0000\u0102\u0104\u0003F#\u0000\u0103\u00ff\u0001\u0000\u0000"+
		"\u0000\u0103\u0100\u0001\u0000\u0000\u0000\u0103\u0101\u0001\u0000\u0000"+
		"\u0000\u0103\u0102\u0001\u0000\u0000\u0000\u0104C\u0001\u0000\u0000\u0000"+
		"\u0105\u0106\u0005\'\u0000\u0000\u0106\u0107\u0005\u0001\u0000\u0000\u0107"+
		"\u0108\u0005%\u0000\u0000\u0108\u0109\u0005\"\u0000\u0000\u0109\u010a"+
		"\u0005(\u0000\u0000\u010aE\u0001\u0000\u0000\u0000\u010b\u0114\u0005)"+
		"\u0000\u0000\u010c\u0111\u0003\u0002\u0001\u0000\u010d\u010e\u0005&\u0000"+
		"\u0000\u010e\u0110\u0003\u0002\u0001\u0000\u010f\u010d\u0001\u0000\u0000"+
		"\u0000\u0110\u0113\u0001\u0000\u0000\u0000\u0111\u010f\u0001\u0000\u0000"+
		"\u0000\u0111\u0112\u0001\u0000\u0000\u0000\u0112\u0115\u0001\u0000\u0000"+
		"\u0000\u0113\u0111\u0001\u0000\u0000\u0000\u0114\u010c\u0001\u0000\u0000"+
		"\u0000\u0114\u0115\u0001\u0000\u0000\u0000\u0115\u0116\u0001\u0000\u0000"+
		"\u0000\u0116\u0117\u0005*\u0000\u0000\u0117G\u0001\u0000\u0000\u0000\u0118"+
		"\u0125\u0005\'\u0000\u0000\u0119\u011a\u0005#\u0000\u0000\u011a\u011b"+
		"\u0005%\u0000\u0000\u011b\u0122\u0003\u0002\u0001\u0000\u011c\u011d\u0005"+
		"&\u0000\u0000\u011d\u011e\u0005#\u0000\u0000\u011e\u011f\u0005%\u0000"+
		"\u0000\u011f\u0121\u0003\u0002\u0001\u0000\u0120\u011c\u0001\u0000\u0000"+
		"\u0000\u0121\u0124\u0001\u0000\u0000\u0000\u0122\u0120\u0001\u0000\u0000"+
		"\u0000\u0122\u0123\u0001\u0000\u0000\u0000\u0123\u0126\u0001\u0000\u0000"+
		"\u0000\u0124\u0122\u0001\u0000\u0000\u0000\u0125\u0119\u0001\u0000\u0000"+
		"\u0000\u0125\u0126\u0001\u0000\u0000\u0000\u0126\u0127\u0001\u0000\u0000"+
		"\u0000\u0127\u0128\u0005(\u0000\u0000\u0128I\u0001\u0000\u0000\u0000\f"+
		"NWx\u009a\u00a5\u00ab\u00eb\u0103\u0111\u0114\u0122\u0125";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}