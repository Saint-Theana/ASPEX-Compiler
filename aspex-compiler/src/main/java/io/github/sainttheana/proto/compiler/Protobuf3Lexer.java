// Generated from io/github/sainttheana/proto/compiler/Protobuf3.g4 by ANTLR 4.7.1

package io.github.sainttheana.proto.compiler;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Protobuf3Lexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"SYNTAX", "IMPORT", "WEAK", "PUBLIC", "PACKAGE", "OPTION", "REPEATED", 
		"ONEOF", "MAP", "INT32", "INT64", "UINT32", "UINT64", "SINT32", "SINT64", 
		"FIXED32", "FIXED64", "SFIXED32", "SFIXED64", "BOOL", "STRING", "DOUBLE", 
		"FLOAT", "BYTES", "RESERVED", "TO", "MAX", "ENUM", "MESSAGE", "SERVICE", 
		"EXTEND", "RPC", "STREAM", "RETURNS", "PROTO3_LIT_SINGLE", "PROTO3_LIT_DOBULE", 
		"SEMI", "EQ", "LP", "RP", "LB", "RB", "LC", "RC", "LT", "GT", "DOT", "COMMA", 
		"COLON", "PLUS", "MINUS", "STR_LIT", "CHAR_VALUE", "HEX_ESCAPE", "OCT_ESCAPE", 
		"CHAR_ESCAPE", "BOOL_LIT", "FLOAT_LIT", "EXPONENT", "DECIMALS", "INT_LIT", 
		"DECIMAL_LIT", "OCTAL_LIT", "HEX_LIT", "IDENTIFIER", "LETTER", "DECIMAL_DIGIT", 
		"OCTAL_DIGIT", "HEX_DIGIT", "WS", "LINE_COMMENT", "COMMENT"
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


	public Protobuf3Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Protobuf3.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2=\u0247\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35"+
		"\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3"+
		"$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+"+
		"\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64"+
		"\3\64\3\65\3\65\7\65\u01aa\n\65\f\65\16\65\u01ad\13\65\3\65\3\65\3\65"+
		"\7\65\u01b2\n\65\f\65\16\65\u01b5\13\65\3\65\5\65\u01b8\n\65\3\66\3\66"+
		"\3\66\3\66\5\66\u01be\n\66\3\67\3\67\3\67\3\67\3\67\38\38\38\38\38\39"+
		"\39\39\3:\3:\3:\3:\3:\3:\3:\3:\3:\5:\u01d6\n:\3;\3;\3;\5;\u01db\n;\3;"+
		"\5;\u01de\n;\3;\3;\3;\3;\3;\3;\5;\u01e6\n;\5;\u01e8\n;\3;\3;\3;\3;\3;"+
		"\3;\5;\u01f0\n;\3<\3<\3<\5<\u01f5\n<\3<\3<\3=\6=\u01fa\n=\r=\16=\u01fb"+
		"\3>\3>\3>\5>\u0201\n>\3?\3?\7?\u0205\n?\f?\16?\u0208\13?\3@\3@\7@\u020c"+
		"\n@\f@\16@\u020f\13@\3A\3A\3A\6A\u0214\nA\rA\16A\u0215\3B\3B\3B\7B\u021b"+
		"\nB\fB\16B\u021e\13B\3C\3C\3D\3D\3E\3E\3F\3F\3G\6G\u0229\nG\rG\16G\u022a"+
		"\3G\3G\3H\3H\3H\3H\7H\u0233\nH\fH\16H\u0236\13H\3H\3H\3I\3I\3I\3I\7I\u023e"+
		"\nI\fI\16I\u0241\13I\3I\3I\3I\3I\3I\5\u01ab\u01b3\u023f\2J\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G"+
		"%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\2m\2o\2q\2s\67u8w"+
		"\2y\2{9}\2\177\2\u0081\2\u0083:\u0085\2\u0087\2\u0089\2\u008b\2\u008d"+
		";\u008f<\u0091=\3\2\r\5\2\2\2\f\f^^\4\2ZZzz\13\2$$))^^cdhhppttvvxx\4\2"+
		"GGgg\3\2\63;\5\2C\\aac|\3\2\62;\3\2\629\5\2\62;CHch\5\2\13\f\16\17\"\""+
		"\4\2\f\f\17\17\2\u0254\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2"+
		"Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3"+
		"\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2"+
		"\2\2s\3\2\2\2\2u\3\2\2\2\2{\3\2\2\2\2\u0083\3\2\2\2\2\u008d\3\2\2\2\2"+
		"\u008f\3\2\2\2\2\u0091\3\2\2\2\3\u0093\3\2\2\2\5\u009a\3\2\2\2\7\u00a1"+
		"\3\2\2\2\t\u00a6\3\2\2\2\13\u00ad\3\2\2\2\r\u00b5\3\2\2\2\17\u00bc\3\2"+
		"\2\2\21\u00c5\3\2\2\2\23\u00cb\3\2\2\2\25\u00cf\3\2\2\2\27\u00d5\3\2\2"+
		"\2\31\u00db\3\2\2\2\33\u00e2\3\2\2\2\35\u00e9\3\2\2\2\37\u00f0\3\2\2\2"+
		"!\u00f7\3\2\2\2#\u00ff\3\2\2\2%\u0107\3\2\2\2\'\u0110\3\2\2\2)\u0119\3"+
		"\2\2\2+\u011e\3\2\2\2-\u0125\3\2\2\2/\u012c\3\2\2\2\61\u0132\3\2\2\2\63"+
		"\u0138\3\2\2\2\65\u0141\3\2\2\2\67\u0144\3\2\2\29\u0148\3\2\2\2;\u014d"+
		"\3\2\2\2=\u0155\3\2\2\2?\u015d\3\2\2\2A\u0164\3\2\2\2C\u0168\3\2\2\2E"+
		"\u016f\3\2\2\2G\u0177\3\2\2\2I\u0180\3\2\2\2K\u0189\3\2\2\2M\u018b\3\2"+
		"\2\2O\u018d\3\2\2\2Q\u018f\3\2\2\2S\u0191\3\2\2\2U\u0193\3\2\2\2W\u0195"+
		"\3\2\2\2Y\u0197\3\2\2\2[\u0199\3\2\2\2]\u019b\3\2\2\2_\u019d\3\2\2\2a"+
		"\u019f\3\2\2\2c\u01a1\3\2\2\2e\u01a3\3\2\2\2g\u01a5\3\2\2\2i\u01b7\3\2"+
		"\2\2k\u01bd\3\2\2\2m\u01bf\3\2\2\2o\u01c4\3\2\2\2q\u01c9\3\2\2\2s\u01d5"+
		"\3\2\2\2u\u01ef\3\2\2\2w\u01f1\3\2\2\2y\u01f9\3\2\2\2{\u0200\3\2\2\2}"+
		"\u0202\3\2\2\2\177\u0209\3\2\2\2\u0081\u0210\3\2\2\2\u0083\u0217\3\2\2"+
		"\2\u0085\u021f\3\2\2\2\u0087\u0221\3\2\2\2\u0089\u0223\3\2\2\2\u008b\u0225"+
		"\3\2\2\2\u008d\u0228\3\2\2\2\u008f\u022e\3\2\2\2\u0091\u0239\3\2\2\2\u0093"+
		"\u0094\7u\2\2\u0094\u0095\7{\2\2\u0095\u0096\7p\2\2\u0096\u0097\7v\2\2"+
		"\u0097\u0098\7c\2\2\u0098\u0099\7z\2\2\u0099\4\3\2\2\2\u009a\u009b\7k"+
		"\2\2\u009b\u009c\7o\2\2\u009c\u009d\7r\2\2\u009d\u009e\7q\2\2\u009e\u009f"+
		"\7t\2\2\u009f\u00a0\7v\2\2\u00a0\6\3\2\2\2\u00a1\u00a2\7y\2\2\u00a2\u00a3"+
		"\7g\2\2\u00a3\u00a4\7c\2\2\u00a4\u00a5\7m\2\2\u00a5\b\3\2\2\2\u00a6\u00a7"+
		"\7r\2\2\u00a7\u00a8\7w\2\2\u00a8\u00a9\7d\2\2\u00a9\u00aa\7n\2\2\u00aa"+
		"\u00ab\7k\2\2\u00ab\u00ac\7e\2\2\u00ac\n\3\2\2\2\u00ad\u00ae\7r\2\2\u00ae"+
		"\u00af\7c\2\2\u00af\u00b0\7e\2\2\u00b0\u00b1\7m\2\2\u00b1\u00b2\7c\2\2"+
		"\u00b2\u00b3\7i\2\2\u00b3\u00b4\7g\2\2\u00b4\f\3\2\2\2\u00b5\u00b6\7q"+
		"\2\2\u00b6\u00b7\7r\2\2\u00b7\u00b8\7v\2\2\u00b8\u00b9\7k\2\2\u00b9\u00ba"+
		"\7q\2\2\u00ba\u00bb\7p\2\2\u00bb\16\3\2\2\2\u00bc\u00bd\7t\2\2\u00bd\u00be"+
		"\7g\2\2\u00be\u00bf\7r\2\2\u00bf\u00c0\7g\2\2\u00c0\u00c1\7c\2\2\u00c1"+
		"\u00c2\7v\2\2\u00c2\u00c3\7g\2\2\u00c3\u00c4\7f\2\2\u00c4\20\3\2\2\2\u00c5"+
		"\u00c6\7q\2\2\u00c6\u00c7\7p\2\2\u00c7\u00c8\7g\2\2\u00c8\u00c9\7q\2\2"+
		"\u00c9\u00ca\7h\2\2\u00ca\22\3\2\2\2\u00cb\u00cc\7o\2\2\u00cc\u00cd\7"+
		"c\2\2\u00cd\u00ce\7r\2\2\u00ce\24\3\2\2\2\u00cf\u00d0\7k\2\2\u00d0\u00d1"+
		"\7p\2\2\u00d1\u00d2\7v\2\2\u00d2\u00d3\7\65\2\2\u00d3\u00d4\7\64\2\2\u00d4"+
		"\26\3\2\2\2\u00d5\u00d6\7k\2\2\u00d6\u00d7\7p\2\2\u00d7\u00d8\7v\2\2\u00d8"+
		"\u00d9\78\2\2\u00d9\u00da\7\66\2\2\u00da\30\3\2\2\2\u00db\u00dc\7w\2\2"+
		"\u00dc\u00dd\7k\2\2\u00dd\u00de\7p\2\2\u00de\u00df\7v\2\2\u00df\u00e0"+
		"\7\65\2\2\u00e0\u00e1\7\64\2\2\u00e1\32\3\2\2\2\u00e2\u00e3\7w\2\2\u00e3"+
		"\u00e4\7k\2\2\u00e4\u00e5\7p\2\2\u00e5\u00e6\7v\2\2\u00e6\u00e7\78\2\2"+
		"\u00e7\u00e8\7\66\2\2\u00e8\34\3\2\2\2\u00e9\u00ea\7u\2\2\u00ea\u00eb"+
		"\7k\2\2\u00eb\u00ec\7p\2\2\u00ec\u00ed\7v\2\2\u00ed\u00ee\7\65\2\2\u00ee"+
		"\u00ef\7\64\2\2\u00ef\36\3\2\2\2\u00f0\u00f1\7u\2\2\u00f1\u00f2\7k\2\2"+
		"\u00f2\u00f3\7p\2\2\u00f3\u00f4\7v\2\2\u00f4\u00f5\78\2\2\u00f5\u00f6"+
		"\7\66\2\2\u00f6 \3\2\2\2\u00f7\u00f8\7h\2\2\u00f8\u00f9\7k\2\2\u00f9\u00fa"+
		"\7z\2\2\u00fa\u00fb\7g\2\2\u00fb\u00fc\7f\2\2\u00fc\u00fd\7\65\2\2\u00fd"+
		"\u00fe\7\64\2\2\u00fe\"\3\2\2\2\u00ff\u0100\7h\2\2\u0100\u0101\7k\2\2"+
		"\u0101\u0102\7z\2\2\u0102\u0103\7g\2\2\u0103\u0104\7f\2\2\u0104\u0105"+
		"\78\2\2\u0105\u0106\7\66\2\2\u0106$\3\2\2\2\u0107\u0108\7u\2\2\u0108\u0109"+
		"\7h\2\2\u0109\u010a\7k\2\2\u010a\u010b\7z\2\2\u010b\u010c\7g\2\2\u010c"+
		"\u010d\7f\2\2\u010d\u010e\7\65\2\2\u010e\u010f\7\64\2\2\u010f&\3\2\2\2"+
		"\u0110\u0111\7u\2\2\u0111\u0112\7h\2\2\u0112\u0113\7k\2\2\u0113\u0114"+
		"\7z\2\2\u0114\u0115\7g\2\2\u0115\u0116\7f\2\2\u0116\u0117\78\2\2\u0117"+
		"\u0118\7\66\2\2\u0118(\3\2\2\2\u0119\u011a\7d\2\2\u011a\u011b\7q\2\2\u011b"+
		"\u011c\7q\2\2\u011c\u011d\7n\2\2\u011d*\3\2\2\2\u011e\u011f\7u\2\2\u011f"+
		"\u0120\7v\2\2\u0120\u0121\7t\2\2\u0121\u0122\7k\2\2\u0122\u0123\7p\2\2"+
		"\u0123\u0124\7i\2\2\u0124,\3\2\2\2\u0125\u0126\7f\2\2\u0126\u0127\7q\2"+
		"\2\u0127\u0128\7w\2\2\u0128\u0129\7d\2\2\u0129\u012a\7n\2\2\u012a\u012b"+
		"\7g\2\2\u012b.\3\2\2\2\u012c\u012d\7h\2\2\u012d\u012e\7n\2\2\u012e\u012f"+
		"\7q\2\2\u012f\u0130\7c\2\2\u0130\u0131\7v\2\2\u0131\60\3\2\2\2\u0132\u0133"+
		"\7d\2\2\u0133\u0134\7{\2\2\u0134\u0135\7v\2\2\u0135\u0136\7g\2\2\u0136"+
		"\u0137\7u\2\2\u0137\62\3\2\2\2\u0138\u0139\7t\2\2\u0139\u013a\7g\2\2\u013a"+
		"\u013b\7u\2\2\u013b\u013c\7g\2\2\u013c\u013d\7t\2\2\u013d\u013e\7x\2\2"+
		"\u013e\u013f\7g\2\2\u013f\u0140\7f\2\2\u0140\64\3\2\2\2\u0141\u0142\7"+
		"v\2\2\u0142\u0143\7q\2\2\u0143\66\3\2\2\2\u0144\u0145\7o\2\2\u0145\u0146"+
		"\7c\2\2\u0146\u0147\7z\2\2\u01478\3\2\2\2\u0148\u0149\7g\2\2\u0149\u014a"+
		"\7p\2\2\u014a\u014b\7w\2\2\u014b\u014c\7o\2\2\u014c:\3\2\2\2\u014d\u014e"+
		"\7o\2\2\u014e\u014f\7g\2\2\u014f\u0150\7u\2\2\u0150\u0151\7u\2\2\u0151"+
		"\u0152\7c\2\2\u0152\u0153\7i\2\2\u0153\u0154\7g\2\2\u0154<\3\2\2\2\u0155"+
		"\u0156\7u\2\2\u0156\u0157\7g\2\2\u0157\u0158\7t\2\2\u0158\u0159\7x\2\2"+
		"\u0159\u015a\7k\2\2\u015a\u015b\7e\2\2\u015b\u015c\7g\2\2\u015c>\3\2\2"+
		"\2\u015d\u015e\7g\2\2\u015e\u015f\7z\2\2\u015f\u0160\7v\2\2\u0160\u0161"+
		"\7g\2\2\u0161\u0162\7p\2\2\u0162\u0163\7f\2\2\u0163@\3\2\2\2\u0164\u0165"+
		"\7t\2\2\u0165\u0166\7r\2\2\u0166\u0167\7e\2\2\u0167B\3\2\2\2\u0168\u0169"+
		"\7u\2\2\u0169\u016a\7v\2\2\u016a\u016b\7t\2\2\u016b\u016c\7g\2\2\u016c"+
		"\u016d\7c\2\2\u016d\u016e\7o\2\2\u016eD\3\2\2\2\u016f\u0170\7t\2\2\u0170"+
		"\u0171\7g\2\2\u0171\u0172\7v\2\2\u0172\u0173\7w\2\2\u0173\u0174\7t\2\2"+
		"\u0174\u0175\7p\2\2\u0175\u0176\7u\2\2\u0176F\3\2\2\2\u0177\u0178\7$\2"+
		"\2\u0178\u0179\7r\2\2\u0179\u017a\7t\2\2\u017a\u017b\7q\2\2\u017b\u017c"+
		"\7v\2\2\u017c\u017d\7q\2\2\u017d\u017e\7\65\2\2\u017e\u017f\7$\2\2\u017f"+
		"H\3\2\2\2\u0180\u0181\7)\2\2\u0181\u0182\7r\2\2\u0182\u0183\7t\2\2\u0183"+
		"\u0184\7q\2\2\u0184\u0185\7v\2\2\u0185\u0186\7q\2\2\u0186\u0187\7\65\2"+
		"\2\u0187\u0188\7)\2\2\u0188J\3\2\2\2\u0189\u018a\7=\2\2\u018aL\3\2\2\2"+
		"\u018b\u018c\7?\2\2\u018cN\3\2\2\2\u018d\u018e\7*\2\2\u018eP\3\2\2\2\u018f"+
		"\u0190\7+\2\2\u0190R\3\2\2\2\u0191\u0192\7]\2\2\u0192T\3\2\2\2\u0193\u0194"+
		"\7_\2\2\u0194V\3\2\2\2\u0195\u0196\7}\2\2\u0196X\3\2\2\2\u0197\u0198\7"+
		"\177\2\2\u0198Z\3\2\2\2\u0199\u019a\7>\2\2\u019a\\\3\2\2\2\u019b\u019c"+
		"\7@\2\2\u019c^\3\2\2\2\u019d\u019e\7\60\2\2\u019e`\3\2\2\2\u019f\u01a0"+
		"\7.\2\2\u01a0b\3\2\2\2\u01a1\u01a2\7<\2\2\u01a2d\3\2\2\2\u01a3\u01a4\7"+
		"-\2\2\u01a4f\3\2\2\2\u01a5\u01a6\7/\2\2\u01a6h\3\2\2\2\u01a7\u01ab\7)"+
		"\2\2\u01a8\u01aa\5k\66\2\u01a9\u01a8\3\2\2\2\u01aa\u01ad\3\2\2\2\u01ab"+
		"\u01ac\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ac\u01ae\3\2\2\2\u01ad\u01ab\3\2"+
		"\2\2\u01ae\u01b8\7)\2\2\u01af\u01b3\7$\2\2\u01b0\u01b2\5k\66\2\u01b1\u01b0"+
		"\3\2\2\2\u01b2\u01b5\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b3\u01b1\3\2\2\2\u01b4"+
		"\u01b6\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b6\u01b8\7$\2\2\u01b7\u01a7\3\2"+
		"\2\2\u01b7\u01af\3\2\2\2\u01b8j\3\2\2\2\u01b9\u01be\5m\67\2\u01ba\u01be"+
		"\5o8\2\u01bb\u01be\5q9\2\u01bc\u01be\n\2\2\2\u01bd\u01b9\3\2\2\2\u01bd"+
		"\u01ba\3\2\2\2\u01bd\u01bb\3\2\2\2\u01bd\u01bc\3\2\2\2\u01bel\3\2\2\2"+
		"\u01bf\u01c0\7^\2\2\u01c0\u01c1\t\3\2\2\u01c1\u01c2\5\u008bF\2\u01c2\u01c3"+
		"\5\u008bF\2\u01c3n\3\2\2\2\u01c4\u01c5\7^\2\2\u01c5\u01c6\5\u0089E\2\u01c6"+
		"\u01c7\5\u0089E\2\u01c7\u01c8\5\u0089E\2\u01c8p\3\2\2\2\u01c9\u01ca\7"+
		"^\2\2\u01ca\u01cb\t\4\2\2\u01cbr\3\2\2\2\u01cc\u01cd\7v\2\2\u01cd\u01ce"+
		"\7t\2\2\u01ce\u01cf\7w\2\2\u01cf\u01d6\7g\2\2\u01d0\u01d1\7h\2\2\u01d1"+
		"\u01d2\7c\2\2\u01d2\u01d3\7n\2\2\u01d3\u01d4\7u\2\2\u01d4\u01d6\7g\2\2"+
		"\u01d5\u01cc\3\2\2\2\u01d5\u01d0\3\2\2\2\u01d6t\3\2\2\2\u01d7\u01d8\5"+
		"y=\2\u01d8\u01da\5_\60\2\u01d9\u01db\5y=\2\u01da\u01d9\3\2\2\2\u01da\u01db"+
		"\3\2\2\2\u01db\u01dd\3\2\2\2\u01dc\u01de\5w<\2\u01dd\u01dc\3\2\2\2\u01dd"+
		"\u01de\3\2\2\2\u01de\u01e8\3\2\2\2\u01df\u01e0\5y=\2\u01e0\u01e1\5w<\2"+
		"\u01e1\u01e8\3\2\2\2\u01e2\u01e3\5_\60\2\u01e3\u01e5\5y=\2\u01e4\u01e6"+
		"\5w<\2\u01e5\u01e4\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01e8\3\2\2\2\u01e7"+
		"\u01d7\3\2\2\2\u01e7\u01df\3\2\2\2\u01e7\u01e2\3\2\2\2\u01e8\u01f0\3\2"+
		"\2\2\u01e9\u01ea\7k\2\2\u01ea\u01eb\7p\2\2\u01eb\u01f0\7h\2\2\u01ec\u01ed"+
		"\7p\2\2\u01ed\u01ee\7c\2\2\u01ee\u01f0\7p\2\2\u01ef\u01e7\3\2\2\2\u01ef"+
		"\u01e9\3\2\2\2\u01ef\u01ec\3\2\2\2\u01f0v\3\2\2\2\u01f1\u01f4\t\5\2\2"+
		"\u01f2\u01f5\5e\63\2\u01f3\u01f5\5g\64\2\u01f4\u01f2\3\2\2\2\u01f4\u01f3"+
		"\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6\u01f7\5y=\2\u01f7"+
		"x\3\2\2\2\u01f8\u01fa\5\u0087D\2\u01f9\u01f8\3\2\2\2\u01fa\u01fb\3\2\2"+
		"\2\u01fb\u01f9\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fcz\3\2\2\2\u01fd\u0201"+
		"\5}?\2\u01fe\u0201\5\177@\2\u01ff\u0201\5\u0081A\2\u0200\u01fd\3\2\2\2"+
		"\u0200\u01fe\3\2\2\2\u0200\u01ff\3\2\2\2\u0201|\3\2\2\2\u0202\u0206\t"+
		"\6\2\2\u0203\u0205\5\u0087D\2\u0204\u0203\3\2\2\2\u0205\u0208\3\2\2\2"+
		"\u0206\u0204\3\2\2\2\u0206\u0207\3\2\2\2\u0207~\3\2\2\2\u0208\u0206\3"+
		"\2\2\2\u0209\u020d\7\62\2\2\u020a\u020c\5\u0089E\2\u020b\u020a\3\2\2\2"+
		"\u020c\u020f\3\2\2\2\u020d\u020b\3\2\2\2\u020d\u020e\3\2\2\2\u020e\u0080"+
		"\3\2\2\2\u020f\u020d\3\2\2\2\u0210\u0211\7\62\2\2\u0211\u0213\t\3\2\2"+
		"\u0212\u0214\5\u008bF\2\u0213\u0212\3\2\2\2\u0214\u0215\3\2\2\2\u0215"+
		"\u0213\3\2\2\2\u0215\u0216\3\2\2\2\u0216\u0082\3\2\2\2\u0217\u021c\5\u0085"+
		"C\2\u0218\u021b\5\u0085C\2\u0219\u021b\5\u0087D\2\u021a\u0218\3\2\2\2"+
		"\u021a\u0219\3\2\2\2\u021b\u021e\3\2\2\2\u021c\u021a\3\2\2\2\u021c\u021d"+
		"\3\2\2\2\u021d\u0084\3\2\2\2\u021e\u021c\3\2\2\2\u021f\u0220\t\7\2\2\u0220"+
		"\u0086\3\2\2\2\u0221\u0222\t\b\2\2\u0222\u0088\3\2\2\2\u0223\u0224\t\t"+
		"\2\2\u0224\u008a\3\2\2\2\u0225\u0226\t\n\2\2\u0226\u008c\3\2\2\2\u0227"+
		"\u0229\t\13\2\2\u0228\u0227\3\2\2\2\u0229\u022a\3\2\2\2\u022a\u0228\3"+
		"\2\2\2\u022a\u022b\3\2\2\2\u022b\u022c\3\2\2\2\u022c\u022d\bG\2\2\u022d"+
		"\u008e\3\2\2\2\u022e\u022f\7\61\2\2\u022f\u0230\7\61\2\2\u0230\u0234\3"+
		"\2\2\2\u0231\u0233\n\f\2\2\u0232\u0231\3\2\2\2\u0233\u0236\3\2\2\2\u0234"+
		"\u0232\3\2\2\2\u0234\u0235\3\2\2\2\u0235\u0237\3\2\2\2\u0236\u0234\3\2"+
		"\2\2\u0237\u0238\bH\3\2\u0238\u0090\3\2\2\2\u0239\u023a\7\61\2\2\u023a"+
		"\u023b\7,\2\2\u023b\u023f\3\2\2\2\u023c\u023e\13\2\2\2\u023d\u023c\3\2"+
		"\2\2\u023e\u0241\3\2\2\2\u023f\u0240\3\2\2\2\u023f\u023d\3\2\2\2\u0240"+
		"\u0242\3\2\2\2\u0241\u023f\3\2\2\2\u0242\u0243\7,\2\2\u0243\u0244\7\61"+
		"\2\2\u0244\u0245\3\2\2\2\u0245\u0246\bI\3\2\u0246\u0092\3\2\2\2\30\2\u01ab"+
		"\u01b3\u01b7\u01bd\u01d5\u01da\u01dd\u01e5\u01e7\u01ef\u01f4\u01fb\u0200"+
		"\u0206\u020d\u0215\u021a\u021c\u022a\u0234\u023f\4\b\2\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}