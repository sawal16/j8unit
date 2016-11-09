package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.PortableInterceptor.ServerRequestInterceptor;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ServerRequestInterceptor} (by simply
 * reusing the J8Unit test interface {@link ServerRequestInterceptorTests}).
 */

@RunWith(J8Unit4.class)
public class ServerRequestInterceptorTest
implements ServerRequestInterceptorTests<ServerRequestInterceptor> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.PortableInterceptor.ServerRequestInterceptor]

    @Override
    public ServerRequestInterceptor createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.PortableInterceptor.ServerRequestInterceptor], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.PortableInterceptor.ServerRequestInterceptor]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.PortableInterceptor.ServerRequestInterceptor]

}
