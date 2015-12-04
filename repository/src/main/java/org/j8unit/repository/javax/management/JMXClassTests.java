package org.j8unit.repository.javax.management;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.management.JMX class javax.management.JMX},
 * containing all class relevant test methods (at least the test methods of accessible constructors and
 * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
 * methods is {@link org.j8unit.repository.javax.management.JMXTests}.
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
 * @see org.j8unit.repository.javax.management.JMXTests
 */
@Category(J8UnitRepository.class)
public abstract interface JMXClassTests<SUT extends Class<? extends javax.management.JMX>>
extends org.j8unit.repository.java.lang.ObjectClassTests<SUT>
{

    @Test
    public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
        // create new instance
        Class<? extends javax.management.JMX> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.management.JMX.class.isAssignableFrom(sut));
    }

    /**
     * <p>
     * Test method for {@link javax.management.JMX#isMXBeanInterface(java.lang.Class) public static boolean javax.management.JMX.isMXBeanInterface(java.lang.Class)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isMXBeanInterface_Class() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.JMX#newMBeanProxy(javax.management.MBeanServerConnection,javax.management.ObjectName,java.lang.Class) public static java.lang.Object javax.management.JMX.newMBeanProxy(javax.management.MBeanServerConnection,javax.management.ObjectName,java.lang.Class)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_newMBeanProxy_MBeanServerConnection_ObjectName_Class() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.JMX#newMBeanProxy(javax.management.MBeanServerConnection,javax.management.ObjectName,java.lang.Class,boolean) public static java.lang.Object javax.management.JMX.newMBeanProxy(javax.management.MBeanServerConnection,javax.management.ObjectName,java.lang.Class,boolean)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_newMBeanProxy_MBeanServerConnection_ObjectName_Class_boolean() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.JMX#newMXBeanProxy(javax.management.MBeanServerConnection,javax.management.ObjectName,java.lang.Class,boolean) public static java.lang.Object javax.management.JMX.newMXBeanProxy(javax.management.MBeanServerConnection,javax.management.ObjectName,java.lang.Class,boolean)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_newMXBeanProxy_MBeanServerConnection_ObjectName_Class_boolean() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.JMX#newMXBeanProxy(javax.management.MBeanServerConnection,javax.management.ObjectName,java.lang.Class) public static java.lang.Object javax.management.JMX.newMXBeanProxy(javax.management.MBeanServerConnection,javax.management.ObjectName,java.lang.Class)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_newMXBeanProxy_MBeanServerConnection_ObjectName_Class() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}