package org.j8unit.repository.java.rmi.server;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.rmi.server.RemoteObjectInvocationHandler class
 * java.rmi.server.RemoteObjectInvocationHandler}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.rmi.server.RemoteObjectInvocationHandlerClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface RemoteObjectInvocationHandlerTests<SUT extends java.rmi.server.RemoteObjectInvocationHandler>
extends org.j8unit.repository.java.lang.reflect.InvocationHandlerTests<SUT>, org.j8unit.repository.java.rmi.server.RemoteObjectTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link java.rmi.server.RemoteObjectInvocationHandler#invoke(java.lang.Object,java.lang.reflect.Method,java.lang.Object[])
     * public java.lang.Object
     * java.rmi.server.RemoteObjectInvocationHandler.invoke(java.lang.Object,java.lang.reflect.Method,java.lang.Object[])
     * throws java.lang.Throwable}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_invoke_Object_Method_ObjectArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
