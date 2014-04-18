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

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Enumeration;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.AttributeSet;
import org.netbeans.api.editor.mimelookup.MimeLookup;
import org.netbeans.api.editor.mimelookup.MimePath;
import org.netbeans.api.editor.settings.AttributesUtilities;
import org.netbeans.api.editor.settings.FontColorSettings;
import static org.netbeans.gnu.buildsystem.autoconf.semantic.ACColoringAttributes.*;
import org.netbeans.gnu.buildsystem.autoconf.semantic.ACColoringAttributes.Coloring;

/**
 *
 * @author Enrico M. Crisostomo
 */
final class ACColoringManager {

    private static final Logger logger = Logger.getLogger(ACColoringManager.class.getName());
    private static final Map<Set<ACColoringAttributes>, String> type2Coloring;

    static {
        type2Coloring = new LinkedHashMap<>();

        put("autoconf", AC_BUILTIN);
        put("autoconf-ah-keyword", AH_BUILTIN);
        put("autoconf-am-keyword", AM_BUILTIN);
        put("autoconf-as-keyword", AS_BUILTIN);
        put("autoconf-au-keyword", AU_BUILTIN);
        put("autoconf-obsolete", AC_OBSOLETE);
        put("autoconf-am-obsolete-keyword", AM_OBSOLETE);
        put("autoconf-ac-generic-keyword", AC_GENERIC);
        put("autoconf-ah-generic-keyword", AH_GENERIC);
        put("autoconf-am-generic-keyword", AM_GENERIC);
        put("autoconf-an-generic-keyword", AN_GENERIC);
        put("autoconf-as-generic-keyword", AS_GENERIC);
        put("autoconf-au-generic-keyword", AU_GENERIC);
        put("autoconf-ax-generic-keyword", AX_GENERIC);
    }

    private static void put(String coloring, ACColoringAttributes... attributes) {
        Set<ACColoringAttributes> attribs = EnumSet.copyOf(Arrays.asList(attributes));

        type2Coloring.put(attribs, coloring);
    }

    public static AttributeSet getColoringImpl(Coloring colorings) {
        FontColorSettings fcs = MimeLookup.getLookup(MimePath.get("text/x-autoconf")).lookup(FontColorSettings.class);

        if (fcs == null) {
            //in tests:
            return AttributesUtilities.createImmutable();
        }

        assert fcs != null;

        List<AttributeSet> attribs = new LinkedList<>();

        EnumSet<ACColoringAttributes> es = EnumSet.noneOf(ACColoringAttributes.class);

        es.addAll(colorings);

        for (Map.Entry<Set<ACColoringAttributes>, String> attribs2Colorings : type2Coloring.entrySet()) {
            if (es.containsAll(attribs2Colorings.getKey())) {
                String key = attribs2Colorings.getValue();

                logger.log(Level.FINE, "Matching coloring key: {0}", key);

                es.removeAll(attribs2Colorings.getKey());

                if (key != null) {
                    AttributeSet colors = fcs.getTokenFontColors(key);

                    if (colors == null) {
                        logger.log(Level.SEVERE, "no colors for: {0}", key);
                        continue;
                    }

                    attribs.add(adjustAttributes(colors));
                }
            }
        }

        Collections.reverse(attribs);

        AttributeSet result = AttributesUtilities.createComposite(attribs.toArray(new AttributeSet[0]));

        return result;
    }

    private static AttributeSet adjustAttributes(AttributeSet as) {
        Collection<Object> attrs = new LinkedList<>();

        for (Enumeration<?> e = as.getAttributeNames(); e.hasMoreElements();) {
            Object key = e.nextElement();
            Object value = as.getAttribute(key);

            if (value != Boolean.FALSE) {
                attrs.add(key);
                attrs.add(value);
            }
        }

        return AttributesUtilities.createImmutable(attrs.toArray());
    }
}
