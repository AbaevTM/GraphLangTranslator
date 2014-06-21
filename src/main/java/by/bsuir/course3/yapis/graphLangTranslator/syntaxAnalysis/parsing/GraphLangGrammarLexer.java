// Generated from main\java\by\bsuir\course3\yapis\graphLangTranslator\syntaxAnalysis\parsing\GraphLangGrammar.g4 by ANTLR 4.2
package main.java.by.bsuir.course3.yapis.graphLangTranslator.syntaxAnalysis.parsing;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GraphLangGrammarLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF_WORD=1, RETURN_WORD=2, ELSE_WORD=3, SWITCH_WORD=4, WHILE_WORD=5, UNTIL_WORD=6, 
		FOR_WORD=7, NULL_WORD=8, BREAK_WORD=9, SEMICOLON_WORD=10, OPENING_BRACKET_WORD=11, 
		CLOSING_BRACKET_WORD=12, OPENING_CURLY_BRACKET_WORD=13, CLOSING_CURLY_BRACKET_WORD=14, 
		OPENING_SQUARE_BRACKET_WORD=15, CLOSING_SQUARE_BRACKET_WORD=16, COMMA_WORD=17, 
		EQUAL_SIGN_WORD=18, PLUS_WORD=19, MINUS_WORD=20, MULTIPLICATION_WORD=21, 
		DIVISION_WORD=22, SEPARATOR_WORD=23, GREATER_WORD=24, GREATER_OR_EQUAL_WORD=25, 
		LESS_WORD=26, LESS_OR_EQUAL_WORD=27, EQUAL_WORD=28, NOT_EQUAL_WORD=29, 
		BOOLEAN_LITERAL=30, TRUE_LITERAL=31, FALSE_LITERAL=32, INTEGER_NUMBER=33, 
		REAL_NUMBER=34, STRING=35, TYPE_WORD=36, TYPE_SPECIFIER=37, IDENTIFIER_WORD=38, 
		VOID_TYPE=39, BOOLEAN_TYPE=40, INT_TYPE=41, REAL_TYPE=42, STRING_TYPE=43, 
		ARC_TYPE=44, NODE_TYPE=45, GRAPH_TYPE=46, CONSTANT_TYPE_SPEC=47, GLOBAL_TYPE_SPEC=48, 
		TRASH=49, LINE_COMMENT=50, MULTI_LINE_COMMENT=51;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'if'", "'return'", "'else'", "'switch'", "'while'", "'until'", "'for'", 
		"'null'", "'break'", "';'", "'('", "')'", "'{'", "'}'", "'['", "']'", 
		"','", "'='", "'+'", "'-'", "'*'", "'/'", "'|'", "'>'", "'>='", "'<'", 
		"'<='", "'=='", "'<>'", "BOOLEAN_LITERAL", "'true'", "'false'", "INTEGER_NUMBER", 
		"REAL_NUMBER", "STRING", "TYPE_WORD", "TYPE_SPECIFIER", "IDENTIFIER_WORD", 
		"'Void'", "'Boolean'", "'Int'", "'Real'", "'String'", "'Arc'", "'Node'", 
		"'Graph'", "'#'", "'@'", "TRASH", "LINE_COMMENT", "MULTI_LINE_COMMENT"
	};
	public static final String[] ruleNames = {
		"IF_WORD", "RETURN_WORD", "ELSE_WORD", "SWITCH_WORD", "WHILE_WORD", "UNTIL_WORD", 
		"FOR_WORD", "NULL_WORD", "BREAK_WORD", "SEMICOLON_WORD", "OPENING_BRACKET_WORD", 
		"CLOSING_BRACKET_WORD", "OPENING_CURLY_BRACKET_WORD", "CLOSING_CURLY_BRACKET_WORD", 
		"OPENING_SQUARE_BRACKET_WORD", "CLOSING_SQUARE_BRACKET_WORD", "COMMA_WORD", 
		"EQUAL_SIGN_WORD", "PLUS_WORD", "MINUS_WORD", "MULTIPLICATION_WORD", "DIVISION_WORD", 
		"SEPARATOR_WORD", "GREATER_WORD", "GREATER_OR_EQUAL_WORD", "LESS_WORD", 
		"LESS_OR_EQUAL_WORD", "EQUAL_WORD", "NOT_EQUAL_WORD", "BOOLEAN_LITERAL", 
		"TRUE_LITERAL", "FALSE_LITERAL", "INTEGER_NUMBER", "REAL_NUMBER", "STRING", 
		"TYPE_WORD", "TYPE_SPECIFIER", "IDENTIFIER_WORD", "VOID_TYPE", "BOOLEAN_TYPE", 
		"INT_TYPE", "REAL_TYPE", "STRING_TYPE", "ARC_TYPE", "NODE_TYPE", "GRAPH_TYPE", 
		"CONSTANT_TYPE_SPEC", "GLOBAL_TYPE_SPEC", "LINE_COMMENT_SYMBOL", "MULTILINE_COMMENT_SYMBOL", 
		"UPPER_CASE_LETTER", "LOWER_CASE_LETTER", "STRING_BRACKET", "NON_ZERO_DIGIT", 
		"ZERO_DIGIT", "TRASH", "LINE_COMMENT", "MULTI_LINE_COMMENT"
	};


	public GraphLangGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "GraphLangGrammar.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\65\u0179\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\3\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3"+
		"\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3"+
		"\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3"+
		"\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3"+
		"\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\5\37\u00d7"+
		"\n\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\7\"\u00e7\n\"\f\"\16"+
		"\"\u00ea\13\"\3#\3#\3#\7#\u00ef\n#\f#\16#\u00f2\13#\3#\3#\3#\6#\u00f7"+
		"\n#\r#\16#\u00f8\3#\5#\u00fc\n#\3$\3$\7$\u0100\n$\f$\16$\u0103\13$\3$"+
		"\3$\3%\3%\3%\3%\3%\3%\3%\3%\5%\u010f\n%\3&\3&\5&\u0113\n&\3\'\3\'\3\'"+
		"\3\'\3\'\7\'\u011a\n\'\f\'\16\'\u011d\13\'\3(\3(\3(\3(\3(\3)\3)\3)\3)"+
		"\3)\3)\3)\3)\3*\3*\3*\3*\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-"+
		"\3-\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\62"+
		"\3\63\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\69\u0160"+
		"\n9\r9\169\u0161\39\39\3:\3:\7:\u0168\n:\f:\16:\u016b\13:\3:\3:\3;\3;"+
		"\7;\u0171\n;\f;\16;\u0174\13;\3;\3;\3;\3;\4\u0101\u0172\2<\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G"+
		"%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\2e\2g\2i\2k\2m\2o\2q\63s\64u\65\3"+
		"\2\7\4\2C\\\uffff\uffff\4\2c|\uffff\uffff\3\2\63;\6\2\13\f\16\17\"\")"+
		")\4\2\f\f\17\17\u0189\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2"+
		"Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3"+
		"\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\3w\3\2\2"+
		"\2\5z\3\2\2\2\7\u0081\3\2\2\2\t\u0086\3\2\2\2\13\u008d\3\2\2\2\r\u0093"+
		"\3\2\2\2\17\u0099\3\2\2\2\21\u009d\3\2\2\2\23\u00a2\3\2\2\2\25\u00a8\3"+
		"\2\2\2\27\u00aa\3\2\2\2\31\u00ac\3\2\2\2\33\u00ae\3\2\2\2\35\u00b0\3\2"+
		"\2\2\37\u00b2\3\2\2\2!\u00b4\3\2\2\2#\u00b6\3\2\2\2%\u00b8\3\2\2\2\'\u00ba"+
		"\3\2\2\2)\u00bc\3\2\2\2+\u00be\3\2\2\2-\u00c0\3\2\2\2/\u00c2\3\2\2\2\61"+
		"\u00c4\3\2\2\2\63\u00c6\3\2\2\2\65\u00c9\3\2\2\2\67\u00cb\3\2\2\29\u00ce"+
		"\3\2\2\2;\u00d1\3\2\2\2=\u00d6\3\2\2\2?\u00d8\3\2\2\2A\u00dd\3\2\2\2C"+
		"\u00e3\3\2\2\2E\u00fb\3\2\2\2G\u00fd\3\2\2\2I\u010e\3\2\2\2K\u0112\3\2"+
		"\2\2M\u0114\3\2\2\2O\u011e\3\2\2\2Q\u0123\3\2\2\2S\u012b\3\2\2\2U\u012f"+
		"\3\2\2\2W\u0134\3\2\2\2Y\u013b\3\2\2\2[\u013f\3\2\2\2]\u0144\3\2\2\2_"+
		"\u014a\3\2\2\2a\u014c\3\2\2\2c\u014e\3\2\2\2e\u0151\3\2\2\2g\u0154\3\2"+
		"\2\2i\u0156\3\2\2\2k\u0158\3\2\2\2m\u015a\3\2\2\2o\u015c\3\2\2\2q\u015f"+
		"\3\2\2\2s\u0165\3\2\2\2u\u016e\3\2\2\2wx\7k\2\2xy\7h\2\2y\4\3\2\2\2z{"+
		"\7t\2\2{|\7g\2\2|}\7v\2\2}~\7w\2\2~\177\7t\2\2\177\u0080\7p\2\2\u0080"+
		"\6\3\2\2\2\u0081\u0082\7g\2\2\u0082\u0083\7n\2\2\u0083\u0084\7u\2\2\u0084"+
		"\u0085\7g\2\2\u0085\b\3\2\2\2\u0086\u0087\7u\2\2\u0087\u0088\7y\2\2\u0088"+
		"\u0089\7k\2\2\u0089\u008a\7v\2\2\u008a\u008b\7e\2\2\u008b\u008c\7j\2\2"+
		"\u008c\n\3\2\2\2\u008d\u008e\7y\2\2\u008e\u008f\7j\2\2\u008f\u0090\7k"+
		"\2\2\u0090\u0091\7n\2\2\u0091\u0092\7g\2\2\u0092\f\3\2\2\2\u0093\u0094"+
		"\7w\2\2\u0094\u0095\7p\2\2\u0095\u0096\7v\2\2\u0096\u0097\7k\2\2\u0097"+
		"\u0098\7n\2\2\u0098\16\3\2\2\2\u0099\u009a\7h\2\2\u009a\u009b\7q\2\2\u009b"+
		"\u009c\7t\2\2\u009c\20\3\2\2\2\u009d\u009e\7p\2\2\u009e\u009f\7w\2\2\u009f"+
		"\u00a0\7n\2\2\u00a0\u00a1\7n\2\2\u00a1\22\3\2\2\2\u00a2\u00a3\7d\2\2\u00a3"+
		"\u00a4\7t\2\2\u00a4\u00a5\7g\2\2\u00a5\u00a6\7c\2\2\u00a6\u00a7\7m\2\2"+
		"\u00a7\24\3\2\2\2\u00a8\u00a9\7=\2\2\u00a9\26\3\2\2\2\u00aa\u00ab\7*\2"+
		"\2\u00ab\30\3\2\2\2\u00ac\u00ad\7+\2\2\u00ad\32\3\2\2\2\u00ae\u00af\7"+
		"}\2\2\u00af\34\3\2\2\2\u00b0\u00b1\7\177\2\2\u00b1\36\3\2\2\2\u00b2\u00b3"+
		"\7]\2\2\u00b3 \3\2\2\2\u00b4\u00b5\7_\2\2\u00b5\"\3\2\2\2\u00b6\u00b7"+
		"\7.\2\2\u00b7$\3\2\2\2\u00b8\u00b9\7?\2\2\u00b9&\3\2\2\2\u00ba\u00bb\7"+
		"-\2\2\u00bb(\3\2\2\2\u00bc\u00bd\7/\2\2\u00bd*\3\2\2\2\u00be\u00bf\7,"+
		"\2\2\u00bf,\3\2\2\2\u00c0\u00c1\7\61\2\2\u00c1.\3\2\2\2\u00c2\u00c3\7"+
		"~\2\2\u00c3\60\3\2\2\2\u00c4\u00c5\7@\2\2\u00c5\62\3\2\2\2\u00c6\u00c7"+
		"\7@\2\2\u00c7\u00c8\7?\2\2\u00c8\64\3\2\2\2\u00c9\u00ca\7>\2\2\u00ca\66"+
		"\3\2\2\2\u00cb\u00cc\7>\2\2\u00cc\u00cd\7?\2\2\u00cd8\3\2\2\2\u00ce\u00cf"+
		"\7?\2\2\u00cf\u00d0\7?\2\2\u00d0:\3\2\2\2\u00d1\u00d2\7>\2\2\u00d2\u00d3"+
		"\7@\2\2\u00d3<\3\2\2\2\u00d4\u00d7\5? \2\u00d5\u00d7\5A!\2\u00d6\u00d4"+
		"\3\2\2\2\u00d6\u00d5\3\2\2\2\u00d7>\3\2\2\2\u00d8\u00d9\7v\2\2\u00d9\u00da"+
		"\7t\2\2\u00da\u00db\7w\2\2\u00db\u00dc\7g\2\2\u00dc@\3\2\2\2\u00dd\u00de"+
		"\7h\2\2\u00de\u00df\7c\2\2\u00df\u00e0\7n\2\2\u00e0\u00e1\7u\2\2\u00e1"+
		"\u00e2\7g\2\2\u00e2B\3\2\2\2\u00e3\u00e8\5m\67\2\u00e4\u00e7\5o8\2\u00e5"+
		"\u00e7\5m\67\2\u00e6\u00e4\3\2\2\2\u00e6\u00e5\3\2\2\2\u00e7\u00ea\3\2"+
		"\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9D\3\2\2\2\u00ea\u00e8"+
		"\3\2\2\2\u00eb\u00f0\5m\67\2\u00ec\u00ef\5o8\2\u00ed\u00ef\5m\67\2\u00ee"+
		"\u00ec\3\2\2\2\u00ee\u00ed\3\2\2\2\u00ef\u00f2\3\2\2\2\u00f0\u00ee\3\2"+
		"\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f3\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3"+
		"\u00f6\7\60\2\2\u00f4\u00f7\5o8\2\u00f5\u00f7\5m\67\2\u00f6\u00f4\3\2"+
		"\2\2\u00f6\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8"+
		"\u00f9\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00fc\5o8\2\u00fb\u00eb\3\2\2"+
		"\2\u00fb\u00fa\3\2\2\2\u00fcF\3\2\2\2\u00fd\u0101\5k\66\2\u00fe\u0100"+
		"\13\2\2\2\u00ff\u00fe\3\2\2\2\u0100\u0103\3\2\2\2\u0101\u0102\3\2\2\2"+
		"\u0101\u00ff\3\2\2\2\u0102\u0104\3\2\2\2\u0103\u0101\3\2\2\2\u0104\u0105"+
		"\5k\66\2\u0105H\3\2\2\2\u0106\u010f\5S*\2\u0107\u010f\5U+\2\u0108\u010f"+
		"\5W,\2\u0109\u010f\5Y-\2\u010a\u010f\5[.\2\u010b\u010f\5]/\2\u010c\u010f"+
		"\5O(\2\u010d\u010f\5Q)\2\u010e\u0106\3\2\2\2\u010e\u0107\3\2\2\2\u010e"+
		"\u0108\3\2\2\2\u010e\u0109\3\2\2\2\u010e\u010a\3\2\2\2\u010e\u010b\3\2"+
		"\2\2\u010e\u010c\3\2\2\2\u010e\u010d\3\2\2\2\u010fJ\3\2\2\2\u0110\u0113"+
		"\5a\61\2\u0111\u0113\5_\60\2\u0112\u0110\3\2\2\2\u0112\u0111\3\2\2\2\u0113"+
		"L\3\2\2\2\u0114\u011b\5i\65\2\u0115\u011a\5i\65\2\u0116\u011a\5g\64\2"+
		"\u0117\u011a\5m\67\2\u0118\u011a\5o8\2\u0119\u0115\3\2\2\2\u0119\u0116"+
		"\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u0118\3\2\2\2\u011a\u011d\3\2\2\2\u011b"+
		"\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011cN\3\2\2\2\u011d\u011b\3\2\2\2"+
		"\u011e\u011f\7X\2\2\u011f\u0120\7q\2\2\u0120\u0121\7k\2\2\u0121\u0122"+
		"\7f\2\2\u0122P\3\2\2\2\u0123\u0124\7D\2\2\u0124\u0125\7q\2\2\u0125\u0126"+
		"\7q\2\2\u0126\u0127\7n\2\2\u0127\u0128\7g\2\2\u0128\u0129\7c\2\2\u0129"+
		"\u012a\7p\2\2\u012aR\3\2\2\2\u012b\u012c\7K\2\2\u012c\u012d\7p\2\2\u012d"+
		"\u012e\7v\2\2\u012eT\3\2\2\2\u012f\u0130\7T\2\2\u0130\u0131\7g\2\2\u0131"+
		"\u0132\7c\2\2\u0132\u0133\7n\2\2\u0133V\3\2\2\2\u0134\u0135\7U\2\2\u0135"+
		"\u0136\7v\2\2\u0136\u0137\7t\2\2\u0137\u0138\7k\2\2\u0138\u0139\7p\2\2"+
		"\u0139\u013a\7i\2\2\u013aX\3\2\2\2\u013b\u013c\7C\2\2\u013c\u013d\7t\2"+
		"\2\u013d\u013e\7e\2\2\u013eZ\3\2\2\2\u013f\u0140\7P\2\2\u0140\u0141\7"+
		"q\2\2\u0141\u0142\7f\2\2\u0142\u0143\7g\2\2\u0143\\\3\2\2\2\u0144\u0145"+
		"\7I\2\2\u0145\u0146\7t\2\2\u0146\u0147\7c\2\2\u0147\u0148\7r\2\2\u0148"+
		"\u0149\7j\2\2\u0149^\3\2\2\2\u014a\u014b\7%\2\2\u014b`\3\2\2\2\u014c\u014d"+
		"\7B\2\2\u014db\3\2\2\2\u014e\u014f\7\u0080\2\2\u014f\u0150\7\u0080\2\2"+
		"\u0150d\3\2\2\2\u0151\u0152\7`\2\2\u0152\u0153\7`\2\2\u0153f\3\2\2\2\u0154"+
		"\u0155\t\2\2\2\u0155h\3\2\2\2\u0156\u0157\t\3\2\2\u0157j\3\2\2\2\u0158"+
		"\u0159\7$\2\2\u0159l\3\2\2\2\u015a\u015b\t\4\2\2\u015bn\3\2\2\2\u015c"+
		"\u015d\7\62\2\2\u015dp\3\2\2\2\u015e\u0160\t\5\2\2\u015f\u015e\3\2\2\2"+
		"\u0160\u0161\3\2\2\2\u0161\u015f\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0163"+
		"\3\2\2\2\u0163\u0164\b9\2\2\u0164r\3\2\2\2\u0165\u0169\5c\62\2\u0166\u0168"+
		"\n\6\2\2\u0167\u0166\3\2\2\2\u0168\u016b\3\2\2\2\u0169\u0167\3\2\2\2\u0169"+
		"\u016a\3\2\2\2\u016a\u016c\3\2\2\2\u016b\u0169\3\2\2\2\u016c\u016d\b:"+
		"\2\2\u016dt\3\2\2\2\u016e\u0172\5e\63\2\u016f\u0171\13\2\2\2\u0170\u016f"+
		"\3\2\2\2\u0171\u0174\3\2\2\2\u0172\u0173\3\2\2\2\u0172\u0170\3\2\2\2\u0173"+
		"\u0175\3\2\2\2\u0174\u0172\3\2\2\2\u0175\u0176\5e\63\2\u0176\u0177\3\2"+
		"\2\2\u0177\u0178\b;\2\2\u0178v\3\2\2\2\23\2\u00d6\u00e6\u00e8\u00ee\u00f0"+
		"\u00f6\u00f8\u00fb\u0101\u010e\u0112\u0119\u011b\u0161\u0169\u0172\3\2"+
		"\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}