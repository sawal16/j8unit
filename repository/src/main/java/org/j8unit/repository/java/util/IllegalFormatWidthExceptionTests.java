package org.j8unit.repository.java.util;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link java.util.IllegalFormatWidthException class java.util.IllegalFormatWidthException},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.util.IllegalFormatWidthExceptionClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface IllegalFormatWidthExceptionTests<SUT extends java.util.IllegalFormatWidthException>
extends org.j8unit.repository.java.util.IllegalFormatExceptionTests<SUT>
{

    /**
     * <p>
     * Test method for {@link java.util.IllegalFormatWidthException#getMessage() public java.lang.String java.util.IllegalFormatWidthException.getMessage()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getMessage() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.IllegalFormatWidthException#getWidth() public int java.util.IllegalFormatWidthException.getWidth()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getWidth() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}