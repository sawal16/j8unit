package org.j8unit.repository.javax.xml.ws;

import org.j8unit.J8UnitTest;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.xml.ws.LogicalMessage interface javax.xml.ws.LogicalMessage}, containing all instance
 * relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.xml.ws.LogicalMessageClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface LogicalMessageTests<SUT extends javax.xml.ws.LogicalMessage>
extends J8UnitTest<SUT> {

    /**
     * <p>
     * Test method for {@link javax.xml.ws.LogicalMessage#getPayload() public abstract javax.xml.transform.Source
     * javax.xml.ws.LogicalMessage.getPayload()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPayload()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.ws.LogicalMessage#getPayload(javax.xml.bind.JAXBContext) public abstract
     * java.lang.Object javax.xml.ws.LogicalMessage.getPayload(javax.xml.bind.JAXBContext)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPayload_JAXBContext()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.ws.LogicalMessage#setPayload(java.lang.Object,javax.xml.bind.JAXBContext) public
     * abstract void javax.xml.ws.LogicalMessage.setPayload(java.lang.Object,javax.xml.bind.JAXBContext)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setPayload_Object_JAXBContext()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.ws.LogicalMessage#setPayload(javax.xml.transform.Source) public abstract void
     * javax.xml.ws.LogicalMessage.setPayload(javax.xml.transform.Source)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setPayload_Source()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
