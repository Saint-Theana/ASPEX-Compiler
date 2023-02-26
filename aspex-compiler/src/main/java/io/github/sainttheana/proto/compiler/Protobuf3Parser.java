// Generated from io/github/sainttheana/proto/compiler/Protobuf3.g4 by ANTLR 4.7.1

package io.github.sainttheana.proto.compiler;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Protobuf3Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SYNTAX=1, IMPORT=2, WEAK=3, PUBLIC=4, PACKAGE=5, OPTION=6, REPEATED=7, 
		ONEOF=8, MAP=9, INT32=10, INT64=11, UINT32=12, UINT64=13, SINT32=14, SINT64=15, 
		FIXED32=16, FIXED64=17, SFIXED32=18, SFIXED64=19, BOOL=20, STRING=21, 
		DOUBLE=22, FLOAT=23, BYTES=24, RESERVED=25, TO=26, MAX=27, ENUM=28, MESSAGE=29, 
		SERVICE=30, EXTEND=31, RPC=32, STREAM=33, RETURNS=34, PROTO3_LIT_SINGLE=35, 
		PROTO3_LIT_DOBULE=36, SEMI=37, EQ=38, LP=39, RP=40, LB=41, RB=42, LC=43, 
		RC=44, LT=45, GT=46, DOT=47, COMMA=48, COLON=49, PLUS=50, MINUS=51, STR_LIT=52, 
		BOOL_LIT=53, FLOAT_LIT=54, INT_LIT=55, IDENTIFIER=56, WS=57, LINE_COMMENT=58, 
		COMMENT=59;
	public static final int
		RULE_proto = 0, RULE_syntax = 1, RULE_importStatement = 2, RULE_packageStatement = 3, 
		RULE_optionStatement = 4, RULE_optionName = 5, RULE_field = 6, RULE_fieldOptions = 7, 
		RULE_fieldOption = 8, RULE_fieldNumber = 9, RULE_oneof = 10, RULE_oneofField = 11, 
		RULE_mapField = 12, RULE_keyType = 13, RULE_type_ = 14, RULE_reserved = 15, 
		RULE_ranges = 16, RULE_range_ = 17, RULE_reservedFieldNames = 18, RULE_topLevelDef = 19, 
		RULE_enumDef = 20, RULE_enumBody = 21, RULE_enumElement = 22, RULE_enumField = 23, 
		RULE_enumValueOptions = 24, RULE_enumValueOption = 25, RULE_messageDef = 26, 
		RULE_messageBody = 27, RULE_messageElement = 28, RULE_extendDef = 29, 
		RULE_serviceDef = 30, RULE_serviceElement = 31, RULE_rpc = 32, RULE_constant = 33, 
		RULE_blockLit = 34, RULE_emptyStatement_ = 35, RULE_ident = 36, RULE_fullIdent = 37, 
		RULE_messageName = 38, RULE_enumName = 39, RULE_fieldName = 40, RULE_oneofName = 41, 
		RULE_mapName = 42, RULE_serviceName = 43, RULE_rpcName = 44, RULE_messageType = 45, 
		RULE_enumType = 46, RULE_intLit = 47, RULE_strLit = 48, RULE_boolLit = 49, 
		RULE_floatLit = 50, RULE_keywords = 51;
	public static final String[] ruleNames = {
		"proto", "syntax", "importStatement", "packageStatement", "optionStatement", 
		"optionName", "field", "fieldOptions", "fieldOption", "fieldNumber", "oneof", 
		"oneofField", "mapField", "keyType", "type_", "reserved", "ranges", "range_", 
		"reservedFieldNames", "topLevelDef", "enumDef", "enumBody", "enumElement", 
		"enumField", "enumValueOptions", "enumValueOption", "messageDef", "messageBody", 
		"messageElement", "extendDef", "serviceDef", "serviceElement", "rpc", 
		"constant", "blockLit", "emptyStatement_", "ident", "fullIdent", "messageName", 
		"enumName", "fieldName", "oneofName", "mapName", "serviceName", "rpcName", 
		"messageType", "enumType", "intLit", "strLit", "boolLit", "floatLit", 
		"keywords"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'syntax'", "'import'", "'weak'", "'public'", "'package'", "'option'", 
		"'repeated'", "'oneof'", "'map'", "'int32'", "'int64'", "'uint32'", "'uint64'", 
		"'sint32'", "'sint64'", "'fixed32'", "'fixed64'", "'sfixed32'", "'sfixed64'", 
		"'bool'", "'string'", "'double'", "'float'", "'bytes'", "'reserved'", 
		"'to'", "'max'", "'enum'", "'message'", "'service'", "'extend'", "'rpc'", 
		"'stream'", "'returns'", "'\"proto3\"'", "''proto3''", "';'", "'='", "'('", 
		"')'", "'['", "']'", "'{'", "'}'", "'<'", "'>'", "'.'", "','", "':'", 
		"'+'", "'-'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SYNTAX", "IMPORT", "WEAK", "PUBLIC", "PACKAGE", "OPTION", "REPEATED", 
		"ONEOF", "MAP", "INT32", "INT64", "UINT32", "UINT64", "SINT32", "SINT64", 
		"FIXED32", "FIXED64", "SFIXED32", "SFIXED64", "BOOL", "STRING", "DOUBLE", 
		"FLOAT", "BYTES", "RESERVED", "TO", "MAX", "ENUM", "MESSAGE", "SERVICE", 
		"EXTEND", "RPC", "STREAM", "RETURNS", "PROTO3_LIT_SINGLE", "PROTO3_LIT_DOBULE", 
		"SEMI", "EQ", "LP", "RP", "LB", "RB", "LC", "RC", "LT", "GT", "DOT", "COMMA", 
		"COLON", "PLUS", "MINUS", "STR_LIT", "BOOL_LIT", "FLOAT_LIT", "INT_LIT", 
		"IDENTIFIER", "WS", "LINE_COMMENT", "COMMENT"
	};
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
	public String getGrammarFileName() { return "Protobuf3.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Protobuf3Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProtoContext extends ParserRuleContext {
		public SyntaxContext syntax() {
			return getRuleContext(SyntaxContext.class,0);
		}
		public TerminalNode EOF() { return getToken(Protobuf3Parser.EOF, 0); }
		public PackageStatementContext packageStatement() {
			return getRuleContext(PackageStatementContext.class,0);
		}
		public List<OptionStatementContext> optionStatement() {
			return getRuleContexts(OptionStatementContext.class);
		}
		public OptionStatementContext optionStatement(int i) {
			return getRuleContext(OptionStatementContext.class,i);
		}
		public List<ImportStatementContext> importStatement() {
			return getRuleContexts(ImportStatementContext.class);
		}
		public ImportStatementContext importStatement(int i) {
			return getRuleContext(ImportStatementContext.class,i);
		}
		public List<TopLevelDefContext> topLevelDef() {
			return getRuleContexts(TopLevelDefContext.class);
		}
		public TopLevelDefContext topLevelDef(int i) {
			return getRuleContext(TopLevelDefContext.class,i);
		}
		public List<EmptyStatement_Context> emptyStatement_() {
			return getRuleContexts(EmptyStatement_Context.class);
		}
		public EmptyStatement_Context emptyStatement_(int i) {
			return getRuleContext(EmptyStatement_Context.class,i);
		}
		public ProtoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proto; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Protobuf3Visitor ) return ((Protobuf3Visitor<? extends T>)visitor).visitProto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProtoContext proto() throws RecognitionException {
		ProtoContext _localctx = new ProtoContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_proto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			syntax();
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PACKAGE) {
				{
				setState(105);
				packageStatement();
				}
			}

			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT || _la==OPTION) {
				{
				setState(110);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OPTION:
					{
					setState(108);
					optionStatement();
					}
					break;
				case IMPORT:
					{
					setState(109);
					importStatement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENUM) | (1L << MESSAGE) | (1L << SERVICE) | (1L << EXTEND) | (1L << SEMI))) != 0)) {
				{
				setState(117);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ENUM:
				case MESSAGE:
				case SERVICE:
				case EXTEND:
					{
					setState(115);
					topLevelDef();
					}
					break;
				case SEMI:
					{
					setState(116);
					emptyStatement_();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(122);
			match(EOF);
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

	public static class SyntaxContext extends ParserRuleContext {
		public TerminalNode SYNTAX() { return getToken(Protobuf3Parser.SYNTAX, 0); }
		public TerminalNode EQ() { return getToken(Protobuf3Parser.EQ, 0); }
		public TerminalNode SEMI() { return getToken(Protobuf3Parser.SEMI, 0); }
		public TerminalNode PROTO3_LIT_SINGLE() { return getToken(Protobuf3Parser.PROTO3_LIT_SINGLE, 0); }
		public TerminalNode PROTO3_LIT_DOBULE() { return getToken(Protobuf3Parser.PROTO3_LIT_DOBULE, 0); }
		public SyntaxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_syntax; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Protobuf3Visitor ) return ((Protobuf3Visitor<? extends T>)visitor).visitSyntax(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SyntaxContext syntax() throws RecognitionException {
		SyntaxContext _localctx = new SyntaxContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_syntax);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(SYNTAX);
			setState(125);
			match(EQ);
			setState(126);
			_la = _input.LA(1);
			if ( !(_la==PROTO3_LIT_SINGLE || _la==PROTO3_LIT_DOBULE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(127);
			match(SEMI);
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

	public static class ImportStatementContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(Protobuf3Parser.IMPORT, 0); }
		public StrLitContext strLit() {
			return getRuleContext(StrLitContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(Protobuf3Parser.SEMI, 0); }
		public TerminalNode WEAK() { return getToken(Protobuf3Parser.WEAK, 0); }
		public TerminalNode PUBLIC() { return getToken(Protobuf3Parser.PUBLIC, 0); }
		public ImportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Protobuf3Visitor ) return ((Protobuf3Visitor<? extends T>)visitor).visitImportStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportStatementContext importStatement() throws RecognitionException {
		ImportStatementContext _localctx = new ImportStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(IMPORT);
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WEAK || _la==PUBLIC) {
				{
				setState(130);
				_la = _input.LA(1);
				if ( !(_la==WEAK || _la==PUBLIC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(133);
			strLit();
			setState(134);
			match(SEMI);
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

	public static class PackageStatementContext extends ParserRuleContext {
		public TerminalNode PACKAGE() { return getToken(Protobuf3Parser.PACKAGE, 0); }
		public FullIdentContext fullIdent() {
			return getRuleContext(FullIdentContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(Protobuf3Parser.SEMI, 0); }
		public PackageStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Protobuf3Visitor ) return ((Protobuf3Visitor<? extends T>)visitor).visitPackageStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageStatementContext packageStatement() throws RecognitionException {
		PackageStatementContext _localctx = new PackageStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_packageStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(PACKAGE);
			setState(137);
			fullIdent();
			setState(138);
			match(SEMI);
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

	public static class OptionStatementContext extends ParserRuleContext {
		public TerminalNode OPTION() { return getToken(Protobuf3Parser.OPTION, 0); }
		public OptionNameContext optionName() {
			return getRuleContext(OptionNameContext.class,0);
		}
		public TerminalNode EQ() { return getToken(Protobuf3Parser.EQ, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(Protobuf3Parser.SEMI, 0); }
		public OptionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Protobuf3Visitor ) return ((Protobuf3Visitor<? extends T>)visitor).visitOptionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptionStatementContext optionStatement() throws RecognitionException {
		OptionStatementContext _localctx = new OptionStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_optionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(OPTION);
			setState(141);
			optionName();
			setState(142);
			match(EQ);
			setState(143);
			constant();
			setState(144);
			match(SEMI);
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

	public static class OptionNameContext extends ParserRuleContext {
		public List<FullIdentContext> fullIdent() {
			return getRuleContexts(FullIdentContext.class);
		}
		public FullIdentContext fullIdent(int i) {
			return getRuleContext(FullIdentContext.class,i);
		}
		public TerminalNode LP() { return getToken(Protobuf3Parser.LP, 0); }
		public TerminalNode RP() { return getToken(Protobuf3Parser.RP, 0); }
		public TerminalNode DOT() { return getToken(Protobuf3Parser.DOT, 0); }
		public OptionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Protobuf3Visitor ) return ((Protobuf3Visitor<? extends T>)visitor).visitOptionName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptionNameContext optionName() throws RecognitionException {
		OptionNameContext _localctx = new OptionNameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_optionName);
		int _la;
		try {
			setState(154);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SYNTAX:
			case IMPORT:
			case WEAK:
			case PUBLIC:
			case PACKAGE:
			case OPTION:
			case REPEATED:
			case ONEOF:
			case MAP:
			case INT32:
			case INT64:
			case UINT32:
			case UINT64:
			case SINT32:
			case SINT64:
			case FIXED32:
			case FIXED64:
			case SFIXED32:
			case SFIXED64:
			case BOOL:
			case STRING:
			case DOUBLE:
			case FLOAT:
			case BYTES:
			case RESERVED:
			case TO:
			case MAX:
			case ENUM:
			case MESSAGE:
			case SERVICE:
			case EXTEND:
			case RPC:
			case STREAM:
			case RETURNS:
			case BOOL_LIT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				fullIdent();
				}
				break;
			case LP:
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				match(LP);
				setState(148);
				fullIdent();
				setState(149);
				match(RP);
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOT) {
					{
					setState(150);
					match(DOT);
					setState(151);
					fullIdent();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class FieldContext extends ParserRuleContext {
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public FieldNameContext fieldName() {
			return getRuleContext(FieldNameContext.class,0);
		}
		public TerminalNode EQ() { return getToken(Protobuf3Parser.EQ, 0); }
		public FieldNumberContext fieldNumber() {
			return getRuleContext(FieldNumberContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(Protobuf3Parser.SEMI, 0); }
		public TerminalNode REPEATED() { return getToken(Protobuf3Parser.REPEATED, 0); }
		public TerminalNode LB() { return getToken(Protobuf3Parser.LB, 0); }
		public FieldOptionsContext fieldOptions() {
			return getRuleContext(FieldOptionsContext.class,0);
		}
		public TerminalNode RB() { return getToken(Protobuf3Parser.RB, 0); }
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Protobuf3Visitor ) return ((Protobuf3Visitor<? extends T>)visitor).visitField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_field);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(156);
				match(REPEATED);
				}
				break;
			}
			setState(159);
			type_();
			setState(160);
			fieldName();
			setState(161);
			match(EQ);
			setState(162);
			fieldNumber();
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LB) {
				{
				setState(163);
				match(LB);
				setState(164);
				fieldOptions();
				setState(165);
				match(RB);
				}
			}

			setState(169);
			match(SEMI);
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

	public static class FieldOptionsContext extends ParserRuleContext {
		public List<FieldOptionContext> fieldOption() {
			return getRuleContexts(FieldOptionContext.class);
		}
		public FieldOptionContext fieldOption(int i) {
			return getRuleContext(FieldOptionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Protobuf3Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Protobuf3Parser.COMMA, i);
		}
		public FieldOptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldOptions; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Protobuf3Visitor ) return ((Protobuf3Visitor<? extends T>)visitor).visitFieldOptions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldOptionsContext fieldOptions() throws RecognitionException {
		FieldOptionsContext _localctx = new FieldOptionsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_fieldOptions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			fieldOption();
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(172);
				match(COMMA);
				setState(173);
				fieldOption();
				}
				}
				setState(178);
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

	public static class FieldOptionContext extends ParserRuleContext {
		public OptionNameContext optionName() {
			return getRuleContext(OptionNameContext.class,0);
		}
		public TerminalNode EQ() { return getToken(Protobuf3Parser.EQ, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public FieldOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldOption; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Protobuf3Visitor ) return ((Protobuf3Visitor<? extends T>)visitor).visitFieldOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldOptionContext fieldOption() throws RecognitionException {
		FieldOptionContext _localctx = new FieldOptionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_fieldOption);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			optionName();
			setState(180);
			match(EQ);
			setState(181);
			constant();
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

	public static class FieldNumberContext extends ParserRuleContext {
		public IntLitContext intLit() {
			return getRuleContext(IntLitContext.class,0);
		}
		public FieldNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldNumber; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Protobuf3Visitor ) return ((Protobuf3Visitor<? extends T>)visitor).visitFieldNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldNumberContext fieldNumber() throws RecognitionException {
		FieldNumberContext _localctx = new FieldNumberContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_fieldNumber);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			intLit();
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

	public static class OneofContext extends ParserRuleContext {
		public TerminalNode ONEOF() { return getToken(Protobuf3Parser.ONEOF, 0); }
		public OneofNameContext oneofName() {
			return getRuleContext(OneofNameContext.class,0);
		}
		public TerminalNode LC() { return getToken(Protobuf3Parser.LC, 0); }
		public TerminalNode RC() { return getToken(Protobuf3Parser.RC, 0); }
		public List<OptionStatementContext> optionStatement() {
			return getRuleContexts(OptionStatementContext.class);
		}
		public OptionStatementContext optionStatement(int i) {
			return getRuleContext(OptionStatementContext.class,i);
		}
		public List<OneofFieldContext> oneofField() {
			return getRuleContexts(OneofFieldContext.class);
		}
		public OneofFieldContext oneofField(int i) {
			return getRuleContext(OneofFieldContext.class,i);
		}
		public List<EmptyStatement_Context> emptyStatement_() {
			return getRuleContexts(EmptyStatement_Context.class);
		}
		public EmptyStatement_Context emptyStatement_(int i) {
			return getRuleContext(EmptyStatement_Context.class,i);
		}
		public OneofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oneof; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Protobuf3Visitor ) return ((Protobuf3Visitor<? extends T>)visitor).visitOneof(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OneofContext oneof() throws RecognitionException {
		OneofContext _localctx = new OneofContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_oneof);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(ONEOF);
			setState(186);
			oneofName();
			setState(187);
			match(LC);
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SYNTAX) | (1L << IMPORT) | (1L << WEAK) | (1L << PUBLIC) | (1L << PACKAGE) | (1L << OPTION) | (1L << REPEATED) | (1L << ONEOF) | (1L << MAP) | (1L << INT32) | (1L << INT64) | (1L << UINT32) | (1L << UINT64) | (1L << SINT32) | (1L << SINT64) | (1L << FIXED32) | (1L << FIXED64) | (1L << SFIXED32) | (1L << SFIXED64) | (1L << BOOL) | (1L << STRING) | (1L << DOUBLE) | (1L << FLOAT) | (1L << BYTES) | (1L << RESERVED) | (1L << TO) | (1L << MAX) | (1L << ENUM) | (1L << MESSAGE) | (1L << SERVICE) | (1L << EXTEND) | (1L << RPC) | (1L << STREAM) | (1L << RETURNS) | (1L << SEMI) | (1L << DOT) | (1L << BOOL_LIT) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(191);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(188);
					optionStatement();
					}
					break;
				case 2:
					{
					setState(189);
					oneofField();
					}
					break;
				case 3:
					{
					setState(190);
					emptyStatement_();
					}
					break;
				}
				}
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(196);
			match(RC);
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

	public static class OneofFieldContext extends ParserRuleContext {
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public FieldNameContext fieldName() {
			return getRuleContext(FieldNameContext.class,0);
		}
		public TerminalNode EQ() { return getToken(Protobuf3Parser.EQ, 0); }
		public FieldNumberContext fieldNumber() {
			return getRuleContext(FieldNumberContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(Protobuf3Parser.SEMI, 0); }
		public TerminalNode LB() { return getToken(Protobuf3Parser.LB, 0); }
		public FieldOptionsContext fieldOptions() {
			return getRuleContext(FieldOptionsContext.class,0);
		}
		public TerminalNode RB() { return getToken(Protobuf3Parser.RB, 0); }
		public OneofFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oneofField; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Protobuf3Visitor ) return ((Protobuf3Visitor<? extends T>)visitor).visitOneofField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OneofFieldContext oneofField() throws RecognitionException {
		OneofFieldContext _localctx = new OneofFieldContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_oneofField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			type_();
			setState(199);
			fieldName();
			setState(200);
			match(EQ);
			setState(201);
			fieldNumber();
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LB) {
				{
				setState(202);
				match(LB);
				setState(203);
				fieldOptions();
				setState(204);
				match(RB);
				}
			}

			setState(208);
			match(SEMI);
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

	public static class MapFieldContext extends ParserRuleContext {
		public TerminalNode MAP() { return getToken(Protobuf3Parser.MAP, 0); }
		public TerminalNode LT() { return getToken(Protobuf3Parser.LT, 0); }
		public KeyTypeContext keyType() {
			return getRuleContext(KeyTypeContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(Protobuf3Parser.COMMA, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode GT() { return getToken(Protobuf3Parser.GT, 0); }
		public MapNameContext mapName() {
			return getRuleContext(MapNameContext.class,0);
		}
		public TerminalNode EQ() { return getToken(Protobuf3Parser.EQ, 0); }
		public FieldNumberContext fieldNumber() {
			return getRuleContext(FieldNumberContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(Protobuf3Parser.SEMI, 0); }
		public TerminalNode LB() { return getToken(Protobuf3Parser.LB, 0); }
		public FieldOptionsContext fieldOptions() {
			return getRuleContext(FieldOptionsContext.class,0);
		}
		public TerminalNode RB() { return getToken(Protobuf3Parser.RB, 0); }
		public MapFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapField; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Protobuf3Visitor ) return ((Protobuf3Visitor<? extends T>)visitor).visitMapField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapFieldContext mapField() throws RecognitionException {
		MapFieldContext _localctx = new MapFieldContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_mapField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(MAP);
			setState(211);
			match(LT);
			setState(212);
			keyType();
			setState(213);
			match(COMMA);
			setState(214);
			type_();
			setState(215);
			match(GT);
			setState(216);
			mapName();
			setState(217);
			match(EQ);
			setState(218);
			fieldNumber();
			setState(223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LB) {
				{
				setState(219);
				match(LB);
				setState(220);
				fieldOptions();
				setState(221);
				match(RB);
				}
			}

			setState(225);
			match(SEMI);
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

	public static class KeyTypeContext extends ParserRuleContext {
		public TerminalNode INT32() { return getToken(Protobuf3Parser.INT32, 0); }
		public TerminalNode INT64() { return getToken(Protobuf3Parser.INT64, 0); }
		public TerminalNode UINT32() { return getToken(Protobuf3Parser.UINT32, 0); }
		public TerminalNode UINT64() { return getToken(Protobuf3Parser.UINT64, 0); }
		public TerminalNode SINT32() { return getToken(Protobuf3Parser.SINT32, 0); }
		public TerminalNode SINT64() { return getToken(Protobuf3Parser.SINT64, 0); }
		public TerminalNode FIXED32() { return getToken(Protobuf3Parser.FIXED32, 0); }
		public TerminalNode FIXED64() { return getToken(Protobuf3Parser.FIXED64, 0); }
		public TerminalNode SFIXED32() { return getToken(Protobuf3Parser.SFIXED32, 0); }
		public TerminalNode SFIXED64() { return getToken(Protobuf3Parser.SFIXED64, 0); }
		public TerminalNode BOOL() { return getToken(Protobuf3Parser.BOOL, 0); }
		public TerminalNode STRING() { return getToken(Protobuf3Parser.STRING, 0); }
		public KeyTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Protobuf3Visitor ) return ((Protobuf3Visitor<? extends T>)visitor).visitKeyType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyTypeContext keyType() throws RecognitionException {
		KeyTypeContext _localctx = new KeyTypeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_keyType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT32) | (1L << INT64) | (1L << UINT32) | (1L << UINT64) | (1L << SINT32) | (1L << SINT64) | (1L << FIXED32) | (1L << FIXED64) | (1L << SFIXED32) | (1L << SFIXED64) | (1L << BOOL) | (1L << STRING))) != 0)) ) {
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

	public static class Type_Context extends ParserRuleContext {
		public TerminalNode DOUBLE() { return getToken(Protobuf3Parser.DOUBLE, 0); }
		public TerminalNode FLOAT() { return getToken(Protobuf3Parser.FLOAT, 0); }
		public TerminalNode INT32() { return getToken(Protobuf3Parser.INT32, 0); }
		public TerminalNode INT64() { return getToken(Protobuf3Parser.INT64, 0); }
		public TerminalNode UINT32() { return getToken(Protobuf3Parser.UINT32, 0); }
		public TerminalNode UINT64() { return getToken(Protobuf3Parser.UINT64, 0); }
		public TerminalNode SINT32() { return getToken(Protobuf3Parser.SINT32, 0); }
		public TerminalNode SINT64() { return getToken(Protobuf3Parser.SINT64, 0); }
		public TerminalNode FIXED32() { return getToken(Protobuf3Parser.FIXED32, 0); }
		public TerminalNode FIXED64() { return getToken(Protobuf3Parser.FIXED64, 0); }
		public TerminalNode SFIXED32() { return getToken(Protobuf3Parser.SFIXED32, 0); }
		public TerminalNode SFIXED64() { return getToken(Protobuf3Parser.SFIXED64, 0); }
		public TerminalNode BOOL() { return getToken(Protobuf3Parser.BOOL, 0); }
		public TerminalNode STRING() { return getToken(Protobuf3Parser.STRING, 0); }
		public TerminalNode BYTES() { return getToken(Protobuf3Parser.BYTES, 0); }
		public MessageTypeContext messageType() {
			return getRuleContext(MessageTypeContext.class,0);
		}
		public EnumTypeContext enumType() {
			return getRuleContext(EnumTypeContext.class,0);
		}
		public Type_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Protobuf3Visitor ) return ((Protobuf3Visitor<? extends T>)visitor).visitType_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_Context type_() throws RecognitionException {
		Type_Context _localctx = new Type_Context(_ctx, getState());
		enterRule(_localctx, 28, RULE_type_);
		try {
			setState(246);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(229);
				match(DOUBLE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(230);
				match(FLOAT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(231);
				match(INT32);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(232);
				match(INT64);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(233);
				match(UINT32);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(234);
				match(UINT64);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(235);
				match(SINT32);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(236);
				match(SINT64);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(237);
				match(FIXED32);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(238);
				match(FIXED64);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(239);
				match(SFIXED32);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(240);
				match(SFIXED64);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(241);
				match(BOOL);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(242);
				match(STRING);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(243);
				match(BYTES);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(244);
				messageType();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(245);
				enumType();
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

	public static class ReservedContext extends ParserRuleContext {
		public TerminalNode RESERVED() { return getToken(Protobuf3Parser.RESERVED, 0); }
		public TerminalNode SEMI() { return getToken(Protobuf3Parser.SEMI, 0); }
		public RangesContext ranges() {
			return getRuleContext(RangesContext.class,0);
		}
		public ReservedFieldNamesContext reservedFieldNames() {
			return getRuleContext(ReservedFieldNamesContext.class,0);
		}
		public ReservedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reserved; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Protobuf3Visitor ) return ((Protobuf3Visitor<? extends T>)visitor).visitReserved(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReservedContext reserved() throws RecognitionException {
		ReservedContext _localctx = new ReservedContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_reserved);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(RESERVED);
			setState(251);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_LIT:
				{
				setState(249);
				ranges();
				}
				break;
			case PROTO3_LIT_SINGLE:
			case PROTO3_LIT_DOBULE:
			case STR_LIT:
				{
				setState(250);
				reservedFieldNames();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(253);
			match(SEMI);
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

	public static class RangesContext extends ParserRuleContext {
		public List<Range_Context> range_() {
			return getRuleContexts(Range_Context.class);
		}
		public Range_Context range_(int i) {
			return getRuleContext(Range_Context.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Protobuf3Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Protobuf3Parser.COMMA, i);
		}
		public RangesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ranges; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Protobuf3Visitor ) return ((Protobuf3Visitor<? extends T>)visitor).visitRanges(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangesContext ranges() throws RecognitionException {
		RangesContext _localctx = new RangesContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_ranges);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			range_();
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(256);
				match(COMMA);
				setState(257);
				range_();
				}
				}
				setState(262);
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

	public static class Range_Context extends ParserRuleContext {
		public List<IntLitContext> intLit() {
			return getRuleContexts(IntLitContext.class);
		}
		public IntLitContext intLit(int i) {
			return getRuleContext(IntLitContext.class,i);
		}
		public TerminalNode TO() { return getToken(Protobuf3Parser.TO, 0); }
		public TerminalNode MAX() { return getToken(Protobuf3Parser.MAX, 0); }
		public Range_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Protobuf3Visitor ) return ((Protobuf3Visitor<? extends T>)visitor).visitRange_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Range_Context range_() throws RecognitionException {
		Range_Context _localctx = new Range_Context(_ctx, getState());
		enterRule(_localctx, 34, RULE_range_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			intLit();
			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TO) {
				{
				setState(264);
				match(TO);
				setState(267);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INT_LIT:
					{
					setState(265);
					intLit();
					}
					break;
				case MAX:
					{
					setState(266);
					match(MAX);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
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

	public static class ReservedFieldNamesContext extends ParserRuleContext {
		public List<StrLitContext> strLit() {
			return getRuleContexts(StrLitContext.class);
		}
		public StrLitContext strLit(int i) {
			return getRuleContext(StrLitContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Protobuf3Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Protobuf3Parser.COMMA, i);
		}
		public ReservedFieldNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reservedFieldNames; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Protobuf3Visitor ) return ((Protobuf3Visitor<? extends T>)visitor).visitReservedFieldNames(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReservedFieldNamesContext reservedFieldNames() throws RecognitionException {
		ReservedFieldNamesContext _localctx = new ReservedFieldNamesContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_reservedFieldNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			strLit();
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(272);
				match(COMMA);
				setState(273);
				strLit();
				}
				}
				setState(278);
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

	public static class TopLevelDefContext extends ParserRuleContext {
		public MessageDefContext messageDef() {
			return getRuleContext(MessageDefContext.class,0);
		}
		public EnumDefContext enumDef() {
			return getRuleContext(EnumDefContext.class,0);
		}
		public ExtendDefContext extendDef() {
			return getRuleContext(ExtendDefContext.class,0);
		}
		public ServiceDefContext serviceDef() {
			return getRuleContext(ServiceDefContext.class,0);
		}
		public TopLevelDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topLevelDef; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Protobuf3Visitor ) return ((Protobuf3Visitor<? extends T>)visitor).visitTopLevelDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TopLevelDefContext topLevelDef() throws RecognitionException {
		TopLevelDefContext _localctx = new TopLevelDefContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_topLevelDef);
		try {
			setState(283);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MESSAGE:
				enterOuterAlt(_localctx, 1);
				{
				setState(279);
				messageDef();
				}
				break;
			case ENUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(280);
				enumDef();
				}
				break;
			case EXTEND:
				enterOuterAlt(_localctx, 3);
				{
				setState(281);
				extendDef();
				}
				break;
			case SERVICE:
				enterOuterAlt(_localctx, 4);
				{
				setState(282);
				serviceDef();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class EnumDefContext extends ParserRuleContext {
		public TerminalNode ENUM() { return getToken(Protobuf3Parser.ENUM, 0); }
		public EnumNameContext enumName() {
			return getRuleContext(EnumNameContext.class,0);
		}
		public EnumBodyContext enumBody() {
			return getRuleContext(EnumBodyContext.class,0);
		}
		public EnumDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDef; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Protobuf3Visitor ) return ((Protobuf3Visitor<? extends T>)visitor).visitEnumDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumDefContext enumDef() throws RecognitionException {
		EnumDefContext _localctx = new EnumDefContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_enumDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(ENUM);
			setState(286);
			enumName();
			setState(287);
			enumBody();
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

	public static class EnumBodyContext extends ParserRuleContext {
		public TerminalNode LC() { return getToken(Protobuf3Parser.LC, 0); }
		public TerminalNode RC() { return getToken(Protobuf3Parser.RC, 0); }
		public List<EnumElementContext> enumElement() {
			return getRuleContexts(EnumElementContext.class);
		}
		public EnumElementContext enumElement(int i) {
			return getRuleContext(EnumElementContext.class,i);
		}
		public EnumBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumBody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Protobuf3Visitor ) return ((Protobuf3Visitor<? extends T>)visitor).visitEnumBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumBodyContext enumBody() throws RecognitionException {
		EnumBodyContext _localctx = new EnumBodyContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_enumBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(LC);
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SYNTAX) | (1L << IMPORT) | (1L << WEAK) | (1L << PUBLIC) | (1L << PACKAGE) | (1L << OPTION) | (1L << REPEATED) | (1L << ONEOF) | (1L << MAP) | (1L << INT32) | (1L << INT64) | (1L << UINT32) | (1L << UINT64) | (1L << SINT32) | (1L << SINT64) | (1L << FIXED32) | (1L << FIXED64) | (1L << SFIXED32) | (1L << SFIXED64) | (1L << BOOL) | (1L << STRING) | (1L << DOUBLE) | (1L << FLOAT) | (1L << BYTES) | (1L << RESERVED) | (1L << TO) | (1L << MAX) | (1L << ENUM) | (1L << MESSAGE) | (1L << SERVICE) | (1L << EXTEND) | (1L << RPC) | (1L << STREAM) | (1L << RETURNS) | (1L << SEMI) | (1L << BOOL_LIT) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(290);
				enumElement();
				}
				}
				setState(295);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(296);
			match(RC);
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

	public static class EnumElementContext extends ParserRuleContext {
		public OptionStatementContext optionStatement() {
			return getRuleContext(OptionStatementContext.class,0);
		}
		public EnumFieldContext enumField() {
			return getRuleContext(EnumFieldContext.class,0);
		}
		public EmptyStatement_Context emptyStatement_() {
			return getRuleContext(EmptyStatement_Context.class,0);
		}
		public EnumElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumElement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Protobuf3Visitor ) return ((Protobuf3Visitor<? extends T>)visitor).visitEnumElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumElementContext enumElement() throws RecognitionException {
		EnumElementContext _localctx = new EnumElementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_enumElement);
		try {
			setState(301);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(298);
				optionStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(299);
				enumField();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(300);
				emptyStatement_();
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

	public static class EnumFieldContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode EQ() { return getToken(Protobuf3Parser.EQ, 0); }
		public IntLitContext intLit() {
			return getRuleContext(IntLitContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(Protobuf3Parser.SEMI, 0); }
		public TerminalNode MINUS() { return getToken(Protobuf3Parser.MINUS, 0); }
		public EnumValueOptionsContext enumValueOptions() {
			return getRuleContext(EnumValueOptionsContext.class,0);
		}
		public EnumFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumField; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Protobuf3Visitor ) return ((Protobuf3Visitor<? extends T>)visitor).visitEnumField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumFieldContext enumField() throws RecognitionException {
		EnumFieldContext _localctx = new EnumFieldContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_enumField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			ident();
			setState(304);
			match(EQ);
			setState(306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				setState(305);
				match(MINUS);
				}
			}

			setState(308);
			intLit();
			setState(310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LB) {
				{
				setState(309);
				enumValueOptions();
				}
			}

			setState(312);
			match(SEMI);
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

	public static class EnumValueOptionsContext extends ParserRuleContext {
		public TerminalNode LB() { return getToken(Protobuf3Parser.LB, 0); }
		public List<EnumValueOptionContext> enumValueOption() {
			return getRuleContexts(EnumValueOptionContext.class);
		}
		public EnumValueOptionContext enumValueOption(int i) {
			return getRuleContext(EnumValueOptionContext.class,i);
		}
		public TerminalNode RB() { return getToken(Protobuf3Parser.RB, 0); }
		public List<TerminalNode> COMMA() { return getTokens(Protobuf3Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Protobuf3Parser.COMMA, i);
		}
		public EnumValueOptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumValueOptions; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Protobuf3Visitor ) return ((Protobuf3Visitor<? extends T>)visitor).visitEnumValueOptions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumValueOptionsContext enumValueOptions() throws RecognitionException {
		EnumValueOptionsContext _localctx = new EnumValueOptionsContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_enumValueOptions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			match(LB);
			setState(315);
			enumValueOption();
			setState(320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(316);
				match(COMMA);
				setState(317);
				enumValueOption();
				}
				}
				setState(322);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(323);
			match(RB);
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

	public static class EnumValueOptionContext extends ParserRuleContext {
		public OptionNameContext optionName() {
			return getRuleContext(OptionNameContext.class,0);
		}
		public TerminalNode EQ() { return getToken(Protobuf3Parser.EQ, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public EnumValueOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumValueOption; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Protobuf3Visitor ) return ((Protobuf3Visitor<? extends T>)visitor).visitEnumValueOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumValueOptionContext enumValueOption() throws RecognitionException {
		EnumValueOptionContext _localctx = new EnumValueOptionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_enumValueOption);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			optionName();
			setState(326);
			match(EQ);
			setState(327);
			constant();
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

	public static class MessageDefContext extends ParserRuleContext {
		public TerminalNode MESSAGE() { return getToken(Protobuf3Parser.MESSAGE, 0); }
		public MessageNameContext messageName() {
			return getRuleContext(MessageNameContext.class,0);
		}
		public MessageBodyContext messageBody() {
			return getRuleContext(MessageBodyContext.class,0);
		}
		public MessageDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_messageDef; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Protobuf3Visitor ) return ((Protobuf3Visitor<? extends T>)visitor).visitMessageDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MessageDefContext messageDef() throws RecognitionException {
		MessageDefContext _localctx = new MessageDefContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_messageDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			match(MESSAGE);
			setState(330);
			messageName();
			setState(331);
			messageBody();
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

	public static class MessageBodyContext extends ParserRuleContext {
		public TerminalNode LC() { return getToken(Protobuf3Parser.LC, 0); }
		public TerminalNode RC() { return getToken(Protobuf3Parser.RC, 0); }
		public List<MessageElementContext> messageElement() {
			return getRuleContexts(MessageElementContext.class);
		}
		public MessageElementContext messageElement(int i) {
			return getRuleContext(MessageElementContext.class,i);
		}
		public MessageBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_messageBody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Protobuf3Visitor ) return ((Protobuf3Visitor<? extends T>)visitor).visitMessageBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MessageBodyContext messageBody() throws RecognitionException {
		MessageBodyContext _localctx = new MessageBodyContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_messageBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			match(LC);
			setState(337);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SYNTAX) | (1L << IMPORT) | (1L << WEAK) | (1L << PUBLIC) | (1L << PACKAGE) | (1L << OPTION) | (1L << REPEATED) | (1L << ONEOF) | (1L << MAP) | (1L << INT32) | (1L << INT64) | (1L << UINT32) | (1L << UINT64) | (1L << SINT32) | (1L << SINT64) | (1L << FIXED32) | (1L << FIXED64) | (1L << SFIXED32) | (1L << SFIXED64) | (1L << BOOL) | (1L << STRING) | (1L << DOUBLE) | (1L << FLOAT) | (1L << BYTES) | (1L << RESERVED) | (1L << TO) | (1L << MAX) | (1L << ENUM) | (1L << MESSAGE) | (1L << SERVICE) | (1L << EXTEND) | (1L << RPC) | (1L << STREAM) | (1L << RETURNS) | (1L << SEMI) | (1L << DOT) | (1L << BOOL_LIT) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(334);
				messageElement();
				}
				}
				setState(339);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(340);
			match(RC);
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

	public static class MessageElementContext extends ParserRuleContext {
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public EnumDefContext enumDef() {
			return getRuleContext(EnumDefContext.class,0);
		}
		public MessageDefContext messageDef() {
			return getRuleContext(MessageDefContext.class,0);
		}
		public ExtendDefContext extendDef() {
			return getRuleContext(ExtendDefContext.class,0);
		}
		public OptionStatementContext optionStatement() {
			return getRuleContext(OptionStatementContext.class,0);
		}
		public OneofContext oneof() {
			return getRuleContext(OneofContext.class,0);
		}
		public MapFieldContext mapField() {
			return getRuleContext(MapFieldContext.class,0);
		}
		public ReservedContext reserved() {
			return getRuleContext(ReservedContext.class,0);
		}
		public EmptyStatement_Context emptyStatement_() {
			return getRuleContext(EmptyStatement_Context.class,0);
		}
		public MessageElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_messageElement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Protobuf3Visitor ) return ((Protobuf3Visitor<? extends T>)visitor).visitMessageElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MessageElementContext messageElement() throws RecognitionException {
		MessageElementContext _localctx = new MessageElementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_messageElement);
		try {
			setState(351);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(342);
				field();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(343);
				enumDef();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(344);
				messageDef();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(345);
				extendDef();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(346);
				optionStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(347);
				oneof();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(348);
				mapField();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(349);
				reserved();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(350);
				emptyStatement_();
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

	public static class ExtendDefContext extends ParserRuleContext {
		public TerminalNode EXTEND() { return getToken(Protobuf3Parser.EXTEND, 0); }
		public MessageTypeContext messageType() {
			return getRuleContext(MessageTypeContext.class,0);
		}
		public TerminalNode LC() { return getToken(Protobuf3Parser.LC, 0); }
		public TerminalNode RC() { return getToken(Protobuf3Parser.RC, 0); }
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public List<EmptyStatement_Context> emptyStatement_() {
			return getRuleContexts(EmptyStatement_Context.class);
		}
		public EmptyStatement_Context emptyStatement_(int i) {
			return getRuleContext(EmptyStatement_Context.class,i);
		}
		public ExtendDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extendDef; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Protobuf3Visitor ) return ((Protobuf3Visitor<? extends T>)visitor).visitExtendDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtendDefContext extendDef() throws RecognitionException {
		ExtendDefContext _localctx = new ExtendDefContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_extendDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			match(EXTEND);
			setState(354);
			messageType();
			setState(355);
			match(LC);
			setState(360);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SYNTAX) | (1L << IMPORT) | (1L << WEAK) | (1L << PUBLIC) | (1L << PACKAGE) | (1L << OPTION) | (1L << REPEATED) | (1L << ONEOF) | (1L << MAP) | (1L << INT32) | (1L << INT64) | (1L << UINT32) | (1L << UINT64) | (1L << SINT32) | (1L << SINT64) | (1L << FIXED32) | (1L << FIXED64) | (1L << SFIXED32) | (1L << SFIXED64) | (1L << BOOL) | (1L << STRING) | (1L << DOUBLE) | (1L << FLOAT) | (1L << BYTES) | (1L << RESERVED) | (1L << TO) | (1L << MAX) | (1L << ENUM) | (1L << MESSAGE) | (1L << SERVICE) | (1L << EXTEND) | (1L << RPC) | (1L << STREAM) | (1L << RETURNS) | (1L << SEMI) | (1L << DOT) | (1L << BOOL_LIT) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(358);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SYNTAX:
				case IMPORT:
				case WEAK:
				case PUBLIC:
				case PACKAGE:
				case OPTION:
				case REPEATED:
				case ONEOF:
				case MAP:
				case INT32:
				case INT64:
				case UINT32:
				case UINT64:
				case SINT32:
				case SINT64:
				case FIXED32:
				case FIXED64:
				case SFIXED32:
				case SFIXED64:
				case BOOL:
				case STRING:
				case DOUBLE:
				case FLOAT:
				case BYTES:
				case RESERVED:
				case TO:
				case MAX:
				case ENUM:
				case MESSAGE:
				case SERVICE:
				case EXTEND:
				case RPC:
				case STREAM:
				case RETURNS:
				case DOT:
				case BOOL_LIT:
				case IDENTIFIER:
					{
					setState(356);
					field();
					}
					break;
				case SEMI:
					{
					setState(357);
					emptyStatement_();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(362);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(363);
			match(RC);
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

	public static class ServiceDefContext extends ParserRuleContext {
		public TerminalNode SERVICE() { return getToken(Protobuf3Parser.SERVICE, 0); }
		public ServiceNameContext serviceName() {
			return getRuleContext(ServiceNameContext.class,0);
		}
		public TerminalNode LC() { return getToken(Protobuf3Parser.LC, 0); }
		public TerminalNode RC() { return getToken(Protobuf3Parser.RC, 0); }
		public List<ServiceElementContext> serviceElement() {
			return getRuleContexts(ServiceElementContext.class);
		}
		public ServiceElementContext serviceElement(int i) {
			return getRuleContext(ServiceElementContext.class,i);
		}
		public ServiceDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_serviceDef; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Protobuf3Visitor ) return ((Protobuf3Visitor<? extends T>)visitor).visitServiceDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ServiceDefContext serviceDef() throws RecognitionException {
		ServiceDefContext _localctx = new ServiceDefContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_serviceDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			match(SERVICE);
			setState(366);
			serviceName();
			setState(367);
			match(LC);
			setState(371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPTION) | (1L << RPC) | (1L << SEMI))) != 0)) {
				{
				{
				setState(368);
				serviceElement();
				}
				}
				setState(373);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(374);
			match(RC);
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

	public static class ServiceElementContext extends ParserRuleContext {
		public OptionStatementContext optionStatement() {
			return getRuleContext(OptionStatementContext.class,0);
		}
		public RpcContext rpc() {
			return getRuleContext(RpcContext.class,0);
		}
		public EmptyStatement_Context emptyStatement_() {
			return getRuleContext(EmptyStatement_Context.class,0);
		}
		public ServiceElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_serviceElement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Protobuf3Visitor ) return ((Protobuf3Visitor<? extends T>)visitor).visitServiceElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ServiceElementContext serviceElement() throws RecognitionException {
		ServiceElementContext _localctx = new ServiceElementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_serviceElement);
		try {
			setState(379);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(376);
				optionStatement();
				}
				break;
			case RPC:
				enterOuterAlt(_localctx, 2);
				{
				setState(377);
				rpc();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 3);
				{
				setState(378);
				emptyStatement_();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class RpcContext extends ParserRuleContext {
		public TerminalNode RPC() { return getToken(Protobuf3Parser.RPC, 0); }
		public RpcNameContext rpcName() {
			return getRuleContext(RpcNameContext.class,0);
		}
		public List<TerminalNode> LP() { return getTokens(Protobuf3Parser.LP); }
		public TerminalNode LP(int i) {
			return getToken(Protobuf3Parser.LP, i);
		}
		public List<MessageTypeContext> messageType() {
			return getRuleContexts(MessageTypeContext.class);
		}
		public MessageTypeContext messageType(int i) {
			return getRuleContext(MessageTypeContext.class,i);
		}
		public List<TerminalNode> RP() { return getTokens(Protobuf3Parser.RP); }
		public TerminalNode RP(int i) {
			return getToken(Protobuf3Parser.RP, i);
		}
		public TerminalNode RETURNS() { return getToken(Protobuf3Parser.RETURNS, 0); }
		public TerminalNode LC() { return getToken(Protobuf3Parser.LC, 0); }
		public TerminalNode RC() { return getToken(Protobuf3Parser.RC, 0); }
		public TerminalNode SEMI() { return getToken(Protobuf3Parser.SEMI, 0); }
		public List<TerminalNode> STREAM() { return getTokens(Protobuf3Parser.STREAM); }
		public TerminalNode STREAM(int i) {
			return getToken(Protobuf3Parser.STREAM, i);
		}
		public List<OptionStatementContext> optionStatement() {
			return getRuleContexts(OptionStatementContext.class);
		}
		public OptionStatementContext optionStatement(int i) {
			return getRuleContext(OptionStatementContext.class,i);
		}
		public List<EmptyStatement_Context> emptyStatement_() {
			return getRuleContexts(EmptyStatement_Context.class);
		}
		public EmptyStatement_Context emptyStatement_(int i) {
			return getRuleContext(EmptyStatement_Context.class,i);
		}
		public RpcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rpc; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Protobuf3Visitor ) return ((Protobuf3Visitor<? extends T>)visitor).visitRpc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RpcContext rpc() throws RecognitionException {
		RpcContext _localctx = new RpcContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_rpc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			match(RPC);
			setState(382);
			rpcName();
			setState(383);
			match(LP);
			setState(385);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(384);
				match(STREAM);
				}
				break;
			}
			setState(387);
			messageType();
			setState(388);
			match(RP);
			setState(389);
			match(RETURNS);
			setState(390);
			match(LP);
			setState(392);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(391);
				match(STREAM);
				}
				break;
			}
			setState(394);
			messageType();
			setState(395);
			match(RP);
			setState(406);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LC:
				{
				setState(396);
				match(LC);
				setState(401);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OPTION || _la==SEMI) {
					{
					setState(399);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case OPTION:
						{
						setState(397);
						optionStatement();
						}
						break;
					case SEMI:
						{
						setState(398);
						emptyStatement_();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(403);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(404);
				match(RC);
				}
				break;
			case SEMI:
				{
				setState(405);
				match(SEMI);
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

	public static class ConstantContext extends ParserRuleContext {
		public FullIdentContext fullIdent() {
			return getRuleContext(FullIdentContext.class,0);
		}
		public IntLitContext intLit() {
			return getRuleContext(IntLitContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(Protobuf3Parser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(Protobuf3Parser.PLUS, 0); }
		public FloatLitContext floatLit() {
			return getRuleContext(FloatLitContext.class,0);
		}
		public StrLitContext strLit() {
			return getRuleContext(StrLitContext.class,0);
		}
		public BoolLitContext boolLit() {
			return getRuleContext(BoolLitContext.class,0);
		}
		public BlockLitContext blockLit() {
			return getRuleContext(BlockLitContext.class,0);
		}
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Protobuf3Visitor ) return ((Protobuf3Visitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_constant);
		int _la;
		try {
			setState(420);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(408);
				fullIdent();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(410);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(409);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(412);
				intLit();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(414);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(413);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(416);
				floatLit();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(417);
				strLit();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(418);
				boolLit();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(419);
				blockLit();
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

	public static class BlockLitContext extends ParserRuleContext {
		public TerminalNode LC() { return getToken(Protobuf3Parser.LC, 0); }
		public TerminalNode RC() { return getToken(Protobuf3Parser.RC, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public List<TerminalNode> COLON() { return getTokens(Protobuf3Parser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(Protobuf3Parser.COLON, i);
		}
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public BlockLitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockLit; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Protobuf3Visitor ) return ((Protobuf3Visitor<? extends T>)visitor).visitBlockLit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockLitContext blockLit() throws RecognitionException {
		BlockLitContext _localctx = new BlockLitContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_blockLit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			match(LC);
			setState(429);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SYNTAX) | (1L << IMPORT) | (1L << WEAK) | (1L << PUBLIC) | (1L << PACKAGE) | (1L << OPTION) | (1L << REPEATED) | (1L << ONEOF) | (1L << MAP) | (1L << INT32) | (1L << INT64) | (1L << UINT32) | (1L << UINT64) | (1L << SINT32) | (1L << SINT64) | (1L << FIXED32) | (1L << FIXED64) | (1L << SFIXED32) | (1L << SFIXED64) | (1L << BOOL) | (1L << STRING) | (1L << DOUBLE) | (1L << FLOAT) | (1L << BYTES) | (1L << RESERVED) | (1L << TO) | (1L << MAX) | (1L << ENUM) | (1L << MESSAGE) | (1L << SERVICE) | (1L << EXTEND) | (1L << RPC) | (1L << STREAM) | (1L << RETURNS) | (1L << BOOL_LIT) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(423);
				ident();
				setState(424);
				match(COLON);
				setState(425);
				constant();
				}
				}
				setState(431);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(432);
			match(RC);
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

	public static class EmptyStatement_Context extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(Protobuf3Parser.SEMI, 0); }
		public EmptyStatement_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyStatement_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Protobuf3Visitor ) return ((Protobuf3Visitor<? extends T>)visitor).visitEmptyStatement_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmptyStatement_Context emptyStatement_() throws RecognitionException {
		EmptyStatement_Context _localctx = new EmptyStatement_Context(_ctx, getState());
		enterRule(_localctx, 70, RULE_emptyStatement_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			match(SEMI);
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

	public static class IdentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(Protobuf3Parser.IDENTIFIER, 0); }
		public KeywordsContext keywords() {
			return getRuleContext(KeywordsContext.class,0);
		}
		public IdentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ident; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Protobuf3Visitor ) return ((Protobuf3Visitor<? extends T>)visitor).visitIdent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentContext ident() throws RecognitionException {
		IdentContext _localctx = new IdentContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_ident);
		try {
			setState(438);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(436);
				match(IDENTIFIER);
				}
				break;
			case SYNTAX:
			case IMPORT:
			case WEAK:
			case PUBLIC:
			case PACKAGE:
			case OPTION:
			case REPEATED:
			case ONEOF:
			case MAP:
			case INT32:
			case INT64:
			case UINT32:
			case UINT64:
			case SINT32:
			case SINT64:
			case FIXED32:
			case FIXED64:
			case SFIXED32:
			case SFIXED64:
			case BOOL:
			case STRING:
			case DOUBLE:
			case FLOAT:
			case BYTES:
			case RESERVED:
			case TO:
			case MAX:
			case ENUM:
			case MESSAGE:
			case SERVICE:
			case EXTEND:
			case RPC:
			case STREAM:
			case RETURNS:
			case BOOL_LIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(437);
				keywords();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class FullIdentContext extends ParserRuleContext {
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(Protobuf3Parser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(Protobuf3Parser.DOT, i);
		}
		public FullIdentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fullIdent; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Protobuf3Visitor ) return ((Protobuf3Visitor<? extends T>)visitor).visitFullIdent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FullIdentContext fullIdent() throws RecognitionException {
		FullIdentContext _localctx = new FullIdentContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_fullIdent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			ident();
			setState(445);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(441);
				match(DOT);
				setState(442);
				ident();
				}
				}
				setState(447);
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

	public static class MessageNameContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public MessageNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_messageName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Protobuf3Visitor ) return ((Protobuf3Visitor<? extends T>)visitor).visitMessageName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MessageNameContext messageName() throws RecognitionException {
		MessageNameContext _localctx = new MessageNameContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_messageName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			ident();
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

	public static class EnumNameContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public EnumNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Protobuf3Visitor ) return ((Protobuf3Visitor<? extends T>)visitor).visitEnumName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumNameContext enumName() throws RecognitionException {
		EnumNameContext _localctx = new EnumNameContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_enumName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			ident();
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

	public static class FieldNameContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public FieldNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Protobuf3Visitor ) return ((Protobuf3Visitor<? extends T>)visitor).visitFieldName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldNameContext fieldName() throws RecognitionException {
		FieldNameContext _localctx = new FieldNameContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_fieldName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
			ident();
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

	public static class OneofNameContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public OneofNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oneofName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Protobuf3Visitor ) return ((Protobuf3Visitor<? extends T>)visitor).visitOneofName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OneofNameContext oneofName() throws RecognitionException {
		OneofNameContext _localctx = new OneofNameContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_oneofName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			ident();
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

	public static class MapNameContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public MapNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Protobuf3Visitor ) return ((Protobuf3Visitor<? extends T>)visitor).visitMapName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapNameContext mapName() throws RecognitionException {
		MapNameContext _localctx = new MapNameContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_mapName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			ident();
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

	public static class ServiceNameContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public ServiceNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_serviceName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Protobuf3Visitor ) return ((Protobuf3Visitor<? extends T>)visitor).visitServiceName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ServiceNameContext serviceName() throws RecognitionException {
		ServiceNameContext _localctx = new ServiceNameContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_serviceName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			ident();
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

	public static class RpcNameContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public RpcNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rpcName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Protobuf3Visitor ) return ((Protobuf3Visitor<? extends T>)visitor).visitRpcName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RpcNameContext rpcName() throws RecognitionException {
		RpcNameContext _localctx = new RpcNameContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_rpcName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			ident();
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

	public static class MessageTypeContext extends ParserRuleContext {
		public MessageNameContext messageName() {
			return getRuleContext(MessageNameContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(Protobuf3Parser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(Protobuf3Parser.DOT, i);
		}
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public MessageTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_messageType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Protobuf3Visitor ) return ((Protobuf3Visitor<? extends T>)visitor).visitMessageType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MessageTypeContext messageType() throws RecognitionException {
		MessageTypeContext _localctx = new MessageTypeContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_messageType);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(462);
				match(DOT);
				}
			}

			setState(470);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(465);
					ident();
					setState(466);
					match(DOT);
					}
					} 
				}
				setState(472);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			}
			setState(473);
			messageName();
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

	public static class EnumTypeContext extends ParserRuleContext {
		public EnumNameContext enumName() {
			return getRuleContext(EnumNameContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(Protobuf3Parser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(Protobuf3Parser.DOT, i);
		}
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public EnumTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Protobuf3Visitor ) return ((Protobuf3Visitor<? extends T>)visitor).visitEnumType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumTypeContext enumType() throws RecognitionException {
		EnumTypeContext _localctx = new EnumTypeContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_enumType);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(475);
				match(DOT);
				}
			}

			setState(483);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(478);
					ident();
					setState(479);
					match(DOT);
					}
					} 
				}
				setState(485);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			}
			setState(486);
			enumName();
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

	public static class IntLitContext extends ParserRuleContext {
		public TerminalNode INT_LIT() { return getToken(Protobuf3Parser.INT_LIT, 0); }
		public IntLitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intLit; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Protobuf3Visitor ) return ((Protobuf3Visitor<? extends T>)visitor).visitIntLit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntLitContext intLit() throws RecognitionException {
		IntLitContext _localctx = new IntLitContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_intLit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488);
			match(INT_LIT);
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

	public static class StrLitContext extends ParserRuleContext {
		public TerminalNode STR_LIT() { return getToken(Protobuf3Parser.STR_LIT, 0); }
		public TerminalNode PROTO3_LIT_SINGLE() { return getToken(Protobuf3Parser.PROTO3_LIT_SINGLE, 0); }
		public TerminalNode PROTO3_LIT_DOBULE() { return getToken(Protobuf3Parser.PROTO3_LIT_DOBULE, 0); }
		public StrLitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strLit; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Protobuf3Visitor ) return ((Protobuf3Visitor<? extends T>)visitor).visitStrLit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StrLitContext strLit() throws RecognitionException {
		StrLitContext _localctx = new StrLitContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_strLit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PROTO3_LIT_SINGLE) | (1L << PROTO3_LIT_DOBULE) | (1L << STR_LIT))) != 0)) ) {
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

	public static class BoolLitContext extends ParserRuleContext {
		public TerminalNode BOOL_LIT() { return getToken(Protobuf3Parser.BOOL_LIT, 0); }
		public BoolLitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolLit; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Protobuf3Visitor ) return ((Protobuf3Visitor<? extends T>)visitor).visitBoolLit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolLitContext boolLit() throws RecognitionException {
		BoolLitContext _localctx = new BoolLitContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_boolLit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(492);
			match(BOOL_LIT);
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

	public static class FloatLitContext extends ParserRuleContext {
		public TerminalNode FLOAT_LIT() { return getToken(Protobuf3Parser.FLOAT_LIT, 0); }
		public FloatLitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatLit; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Protobuf3Visitor ) return ((Protobuf3Visitor<? extends T>)visitor).visitFloatLit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatLitContext floatLit() throws RecognitionException {
		FloatLitContext _localctx = new FloatLitContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_floatLit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(494);
			match(FLOAT_LIT);
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

	public static class KeywordsContext extends ParserRuleContext {
		public TerminalNode SYNTAX() { return getToken(Protobuf3Parser.SYNTAX, 0); }
		public TerminalNode IMPORT() { return getToken(Protobuf3Parser.IMPORT, 0); }
		public TerminalNode WEAK() { return getToken(Protobuf3Parser.WEAK, 0); }
		public TerminalNode PUBLIC() { return getToken(Protobuf3Parser.PUBLIC, 0); }
		public TerminalNode PACKAGE() { return getToken(Protobuf3Parser.PACKAGE, 0); }
		public TerminalNode OPTION() { return getToken(Protobuf3Parser.OPTION, 0); }
		public TerminalNode REPEATED() { return getToken(Protobuf3Parser.REPEATED, 0); }
		public TerminalNode ONEOF() { return getToken(Protobuf3Parser.ONEOF, 0); }
		public TerminalNode MAP() { return getToken(Protobuf3Parser.MAP, 0); }
		public TerminalNode INT32() { return getToken(Protobuf3Parser.INT32, 0); }
		public TerminalNode INT64() { return getToken(Protobuf3Parser.INT64, 0); }
		public TerminalNode UINT32() { return getToken(Protobuf3Parser.UINT32, 0); }
		public TerminalNode UINT64() { return getToken(Protobuf3Parser.UINT64, 0); }
		public TerminalNode SINT32() { return getToken(Protobuf3Parser.SINT32, 0); }
		public TerminalNode SINT64() { return getToken(Protobuf3Parser.SINT64, 0); }
		public TerminalNode FIXED32() { return getToken(Protobuf3Parser.FIXED32, 0); }
		public TerminalNode FIXED64() { return getToken(Protobuf3Parser.FIXED64, 0); }
		public TerminalNode SFIXED32() { return getToken(Protobuf3Parser.SFIXED32, 0); }
		public TerminalNode SFIXED64() { return getToken(Protobuf3Parser.SFIXED64, 0); }
		public TerminalNode BOOL() { return getToken(Protobuf3Parser.BOOL, 0); }
		public TerminalNode STRING() { return getToken(Protobuf3Parser.STRING, 0); }
		public TerminalNode DOUBLE() { return getToken(Protobuf3Parser.DOUBLE, 0); }
		public TerminalNode FLOAT() { return getToken(Protobuf3Parser.FLOAT, 0); }
		public TerminalNode BYTES() { return getToken(Protobuf3Parser.BYTES, 0); }
		public TerminalNode RESERVED() { return getToken(Protobuf3Parser.RESERVED, 0); }
		public TerminalNode TO() { return getToken(Protobuf3Parser.TO, 0); }
		public TerminalNode MAX() { return getToken(Protobuf3Parser.MAX, 0); }
		public TerminalNode ENUM() { return getToken(Protobuf3Parser.ENUM, 0); }
		public TerminalNode MESSAGE() { return getToken(Protobuf3Parser.MESSAGE, 0); }
		public TerminalNode SERVICE() { return getToken(Protobuf3Parser.SERVICE, 0); }
		public TerminalNode EXTEND() { return getToken(Protobuf3Parser.EXTEND, 0); }
		public TerminalNode RPC() { return getToken(Protobuf3Parser.RPC, 0); }
		public TerminalNode STREAM() { return getToken(Protobuf3Parser.STREAM, 0); }
		public TerminalNode RETURNS() { return getToken(Protobuf3Parser.RETURNS, 0); }
		public TerminalNode BOOL_LIT() { return getToken(Protobuf3Parser.BOOL_LIT, 0); }
		public KeywordsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keywords; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Protobuf3Visitor ) return ((Protobuf3Visitor<? extends T>)visitor).visitKeywords(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeywordsContext keywords() throws RecognitionException {
		KeywordsContext _localctx = new KeywordsContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_keywords);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(496);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SYNTAX) | (1L << IMPORT) | (1L << WEAK) | (1L << PUBLIC) | (1L << PACKAGE) | (1L << OPTION) | (1L << REPEATED) | (1L << ONEOF) | (1L << MAP) | (1L << INT32) | (1L << INT64) | (1L << UINT32) | (1L << UINT64) | (1L << SINT32) | (1L << SINT64) | (1L << FIXED32) | (1L << FIXED64) | (1L << SFIXED32) | (1L << SFIXED64) | (1L << BOOL) | (1L << STRING) | (1L << DOUBLE) | (1L << FLOAT) | (1L << BYTES) | (1L << RESERVED) | (1L << TO) | (1L << MAX) | (1L << ENUM) | (1L << MESSAGE) | (1L << SERVICE) | (1L << EXTEND) | (1L << RPC) | (1L << STREAM) | (1L << RETURNS) | (1L << BOOL_LIT))) != 0)) ) {
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3=\u01f5\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\3\2\3\2\5\2m\n\2\3\2\3\2\7\2q\n\2\f\2\16\2t\13\2\3\2\3\2"+
		"\7\2x\n\2\f\2\16\2{\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\5\4\u0086"+
		"\n\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\5\7\u009b\n\7\5\7\u009d\n\7\3\b\5\b\u00a0\n\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\5\b\u00aa\n\b\3\b\3\b\3\t\3\t\3\t\7\t\u00b1\n\t\f\t"+
		"\16\t\u00b4\13\t\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\7\f"+
		"\u00c2\n\f\f\f\16\f\u00c5\13\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\5\r\u00d1\n\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\5\16\u00e2\n\16\3\16\3\16\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\5\20\u00f9\n\20\3\21\3\21\3\21\5\21\u00fe\n\21\3\21\3\21\3\22\3\22\3"+
		"\22\7\22\u0105\n\22\f\22\16\22\u0108\13\22\3\23\3\23\3\23\3\23\5\23\u010e"+
		"\n\23\5\23\u0110\n\23\3\24\3\24\3\24\7\24\u0115\n\24\f\24\16\24\u0118"+
		"\13\24\3\25\3\25\3\25\3\25\5\25\u011e\n\25\3\26\3\26\3\26\3\26\3\27\3"+
		"\27\7\27\u0126\n\27\f\27\16\27\u0129\13\27\3\27\3\27\3\30\3\30\3\30\5"+
		"\30\u0130\n\30\3\31\3\31\3\31\5\31\u0135\n\31\3\31\3\31\5\31\u0139\n\31"+
		"\3\31\3\31\3\32\3\32\3\32\3\32\7\32\u0141\n\32\f\32\16\32\u0144\13\32"+
		"\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\7\35\u0152"+
		"\n\35\f\35\16\35\u0155\13\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\5\36\u0162\n\36\3\37\3\37\3\37\3\37\3\37\7\37\u0169\n\37"+
		"\f\37\16\37\u016c\13\37\3\37\3\37\3 \3 \3 \3 \7 \u0174\n \f \16 \u0177"+
		"\13 \3 \3 \3!\3!\3!\5!\u017e\n!\3\"\3\"\3\"\3\"\5\"\u0184\n\"\3\"\3\""+
		"\3\"\3\"\3\"\5\"\u018b\n\"\3\"\3\"\3\"\3\"\3\"\7\"\u0192\n\"\f\"\16\""+
		"\u0195\13\"\3\"\3\"\5\"\u0199\n\"\3#\3#\5#\u019d\n#\3#\3#\5#\u01a1\n#"+
		"\3#\3#\3#\3#\5#\u01a7\n#\3$\3$\3$\3$\3$\7$\u01ae\n$\f$\16$\u01b1\13$\3"+
		"$\3$\3%\3%\3&\3&\5&\u01b9\n&\3\'\3\'\3\'\7\'\u01be\n\'\f\'\16\'\u01c1"+
		"\13\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\5/\u01d2\n/\3/\3/\3"+
		"/\7/\u01d7\n/\f/\16/\u01da\13/\3/\3/\3\60\5\60\u01df\n\60\3\60\3\60\3"+
		"\60\7\60\u01e4\n\60\f\60\16\60\u01e7\13\60\3\60\3\60\3\61\3\61\3\62\3"+
		"\62\3\63\3\63\3\64\3\64\3\65\3\65\3\65\2\2\66\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfh\2\b\3\2"+
		"%&\3\2\5\6\3\2\f\27\3\2\64\65\4\2%&\66\66\4\2\3$\67\67\2\u020f\2j\3\2"+
		"\2\2\4~\3\2\2\2\6\u0083\3\2\2\2\b\u008a\3\2\2\2\n\u008e\3\2\2\2\f\u009c"+
		"\3\2\2\2\16\u009f\3\2\2\2\20\u00ad\3\2\2\2\22\u00b5\3\2\2\2\24\u00b9\3"+
		"\2\2\2\26\u00bb\3\2\2\2\30\u00c8\3\2\2\2\32\u00d4\3\2\2\2\34\u00e5\3\2"+
		"\2\2\36\u00f8\3\2\2\2 \u00fa\3\2\2\2\"\u0101\3\2\2\2$\u0109\3\2\2\2&\u0111"+
		"\3\2\2\2(\u011d\3\2\2\2*\u011f\3\2\2\2,\u0123\3\2\2\2.\u012f\3\2\2\2\60"+
		"\u0131\3\2\2\2\62\u013c\3\2\2\2\64\u0147\3\2\2\2\66\u014b\3\2\2\28\u014f"+
		"\3\2\2\2:\u0161\3\2\2\2<\u0163\3\2\2\2>\u016f\3\2\2\2@\u017d\3\2\2\2B"+
		"\u017f\3\2\2\2D\u01a6\3\2\2\2F\u01a8\3\2\2\2H\u01b4\3\2\2\2J\u01b8\3\2"+
		"\2\2L\u01ba\3\2\2\2N\u01c2\3\2\2\2P\u01c4\3\2\2\2R\u01c6\3\2\2\2T\u01c8"+
		"\3\2\2\2V\u01ca\3\2\2\2X\u01cc\3\2\2\2Z\u01ce\3\2\2\2\\\u01d1\3\2\2\2"+
		"^\u01de\3\2\2\2`\u01ea\3\2\2\2b\u01ec\3\2\2\2d\u01ee\3\2\2\2f\u01f0\3"+
		"\2\2\2h\u01f2\3\2\2\2jl\5\4\3\2km\5\b\5\2lk\3\2\2\2lm\3\2\2\2mr\3\2\2"+
		"\2nq\5\n\6\2oq\5\6\4\2pn\3\2\2\2po\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2"+
		"\2sy\3\2\2\2tr\3\2\2\2ux\5(\25\2vx\5H%\2wu\3\2\2\2wv\3\2\2\2x{\3\2\2\2"+
		"yw\3\2\2\2yz\3\2\2\2z|\3\2\2\2{y\3\2\2\2|}\7\2\2\3}\3\3\2\2\2~\177\7\3"+
		"\2\2\177\u0080\7(\2\2\u0080\u0081\t\2\2\2\u0081\u0082\7\'\2\2\u0082\5"+
		"\3\2\2\2\u0083\u0085\7\4\2\2\u0084\u0086\t\3\2\2\u0085\u0084\3\2\2\2\u0085"+
		"\u0086\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088\5b\62\2\u0088\u0089\7\'"+
		"\2\2\u0089\7\3\2\2\2\u008a\u008b\7\7\2\2\u008b\u008c\5L\'\2\u008c\u008d"+
		"\7\'\2\2\u008d\t\3\2\2\2\u008e\u008f\7\b\2\2\u008f\u0090\5\f\7\2\u0090"+
		"\u0091\7(\2\2\u0091\u0092\5D#\2\u0092\u0093\7\'\2\2\u0093\13\3\2\2\2\u0094"+
		"\u009d\5L\'\2\u0095\u0096\7)\2\2\u0096\u0097\5L\'\2\u0097\u009a\7*\2\2"+
		"\u0098\u0099\7\61\2\2\u0099\u009b\5L\'\2\u009a\u0098\3\2\2\2\u009a\u009b"+
		"\3\2\2\2\u009b\u009d\3\2\2\2\u009c\u0094\3\2\2\2\u009c\u0095\3\2\2\2\u009d"+
		"\r\3\2\2\2\u009e\u00a0\7\t\2\2\u009f\u009e\3\2\2\2\u009f\u00a0\3\2\2\2"+
		"\u00a0\u00a1\3\2\2\2\u00a1\u00a2\5\36\20\2\u00a2\u00a3\5R*\2\u00a3\u00a4"+
		"\7(\2\2\u00a4\u00a9\5\24\13\2\u00a5\u00a6\7+\2\2\u00a6\u00a7\5\20\t\2"+
		"\u00a7\u00a8\7,\2\2\u00a8\u00aa\3\2\2\2\u00a9\u00a5\3\2\2\2\u00a9\u00aa"+
		"\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\7\'\2\2\u00ac\17\3\2\2\2\u00ad"+
		"\u00b2\5\22\n\2\u00ae\u00af\7\62\2\2\u00af\u00b1\5\22\n\2\u00b0\u00ae"+
		"\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3"+
		"\21\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00b6\5\f\7\2\u00b6\u00b7\7(\2\2"+
		"\u00b7\u00b8\5D#\2\u00b8\23\3\2\2\2\u00b9\u00ba\5`\61\2\u00ba\25\3\2\2"+
		"\2\u00bb\u00bc\7\n\2\2\u00bc\u00bd\5T+\2\u00bd\u00c3\7-\2\2\u00be\u00c2"+
		"\5\n\6\2\u00bf\u00c2\5\30\r\2\u00c0\u00c2\5H%\2\u00c1\u00be\3\2\2\2\u00c1"+
		"\u00bf\3\2\2\2\u00c1\u00c0\3\2\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c1\3\2"+
		"\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c6\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6"+
		"\u00c7\7.\2\2\u00c7\27\3\2\2\2\u00c8\u00c9\5\36\20\2\u00c9\u00ca\5R*\2"+
		"\u00ca\u00cb\7(\2\2\u00cb\u00d0\5\24\13\2\u00cc\u00cd\7+\2\2\u00cd\u00ce"+
		"\5\20\t\2\u00ce\u00cf\7,\2\2\u00cf\u00d1\3\2\2\2\u00d0\u00cc\3\2\2\2\u00d0"+
		"\u00d1\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d3\7\'\2\2\u00d3\31\3\2\2"+
		"\2\u00d4\u00d5\7\13\2\2\u00d5\u00d6\7/\2\2\u00d6\u00d7\5\34\17\2\u00d7"+
		"\u00d8\7\62\2\2\u00d8\u00d9\5\36\20\2\u00d9\u00da\7\60\2\2\u00da\u00db"+
		"\5V,\2\u00db\u00dc\7(\2\2\u00dc\u00e1\5\24\13\2\u00dd\u00de\7+\2\2\u00de"+
		"\u00df\5\20\t\2\u00df\u00e0\7,\2\2\u00e0\u00e2\3\2\2\2\u00e1\u00dd\3\2"+
		"\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4\7\'\2\2\u00e4"+
		"\33\3\2\2\2\u00e5\u00e6\t\4\2\2\u00e6\35\3\2\2\2\u00e7\u00f9\7\30\2\2"+
		"\u00e8\u00f9\7\31\2\2\u00e9\u00f9\7\f\2\2\u00ea\u00f9\7\r\2\2\u00eb\u00f9"+
		"\7\16\2\2\u00ec\u00f9\7\17\2\2\u00ed\u00f9\7\20\2\2\u00ee\u00f9\7\21\2"+
		"\2\u00ef\u00f9\7\22\2\2\u00f0\u00f9\7\23\2\2\u00f1\u00f9\7\24\2\2\u00f2"+
		"\u00f9\7\25\2\2\u00f3\u00f9\7\26\2\2\u00f4\u00f9\7\27\2\2\u00f5\u00f9"+
		"\7\32\2\2\u00f6\u00f9\5\\/\2\u00f7\u00f9\5^\60\2\u00f8\u00e7\3\2\2\2\u00f8"+
		"\u00e8\3\2\2\2\u00f8\u00e9\3\2\2\2\u00f8\u00ea\3\2\2\2\u00f8\u00eb\3\2"+
		"\2\2\u00f8\u00ec\3\2\2\2\u00f8\u00ed\3\2\2\2\u00f8\u00ee\3\2\2\2\u00f8"+
		"\u00ef\3\2\2\2\u00f8\u00f0\3\2\2\2\u00f8\u00f1\3\2\2\2\u00f8\u00f2\3\2"+
		"\2\2\u00f8\u00f3\3\2\2\2\u00f8\u00f4\3\2\2\2\u00f8\u00f5\3\2\2\2\u00f8"+
		"\u00f6\3\2\2\2\u00f8\u00f7\3\2\2\2\u00f9\37\3\2\2\2\u00fa\u00fd\7\33\2"+
		"\2\u00fb\u00fe\5\"\22\2\u00fc\u00fe\5&\24\2\u00fd\u00fb\3\2\2\2\u00fd"+
		"\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0100\7\'\2\2\u0100!\3\2\2\2"+
		"\u0101\u0106\5$\23\2\u0102\u0103\7\62\2\2\u0103\u0105\5$\23\2\u0104\u0102"+
		"\3\2\2\2\u0105\u0108\3\2\2\2\u0106\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107"+
		"#\3\2\2\2\u0108\u0106\3\2\2\2\u0109\u010f\5`\61\2\u010a\u010d\7\34\2\2"+
		"\u010b\u010e\5`\61\2\u010c\u010e\7\35\2\2\u010d\u010b\3\2\2\2\u010d\u010c"+
		"\3\2\2\2\u010e\u0110\3\2\2\2\u010f\u010a\3\2\2\2\u010f\u0110\3\2\2\2\u0110"+
		"%\3\2\2\2\u0111\u0116\5b\62\2\u0112\u0113\7\62\2\2\u0113\u0115\5b\62\2"+
		"\u0114\u0112\3\2\2\2\u0115\u0118\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117"+
		"\3\2\2\2\u0117\'\3\2\2\2\u0118\u0116\3\2\2\2\u0119\u011e\5\66\34\2\u011a"+
		"\u011e\5*\26\2\u011b\u011e\5<\37\2\u011c\u011e\5> \2\u011d\u0119\3\2\2"+
		"\2\u011d\u011a\3\2\2\2\u011d\u011b\3\2\2\2\u011d\u011c\3\2\2\2\u011e)"+
		"\3\2\2\2\u011f\u0120\7\36\2\2\u0120\u0121\5P)\2\u0121\u0122\5,\27\2\u0122"+
		"+\3\2\2\2\u0123\u0127\7-\2\2\u0124\u0126\5.\30\2\u0125\u0124\3\2\2\2\u0126"+
		"\u0129\3\2\2\2\u0127\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u012a\3\2"+
		"\2\2\u0129\u0127\3\2\2\2\u012a\u012b\7.\2\2\u012b-\3\2\2\2\u012c\u0130"+
		"\5\n\6\2\u012d\u0130\5\60\31\2\u012e\u0130\5H%\2\u012f\u012c\3\2\2\2\u012f"+
		"\u012d\3\2\2\2\u012f\u012e\3\2\2\2\u0130/\3\2\2\2\u0131\u0132\5J&\2\u0132"+
		"\u0134\7(\2\2\u0133\u0135\7\65\2\2\u0134\u0133\3\2\2\2\u0134\u0135\3\2"+
		"\2\2\u0135\u0136\3\2\2\2\u0136\u0138\5`\61\2\u0137\u0139\5\62\32\2\u0138"+
		"\u0137\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013b\7\'"+
		"\2\2\u013b\61\3\2\2\2\u013c\u013d\7+\2\2\u013d\u0142\5\64\33\2\u013e\u013f"+
		"\7\62\2\2\u013f\u0141\5\64\33\2\u0140\u013e\3\2\2\2\u0141\u0144\3\2\2"+
		"\2\u0142\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0145\3\2\2\2\u0144\u0142"+
		"\3\2\2\2\u0145\u0146\7,\2\2\u0146\63\3\2\2\2\u0147\u0148\5\f\7\2\u0148"+
		"\u0149\7(\2\2\u0149\u014a\5D#\2\u014a\65\3\2\2\2\u014b\u014c\7\37\2\2"+
		"\u014c\u014d\5N(\2\u014d\u014e\58\35\2\u014e\67\3\2\2\2\u014f\u0153\7"+
		"-\2\2\u0150\u0152\5:\36\2\u0151\u0150\3\2\2\2\u0152\u0155\3\2\2\2\u0153"+
		"\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0156\3\2\2\2\u0155\u0153\3\2"+
		"\2\2\u0156\u0157\7.\2\2\u01579\3\2\2\2\u0158\u0162\5\16\b\2\u0159\u0162"+
		"\5*\26\2\u015a\u0162\5\66\34\2\u015b\u0162\5<\37\2\u015c\u0162\5\n\6\2"+
		"\u015d\u0162\5\26\f\2\u015e\u0162\5\32\16\2\u015f\u0162\5 \21\2\u0160"+
		"\u0162\5H%\2\u0161\u0158\3\2\2\2\u0161\u0159\3\2\2\2\u0161\u015a\3\2\2"+
		"\2\u0161\u015b\3\2\2\2\u0161\u015c\3\2\2\2\u0161\u015d\3\2\2\2\u0161\u015e"+
		"\3\2\2\2\u0161\u015f\3\2\2\2\u0161\u0160\3\2\2\2\u0162;\3\2\2\2\u0163"+
		"\u0164\7!\2\2\u0164\u0165\5\\/\2\u0165\u016a\7-\2\2\u0166\u0169\5\16\b"+
		"\2\u0167\u0169\5H%\2\u0168\u0166\3\2\2\2\u0168\u0167\3\2\2\2\u0169\u016c"+
		"\3\2\2\2\u016a\u0168\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016d\3\2\2\2\u016c"+
		"\u016a\3\2\2\2\u016d\u016e\7.\2\2\u016e=\3\2\2\2\u016f\u0170\7 \2\2\u0170"+
		"\u0171\5X-\2\u0171\u0175\7-\2\2\u0172\u0174\5@!\2\u0173\u0172\3\2\2\2"+
		"\u0174\u0177\3\2\2\2\u0175\u0173\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0178"+
		"\3\2\2\2\u0177\u0175\3\2\2\2\u0178\u0179\7.\2\2\u0179?\3\2\2\2\u017a\u017e"+
		"\5\n\6\2\u017b\u017e\5B\"\2\u017c\u017e\5H%\2\u017d\u017a\3\2\2\2\u017d"+
		"\u017b\3\2\2\2\u017d\u017c\3\2\2\2\u017eA\3\2\2\2\u017f\u0180\7\"\2\2"+
		"\u0180\u0181\5Z.\2\u0181\u0183\7)\2\2\u0182\u0184\7#\2\2\u0183\u0182\3"+
		"\2\2\2\u0183\u0184\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0186\5\\/\2\u0186"+
		"\u0187\7*\2\2\u0187\u0188\7$\2\2\u0188\u018a\7)\2\2\u0189\u018b\7#\2\2"+
		"\u018a\u0189\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u018d"+
		"\5\\/\2\u018d\u0198\7*\2\2\u018e\u0193\7-\2\2\u018f\u0192\5\n\6\2\u0190"+
		"\u0192\5H%\2\u0191\u018f\3\2\2\2\u0191\u0190\3\2\2\2\u0192\u0195\3\2\2"+
		"\2\u0193\u0191\3\2\2\2\u0193\u0194\3\2\2\2\u0194\u0196\3\2\2\2\u0195\u0193"+
		"\3\2\2\2\u0196\u0199\7.\2\2\u0197\u0199\7\'\2\2\u0198\u018e\3\2\2\2\u0198"+
		"\u0197\3\2\2\2\u0199C\3\2\2\2\u019a\u01a7\5L\'\2\u019b\u019d\t\5\2\2\u019c"+
		"\u019b\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u01a7\5`"+
		"\61\2\u019f\u01a1\t\5\2\2\u01a0\u019f\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1"+
		"\u01a2\3\2\2\2\u01a2\u01a7\5f\64\2\u01a3\u01a7\5b\62\2\u01a4\u01a7\5d"+
		"\63\2\u01a5\u01a7\5F$\2\u01a6\u019a\3\2\2\2\u01a6\u019c\3\2\2\2\u01a6"+
		"\u01a0\3\2\2\2\u01a6\u01a3\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a6\u01a5\3\2"+
		"\2\2\u01a7E\3\2\2\2\u01a8\u01af\7-\2\2\u01a9\u01aa\5J&\2\u01aa\u01ab\7"+
		"\63\2\2\u01ab\u01ac\5D#\2\u01ac\u01ae\3\2\2\2\u01ad\u01a9\3\2\2\2\u01ae"+
		"\u01b1\3\2\2\2\u01af\u01ad\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01b2\3\2"+
		"\2\2\u01b1\u01af\3\2\2\2\u01b2\u01b3\7.\2\2\u01b3G\3\2\2\2\u01b4\u01b5"+
		"\7\'\2\2\u01b5I\3\2\2\2\u01b6\u01b9\7:\2\2\u01b7\u01b9\5h\65\2\u01b8\u01b6"+
		"\3\2\2\2\u01b8\u01b7\3\2\2\2\u01b9K\3\2\2\2\u01ba\u01bf\5J&\2\u01bb\u01bc"+
		"\7\61\2\2\u01bc\u01be\5J&\2\u01bd\u01bb\3\2\2\2\u01be\u01c1\3\2\2\2\u01bf"+
		"\u01bd\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0M\3\2\2\2\u01c1\u01bf\3\2\2\2"+
		"\u01c2\u01c3\5J&\2\u01c3O\3\2\2\2\u01c4\u01c5\5J&\2\u01c5Q\3\2\2\2\u01c6"+
		"\u01c7\5J&\2\u01c7S\3\2\2\2\u01c8\u01c9\5J&\2\u01c9U\3\2\2\2\u01ca\u01cb"+
		"\5J&\2\u01cbW\3\2\2\2\u01cc\u01cd\5J&\2\u01cdY\3\2\2\2\u01ce\u01cf\5J"+
		"&\2\u01cf[\3\2\2\2\u01d0\u01d2\7\61\2\2\u01d1\u01d0\3\2\2\2\u01d1\u01d2"+
		"\3\2\2\2\u01d2\u01d8\3\2\2\2\u01d3\u01d4\5J&\2\u01d4\u01d5\7\61\2\2\u01d5"+
		"\u01d7\3\2\2\2\u01d6\u01d3\3\2\2\2\u01d7\u01da\3\2\2\2\u01d8\u01d6\3\2"+
		"\2\2\u01d8\u01d9\3\2\2\2\u01d9\u01db\3\2\2\2\u01da\u01d8\3\2\2\2\u01db"+
		"\u01dc\5N(\2\u01dc]\3\2\2\2\u01dd\u01df\7\61\2\2\u01de\u01dd\3\2\2\2\u01de"+
		"\u01df\3\2\2\2\u01df\u01e5\3\2\2\2\u01e0\u01e1\5J&\2\u01e1\u01e2\7\61"+
		"\2\2\u01e2\u01e4\3\2\2\2\u01e3\u01e0\3\2\2\2\u01e4\u01e7\3\2\2\2\u01e5"+
		"\u01e3\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01e8\3\2\2\2\u01e7\u01e5\3\2"+
		"\2\2\u01e8\u01e9\5P)\2\u01e9_\3\2\2\2\u01ea\u01eb\79\2\2\u01eba\3\2\2"+
		"\2\u01ec\u01ed\t\6\2\2\u01edc\3\2\2\2\u01ee\u01ef\7\67\2\2\u01efe\3\2"+
		"\2\2\u01f0\u01f1\78\2\2\u01f1g\3\2\2\2\u01f2\u01f3\t\7\2\2\u01f3i\3\2"+
		"\2\2\62lprwy\u0085\u009a\u009c\u009f\u00a9\u00b2\u00c1\u00c3\u00d0\u00e1"+
		"\u00f8\u00fd\u0106\u010d\u010f\u0116\u011d\u0127\u012f\u0134\u0138\u0142"+
		"\u0153\u0161\u0168\u016a\u0175\u017d\u0183\u018a\u0191\u0193\u0198\u019c"+
		"\u01a0\u01a6\u01af\u01b8\u01bf\u01d1\u01d8\u01de\u01e5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}