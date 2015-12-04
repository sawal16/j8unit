package org.j8unit.repository.javax.management.openmbean;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.management.openmbean.OpenMBeanInfoSupport class javax.management.openmbean.OpenMBeanInfoSupport},
 * containing all class relevant test methods (at least the test methods of accessible constructors and
 * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
 * methods is {@link org.j8unit.repository.javax.management.openmbean.OpenMBeanInfoSupportTests}.
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
 * @see org.j8unit.repository.javax.management.openmbean.OpenMBeanInfoSupportTests
 */
@Category(J8UnitRepository.class)
public abstract interface OpenMBeanInfoSupportClassTests<SUT extends Class<? extends javax.management.openmbean.OpenMBeanInfoSupport>>
extends org.j8unit.repository.javax.management.openmbean.OpenMBeanInfoClassTests<SUT>,
        org.j8unit.repository.javax.management.MBeanInfoClassTests<SUT>
{

    /**
     * Test method for {@link javax.management.openmbean.OpenMBeanInfoSupport#OpenMBeanInfoSupport(java.lang.String,java.lang.String,javax.management.openmbean.OpenMBeanAttributeInfo[],javax.management.openmbean.OpenMBeanConstructorInfo[],javax.management.openmbean.OpenMBeanOperationInfo[],javax.management.MBeanNotificationInfo[]) public javax.management.openmbean.OpenMBeanInfoSupport(java.lang.String,java.lang.String,javax.management.openmbean.OpenMBeanAttributeInfo[],javax.management.openmbean.OpenMBeanConstructorInfo[],javax.management.openmbean.OpenMBeanOperationInfo[],javax.management.MBeanNotificationInfo[])}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_OpenMBeanInfoSupport_String_String_OpenMBeanAttributeInfoArray_OpenMBeanConstructorInfoArray_OpenMBeanOperationInfoArray_MBeanNotificationInfoArray() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        javax.management.openmbean.OpenMBeanInfoSupport sut = null; // = new OpenMBeanInfoSupport(java.lang.String,java.lang.String,javax.management.openmbean.OpenMBeanAttributeInfo[],javax.management.openmbean.OpenMBeanConstructorInfo[],javax.management.openmbean.OpenMBeanOperationInfo[],javax.management.MBeanNotificationInfo[]);
    }

    /**
     * Test method for {@link javax.management.openmbean.OpenMBeanInfoSupport#OpenMBeanInfoSupport(java.lang.String,java.lang.String,javax.management.openmbean.OpenMBeanAttributeInfo[],javax.management.openmbean.OpenMBeanConstructorInfo[],javax.management.openmbean.OpenMBeanOperationInfo[],javax.management.MBeanNotificationInfo[],javax.management.Descriptor) public javax.management.openmbean.OpenMBeanInfoSupport(java.lang.String,java.lang.String,javax.management.openmbean.OpenMBeanAttributeInfo[],javax.management.openmbean.OpenMBeanConstructorInfo[],javax.management.openmbean.OpenMBeanOperationInfo[],javax.management.MBeanNotificationInfo[],javax.management.Descriptor)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_OpenMBeanInfoSupport_String_String_OpenMBeanAttributeInfoArray_OpenMBeanConstructorInfoArray_OpenMBeanOperationInfoArray_MBeanNotificationInfoArray_Descriptor() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        javax.management.openmbean.OpenMBeanInfoSupport sut = null; // = new OpenMBeanInfoSupport(java.lang.String,java.lang.String,javax.management.openmbean.OpenMBeanAttributeInfo[],javax.management.openmbean.OpenMBeanConstructorInfo[],javax.management.openmbean.OpenMBeanOperationInfo[],javax.management.MBeanNotificationInfo[],javax.management.Descriptor);
    }

    @Test
    public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
        // create new instance
        Class<? extends javax.management.openmbean.OpenMBeanInfoSupport> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.management.openmbean.OpenMBeanInfoSupport.class.isAssignableFrom(sut));
    }

}