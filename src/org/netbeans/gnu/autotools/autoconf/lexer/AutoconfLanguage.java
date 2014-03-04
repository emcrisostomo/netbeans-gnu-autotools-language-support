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
package org.netbeans.gnu.autotools.autoconf.lexer;

import org.netbeans.gnu.autotools.autoconf.parser.ACParser;
import org.netbeans.api.lexer.Language;
import org.netbeans.modules.csl.spi.DefaultLanguageConfig;
import org.netbeans.modules.csl.spi.LanguageRegistration;
import org.netbeans.modules.parsing.spi.Parser;

/**
 *
 * @author enricomariacrisostomo
 */
@LanguageRegistration(mimeType = "text/x-autoconf")
public class AutoconfLanguage extends DefaultLanguageConfig {

    @Override
    public Language getLexerLanguage() {
        return ACTokenId.getLanguage();
    }

    @Override
    public String getDisplayName() {
        return "AC";
    }

    @Override
    public Parser getParser() {
        return new ACParser();
    }
}
