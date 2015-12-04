package org.j8unit.repository.javax.net.ssl;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.net.ssl.SSLEngineResult class javax.net.ssl.SSLEngineResult},
 * containing all class relevant test methods (at least the test methods of accessible constructors and
 * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
 * methods is {@link org.j8unit.repository.javax.net.ssl.SSLEngineResultTests}.
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
 * @see org.j8unit.repository.javax.net.ssl.SSLEngineResultTests
 */
@Category(J8UnitRepository.class)
public abstract interface SSLEngineResultClassTests<SUT extends Class<? extends javax.net.ssl.SSLEngineResult>>
extends org.j8unit.repository.java.lang.ObjectClassTests<SUT>
{

    /**
     * Test method for {@link javax.net.ssl.SSLEngineResult#SSLEngineResult(javax.net.ssl.SSLEngineResult.Status,javax.net.ssl.SSLEngineResult.HandshakeStatus,int,int) public javax.net.ssl.SSLEngineResult(javax.net.ssl.SSLEngineResult$Status,javax.net.ssl.SSLEngineResult$HandshakeStatus,int,int)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_SSLEngineResult_Status_HandshakeStatus_int_int() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        javax.net.ssl.SSLEngineResult sut = null; // = new SSLEngineResult(javax.net.ssl.SSLEngineResult.Status,javax.net.ssl.SSLEngineResult.HandshakeStatus,int,int);
    }

    @Test
    public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
        // create new instance
        Class<? extends javax.net.ssl.SSLEngineResult> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.net.ssl.SSLEngineResult.class.isAssignableFrom(sut));
    }

    /**
     * <p>
     * Test class for {@link javax.net.ssl.SSLEngineResult$HandshakeStatus class javax.net.ssl.SSLEngineResult$HandshakeStatus},
     * containing all class relevant test methods (at least the test methods of accessible constructors and
     * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
     * methods is {@link org.j8unit.repository.javax.net.ssl.SSLEngineResultTests.HandshakeStatusTests}.
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
     * @see org.j8unit.repository.javax.net.ssl.SSLEngineResultTests.HandshakeStatusTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface HandshakeStatusClassTests<SUT extends Class<? extends javax.net.ssl.SSLEngineResult.HandshakeStatus>>
    extends org.j8unit.repository.java.lang.EnumClassTests<SUT,javax.net.ssl.SSLEngineResult.HandshakeStatus>
    {

        @Test
        public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
            // create new instance
            Class<? extends javax.net.ssl.SSLEngineResult.HandshakeStatus> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.net.ssl.SSLEngineResult.HandshakeStatus.class.isAssignableFrom(sut));
        }

        /**
         * <p>
         * Test method for {@link javax.net.ssl.SSLEngineResult.HandshakeStatus#values() public static javax.net.ssl.SSLEngineResult$HandshakeStatus[] javax.net.ssl.SSLEngineResult$HandshakeStatus.values()}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_values() throws Exception {
            // query fresh subject-under-test
            SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.net.ssl.SSLEngineResult.HandshakeStatus#valueOf(java.lang.String) public static javax.net.ssl.SSLEngineResult$HandshakeStatus javax.net.ssl.SSLEngineResult$HandshakeStatus.valueOf(java.lang.String)}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_valueOf_String() throws Exception {
            // query fresh subject-under-test
            SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Test class for {@link javax.net.ssl.SSLEngineResult$Status class javax.net.ssl.SSLEngineResult$Status},
     * containing all class relevant test methods (at least the test methods of accessible constructors and
     * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
     * methods is {@link org.j8unit.repository.javax.net.ssl.SSLEngineResultTests.StatusTests}.
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
     * @see org.j8unit.repository.javax.net.ssl.SSLEngineResultTests.StatusTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface StatusClassTests<SUT extends Class<? extends javax.net.ssl.SSLEngineResult.Status>>
    extends org.j8unit.repository.java.lang.EnumClassTests<SUT,javax.net.ssl.SSLEngineResult.Status>
    {

        @Test
        public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
            // create new instance
            Class<? extends javax.net.ssl.SSLEngineResult.Status> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.net.ssl.SSLEngineResult.Status.class.isAssignableFrom(sut));
        }

        /**
         * <p>
         * Test method for {@link javax.net.ssl.SSLEngineResult.Status#valueOf(java.lang.String) public static javax.net.ssl.SSLEngineResult$Status javax.net.ssl.SSLEngineResult$Status.valueOf(java.lang.String)}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_valueOf_String() throws Exception {
            // query fresh subject-under-test
            SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.net.ssl.SSLEngineResult.Status#values() public static javax.net.ssl.SSLEngineResult$Status[] javax.net.ssl.SSLEngineResult$Status.values()}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_values() throws Exception {
            // query fresh subject-under-test
            SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

}