package org.j8unit.repository.java.security;

import java.security.AlgorithmParametersSpi;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link AlgorithmParametersSpi} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.java.security.AlgorithmParametersSpiTests}).
 */
@RunWith(J8Unit4.class)
public class AlgorithmParametersSpiTest
implements AlgorithmParametersSpiTests<AlgorithmParametersSpi> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.AlgorithmParametersSpi]

    @Override
    public AlgorithmParametersSpi createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.security.AlgorithmParametersSpi], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.security.AlgorithmParametersSpi]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.security.AlgorithmParametersSpi]

}
