// Generated from SqlParser.g4 by ANTLR 4.4

	package com.dokia.SqlParser.converter;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SqlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DATE_HOUR_MIN_SEC=67, JOIN=44, DATE_HOUR_MIN=66, BETWEEN=25, FROM=23, 
		ARITH_OPER=7, DESC=34, SINGLE_QUOTE_STRING=61, RSQUARE=6, LPARAN=3, WHICH=49, 
		BREAK=27, DESCENDING=36, ID=60, COMPARE_OPER=9, INCLUDE=57, NEGTIVE=8, 
		IN=21, HINT=52, UNIQUE=41, PAGE=14, WHERE=24, RPARAN=4, DATE=64, NOT=10, 
		AS=17, MIN=54, LIKE=20, AND=18, PERIOD=31, SORT=51, COUNT=38, THEN=48, 
		HAVING=47, DATE_HOUR_MIN_SEC_SUB=68, SEP=13, JAVASCRIPT=56, FLOAT=59, 
		HYPER_UNIQUE=42, MAX=55, LEFT_JOIN=45, LIMIT=32, CONTAINS=50, ORDER=26, 
		GROUP=28, ASC=33, DOUBLE_SUM=40, DATE_HOUR=65, BY=29, OFFSET=15, WS=62, 
		ON=43, LONG=58, COMMA=2, INTERVAL=53, OR=19, DATE_HOUR_MIN_SEC_SUB_TZ=69, 
		EQUALS=11, DATE_YEAR_MONTH_ONLY=63, DATE_HOUR_MIN_SEC_SUB_UTC_TZ=70, SELECT=22, 
		AGGREOPR=37, LSQUARE=5, STAR=12, ASCENDING=35, OPT_SEMI_COLON=1, LONG_SUM=39, 
		UNION=16, DURATION=30, RIGHT_JOIN=46;
	public static final String[] tokenNames = {
		"<INVALID>", "';'", "','", "'('", "')'", "'['", "']'", "ARITH_OPER", "'-'", 
		"COMPARE_OPER", "NOT", "'='", "'*'", "SEP", "PAGE", "OFFSET", "UNION", 
		"AS", "AND", "OR", "LIKE", "IN", "SELECT", "FROM", "WHERE", "BETWEEN", 
		"ORDER", "BREAK", "GROUP", "BY", "DURATION", "PERIOD", "LIMIT", "ASC", 
		"DESC", "ASCENDING", "DESCENDING", "AGGREOPR", "COUNT", "LONG_SUM", "DOUBLE_SUM", 
		"UNIQUE", "HYPER_UNIQUE", "ON", "JOIN", "LEFT_JOIN", "RIGHT_JOIN", "HAVING", 
		"THEN", "WHICH", "CONTAINS", "SORT", "HINT", "INTERVAL", "MIN", "MAX", 
		"JAVASCRIPT", "INCLUDE", "LONG", "FLOAT", "ID", "SINGLE_QUOTE_STRING", 
		"WS", "DATE_YEAR_MONTH_ONLY", "DATE", "DATE_HOUR", "DATE_HOUR_MIN", "DATE_HOUR_MIN_SEC", 
		"DATE_HOUR_MIN_SEC_SUB", "DATE_HOUR_MIN_SEC_SUB_TZ", "DATE_HOUR_MIN_SEC_SUB_UTC_TZ"
	};
	public static final int
		RULE_program = 0, RULE_grandQuery = 1, RULE_queryStmnt = 2, RULE_whereClause = 3, 
		RULE_compareItem = 4, RULE_equalItem = 5, RULE_largerItem = 6, RULE_lessItem = 7;
	public static final String[] ruleNames = {
		"program", "grandQuery", "queryStmnt", "whereClause", "compareItem", "equalItem", 
		"largerItem", "lessItem"
	};

	@Override
	public String getGrammarFileName() { return "SqlParser.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SqlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public GrandQueryContext grandQuery() {
			return getRuleContext(GrandQueryContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16); grandQuery();
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

	public static class GrandQueryContext extends ParserRuleContext {
		public QueryStmntContext queryStmnt() {
			return getRuleContext(QueryStmntContext.class,0);
		}
		public GrandQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grandQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterGrandQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitGrandQuery(this);
		}
	}

	public final GrandQueryContext grandQuery() throws RecognitionException {
		GrandQueryContext _localctx = new GrandQueryContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_grandQuery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18); queryStmnt();
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

	public static class QueryStmntContext extends ParserRuleContext {
		public Token id;
		public Token table;
		public List<TerminalNode> ID() { return getTokens(SqlParser.ID); }
		public TerminalNode WHERE() { return getToken(SqlParser.WHERE, 0); }
		public TerminalNode FROM() { return getToken(SqlParser.FROM, 0); }
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public TerminalNode ID(int i) {
			return getToken(SqlParser.ID, i);
		}
		public TerminalNode SELECT() { return getToken(SqlParser.SELECT, 0); }
		public QueryStmntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryStmnt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterQueryStmnt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitQueryStmnt(this);
		}
	}

	public final QueryStmntContext queryStmnt() throws RecognitionException {
		QueryStmntContext _localctx = new QueryStmntContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_queryStmnt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20); match(SELECT);
			setState(21); ((QueryStmntContext)_localctx).id = match(ID);
			setState(22); match(FROM);
			setState(23); ((QueryStmntContext)_localctx).table = match(ID);
			setState(24); match(WHERE);
			setState(25); whereClause();
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

	public static class WhereClauseContext extends ParserRuleContext {
		public Token join;
		public TerminalNode AND(int i) {
			return getToken(SqlParser.AND, i);
		}
		public List<TerminalNode> AND() { return getTokens(SqlParser.AND); }
		public List<CompareItemContext> compareItem() {
			return getRuleContexts(CompareItemContext.class);
		}
		public List<TerminalNode> OR() { return getTokens(SqlParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(SqlParser.OR, i);
		}
		public CompareItemContext compareItem(int i) {
			return getRuleContext(CompareItemContext.class,i);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterWhereClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitWhereClause(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_whereClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27); compareItem();
			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND || _la==OR) {
				{
				{
				setState(28);
				((WhereClauseContext)_localctx).join = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==AND || _la==OR) ) {
					((WhereClauseContext)_localctx).join = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(29); compareItem();
				}
				}
				setState(34);
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

	public static class CompareItemContext extends ParserRuleContext {
		public LessItemContext lessItem() {
			return getRuleContext(LessItemContext.class,0);
		}
		public EqualItemContext equalItem() {
			return getRuleContext(EqualItemContext.class,0);
		}
		public LargerItemContext largerItem() {
			return getRuleContext(LargerItemContext.class,0);
		}
		public CompareItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compareItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterCompareItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitCompareItem(this);
		}
	}

	public final CompareItemContext compareItem() throws RecognitionException {
		CompareItemContext _localctx = new CompareItemContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_compareItem);
		try {
			setState(38);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(35); equalItem();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(36); largerItem();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(37); lessItem();
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

	public static class EqualItemContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(SqlParser.ID); }
		public TerminalNode EQUALS() { return getToken(SqlParser.EQUALS, 0); }
		public TerminalNode LONG() { return getToken(SqlParser.LONG, 0); }
		public TerminalNode SINGLE_QUOTE_STRING() { return getToken(SqlParser.SINGLE_QUOTE_STRING, 0); }
		public TerminalNode ID(int i) {
			return getToken(SqlParser.ID, i);
		}
		public TerminalNode FLOAT() { return getToken(SqlParser.FLOAT, 0); }
		public EqualItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterEqualItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitEqualItem(this);
		}
	}

	public final EqualItemContext equalItem() throws RecognitionException {
		EqualItemContext _localctx = new EqualItemContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_equalItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40); match(ID);
			setState(41); match(EQUALS);
			setState(42);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LONG) | (1L << FLOAT) | (1L << ID) | (1L << SINGLE_QUOTE_STRING))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class LargerItemContext extends ParserRuleContext {
		public LargerItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_largerItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterLargerItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitLargerItem(this);
		}
	}

	public final LargerItemContext largerItem() throws RecognitionException {
		LargerItemContext _localctx = new LargerItemContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_largerItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	public static class LessItemContext extends ParserRuleContext {
		public LessItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lessItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterLessItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitLessItem(this);
		}
	}

	public final LessItemContext lessItem() throws RecognitionException {
		LessItemContext _localctx = new LessItemContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_lessItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3H\63\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\3\3\3\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\7\5!\n\5\f\5\16\5$\13\5\3\6\3\6\3"+
		"\6\5\6)\n\6\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\2\2\n\2\4\6\b\n\f\16\20"+
		"\2\4\3\2\24\25\3\2<?-\2\22\3\2\2\2\4\24\3\2\2\2\6\26\3\2\2\2\b\35\3\2"+
		"\2\2\n(\3\2\2\2\f*\3\2\2\2\16.\3\2\2\2\20\60\3\2\2\2\22\23\5\4\3\2\23"+
		"\3\3\2\2\2\24\25\5\6\4\2\25\5\3\2\2\2\26\27\7\30\2\2\27\30\7>\2\2\30\31"+
		"\7\31\2\2\31\32\7>\2\2\32\33\7\32\2\2\33\34\5\b\5\2\34\7\3\2\2\2\35\""+
		"\5\n\6\2\36\37\t\2\2\2\37!\5\n\6\2 \36\3\2\2\2!$\3\2\2\2\" \3\2\2\2\""+
		"#\3\2\2\2#\t\3\2\2\2$\"\3\2\2\2%)\5\f\7\2&)\5\16\b\2\')\5\20\t\2(%\3\2"+
		"\2\2(&\3\2\2\2(\'\3\2\2\2)\13\3\2\2\2*+\7>\2\2+,\7\r\2\2,-\t\3\2\2-\r"+
		"\3\2\2\2./\3\2\2\2/\17\3\2\2\2\60\61\3\2\2\2\61\21\3\2\2\2\4\"(";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}