package org.j8unit.repository.javax.print.attribute.standard;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.print.attribute.standard.DialogTypeSelection class javax.print.attribute.standard.DialogTypeSelection},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.print.attribute.standard.DialogTypeSelectionClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface DialogTypeSelectionTests<SUT extends javax.print.attribute.standard.DialogTypeSelection>
extends org.j8unit.repository.javax.print.attribute.PrintRequestAttributeTests<SUT>,
        org.j8unit.repository.javax.print.attribute.EnumSyntaxTests<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.print.attribute.standard.DialogTypeSelection#getName() public final java.lang.String javax.print.attribute.standard.DialogTypeSelection.getName()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getName() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.print.attribute.standard.DialogTypeSelection#getCategory() public final java.lang.Class javax.print.attribute.standard.DialogTypeSelection.getCategory()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getCategory() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}