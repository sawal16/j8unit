package org.j8unit.repository.java.net;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link java.net.ServerSocket class java.net.ServerSocket},
 * containing all class relevant test methods (at least the test methods of accessible constructors and
 * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
 * methods is {@link org.j8unit.repository.java.net.ServerSocketTests}.
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
 * @see org.j8unit.repository.java.net.ServerSocketTests
 */
@Category(J8UnitRepository.class)
public abstract interface ServerSocketClassTests<SUT extends Class<? extends java.net.ServerSocket>>
extends org.j8unit.repository.java.io.CloseableClassTests<SUT>,
        org.j8unit.repository.java.lang.ObjectClassTests<SUT>
{

    /**
     * Test method for {@link java.net.ServerSocket#ServerSocket(int,int,java.net.InetAddress) public java.net.ServerSocket(int,int,java.net.InetAddress) throws java.io.IOException}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_ServerSocket_int_int_InetAddress() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        java.net.ServerSocket sut = null; // = new ServerSocket(int,int,java.net.InetAddress);
    }

    /**
     * Test method for {@link java.net.ServerSocket#ServerSocket(int,int) public java.net.ServerSocket(int,int) throws java.io.IOException}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_ServerSocket_int_int() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        java.net.ServerSocket sut = null; // = new ServerSocket(int,int);
    }

    /**
     * Test method for {@link java.net.ServerSocket#ServerSocket(int) public java.net.ServerSocket(int) throws java.io.IOException}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_ServerSocket_int() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        java.net.ServerSocket sut = null; // = new ServerSocket(int);
    }

    /**
     * Test method for {@link java.net.ServerSocket#ServerSocket() public java.net.ServerSocket() throws java.io.IOException}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_ServerSocket() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        java.net.ServerSocket sut = null; // = new ServerSocket();
    }

    @Test
    public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
        // create new instance
        Class<? extends java.net.ServerSocket> sut = createNewSUT();
        // assert assignability
        assertTrue(java.net.ServerSocket.class.isAssignableFrom(sut));
    }

    /**
     * <p>
     * Test method for {@link java.net.ServerSocket#setSocketFactory(java.net.SocketImplFactory) public static synchronized void java.net.ServerSocket.setSocketFactory(java.net.SocketImplFactory) throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setSocketFactory_SocketImplFactory() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}