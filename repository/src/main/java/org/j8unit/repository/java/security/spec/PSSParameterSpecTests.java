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
 * Test class for {@link java.security.spec.PSSParameterSpec class java.security.spec.PSSParameterSpec},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.security.spec.PSSParameterSpecClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface PSSParameterSpecTests<SUT extends java.security.spec.PSSParameterSpec>
extends org.j8unit.repository.java.security.spec.AlgorithmParameterSpecTests<SUT>,
        org.j8unit.repository.java.lang.ObjectTests<SUT>
{

    /**
     * <p>
     * Test method for {@link java.security.spec.PSSParameterSpec#getDigestAlgorithm() public java.lang.String java.security.spec.PSSParameterSpec.getDigestAlgorithm()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getDigestAlgorithm() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.spec.PSSParameterSpec#getSaltLength() public int java.security.spec.PSSParameterSpec.getSaltLength()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSaltLength() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.spec.PSSParameterSpec#getMGFAlgorithm() public java.lang.String java.security.spec.PSSParameterSpec.getMGFAlgorithm()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getMGFAlgorithm() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.spec.PSSParameterSpec#getMGFParameters() public java.security.spec.AlgorithmParameterSpec java.security.spec.PSSParameterSpec.getMGFParameters()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getMGFParameters() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.spec.PSSParameterSpec#getTrailerField() public int java.security.spec.PSSParameterSpec.getTrailerField()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getTrailerField() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}