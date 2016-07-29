// Generated from SqlParser.g4 by ANTLR 4.5

	package com.dokia.SqlParser.converter;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SqlParser}.
 */
public interface SqlParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SqlParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(SqlParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(SqlParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#grandQuery}.
	 * @param ctx the parse tree
	 */
	void enterGrandQuery(SqlParser.GrandQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#grandQuery}.
	 * @param ctx the parse tree
	 */
	void exitGrandQuery(SqlParser.GrandQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#queryStmnt}.
	 * @param ctx the parse tree
	 */
	void enterQueryStmnt(SqlParser.QueryStmntContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#queryStmnt}.
	 * @param ctx the parse tree
	 */
	void exitQueryStmnt(SqlParser.QueryStmntContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterWhereClause(SqlParser.WhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitWhereClause(SqlParser.WhereClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#compareItem}.
	 * @param ctx the parse tree
	 */
	void enterCompareItem(SqlParser.CompareItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#compareItem}.
	 * @param ctx the parse tree
	 */
	void exitCompareItem(SqlParser.CompareItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#equalItem}.
	 * @param ctx the parse tree
	 */
	void enterEqualItem(SqlParser.EqualItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#equalItem}.
	 * @param ctx the parse tree
	 */
	void exitEqualItem(SqlParser.EqualItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#largerItem}.
	 * @param ctx the parse tree
	 */
	void enterLargerItem(SqlParser.LargerItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#largerItem}.
	 * @param ctx the parse tree
	 */
	void exitLargerItem(SqlParser.LargerItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#lessItem}.
	 * @param ctx the parse tree
	 */
	void enterLessItem(SqlParser.LessItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#lessItem}.
	 * @param ctx the parse tree
	 */
	void exitLessItem(SqlParser.LessItemContext ctx);
}