package org.j8unit.repository.javax.swing;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.swing.SwingWorker class javax.swing.SwingWorker},
 * containing all class relevant test methods (at least the test methods of accessible constructors and
 * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
 * methods is {@link org.j8unit.repository.javax.swing.SwingWorkerTests}.
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
 * @see org.j8unit.repository.javax.swing.SwingWorkerTests
 */
@Category(J8UnitRepository.class)
public abstract interface SwingWorkerClassTests<SUT extends Class<? extends javax.swing.SwingWorker<T,V>>, T, V>
extends org.j8unit.repository.java.util.concurrent.RunnableFutureClassTests<SUT,T>,
        org.j8unit.repository.java.lang.ObjectClassTests<SUT>
{

    /**
     * Test method for {@link javax.swing.SwingWorker#SwingWorker() public javax.swing.SwingWorker()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_SwingWorker() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        javax.swing.SwingWorker<T,V> sut = null; // = new SwingWorker();
    }

    @Test
    public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
        // create new instance
        Class<? extends javax.swing.SwingWorker<T,V>> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.swing.SwingWorker.class.isAssignableFrom(sut));
    }

    /**
     * <p>
     * Test class for {@link javax.swing.SwingWorker$StateValue class javax.swing.SwingWorker$StateValue},
     * containing all class relevant test methods (at least the test methods of accessible constructors and
     * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
     * methods is {@link org.j8unit.repository.javax.swing.SwingWorkerTests.StateValueTests}.
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
     * @see org.j8unit.repository.javax.swing.SwingWorkerTests.StateValueTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface StateValueClassTests<SUT extends Class<? extends javax.swing.SwingWorker.StateValue>>
    extends org.j8unit.repository.java.lang.EnumClassTests<SUT,javax.swing.SwingWorker.StateValue>
    {

        @Test
        public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
            // create new instance
            Class<? extends javax.swing.SwingWorker.StateValue> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.SwingWorker.StateValue.class.isAssignableFrom(sut));
        }

        /**
         * <p>
         * Test method for {@link javax.swing.SwingWorker.StateValue#valueOf(java.lang.String) public static javax.swing.SwingWorker$StateValue javax.swing.SwingWorker$StateValue.valueOf(java.lang.String)}.
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
         * Test method for {@link javax.swing.SwingWorker.StateValue#values() public static javax.swing.SwingWorker$StateValue[] javax.swing.SwingWorker$StateValue.values()}.
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