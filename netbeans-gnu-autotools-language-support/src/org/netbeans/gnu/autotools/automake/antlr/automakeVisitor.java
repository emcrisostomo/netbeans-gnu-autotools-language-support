// Generated from automake.g4 by ANTLR 4.2.2

package org.netbeans.gnu.autotools.automake.antlr;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link automakeParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface automakeVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link automakeParser#variableAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableAssignment(@NotNull automakeParser.VariableAssignmentContext ctx);

	/**
	 * Visit a parse tree produced by {@link automakeParser#variableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableName(@NotNull automakeParser.VariableNameContext ctx);

	/**
	 * Visit a parse tree produced by {@link automakeParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(@NotNull automakeParser.LineContext ctx);

	/**
	 * Visit a parse tree produced by {@link automakeParser#elsestatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElsestatement(@NotNull automakeParser.ElsestatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link automakeParser#recipe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecipe(@NotNull automakeParser.RecipeContext ctx);

	/**
	 * Visit a parse tree produced by {@link automakeParser#any}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAny(@NotNull automakeParser.AnyContext ctx);

	/**
	 * Visit a parse tree produced by {@link automakeParser#target}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTarget(@NotNull automakeParser.TargetContext ctx);

	/**
	 * Visit a parse tree produced by {@link automakeParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(@NotNull automakeParser.ConditionContext ctx);

	/**
	 * Visit a parse tree produced by {@link automakeParser#prerequisiteList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrerequisiteList(@NotNull automakeParser.PrerequisiteListContext ctx);

	/**
	 * Visit a parse tree produced by {@link automakeParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(@NotNull automakeParser.CompilationUnitContext ctx);

	/**
	 * Visit a parse tree produced by {@link automakeParser#filename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilename(@NotNull automakeParser.FilenameContext ctx);

	/**
	 * Visit a parse tree produced by {@link automakeParser#ifstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfstatement(@NotNull automakeParser.IfstatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link automakeParser#recipeText}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecipeText(@NotNull automakeParser.RecipeTextContext ctx);

	/**
	 * Visit a parse tree produced by {@link automakeParser#variableWiwhBrace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableWiwhBrace(@NotNull automakeParser.VariableWiwhBraceContext ctx);

	/**
	 * Visit a parse tree produced by {@link automakeParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(@NotNull automakeParser.StatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link automakeParser#row}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRow(@NotNull automakeParser.RowContext ctx);

	/**
	 * Visit a parse tree produced by {@link automakeParser#unterminatedRow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnterminatedRow(@NotNull automakeParser.UnterminatedRowContext ctx);

	/**
	 * Visit a parse tree produced by {@link automakeParser#variableWithParen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableWithParen(@NotNull automakeParser.VariableWithParenContext ctx);
}