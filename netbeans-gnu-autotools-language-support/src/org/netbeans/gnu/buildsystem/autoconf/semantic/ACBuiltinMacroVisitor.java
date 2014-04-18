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
package org.netbeans.gnu.buildsystem.autoconf.semantic;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.netbeans.gnu.buildsystem.autoconf.antlr.autoconfBaseVisitor;
import org.netbeans.gnu.buildsystem.autoconf.antlr.autoconfParser;
import org.netbeans.gnu.buildsystem.autoconf.lexer.AutoconfKeyword;
import org.netbeans.gnu.buildsystem.autoconf.lexer.AutoconfKeyword.Type;

/**
 *
 * @author Enrico M. Crisostomo
 */
class ACBuiltinMacroVisitor extends autoconfBaseVisitor<Void> {

    private static final Logger logger = Logger.getLogger(ACBuiltinMacroVisitor.class.getName());

    private final Map<Token, Type> identifiers = new HashMap<>();

    @Override
    public Void visitExpression_with_params(autoconfParser.Expression_with_paramsContext ctx) {
        processIdentifier(ctx.ID());

        return super.visitExpression_with_params(ctx);
    }

    @Override
    public Void visitExpression(autoconfParser.ExpressionContext ctx) {
        processIdentifier(ctx.ID());

        return super.visitExpression(ctx);
    }

    private void processIdentifier(final TerminalNode identifier) {
        logger.fine(String.format("M4 Identifier found in expression with params: %s", identifier.getText()));

        final Token symbol = identifier.getSymbol();
        identifiers.put(symbol, AutoconfKeyword.getType(identifier.getText()));
    }

    public Map<Token, Type> getIdentifiers() {
        return identifiers;
    }
}
