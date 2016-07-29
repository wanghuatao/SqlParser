// Generated from SqlLexer.g4 by ANTLR 4.5

	package com.dokia.SqlParser.converter;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SqlLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OPT_SEMI_COLON=1, COMMA=2, LPARAN=3, RPARAN=4, LSQUARE=5, RSQUARE=6, ARITH_OPER=7, 
		NEGTIVE=8, COMPARE_OPER=9, NOT=10, EQUALS=11, STAR=12, SEP=13, PAGE=14, 
		OFFSET=15, UNION=16, AS=17, AND=18, OR=19, LIKE=20, IN=21, SELECT=22, 
		FROM=23, WHERE=24, BETWEEN=25, ORDER=26, BREAK=27, GROUP=28, BY=29, DURATION=30, 
		PERIOD=31, LIMIT=32, ASC=33, DESC=34, ASCENDING=35, DESCENDING=36, AGGREOPR=37, 
		COUNT=38, LONG_SUM=39, DOUBLE_SUM=40, UNIQUE=41, HYPER_UNIQUE=42, ON=43, 
		JOIN=44, LEFT_JOIN=45, RIGHT_JOIN=46, HAVING=47, THEN=48, WHICH=49, CONTAINS=50, 
		SORT=51, HINT=52, INTERVAL=53, MIN=54, MAX=55, JAVASCRIPT=56, INCLUDE=57, 
		LONG=58, FLOAT=59, ID=60, SINGLE_QUOTE_STRING=61, WS=62, DATE_YEAR_MONTH_ONLY=63, 
		DATE=64, DATE_HOUR=65, DATE_HOUR_MIN=66, DATE_HOUR_MIN_SEC=67, DATE_HOUR_MIN_SEC_SUB=68, 
		DATE_HOUR_MIN_SEC_SUB_TZ=69, DATE_HOUR_MIN_SEC_SUB_UTC_TZ=70;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"OPT_SEMI_COLON", "COMMA", "LPARAN", "RPARAN", "LSQUARE", "RSQUARE", "ARITH_OPER", 
		"NEGTIVE", "COMPARE_OPER", "NOT", "EQUALS", "STAR", "SEP", "PAGE", "OFFSET", 
		"UNION", "AS", "AND", "OR", "LIKE", "IN", "SELECT", "FROM", "WHERE", "BETWEEN", 
		"ORDER", "BREAK", "GROUP", "BY", "DURATION", "PERIOD", "LIMIT", "ASC", 
		"DESC", "ASCENDING", "DESCENDING", "AGGREOPR", "COUNT", "LONG_SUM", "DOUBLE_SUM", 
		"UNIQUE", "HYPER_UNIQUE", "ON", "JOIN", "LEFT_JOIN", "RIGHT_JOIN", "HAVING", 
		"THEN", "WHICH", "CONTAINS", "SORT", "HINT", "INTERVAL", "MIN", "MAX", 
		"JAVASCRIPT", "INCLUDE", "LONG", "FLOAT", "ID", "SINGLE_QUOTE_STRING", 
		"WS", "DATE_YEAR_MONTH_ONLY", "DATE", "DATE_HOUR", "DATE_HOUR_MIN", "DATE_HOUR_MIN_SEC", 
		"DATE_HOUR_MIN_SEC_SUB", "DATE_HOUR_MIN_SEC_SUB_TZ", "DATE_HOUR_MIN_SEC_SUB_UTC_TZ", 
		"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", 
		"O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "NUM", "DATE_YEAR_ONLY", 
		"HEX_DIGIT", "ESC_SEQ", "OCTAL_ESC", "UNICODE_ESC"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "','", "'('", "')'", "'['", "']'", null, "'-'", null, null, 
		"'='", "'*'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "OPT_SEMI_COLON", "COMMA", "LPARAN", "RPARAN", "LSQUARE", "RSQUARE", 
		"ARITH_OPER", "NEGTIVE", "COMPARE_OPER", "NOT", "EQUALS", "STAR", "SEP", 
		"PAGE", "OFFSET", "UNION", "AS", "AND", "OR", "LIKE", "IN", "SELECT", 
		"FROM", "WHERE", "BETWEEN", "ORDER", "BREAK", "GROUP", "BY", "DURATION", 
		"PERIOD", "LIMIT", "ASC", "DESC", "ASCENDING", "DESCENDING", "AGGREOPR", 
		"COUNT", "LONG_SUM", "DOUBLE_SUM", "UNIQUE", "HYPER_UNIQUE", "ON", "JOIN", 
		"LEFT_JOIN", "RIGHT_JOIN", "HAVING", "THEN", "WHICH", "CONTAINS", "SORT", 
		"HINT", "INTERVAL", "MIN", "MAX", "JAVASCRIPT", "INCLUDE", "LONG", "FLOAT", 
		"ID", "SINGLE_QUOTE_STRING", "WS", "DATE_YEAR_MONTH_ONLY", "DATE", "DATE_HOUR", 
		"DATE_HOUR_MIN", "DATE_HOUR_MIN_SEC", "DATE_HOUR_MIN_SEC_SUB", "DATE_HOUR_MIN_SEC_SUB_TZ", 
		"DATE_HOUR_MIN_SEC_SUB_UTC_TZ"
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


	public SqlLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SqlLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2H\u02bd\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#"+
		"\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%"+
		"\3&\3&\3&\5&\u0178\n&\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3("+
		"\3(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+"+
		"\3+\3+\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3."+
		"\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\65"+
		"\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\67"+
		"\3\67\3\67\3\67\38\38\38\38\39\39\39\39\39\39\39\39\39\39\39\3:\3:\3:"+
		"\3:\3:\3:\3:\3:\3;\6;\u020f\n;\r;\16;\u0210\3<\7<\u0214\n<\f<\16<\u0217"+
		"\13<\3<\3<\6<\u021b\n<\r<\16<\u021c\3=\3=\7=\u0221\n=\f=\16=\u0224\13"+
		"=\3>\3>\3>\7>\u0229\n>\f>\16>\u022c\13>\3>\3>\3?\6?\u0231\n?\r?\16?\u0232"+
		"\3?\3?\3@\3@\3@\3@\3@\3A\3A\3A\3A\3A\3B\3B\3B\3B\3B\3C\3C\3C\3C\3C\3D"+
		"\3D\3D\3D\3D\3E\3E\3E\3E\3E\3E\3F\3F\3F\3F\3F\3F\3F\3F\3G\3G\3G\3G\3G"+
		"\3G\3G\3G\3G\5G\u0267\nG\3H\3H\3I\3I\3J\3J\3K\3K\3L\3L\3M\3M\3N\3N\3O"+
		"\3O\3P\3P\3Q\3Q\3R\3R\3S\3S\3T\3T\3U\3U\3V\3V\3W\3W\3X\3X\3Y\3Y\3Z\3Z"+
		"\3[\3[\3\\\3\\\3]\3]\3^\3^\3_\3_\3`\3`\3a\3a\3b\3b\3c\3c\3c\3c\3c\3d\3"+
		"d\3e\3e\3e\3e\5e\u02aa\ne\3f\3f\3f\3f\3f\3f\3f\3f\3f\5f\u02b5\nf\3g\3"+
		"g\3g\3g\3g\3g\3g\2\2h\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63"+
		"e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089"+
		"F\u008bG\u008dH\u008f\2\u0091\2\u0093\2\u0095\2\u0097\2\u0099\2\u009b"+
		"\2\u009d\2\u009f\2\u00a1\2\u00a3\2\u00a5\2\u00a7\2\u00a9\2\u00ab\2\u00ad"+
		"\2\u00af\2\u00b1\2\u00b3\2\u00b5\2\u00b7\2\u00b9\2\u00bb\2\u00bd\2\u00bf"+
		"\2\u00c1\2\u00c3\2\u00c5\2\u00c7\2\u00c9\2\u00cb\2\u00cd\2\3\2%\5\2,-"+
		"//\61\61\4\2>>@@\5\2C\\aac|\6\2\62;C\\aac|\4\2))^^\5\2\13\f\17\17\"\""+
		"\4\2--//\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2J"+
		"Jjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4"+
		"\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{"+
		"{\4\2\\\\||\5\2\62;CHch\n\2$$))^^ddhhppttvv\u02ab\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2"+
		"Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3"+
		"\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2"+
		"\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2"+
		"\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3"+
		"\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\3\u00cf\3\2\2\2"+
		"\5\u00d1\3\2\2\2\7\u00d3\3\2\2\2\t\u00d5\3\2\2\2\13\u00d7\3\2\2\2\r\u00d9"+
		"\3\2\2\2\17\u00db\3\2\2\2\21\u00dd\3\2\2\2\23\u00df\3\2\2\2\25\u00e1\3"+
		"\2\2\2\27\u00e5\3\2\2\2\31\u00e7\3\2\2\2\33\u00e9\3\2\2\2\35\u00ed\3\2"+
		"\2\2\37\u00f2\3\2\2\2!\u00f9\3\2\2\2#\u00ff\3\2\2\2%\u0102\3\2\2\2\'\u0106"+
		"\3\2\2\2)\u0109\3\2\2\2+\u010e\3\2\2\2-\u0111\3\2\2\2/\u0118\3\2\2\2\61"+
		"\u011d\3\2\2\2\63\u0123\3\2\2\2\65\u012b\3\2\2\2\67\u0131\3\2\2\29\u0137"+
		"\3\2\2\2;\u013d\3\2\2\2=\u0140\3\2\2\2?\u0149\3\2\2\2A\u0150\3\2\2\2C"+
		"\u0156\3\2\2\2E\u015a\3\2\2\2G\u015f\3\2\2\2I\u0169\3\2\2\2K\u0177\3\2"+
		"\2\2M\u0179\3\2\2\2O\u017f\3\2\2\2Q\u0188\3\2\2\2S\u0193\3\2\2\2U\u019a"+
		"\3\2\2\2W\u01a7\3\2\2\2Y\u01aa\3\2\2\2[\u01af\3\2\2\2]\u01b9\3\2\2\2_"+
		"\u01c4\3\2\2\2a\u01cb\3\2\2\2c\u01d0\3\2\2\2e\u01d6\3\2\2\2g\u01df\3\2"+
		"\2\2i\u01e4\3\2\2\2k\u01e9\3\2\2\2m\u01f2\3\2\2\2o\u01f6\3\2\2\2q\u01fa"+
		"\3\2\2\2s\u0205\3\2\2\2u\u020e\3\2\2\2w\u0215\3\2\2\2y\u021e\3\2\2\2{"+
		"\u0225\3\2\2\2}\u0230\3\2\2\2\177\u0236\3\2\2\2\u0081\u023b\3\2\2\2\u0083"+
		"\u0240\3\2\2\2\u0085\u0245\3\2\2\2\u0087\u024a\3\2\2\2\u0089\u024f\3\2"+
		"\2\2\u008b\u0255\3\2\2\2\u008d\u0266\3\2\2\2\u008f\u0268\3\2\2\2\u0091"+
		"\u026a\3\2\2\2\u0093\u026c\3\2\2\2\u0095\u026e\3\2\2\2\u0097\u0270\3\2"+
		"\2\2\u0099\u0272\3\2\2\2\u009b\u0274\3\2\2\2\u009d\u0276\3\2\2\2\u009f"+
		"\u0278\3\2\2\2\u00a1\u027a\3\2\2\2\u00a3\u027c\3\2\2\2\u00a5\u027e\3\2"+
		"\2\2\u00a7\u0280\3\2\2\2\u00a9\u0282\3\2\2\2\u00ab\u0284\3\2\2\2\u00ad"+
		"\u0286\3\2\2\2\u00af\u0288\3\2\2\2\u00b1\u028a\3\2\2\2\u00b3\u028c\3\2"+
		"\2\2\u00b5\u028e\3\2\2\2\u00b7\u0290\3\2\2\2\u00b9\u0292\3\2\2\2\u00bb"+
		"\u0294\3\2\2\2\u00bd\u0296\3\2\2\2\u00bf\u0298\3\2\2\2\u00c1\u029a\3\2"+
		"\2\2\u00c3\u029c\3\2\2\2\u00c5\u029e\3\2\2\2\u00c7\u02a3\3\2\2\2\u00c9"+
		"\u02a9\3\2\2\2\u00cb\u02b4\3\2\2\2\u00cd\u02b6\3\2\2\2\u00cf\u00d0\7="+
		"\2\2\u00d0\4\3\2\2\2\u00d1\u00d2\7.\2\2\u00d2\6\3\2\2\2\u00d3\u00d4\7"+
		"*\2\2\u00d4\b\3\2\2\2\u00d5\u00d6\7+\2\2\u00d6\n\3\2\2\2\u00d7\u00d8\7"+
		"]\2\2\u00d8\f\3\2\2\2\u00d9\u00da\7_\2\2\u00da\16\3\2\2\2\u00db\u00dc"+
		"\t\2\2\2\u00dc\20\3\2\2\2\u00dd\u00de\7/\2\2\u00de\22\3\2\2\2\u00df\u00e0"+
		"\t\3\2\2\u00e0\24\3\2\2\2\u00e1\u00e2\5\u00a9U\2\u00e2\u00e3\5\u00abV"+
		"\2\u00e3\u00e4\5\u00b5[\2\u00e4\26\3\2\2\2\u00e5\u00e6\7?\2\2\u00e6\30"+
		"\3\2\2\2\u00e7\u00e8\7,\2\2\u00e8\32\3\2\2\2\u00e9\u00ea\5\u00b3Z\2\u00ea"+
		"\u00eb\5\u0097L\2\u00eb\u00ec\5\u00adW\2\u00ec\34\3\2\2\2\u00ed\u00ee"+
		"\5\u00adW\2\u00ee\u00ef\5\u008fH\2\u00ef\u00f0\5\u009bN\2\u00f0\u00f1"+
		"\5\u0097L\2\u00f1\36\3\2\2\2\u00f2\u00f3\5\u00abV\2\u00f3\u00f4\5\u0099"+
		"M\2\u00f4\u00f5\5\u0099M\2\u00f5\u00f6\5\u00b3Z\2\u00f6\u00f7\5\u0097"+
		"L\2\u00f7\u00f8\5\u00b5[\2\u00f8 \3\2\2\2\u00f9\u00fa\5\u00b7\\\2\u00fa"+
		"\u00fb\5\u00a9U\2\u00fb\u00fc\5\u009fP\2\u00fc\u00fd\5\u00abV\2\u00fd"+
		"\u00fe\5\u00a9U\2\u00fe\"\3\2\2\2\u00ff\u0100\5\u008fH\2\u0100\u0101\5"+
		"\u00b3Z\2\u0101$\3\2\2\2\u0102\u0103\5\u008fH\2\u0103\u0104\5\u00a9U\2"+
		"\u0104\u0105\5\u0095K\2\u0105&\3\2\2\2\u0106\u0107\5\u00abV\2\u0107\u0108"+
		"\5\u00b1Y\2\u0108(\3\2\2\2\u0109\u010a\5\u00a5S\2\u010a\u010b\5\u009f"+
		"P\2\u010b\u010c\5\u00a3R\2\u010c\u010d\5\u0097L\2\u010d*\3\2\2\2\u010e"+
		"\u010f\5\u009fP\2\u010f\u0110\5\u00a9U\2\u0110,\3\2\2\2\u0111\u0112\5"+
		"\u00b3Z\2\u0112\u0113\5\u0097L\2\u0113\u0114\5\u00a5S\2\u0114\u0115\5"+
		"\u0097L\2\u0115\u0116\5\u0093J\2\u0116\u0117\5\u00b5[\2\u0117.\3\2\2\2"+
		"\u0118\u0119\5\u0099M\2\u0119\u011a\5\u00b1Y\2\u011a\u011b\5\u00abV\2"+
		"\u011b\u011c\5\u00a7T\2\u011c\60\3\2\2\2\u011d\u011e\5\u00bb^\2\u011e"+
		"\u011f\5\u009dO\2\u011f\u0120\5\u0097L\2\u0120\u0121\5\u00b1Y\2\u0121"+
		"\u0122\5\u0097L\2\u0122\62\3\2\2\2\u0123\u0124\5\u0091I\2\u0124\u0125"+
		"\5\u0097L\2\u0125\u0126\5\u00b5[\2\u0126\u0127\5\u00bb^\2\u0127\u0128"+
		"\5\u0097L\2\u0128\u0129\5\u0097L\2\u0129\u012a\5\u00a9U\2\u012a\64\3\2"+
		"\2\2\u012b\u012c\5\u00abV\2\u012c\u012d\5\u00b1Y\2\u012d\u012e\5\u0095"+
		"K\2\u012e\u012f\5\u0097L\2\u012f\u0130\5\u00b1Y\2\u0130\66\3\2\2\2\u0131"+
		"\u0132\5\u0091I\2\u0132\u0133\5\u00b1Y\2\u0133\u0134\5\u0097L\2\u0134"+
		"\u0135\5\u008fH\2\u0135\u0136\5\u00a3R\2\u01368\3\2\2\2\u0137\u0138\5"+
		"\u009bN\2\u0138\u0139\5\u00b1Y\2\u0139\u013a\5\u00abV\2\u013a\u013b\5"+
		"\u00b7\\\2\u013b\u013c\5\u00adW\2\u013c:\3\2\2\2\u013d\u013e\5\u0091I"+
		"\2\u013e\u013f\5\u00bf`\2\u013f<\3\2\2\2\u0140\u0141\5\u0095K\2\u0141"+
		"\u0142\5\u00b7\\\2\u0142\u0143\5\u00b1Y\2\u0143\u0144\5\u008fH\2\u0144"+
		"\u0145\5\u00b5[\2\u0145\u0146\5\u009fP\2\u0146\u0147\5\u00abV\2\u0147"+
		"\u0148\5\u00a9U\2\u0148>\3\2\2\2\u0149\u014a\5\u00adW\2\u014a\u014b\5"+
		"\u0097L\2\u014b\u014c\5\u00b1Y\2\u014c\u014d\5\u009fP\2\u014d\u014e\5"+
		"\u00abV\2\u014e\u014f\5\u0095K\2\u014f@\3\2\2\2\u0150\u0151\5\u00a5S\2"+
		"\u0151\u0152\5\u009fP\2\u0152\u0153\5\u00a7T\2\u0153\u0154\5\u009fP\2"+
		"\u0154\u0155\5\u00b5[\2\u0155B\3\2\2\2\u0156\u0157\5\u008fH\2\u0157\u0158"+
		"\5\u00b3Z\2\u0158\u0159\5\u0093J\2\u0159D\3\2\2\2\u015a\u015b\5\u0095"+
		"K\2\u015b\u015c\5\u0097L\2\u015c\u015d\5\u00b3Z\2\u015d\u015e\5\u0093"+
		"J\2\u015eF\3\2\2\2\u015f\u0160\5\u008fH\2\u0160\u0161\5\u00b3Z\2\u0161"+
		"\u0162\5\u0093J\2\u0162\u0163\5\u0097L\2\u0163\u0164\5\u00a9U\2\u0164"+
		"\u0165\5\u0095K\2\u0165\u0166\5\u009fP\2\u0166\u0167\5\u00a9U\2\u0167"+
		"\u0168\5\u009bN\2\u0168H\3\2\2\2\u0169\u016a\5\u0095K\2\u016a\u016b\5"+
		"\u0097L\2\u016b\u016c\5\u00b3Z\2\u016c\u016d\5\u0093J\2\u016d\u016e\5"+
		"\u0097L\2\u016e\u016f\5\u00a9U\2\u016f\u0170\5\u0095K\2\u0170\u0171\5"+
		"\u009fP\2\u0171\u0172\5\u00a9U\2\u0172\u0173\5\u009bN\2\u0173J\3\2\2\2"+
		"\u0174\u0178\5O(\2\u0175\u0178\5Q)\2\u0176\u0178\5U+\2\u0177\u0174\3\2"+
		"\2\2\u0177\u0175\3\2\2\2\u0177\u0176\3\2\2\2\u0178L\3\2\2\2\u0179\u017a"+
		"\5\u0093J\2\u017a\u017b\5\u00abV\2\u017b\u017c\5\u00b7\\\2\u017c\u017d"+
		"\5\u00a9U\2\u017d\u017e\5\u00b5[\2\u017eN\3\2\2\2\u017f\u0180\5\u00a5"+
		"S\2\u0180\u0181\5\u00abV\2\u0181\u0182\5\u00a9U\2\u0182\u0183\5\u009b"+
		"N\2\u0183\u0184\7a\2\2\u0184\u0185\5\u00b3Z\2\u0185\u0186\5\u00b7\\\2"+
		"\u0186\u0187\5\u00a7T\2\u0187P\3\2\2\2\u0188\u0189\5\u0095K\2\u0189\u018a"+
		"\5\u00abV\2\u018a\u018b\5\u00b7\\\2\u018b\u018c\5\u0091I\2\u018c\u018d"+
		"\5\u00a5S\2\u018d\u018e\5\u0097L\2\u018e\u018f\7a\2\2\u018f\u0190\5\u00b3"+
		"Z\2\u0190\u0191\5\u00b7\\\2\u0191\u0192\5\u00a7T\2\u0192R\3\2\2\2\u0193"+
		"\u0194\5\u00b7\\\2\u0194\u0195\5\u00a9U\2\u0195\u0196\5\u009fP\2\u0196"+
		"\u0197\5\u00afX\2\u0197\u0198\5\u00b7\\\2\u0198\u0199\5\u0097L\2\u0199"+
		"T\3\2\2\2\u019a\u019b\5\u009dO\2\u019b\u019c\5\u00bf`\2\u019c\u019d\5"+
		"\u00adW\2\u019d\u019e\5\u0097L\2\u019e\u019f\5\u00b1Y\2\u019f\u01a0\7"+
		"a\2\2\u01a0\u01a1\5\u00b7\\\2\u01a1\u01a2\5\u00a9U\2\u01a2\u01a3\5\u009f"+
		"P\2\u01a3\u01a4\5\u00afX\2\u01a4\u01a5\5\u00b7\\\2\u01a5\u01a6\5\u0097"+
		"L\2\u01a6V\3\2\2\2\u01a7\u01a8\5\u00abV\2\u01a8\u01a9\5\u00a9U\2\u01a9"+
		"X\3\2\2\2\u01aa\u01ab\5\u00a1Q\2\u01ab\u01ac\5\u00abV\2\u01ac\u01ad\5"+
		"\u009fP\2\u01ad\u01ae\5\u00a9U\2\u01aeZ\3\2\2\2\u01af\u01b0\5\u00a5S\2"+
		"\u01b0\u01b1\5\u0097L\2\u01b1\u01b2\5\u0099M\2\u01b2\u01b3\5\u00b5[\2"+
		"\u01b3\u01b4\7a\2\2\u01b4\u01b5\5\u00a1Q\2\u01b5\u01b6\5\u00abV\2\u01b6"+
		"\u01b7\5\u009fP\2\u01b7\u01b8\5\u00a9U\2\u01b8\\\3\2\2\2\u01b9\u01ba\5"+
		"\u00b1Y\2\u01ba\u01bb\5\u009fP\2\u01bb\u01bc\5\u009bN\2\u01bc\u01bd\5"+
		"\u009dO\2\u01bd\u01be\5\u00b5[\2\u01be\u01bf\7a\2\2\u01bf\u01c0\5\u00a1"+
		"Q\2\u01c0\u01c1\5\u00abV\2\u01c1\u01c2\5\u009fP\2\u01c2\u01c3\5\u00a9"+
		"U\2\u01c3^\3\2\2\2\u01c4\u01c5\5\u009dO\2\u01c5\u01c6\5\u008fH\2\u01c6"+
		"\u01c7\5\u00b9]\2\u01c7\u01c8\5\u009fP\2\u01c8\u01c9\5\u00a9U\2\u01c9"+
		"\u01ca\5\u009bN\2\u01ca`\3\2\2\2\u01cb\u01cc\5\u00b5[\2\u01cc\u01cd\5"+
		"\u009dO\2\u01cd\u01ce\5\u0097L\2\u01ce\u01cf\5\u00a9U\2\u01cfb\3\2\2\2"+
		"\u01d0\u01d1\5\u00bb^\2\u01d1\u01d2\5\u009dO\2\u01d2\u01d3\5\u009fP\2"+
		"\u01d3\u01d4\5\u0093J\2\u01d4\u01d5\5\u009dO\2\u01d5d\3\2\2\2\u01d6\u01d7"+
		"\5\u0093J\2\u01d7\u01d8\5\u00abV\2\u01d8\u01d9\5\u00a9U\2\u01d9\u01da"+
		"\5\u00b5[\2\u01da\u01db\5\u008fH\2\u01db\u01dc\5\u009fP\2\u01dc\u01dd"+
		"\5\u00a9U\2\u01dd\u01de\5\u00b3Z\2\u01def\3\2\2\2\u01df\u01e0\5\u00b3"+
		"Z\2\u01e0\u01e1\5\u00abV\2\u01e1\u01e2\5\u00b1Y\2\u01e2\u01e3\5\u00b5"+
		"[\2\u01e3h\3\2\2\2\u01e4\u01e5\5\u009dO\2\u01e5\u01e6\5\u009fP\2\u01e6"+
		"\u01e7\5\u00a9U\2\u01e7\u01e8\5\u00b5[\2\u01e8j\3\2\2\2\u01e9\u01ea\5"+
		"\u009fP\2\u01ea\u01eb\5\u00a9U\2\u01eb\u01ec\5\u00b5[\2\u01ec\u01ed\5"+
		"\u0097L\2\u01ed\u01ee\5\u00b1Y\2\u01ee\u01ef\5\u00b9]\2\u01ef\u01f0\5"+
		"\u008fH\2\u01f0\u01f1\5\u00a5S\2\u01f1l\3\2\2\2\u01f2\u01f3\5\u00a7T\2"+
		"\u01f3\u01f4\5\u009fP\2\u01f4\u01f5\5\u00a9U\2\u01f5n\3\2\2\2\u01f6\u01f7"+
		"\5\u00a7T\2\u01f7\u01f8\5\u008fH\2\u01f8\u01f9\5\u00bd_\2\u01f9p\3\2\2"+
		"\2\u01fa\u01fb\5\u00a1Q\2\u01fb\u01fc\5\u008fH\2\u01fc\u01fd\5\u00b9]"+
		"\2\u01fd\u01fe\5\u008fH\2\u01fe\u01ff\5\u00b3Z\2\u01ff\u0200\5\u0093J"+
		"\2\u0200\u0201\5\u00b1Y\2\u0201\u0202\5\u009fP\2\u0202\u0203\5\u00adW"+
		"\2\u0203\u0204\5\u00b5[\2\u0204r\3\2\2\2\u0205\u0206\5\u009fP\2\u0206"+
		"\u0207\5\u00a9U\2\u0207\u0208\5\u0093J\2\u0208\u0209\5\u00a5S\2\u0209"+
		"\u020a\5\u00b7\\\2\u020a\u020b\5\u0095K\2\u020b\u020c\5\u0097L\2\u020c"+
		"t\3\2\2\2\u020d\u020f\5\u00c3b\2\u020e\u020d\3\2\2\2\u020f\u0210\3\2\2"+
		"\2\u0210\u020e\3\2\2\2\u0210\u0211\3\2\2\2\u0211v\3\2\2\2\u0212\u0214"+
		"\5\u00c3b\2\u0213\u0212\3\2\2\2\u0214\u0217\3\2\2\2\u0215\u0213\3\2\2"+
		"\2\u0215\u0216\3\2\2\2\u0216\u0218\3\2\2\2\u0217\u0215\3\2\2\2\u0218\u021a"+
		"\7\60\2\2\u0219\u021b\5\u00c3b\2\u021a\u0219\3\2\2\2\u021b\u021c\3\2\2"+
		"\2\u021c\u021a\3\2\2\2\u021c\u021d\3\2\2\2\u021dx\3\2\2\2\u021e\u0222"+
		"\t\4\2\2\u021f\u0221\t\5\2\2\u0220\u021f\3\2\2\2\u0221\u0224\3\2\2\2\u0222"+
		"\u0220\3\2\2\2\u0222\u0223\3\2\2\2\u0223z\3\2\2\2\u0224\u0222\3\2\2\2"+
		"\u0225\u022a\7)\2\2\u0226\u0229\5\u00c9e\2\u0227\u0229\n\6\2\2\u0228\u0226"+
		"\3\2\2\2\u0228\u0227\3\2\2\2\u0229\u022c\3\2\2\2\u022a\u0228\3\2\2\2\u022a"+
		"\u022b\3\2\2\2\u022b\u022d\3\2\2\2\u022c\u022a\3\2\2\2\u022d\u022e\7)"+
		"\2\2\u022e|\3\2\2\2\u022f\u0231\t\7\2\2\u0230\u022f\3\2\2\2\u0231\u0232"+
		"\3\2\2\2\u0232\u0230\3\2\2\2\u0232\u0233\3\2\2\2\u0233\u0234\3\2\2\2\u0234"+
		"\u0235\b?\2\2\u0235~\3\2\2\2\u0236\u0237\5\u00c5c\2\u0237\u0238\7/\2\2"+
		"\u0238\u0239\5\u00c3b\2\u0239\u023a\5\u00c3b\2\u023a\u0080\3\2\2\2\u023b"+
		"\u023c\5\177@\2\u023c\u023d\7/\2\2\u023d\u023e\5\u00c3b\2\u023e\u023f"+
		"\5\u00c3b\2\u023f\u0082\3\2\2\2\u0240\u0241\5\u0081A\2\u0241\u0242\7V"+
		"\2\2\u0242\u0243\5\u00c3b\2\u0243\u0244\5\u00c3b\2\u0244\u0084\3\2\2\2"+
		"\u0245\u0246\5\u0083B\2\u0246\u0247\7<\2\2\u0247\u0248\5\u00c3b\2\u0248"+
		"\u0249\5\u00c3b\2\u0249\u0086\3\2\2\2\u024a\u024b\5\u0085C\2\u024b\u024c"+
		"\7<\2\2\u024c\u024d\5\u00c3b\2\u024d\u024e\5\u00c3b\2\u024e\u0088\3\2"+
		"\2\2\u024f\u0250\5\u0087D\2\u0250\u0251\7\60\2\2\u0251\u0252\5\u00c3b"+
		"\2\u0252\u0253\5\u00c3b\2\u0253\u0254\5\u00c3b\2\u0254\u008a\3\2\2\2\u0255"+
		"\u0256\5\u0089E\2\u0256\u0257\t\b\2\2\u0257\u0258\5\u00c3b\2\u0258\u0259"+
		"\5\u00c3b\2\u0259\u025a\7<\2\2\u025a\u025b\5\u00c3b\2\u025b\u025c\5\u00c3"+
		"b\2\u025c\u008c\3\2\2\2\u025d\u025e\5\u0085C\2\u025e\u025f\7\\\2\2\u025f"+
		"\u0267\3\2\2\2\u0260\u0261\5\u0087D\2\u0261\u0262\7\\\2\2\u0262\u0267"+
		"\3\2\2\2\u0263\u0264\5\u0089E\2\u0264\u0265\7\\\2\2\u0265\u0267\3\2\2"+
		"\2\u0266\u025d\3\2\2\2\u0266\u0260\3\2\2\2\u0266\u0263\3\2\2\2\u0267\u008e"+
		"\3\2\2\2\u0268\u0269\t\t\2\2\u0269\u0090\3\2\2\2\u026a\u026b\t\n\2\2\u026b"+
		"\u0092\3\2\2\2\u026c\u026d\t\13\2\2\u026d\u0094\3\2\2\2\u026e\u026f\t"+
		"\f\2\2\u026f\u0096\3\2\2\2\u0270\u0271\t\r\2\2\u0271\u0098\3\2\2\2\u0272"+
		"\u0273\t\16\2\2\u0273\u009a\3\2\2\2\u0274\u0275\t\17\2\2\u0275\u009c\3"+
		"\2\2\2\u0276\u0277\t\20\2\2\u0277\u009e\3\2\2\2\u0278\u0279\t\21\2\2\u0279"+
		"\u00a0\3\2\2\2\u027a\u027b\t\22\2\2\u027b\u00a2\3\2\2\2\u027c\u027d\t"+
		"\23\2\2\u027d\u00a4\3\2\2\2\u027e\u027f\t\24\2\2\u027f\u00a6\3\2\2\2\u0280"+
		"\u0281\t\25\2\2\u0281\u00a8\3\2\2\2\u0282\u0283\t\26\2\2\u0283\u00aa\3"+
		"\2\2\2\u0284\u0285\t\27\2\2\u0285\u00ac\3\2\2\2\u0286\u0287\t\30\2\2\u0287"+
		"\u00ae\3\2\2\2\u0288\u0289\t\31\2\2\u0289\u00b0\3\2\2\2\u028a\u028b\t"+
		"\32\2\2\u028b\u00b2\3\2\2\2\u028c\u028d\t\33\2\2\u028d\u00b4\3\2\2\2\u028e"+
		"\u028f\t\34\2\2\u028f\u00b6\3\2\2\2\u0290\u0291\t\35\2\2\u0291\u00b8\3"+
		"\2\2\2\u0292\u0293\t\36\2\2\u0293\u00ba\3\2\2\2\u0294\u0295\t\37\2\2\u0295"+
		"\u00bc\3\2\2\2\u0296\u0297\t \2\2\u0297\u00be\3\2\2\2\u0298\u0299\t!\2"+
		"\2\u0299\u00c0\3\2\2\2\u029a\u029b\t\"\2\2\u029b\u00c2\3\2\2\2\u029c\u029d"+
		"\4\62;\2\u029d\u00c4\3\2\2\2\u029e\u029f\5\u00c3b\2\u029f\u02a0\5\u00c3"+
		"b\2\u02a0\u02a1\5\u00c3b\2\u02a1\u02a2\5\u00c3b\2\u02a2\u00c6\3\2\2\2"+
		"\u02a3\u02a4\t#\2\2\u02a4\u00c8\3\2\2\2\u02a5\u02a6\7^\2\2\u02a6\u02aa"+
		"\t$\2\2\u02a7\u02aa\5\u00cdg\2\u02a8\u02aa\5\u00cbf\2\u02a9\u02a5\3\2"+
		"\2\2\u02a9\u02a7\3\2\2\2\u02a9\u02a8\3\2\2\2\u02aa\u00ca\3\2\2\2\u02ab"+
		"\u02ac\7^\2\2\u02ac\u02ad\4\62\65\2\u02ad\u02ae\4\629\2\u02ae\u02b5\4"+
		"\629\2\u02af\u02b0\7^\2\2\u02b0\u02b1\4\629\2\u02b1\u02b5\4\629\2\u02b2"+
		"\u02b3\7^\2\2\u02b3\u02b5\4\629\2\u02b4\u02ab\3\2\2\2\u02b4\u02af\3\2"+
		"\2\2\u02b4\u02b2\3\2\2\2\u02b5\u00cc\3\2\2\2\u02b6\u02b7\7^\2\2\u02b7"+
		"\u02b8\7w\2\2\u02b8\u02b9\5\u00c7d\2\u02b9\u02ba\5\u00c7d\2\u02ba\u02bb"+
		"\5\u00c7d\2\u02bb\u02bc\5\u00c7d\2\u02bc\u00ce\3\2\2\2\16\2\u0177\u0210"+
		"\u0215\u021c\u0222\u0228\u022a\u0232\u0266\u02a9\u02b4\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}