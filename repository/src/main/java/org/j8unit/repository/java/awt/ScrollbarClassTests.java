package org.j8unit.repository.java.awt;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link java.awt.Scrollbar class java.awt.Scrollbar},
 * containing all class relevant test methods (at least the test methods of accessible constructors and
 * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
 * methods is {@link org.j8unit.repository.java.awt.ScrollbarTests}.
 * </p>
 *
 * <p>
 * In addition, there may be assertions concerning the class itself.
 * For example, <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1"><q>by
 * virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
 * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS, Sec.&thinsp;9.6.1</a>
 * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests}
 * provides a corresponding, inheritable test method:
 * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
 * Similarly, this class is not only intended to assert some static method's behaviour but also to verify
 * runtime constraints and further class specific requirements.
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.awt.ScrollbarTests
 */
@Category(J8UnitRepository.class)
public abstract interface ScrollbarClassTests<SUT extends Class<? extends java.awt.Scrollbar>>
extends org.j8unit.repository.java.awt.AdjustableClassTests<SUT>,
        org.j8unit.repository.javax.accessibility.AccessibleClassTests<SUT>,
        org.j8unit.repository.java.awt.ComponentClassTests<SUT>
{

    /**
     * Test method for {@link java.awt.Scrollbar#Scrollbar(int) public java.awt.Scrollbar(int) throws java.awt.HeadlessException}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_Scrollbar_int() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        java.awt.Scrollbar sut = null; // = new Scrollbar(int);
    }

    /**
     * Test method for {@link java.awt.Scrollbar#Scrollbar() public java.awt.Scrollbar() throws java.awt.HeadlessException}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_Scrollbar() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        java.awt.Scrollbar sut = null; // = new Scrollbar();
    }

    /**
     * Test method for {@link java.awt.Scrollbar#Scrollbar(int,int,int,int,int) public java.awt.Scrollbar(int,int,int,int,int) throws java.awt.HeadlessException}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_Scrollbar_int_int_int_int_int() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        java.awt.Scrollbar sut = null; // = new Scrollbar(int,int,int,int,int);
    }

    @Test
    public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
        // create new instance
        Class<? extends java.awt.Scrollbar> sut = createNewSUT();
        // assert assignability
        assertTrue(java.awt.Scrollbar.class.isAssignableFrom(sut));
    }

}