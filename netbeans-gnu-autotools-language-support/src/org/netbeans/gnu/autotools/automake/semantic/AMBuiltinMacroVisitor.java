/* 
 * Copyright (C) 2014, Enrico M. Crisostomo
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 3, or (at your option)
 * any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.netbeans.gnu.autotools.automake.semantic;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.antlr.v4.runtime.Token;
import org.netbeans.gnu.autotools.autoconf.lexer.AutoconfKeyword;
import org.netbeans.gnu.autotools.automake.antlr.automakeBaseVisitor;
import org.netbeans.gnu.autotools.automake.antlr.automakeParser;
import org.netbeans.gnu.autotools.automake.lexer.AutomakeKeyword.Type;

/**
 *
 * @author Enrico M. Crisostomo
 */
class AMBuiltinMacroVisitor extends automakeBaseVisitor<Void> {

    private static final Logger logger = Logger.getLogger(AMBuiltinMacroVisitor.class.getName());

    private final Map<Token, Type> tokensByType = new HashMap<>();

    @Override
    public Void visitVariableWithParen(automakeParser.VariableWithParenContext ctx) {
        logger.log(Level.FINE, "Automake $() variable found: {0}", ctx.variableName().ID().getText());

        tokensByType.put(ctx.DOLLAR().getSymbol(), Type.AM_BUILTIN_VARIABLE);
        tokensByType.put(ctx.LPAREN().getSymbol(), Type.AM_BUILTIN_VARIABLE);
        tokensByType.put(ctx.variableName().ID().getSymbol(), Type.AM_BUILTIN_VARIABLE);
        tokensByType.put(ctx.RPAREN().getSymbol(), Type.AM_BUILTIN_VARIABLE);

        return null;
    }

    @Override
    public Void visitVariableWiwhBrace(automakeParser.VariableWiwhBraceContext ctx) {
        logger.log(Level.FINE, "Automake ${} variable found: {0}", ctx.variableName().ID().getText());

        tokensByType.put(ctx.DOLLAR().getSymbol(), Type.AM_BUILTIN_VARIABLE);
        tokensByType.put(ctx.LBRACE().getSymbol(), Type.AM_BUILTIN_VARIABLE);
        tokensByType.put(ctx.variableName().ID().getSymbol(), Type.AM_BUILTIN_VARIABLE);
        tokensByType.put(ctx.RBRACE().getSymbol(), Type.AM_BUILTIN_VARIABLE);

        return null;
    }

    public Map<Token, Type> getIdentifiers() {
        return tokensByType;
    }
}
