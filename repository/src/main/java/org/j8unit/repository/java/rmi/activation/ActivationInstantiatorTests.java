package org.j8unit.repository.java.rmi.activation;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link java.rmi.activation.ActivationInstantiator interface java.rmi.activation.ActivationInstantiator},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.rmi.activation.ActivationInstantiatorClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface ActivationInstantiatorTests<SUT extends java.rmi.activation.ActivationInstantiator>
extends org.j8unit.repository.java.rmi.RemoteTests<SUT>
{

    /**
     * <p>
     * Test method for {@link java.rmi.activation.ActivationInstantiator#newInstance(java.rmi.activation.ActivationID,java.rmi.activation.ActivationDesc) public abstract java.rmi.MarshalledObject java.rmi.activation.ActivationInstantiator.newInstance(java.rmi.activation.ActivationID,java.rmi.activation.ActivationDesc) throws java.rmi.activation.ActivationException,java.rmi.RemoteException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_newInstance_ActivationID_ActivationDesc() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}