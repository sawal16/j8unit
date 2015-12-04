package org.j8unit.repository.java.nio.charset;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link java.nio.charset.CodingErrorAction class java.nio.charset.CodingErrorAction},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.nio.charset.CodingErrorActionClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface CodingErrorActionTests<SUT extends java.nio.charset.CodingErrorAction>
extends org.j8unit.repository.java.lang.ObjectTests<SUT>
{

    /**
     * <p>
     * Test method for {@link java.nio.charset.CodingErrorAction#toString() public java.lang.String java.nio.charset.CodingErrorAction.toString()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_toString() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}