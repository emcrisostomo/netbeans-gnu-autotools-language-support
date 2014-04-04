// Generated from autoconf.g4 by ANTLR 4.2.1

package org.netbeans.gnu.autotools.antlr;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link autoconfParser}.
 */
public interface autoconfListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link autoconfParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(@NotNull autoconfParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link autoconfParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(@NotNull autoconfParser.CompilationUnitContext ctx);

	/**
	 * Enter a parse tree produced by {@link autoconfParser#quote}.
	 * @param ctx the parse tree
	 */
	void enterQuote(@NotNull autoconfParser.QuoteContext ctx);
	/**
	 * Exit a parse tree produced by {@link autoconfParser#quote}.
	 * @param ctx the parse tree
	 */
	void exitQuote(@NotNull autoconfParser.QuoteContext ctx);

	/**
	 * Enter a parse tree produced by {@link autoconfParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull autoconfParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link autoconfParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull autoconfParser.ExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link autoconfParser#parenthesizedText}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedText(@NotNull autoconfParser.ParenthesizedTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link autoconfParser#parenthesizedText}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedText(@NotNull autoconfParser.ParenthesizedTextContext ctx);

	/**
	 * Enter a parse tree produced by {@link autoconfParser#expression_with_params}.
	 * @param ctx the parse tree
	 */
	void enterExpression_with_params(@NotNull autoconfParser.Expression_with_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link autoconfParser#expression_with_params}.
	 * @param ctx the parse tree
	 */
	void exitExpression_with_params(@NotNull autoconfParser.Expression_with_paramsContext ctx);

	/**
	 * Enter a parse tree produced by {@link autoconfParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull autoconfParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link autoconfParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull autoconfParser.StatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link autoconfParser#punctuation}.
	 * @param ctx the parse tree
	 */
	void enterPunctuation(@NotNull autoconfParser.PunctuationContext ctx);
	/**
	 * Exit a parse tree produced by {@link autoconfParser#punctuation}.
	 * @param ctx the parse tree
	 */
	void exitPunctuation(@NotNull autoconfParser.PunctuationContext ctx);

	/**
	 * Enter a parse tree produced by {@link autoconfParser#exprParameters}.
	 * @param ctx the parse tree
	 */
	void enterExprParameters(@NotNull autoconfParser.ExprParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link autoconfParser#exprParameters}.
	 * @param ctx the parse tree
	 */
	void exitExprParameters(@NotNull autoconfParser.ExprParametersContext ctx);

	/**
	 * Enter a parse tree produced by {@link autoconfParser#exprParameter}.
	 * @param ctx the parse tree
	 */
	void enterExprParameter(@NotNull autoconfParser.ExprParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link autoconfParser#exprParameter}.
	 * @param ctx the parse tree
	 */
	void exitExprParameter(@NotNull autoconfParser.ExprParameterContext ctx);

	/**
	 * Enter a parse tree produced by {@link autoconfParser#verbatimText}.
	 * @param ctx the parse tree
	 */
	void enterVerbatimText(@NotNull autoconfParser.VerbatimTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link autoconfParser#verbatimText}.
	 * @param ctx the parse tree
	 */
	void exitVerbatimText(@NotNull autoconfParser.VerbatimTextContext ctx);
}