package org.j8unit.repository.java.lang.reflect;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link java.lang.reflect.AnnotatedTypeVariable interface java.lang.reflect.AnnotatedTypeVariable},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.lang.reflect.AnnotatedTypeVariableClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface AnnotatedTypeVariableTests<SUT extends java.lang.reflect.AnnotatedTypeVariable>
extends org.j8unit.repository.java.lang.reflect.AnnotatedTypeTests<SUT>
{

    /**
     * <p>
     * Test method for {@link java.lang.reflect.AnnotatedTypeVariable#getAnnotatedBounds() public abstract java.lang.reflect.AnnotatedType[] java.lang.reflect.AnnotatedTypeVariable.getAnnotatedBounds()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAnnotatedBounds() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}