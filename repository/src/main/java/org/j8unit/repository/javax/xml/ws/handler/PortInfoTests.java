package org.j8unit.repository.javax.xml.ws.handler;

import org.j8unit.J8UnitTest;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.xml.ws.handler.PortInfo interface javax.xml.ws.handler.PortInfo}, containing all instance
 * relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.xml.ws.handler.PortInfoClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface PortInfoTests<SUT extends javax.xml.ws.handler.PortInfo>
extends J8UnitTest<SUT> {

    /**
     * <p>
     * Test method for {@link javax.xml.ws.handler.PortInfo#getBindingID() public abstract java.lang.String
     * javax.xml.ws.handler.PortInfo.getBindingID()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getBindingID()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.ws.handler.PortInfo#getPortName() public abstract javax.xml.namespace.QName
     * javax.xml.ws.handler.PortInfo.getPortName()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPortName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.ws.handler.PortInfo#getServiceName() public abstract javax.xml.namespace.QName
     * javax.xml.ws.handler.PortInfo.getServiceName()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getServiceName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
