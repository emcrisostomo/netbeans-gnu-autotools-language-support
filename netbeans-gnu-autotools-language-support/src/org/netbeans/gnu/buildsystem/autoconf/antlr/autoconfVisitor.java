// Generated from autoconf.g4 by ANTLR 4.2.2

package org.netbeans.gnu.buildsystem.autoconf.antlr;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link autoconfParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface autoconfVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link autoconfParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(@NotNull autoconfParser.CompilationUnitContext ctx);

	/**
	 * Visit a parse tree produced by {@link autoconfParser#quote}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuote(@NotNull autoconfParser.QuoteContext ctx);

	/**
	 * Visit a parse tree produced by {@link autoconfParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(@NotNull autoconfParser.ExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link autoconfParser#parenthesizedText}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedText(@NotNull autoconfParser.ParenthesizedTextContext ctx);

	/**
	 * Visit a parse tree produced by {@link autoconfParser#expression_with_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_with_params(@NotNull autoconfParser.Expression_with_paramsContext ctx);

	/**
	 * Visit a parse tree produced by {@link autoconfParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(@NotNull autoconfParser.StatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link autoconfParser#punctuation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPunctuation(@NotNull autoconfParser.PunctuationContext ctx);

	/**
	 * Visit a parse tree produced by {@link autoconfParser#exprParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprParameters(@NotNull autoconfParser.ExprParametersContext ctx);

	/**
	 * Visit a parse tree produced by {@link autoconfParser#exprParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprParameter(@NotNull autoconfParser.ExprParameterContext ctx);

	/**
	 * Visit a parse tree produced by {@link autoconfParser#verbatimText}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVerbatimText(@NotNull autoconfParser.VerbatimTextContext ctx);
}