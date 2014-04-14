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

import java.util.logging.Logger;
import org.netbeans.api.editor.mimelookup.MimeRegistration;
import org.netbeans.spi.editor.highlighting.HighlightsLayer;
import org.netbeans.spi.editor.highlighting.HighlightsLayerFactory;
import org.netbeans.spi.editor.highlighting.ZOrder;

/**
 *
 * @author Enrico M. Crisostomo
 */
@MimeRegistration(mimeType = "text/x-automake", service = HighlightsLayerFactory.class)
public class AMHighlightsLayerFactory implements HighlightsLayerFactory {

    private static final Logger logger = Logger.getLogger(AMHighlightsLayerFactory.class.getName());

    @Override
    public HighlightsLayer[] createLayers(Context context) {
        logger.fine("Initializing highlight layers.");

        AMLexerBasedHighlightLayer semantic = AMLexerBasedHighlightLayer.getLayer(AMSemanticHighlighter.class, context.getDocument());

        semantic.clearColoringCache();

        return new HighlightsLayer[]{
            HighlightsLayer.create(AMSemanticHighlighter.class.getName() + "-1", ZOrder.SYNTAX_RACK.forPosition(1000), false, semantic)
        };
    }
}
