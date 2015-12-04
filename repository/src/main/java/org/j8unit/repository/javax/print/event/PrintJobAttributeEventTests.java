package org.j8unit.repository.javax.print.event;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.print.event.PrintJobAttributeEvent class javax.print.event.PrintJobAttributeEvent},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.print.event.PrintJobAttributeEventClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface PrintJobAttributeEventTests<SUT extends javax.print.event.PrintJobAttributeEvent>
extends org.j8unit.repository.javax.print.event.PrintEventTests<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.print.event.PrintJobAttributeEvent#getAttributes() public javax.print.attribute.PrintJobAttributeSet javax.print.event.PrintJobAttributeEvent.getAttributes()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAttributes() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.print.event.PrintJobAttributeEvent#getPrintJob() public javax.print.DocPrintJob javax.print.event.PrintJobAttributeEvent.getPrintJob()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPrintJob() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}