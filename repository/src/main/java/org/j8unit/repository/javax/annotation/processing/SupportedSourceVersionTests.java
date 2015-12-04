package org.j8unit.repository.javax.annotation.processing;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.annotation.processing.SupportedSourceVersion interface
 * javax.annotation.processing.SupportedSourceVersion}, containing all instance relevant test methods (i.&thinsp;e.,
 * test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.annotation.processing.SupportedSourceVersionClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SupportedSourceVersionTests<SUT extends javax.annotation.processing.SupportedSourceVersion>
extends org.j8unit.repository.java.lang.annotation.AnnotationTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.annotation.processing.SupportedSourceVersion#value() public abstract
     * javax.lang.model.SourceVersion javax.annotation.processing.SupportedSourceVersion.value()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_value()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
