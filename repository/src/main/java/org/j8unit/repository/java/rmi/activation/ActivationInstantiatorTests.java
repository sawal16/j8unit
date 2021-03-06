package org.j8unit.repository.java.rmi.activation;

import java.rmi.activation.ActivationInstantiator;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.j8unit.repository.java.rmi.RemoteTests;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
 * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test
 * {@link ActivationInstantiator public abstract interface java.rmi.activation.ActivationInstantiator}.
 * </p>
 *
 * <p>
 * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints. For
 * this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects (see
 * {@link org.j8unit.repository.java.rmi.activation.ActivationInstantiatorClassTests}).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ActivationInstantiatorTests<SUT extends ActivationInstantiator>
extends RemoteTests<SUT> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.rmi.activation.ActivationInstantiator]

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.rmi.activation.ActivationInstantiator#newInstance(java.rmi.activation.ActivationID, java.rmi.activation.ActivationDesc)
     * public abstract java.rmi.MarshalledObject<? extends java.rmi.Remote>
     * java.rmi.activation.ActivationInstantiator.newInstance(java.rmi.activation.ActivationID,java.rmi.activation.ActivationDesc)
     * throws java.rmi.activation.ActivationException,java.rmi.RemoteException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_newInstance_ActivationID_ActivationDesc()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.rmi.activation.ActivationInstantiator]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.rmi.activation.ActivationInstantiator]

}
