// Generated from automake.g4 by ANTLR 4.2.2

package org.netbeans.gnu.buildsystem.automake.antlr;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link automakeParser}.
 */
public interface automakeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link automakeParser#variableAssignment}.
	 * @param ctx the parse tree
	 */
	void enterVariableAssignment(@NotNull automakeParser.VariableAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link automakeParser#variableAssignment}.
	 * @param ctx the parse tree
	 */
	void exitVariableAssignment(@NotNull automakeParser.VariableAssignmentContext ctx);

	/**
	 * Enter a parse tree produced by {@link automakeParser#variableName}.
	 * @param ctx the parse tree
	 */
	void enterVariableName(@NotNull automakeParser.VariableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link automakeParser#variableName}.
	 * @param ctx the parse tree
	 */
	void exitVariableName(@NotNull automakeParser.VariableNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link automakeParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(@NotNull automakeParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link automakeParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(@NotNull automakeParser.LineContext ctx);

	/**
	 * Enter a parse tree produced by {@link automakeParser#elsestatement}.
	 * @param ctx the parse tree
	 */
	void enterElsestatement(@NotNull automakeParser.ElsestatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link automakeParser#elsestatement}.
	 * @param ctx the parse tree
	 */
	void exitElsestatement(@NotNull automakeParser.ElsestatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link automakeParser#recipe}.
	 * @param ctx the parse tree
	 */
	void enterRecipe(@NotNull automakeParser.RecipeContext ctx);
	/**
	 * Exit a parse tree produced by {@link automakeParser#recipe}.
	 * @param ctx the parse tree
	 */
	void exitRecipe(@NotNull automakeParser.RecipeContext ctx);

	/**
	 * Enter a parse tree produced by {@link automakeParser#any}.
	 * @param ctx the parse tree
	 */
	void enterAny(@NotNull automakeParser.AnyContext ctx);
	/**
	 * Exit a parse tree produced by {@link automakeParser#any}.
	 * @param ctx the parse tree
	 */
	void exitAny(@NotNull automakeParser.AnyContext ctx);

	/**
	 * Enter a parse tree produced by {@link automakeParser#target}.
	 * @param ctx the parse tree
	 */
	void enterTarget(@NotNull automakeParser.TargetContext ctx);
	/**
	 * Exit a parse tree produced by {@link automakeParser#target}.
	 * @param ctx the parse tree
	 */
	void exitTarget(@NotNull automakeParser.TargetContext ctx);

	/**
	 * Enter a parse tree produced by {@link automakeParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(@NotNull automakeParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link automakeParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(@NotNull automakeParser.ConditionContext ctx);

	/**
	 * Enter a parse tree produced by {@link automakeParser#prerequisiteList}.
	 * @param ctx the parse tree
	 */
	void enterPrerequisiteList(@NotNull automakeParser.PrerequisiteListContext ctx);
	/**
	 * Exit a parse tree produced by {@link automakeParser#prerequisiteList}.
	 * @param ctx the parse tree
	 */
	void exitPrerequisiteList(@NotNull automakeParser.PrerequisiteListContext ctx);

	/**
	 * Enter a parse tree produced by {@link automakeParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(@NotNull automakeParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link automakeParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(@NotNull automakeParser.CompilationUnitContext ctx);

	/**
	 * Enter a parse tree produced by {@link automakeParser#filename}.
	 * @param ctx the parse tree
	 */
	void enterFilename(@NotNull automakeParser.FilenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link automakeParser#filename}.
	 * @param ctx the parse tree
	 */
	void exitFilename(@NotNull automakeParser.FilenameContext ctx);

	/**
	 * Enter a parse tree produced by {@link automakeParser#ifstatement}.
	 * @param ctx the parse tree
	 */
	void enterIfstatement(@NotNull automakeParser.IfstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link automakeParser#ifstatement}.
	 * @param ctx the parse tree
	 */
	void exitIfstatement(@NotNull automakeParser.IfstatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link automakeParser#recipeText}.
	 * @param ctx the parse tree
	 */
	void enterRecipeText(@NotNull automakeParser.RecipeTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link automakeParser#recipeText}.
	 * @param ctx the parse tree
	 */
	void exitRecipeText(@NotNull automakeParser.RecipeTextContext ctx);

	/**
	 * Enter a parse tree produced by {@link automakeParser#variableWiwhBrace}.
	 * @param ctx the parse tree
	 */
	void enterVariableWiwhBrace(@NotNull automakeParser.VariableWiwhBraceContext ctx);
	/**
	 * Exit a parse tree produced by {@link automakeParser#variableWiwhBrace}.
	 * @param ctx the parse tree
	 */
	void exitVariableWiwhBrace(@NotNull automakeParser.VariableWiwhBraceContext ctx);

	/**
	 * Enter a parse tree produced by {@link automakeParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull automakeParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link automakeParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull automakeParser.StatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link automakeParser#row}.
	 * @param ctx the parse tree
	 */
	void enterRow(@NotNull automakeParser.RowContext ctx);
	/**
	 * Exit a parse tree produced by {@link automakeParser#row}.
	 * @param ctx the parse tree
	 */
	void exitRow(@NotNull automakeParser.RowContext ctx);

	/**
	 * Enter a parse tree produced by {@link automakeParser#unterminatedRow}.
	 * @param ctx the parse tree
	 */
	void enterUnterminatedRow(@NotNull automakeParser.UnterminatedRowContext ctx);
	/**
	 * Exit a parse tree produced by {@link automakeParser#unterminatedRow}.
	 * @param ctx the parse tree
	 */
	void exitUnterminatedRow(@NotNull automakeParser.UnterminatedRowContext ctx);

	/**
	 * Enter a parse tree produced by {@link automakeParser#variableWithParen}.
	 * @param ctx the parse tree
	 */
	void enterVariableWithParen(@NotNull automakeParser.VariableWithParenContext ctx);
	/**
	 * Exit a parse tree produced by {@link automakeParser#variableWithParen}.
	 * @param ctx the parse tree
	 */
	void exitVariableWithParen(@NotNull automakeParser.VariableWithParenContext ctx);
}