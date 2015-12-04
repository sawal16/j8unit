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
 * Test class for {@link java.awt.Checkbox class java.awt.Checkbox},
 * containing all class relevant test methods (at least the test methods of accessible constructors and
 * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
 * methods is {@link org.j8unit.repository.java.awt.CheckboxTests}.
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
 * @see org.j8unit.repository.java.awt.CheckboxTests
 */
@Category(J8UnitRepository.class)
public abstract interface CheckboxClassTests<SUT extends Class<? extends java.awt.Checkbox>>
extends org.j8unit.repository.java.awt.ItemSelectableClassTests<SUT>,
        org.j8unit.repository.javax.accessibility.AccessibleClassTests<SUT>,
        org.j8unit.repository.java.awt.ComponentClassTests<SUT>
{

    /**
     * Test method for {@link java.awt.Checkbox#Checkbox(java.lang.String,boolean,java.awt.CheckboxGroup) public java.awt.Checkbox(java.lang.String,boolean,java.awt.CheckboxGroup) throws java.awt.HeadlessException}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_Checkbox_String_boolean_CheckboxGroup() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        java.awt.Checkbox sut = null; // = new Checkbox(java.lang.String,boolean,java.awt.CheckboxGroup);
    }

    /**
     * Test method for {@link java.awt.Checkbox#Checkbox(java.lang.String,boolean) public java.awt.Checkbox(java.lang.String,boolean) throws java.awt.HeadlessException}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_Checkbox_String_boolean() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        java.awt.Checkbox sut = null; // = new Checkbox(java.lang.String,boolean);
    }

    /**
     * Test method for {@link java.awt.Checkbox#Checkbox(java.lang.String) public java.awt.Checkbox(java.lang.String) throws java.awt.HeadlessException}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_Checkbox_String() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        java.awt.Checkbox sut = null; // = new Checkbox(java.lang.String);
    }

    /**
     * Test method for {@link java.awt.Checkbox#Checkbox() public java.awt.Checkbox() throws java.awt.HeadlessException}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_Checkbox() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        java.awt.Checkbox sut = null; // = new Checkbox();
    }

    /**
     * Test method for {@link java.awt.Checkbox#Checkbox(java.lang.String,java.awt.CheckboxGroup,boolean) public java.awt.Checkbox(java.lang.String,java.awt.CheckboxGroup,boolean) throws java.awt.HeadlessException}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_Checkbox_String_CheckboxGroup_boolean() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        java.awt.Checkbox sut = null; // = new Checkbox(java.lang.String,java.awt.CheckboxGroup,boolean);
    }

    @Test
    public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
        // create new instance
        Class<? extends java.awt.Checkbox> sut = createNewSUT();
        // assert assignability
        assertTrue(java.awt.Checkbox.class.isAssignableFrom(sut));
    }

}