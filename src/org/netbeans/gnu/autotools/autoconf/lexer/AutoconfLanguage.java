/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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

    //@Override
    //public Parser getParser() {
    //    return new ACParser();
    //}
}
