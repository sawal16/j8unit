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
 * Test class for {@link javax.lang.model.element.AnnotationMirror interface javax.lang.model.element.AnnotationMirror},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.lang.model.element.AnnotationMirrorClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface AnnotationMirrorTests<SUT extends javax.lang.model.element.AnnotationMirror>
extends J8UnitTest<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.lang.model.element.AnnotationMirror#getElementValues() public abstract java.util.Map javax.lang.model.element.AnnotationMirror.getElementValues()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getElementValues() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.lang.model.element.AnnotationMirror#getAnnotationType() public abstract javax.lang.model.type.DeclaredType javax.lang.model.element.AnnotationMirror.getAnnotationType()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAnnotationType() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}