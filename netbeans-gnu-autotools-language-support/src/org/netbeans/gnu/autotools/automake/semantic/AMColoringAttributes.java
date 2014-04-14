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

import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;
import org.netbeans.gnu.autotools.automake.lexer.AutomakeKeyword.Type;

/**
 *
 * @author Enrico M. Crisostomo
 */
enum AMColoringAttributes {
    AM_BUILTIN;
    
    public static Coloring empty() {
        return new Coloring();
    }
    
    public static Coloring add(Coloring c, AMColoringAttributes a) {
        Coloring ci = new Coloring();

        ci.value = c.value | (1 << a.ordinal());

        return ci;
    }
    
    public static AMColoringAttributes fromType(Type type) {
        switch (type)
        {
            case AM_BUILTIN: return AM_BUILTIN;
         }
        
        return null;
    }
    
    public static final class Coloring implements Collection<AMColoringAttributes> {

        private int value;

        private Coloring() {
        }

        @Override
        public int size() {
            return Integer.bitCount(value);
        }

        @Override
        public boolean isEmpty() {
            return value == 0;
        }

        @Override
        public boolean contains(Object o) {
            if (o instanceof AMColoringAttributes) {
                return (value & (1 << ((AMColoringAttributes) o).ordinal())) != 0;
            } else {
                return false;
            }
        }

        @Override
        public Iterator<AMColoringAttributes> iterator() {
            Set<AMColoringAttributes> s = EnumSet.noneOf(AMColoringAttributes.class);
            for (AMColoringAttributes c : AMColoringAttributes.values()) {
                if (contains(c)) {
                    s.add(c);
                }
            }

            return s.iterator();
        }

        @Override
        public Object[] toArray() {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public <T> T[] toArray(T[] a) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public boolean add(AMColoringAttributes o) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public boolean remove(Object o) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public boolean containsAll(Collection<?> c) {
            for (Object o : c) {

                if (!(o instanceof AMColoringAttributes)) {
                    return false;
                }

                if (!contains((AMColoringAttributes) o)) {
                    return false;
                }
            }

            return true;
        }

        @Override
        public boolean addAll(Collection<? extends AMColoringAttributes> c) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public boolean removeAll(Collection<?> c) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public boolean retainAll(Collection<?> c) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public void clear() {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public int hashCode() {
            return value;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof Coloring) {
                //XXX:
                return ((Coloring) obj).value == value;
            }

            return false;
        }
    }
}
