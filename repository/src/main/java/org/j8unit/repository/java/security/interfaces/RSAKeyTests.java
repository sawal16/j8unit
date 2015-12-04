package org.j8unit.repository.java.security.interfaces;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link java.security.interfaces.RSAKey interface java.security.interfaces.RSAKey},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.security.interfaces.RSAKeyClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface RSAKeyTests<SUT extends java.security.interfaces.RSAKey>
extends J8UnitTest<SUT>
{

    /**
     * <p>
     * Test method for {@link java.security.interfaces.RSAKey#getModulus() public abstract java.math.BigInteger java.security.interfaces.RSAKey.getModulus()}.
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