package org.j8unit.repository.java.beans;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link java.beans.PropertyDescriptor class java.beans.PropertyDescriptor},
 * containing all class relevant test methods (at least the test methods of accessible constructors and
 * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
 * methods is {@link org.j8unit.repository.java.beans.PropertyDescriptorTests}.
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
 * @see org.j8unit.repository.java.beans.PropertyDescriptorTests
 */
@Category(J8UnitRepository.class)
public abstract interface PropertyDescriptorClassTests<SUT extends Class<? extends java.beans.PropertyDescriptor>>
extends org.j8unit.repository.java.beans.FeatureDescriptorClassTests<SUT>
{

    /**
     * Test method for {@link java.beans.PropertyDescriptor#PropertyDescriptor(java.lang.String,java.lang.Class) public java.beans.PropertyDescriptor(java.lang.String,java.lang.Class) throws java.beans.IntrospectionException}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_PropertyDescriptor_String_Class() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        java.beans.PropertyDescriptor sut = null; // = new PropertyDescriptor(java.lang.String,java.lang.Class);
    }

    /**
     * Test method for {@link java.beans.PropertyDescriptor#PropertyDescriptor(java.lang.String,java.lang.Class,java.lang.String,java.lang.String) public java.beans.PropertyDescriptor(java.lang.String,java.lang.Class,java.lang.String,java.lang.String) throws java.beans.IntrospectionException}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_PropertyDescriptor_String_Class_String_String() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        java.beans.PropertyDescriptor sut = null; // = new PropertyDescriptor(java.lang.String,java.lang.Class,java.lang.String,java.lang.String);
    }

    /**
     * Test method for {@link java.beans.PropertyDescriptor#PropertyDescriptor(java.lang.String,java.lang.reflect.Method,java.lang.reflect.Method) public java.beans.PropertyDescriptor(java.lang.String,java.lang.reflect.Method,java.lang.reflect.Method) throws java.beans.IntrospectionException}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_PropertyDescriptor_String_Method_Method() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        java.beans.PropertyDescriptor sut = null; // = new PropertyDescriptor(java.lang.String,java.lang.reflect.Method,java.lang.reflect.Method);
    }

    @Test
    public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
        // create new instance
        Class<? extends java.beans.PropertyDescriptor> sut = createNewSUT();
        // assert assignability
        assertTrue(java.beans.PropertyDescriptor.class.isAssignableFrom(sut));
    }

}