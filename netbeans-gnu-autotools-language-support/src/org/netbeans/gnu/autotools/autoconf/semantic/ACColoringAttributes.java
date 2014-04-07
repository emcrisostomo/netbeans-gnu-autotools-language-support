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
package org.netbeans.gnu.autotools.autoconf.semantic;

import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author Enrico M. Crisostomo
 */
enum ACColoringAttributes {
    M4_BUILTIN,
    INVOCATION;

    public static Coloring empty() {
        return new Coloring();
    }

    public static Coloring add(Coloring c, ACColoringAttributes a) {
        Coloring ci = new Coloring();

        ci.value = c.value | (1 << a.ordinal());

        return ci;
    }

    public static final class Coloring implements Collection<ACColoringAttributes> {

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
            if (o instanceof ACColoringAttributes) {
                return (value & (1 << ((ACColoringAttributes) o).ordinal())) != 0;
            } else {
                return false;
            }
        }

        @Override
        public Iterator<ACColoringAttributes> iterator() {
            Set<ACColoringAttributes> s = EnumSet.noneOf(ACColoringAttributes.class);
            for (ACColoringAttributes c : ACColoringAttributes.values()) {
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
        public boolean add(ACColoringAttributes o) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public boolean remove(Object o) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public boolean containsAll(Collection<?> c) {
            for (Object o : c) {

                if (!(o instanceof ACColoringAttributes)) {
                    return false;
                }

                if (!contains((ACColoringAttributes) o)) {
                    return false;
                }
            }

            return true;
        }

        @Override
        public boolean addAll(Collection<? extends ACColoringAttributes> c) {
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
