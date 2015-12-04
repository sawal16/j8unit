package org.j8unit.repository.javax.lang.model.element;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.lang.model.element.UnknownAnnotationValueException class javax.lang.model.element.UnknownAnnotationValueException},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.lang.model.element.UnknownAnnotationValueExceptionClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface UnknownAnnotationValueExceptionTests<SUT extends javax.lang.model.element.UnknownAnnotationValueException>
extends org.j8unit.repository.javax.lang.model.UnknownEntityExceptionTests<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.lang.model.element.UnknownAnnotationValueException#getUnknownAnnotationValue() public javax.lang.model.element.AnnotationValue javax.lang.model.element.UnknownAnnotationValueException.getUnknownAnnotationValue()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getUnknownAnnotationValue() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.lang.model.element.UnknownAnnotationValueException#getArgument() public java.lang.Object javax.lang.model.element.UnknownAnnotationValueException.getArgument()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getArgument() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}