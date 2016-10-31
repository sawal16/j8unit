package org.j8unit.repository.java.rmi.server;

import java.rmi.server.RemoteObjectInvocationHandler;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RemoteObjectInvocationHandlerTest
implements org.j8unit.repository.java.rmi.server.RemoteObjectInvocationHandlerTests<RemoteObjectInvocationHandler> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.rmi.server.RemoteObjectInvocationHandler]

    @Override
    public RemoteObjectInvocationHandler createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.rmi.server.RemoteObjectInvocationHandler], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.rmi.server.RemoteObjectInvocationHandler]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.rmi.server.RemoteObjectInvocationHandler]

}
