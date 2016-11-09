package org.j8unit.repository.java.rmi.server;

import java.rmi.server.RMIFailureHandler;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link RMIFailureHandler} (by simply reusing
 * the J8Unit test interface {@link RMIFailureHandlerTests}).
 */

@RunWith(J8Unit4.class)
public class RMIFailureHandlerTest
implements RMIFailureHandlerTests<RMIFailureHandler> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.rmi.server.RMIFailureHandler]

    @Override
    public RMIFailureHandler createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.rmi.server.RMIFailureHandler], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.rmi.server.RMIFailureHandler]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.rmi.server.RMIFailureHandler]

}
