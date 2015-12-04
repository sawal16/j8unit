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
 * Test class for {@link javax.lang.model.element.Modifier class javax.lang.model.element.Modifier},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.lang.model.element.ModifierClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface ModifierTests<SUT extends javax.lang.model.element.Modifier>
extends org.j8unit.repository.java.lang.EnumTests<SUT,javax.lang.model.element.Modifier>
{

    /**
     * <p>
     * Test method for {@link javax.lang.model.element.Modifier#toString() public java.lang.String javax.lang.model.element.Modifier.toString()}.
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