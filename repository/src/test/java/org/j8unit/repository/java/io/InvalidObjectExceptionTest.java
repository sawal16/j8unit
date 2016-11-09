package org.j8unit.repository.java.io;

import java.io.InvalidObjectException;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link InvalidObjectException} (by simply
 * reusing the J8Unit test interface {@link InvalidObjectExceptionTests}).
 */

@RunWith(J8Unit4.class)
public class InvalidObjectExceptionTest
implements InvalidObjectExceptionTests<InvalidObjectException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.io.InvalidObjectException]

    @Override
    public InvalidObjectException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.io.InvalidObjectException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.io.InvalidObjectException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.io.InvalidObjectException]

}
