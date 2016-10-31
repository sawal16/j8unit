package org.j8unit.repository.java.util;

import java.util.SortedSet;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SortedSetTest<E>
implements org.j8unit.repository.java.util.SortedSetTests<SortedSet<E>, E> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.SortedSet]

    @Override
    public SortedSet<E> createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.SortedSet], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.SortedSet]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.SortedSet]

}
