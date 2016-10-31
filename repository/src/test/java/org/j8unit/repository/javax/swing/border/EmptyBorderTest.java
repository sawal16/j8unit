package org.j8unit.repository.javax.swing.border;

import javax.swing.border.EmptyBorder;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class EmptyBorderTest
implements org.j8unit.repository.javax.swing.border.EmptyBorderTests<EmptyBorder> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.border.EmptyBorder]

    @Override
    public EmptyBorder createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.border.EmptyBorder], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.border.EmptyBorder]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.border.EmptyBorder]

}
