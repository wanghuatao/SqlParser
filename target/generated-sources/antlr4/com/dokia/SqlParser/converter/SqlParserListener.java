// Generated from SqlParser.g4 by ANTLR 4.4

	package com.dokia.SqlParser.converter;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SqlParser}.
 */
public interface SqlParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SqlParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterWhereClause(@NotNull SqlParser.WhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitWhereClause(@NotNull SqlParser.WhereClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#lessItem}.
	 * @param ctx the parse tree
	 */
	void enterLessItem(@NotNull SqlParser.LessItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#lessItem}.
	 * @param ctx the parse tree
	 */
	void exitLessItem(@NotNull SqlParser.LessItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#grandQuery}.
	 * @param ctx the parse tree
	 */
	void enterGrandQuery(@NotNull SqlParser.GrandQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#grandQuery}.
	 * @param ctx the parse tree
	 */
	void exitGrandQuery(@NotNull SqlParser.GrandQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull SqlParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull SqlParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#queryStmnt}.
	 * @param ctx the parse tree
	 */
	void enterQueryStmnt(@NotNull SqlParser.QueryStmntContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#queryStmnt}.
	 * @param ctx the parse tree
	 */
	void exitQueryStmnt(@NotNull SqlParser.QueryStmntContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#largerItem}.
	 * @param ctx the parse tree
	 */
	void enterLargerItem(@NotNull SqlParser.LargerItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#largerItem}.
	 * @param ctx the parse tree
	 */
	void exitLargerItem(@NotNull SqlParser.LargerItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#compareItem}.
	 * @param ctx the parse tree
	 */
	void enterCompareItem(@NotNull SqlParser.CompareItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#compareItem}.
	 * @param ctx the parse tree
	 */
	void exitCompareItem(@NotNull SqlParser.CompareItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#equalItem}.
	 * @param ctx the parse tree
	 */
	void enterEqualItem(@NotNull SqlParser.EqualItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#equalItem}.
	 * @param ctx the parse tree
	 */
	void exitEqualItem(@NotNull SqlParser.EqualItemContext ctx);
}