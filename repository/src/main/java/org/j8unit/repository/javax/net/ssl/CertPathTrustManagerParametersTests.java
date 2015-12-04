package org.j8unit.repository.javax.net.ssl;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.net.ssl.CertPathTrustManagerParameters class javax.net.ssl.CertPathTrustManagerParameters},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.net.ssl.CertPathTrustManagerParametersClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface CertPathTrustManagerParametersTests<SUT extends javax.net.ssl.CertPathTrustManagerParameters>
extends org.j8unit.repository.javax.net.ssl.ManagerFactoryParametersTests<SUT>,
        org.j8unit.repository.java.lang.ObjectTests<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.net.ssl.CertPathTrustManagerParameters#getParameters() public java.security.cert.CertPathParameters javax.net.ssl.CertPathTrustManagerParameters.getParameters()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getParameters() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}