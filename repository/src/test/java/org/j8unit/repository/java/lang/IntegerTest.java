package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Integer} (by simply reusing the
 * J8Unit test interface {@link IntegerTests}).
 */

@RunWith(J8Unit4.class)
public class IntegerTest
implements IntegerTests<Integer> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.Integer]

    @Override
    public Integer createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.lang.Integer], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.lang.Integer]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.lang.Integer]

}
