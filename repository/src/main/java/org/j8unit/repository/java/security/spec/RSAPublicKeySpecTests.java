package org.j8unit.repository.java.security.spec;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link java.security.spec.RSAPublicKeySpec class java.security.spec.RSAPublicKeySpec},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.security.spec.RSAPublicKeySpecClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface RSAPublicKeySpecTests<SUT extends java.security.spec.RSAPublicKeySpec>
extends org.j8unit.repository.java.security.spec.KeySpecTests<SUT>,
        org.j8unit.repository.java.lang.ObjectTests<SUT>
{

    /**
     * <p>
     * Test method for {@link java.security.spec.RSAPublicKeySpec#getPublicExponent() public java.math.BigInteger java.security.spec.RSAPublicKeySpec.getPublicExponent()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPublicExponent() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.spec.RSAPublicKeySpec#getModulus() public java.math.BigInteger java.security.spec.RSAPublicKeySpec.getModulus()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getModulus() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}