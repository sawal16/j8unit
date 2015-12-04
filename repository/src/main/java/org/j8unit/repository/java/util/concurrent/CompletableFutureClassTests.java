package org.j8unit.repository.java.util.concurrent;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link java.util.concurrent.CompletableFuture class java.util.concurrent.CompletableFuture},
 * containing all class relevant test methods (at least the test methods of accessible constructors and
 * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
 * methods is {@link org.j8unit.repository.java.util.concurrent.CompletableFutureTests}.
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
 * @see org.j8unit.repository.java.util.concurrent.CompletableFutureTests
 */
@Category(J8UnitRepository.class)
public abstract interface CompletableFutureClassTests<SUT extends Class<? extends java.util.concurrent.CompletableFuture<T>>, T>
extends org.j8unit.repository.java.util.concurrent.FutureClassTests<SUT,T>,
        org.j8unit.repository.java.util.concurrent.CompletionStageClassTests<SUT,T>,
        org.j8unit.repository.java.lang.ObjectClassTests<SUT>
{

    /**
     * Test method for {@link java.util.concurrent.CompletableFuture#CompletableFuture() public java.util.concurrent.CompletableFuture()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_CompletableFuture() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        java.util.concurrent.CompletableFuture<T> sut = null; // = new CompletableFuture();
    }

    @Test
    public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
        // create new instance
        Class<? extends java.util.concurrent.CompletableFuture<T>> sut = createNewSUT();
        // assert assignability
        assertTrue(java.util.concurrent.CompletableFuture.class.isAssignableFrom(sut));
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.CompletableFuture#supplyAsync(java.util.function.Supplier,java.util.concurrent.Executor) public static java.util.concurrent.CompletableFuture java.util.concurrent.CompletableFuture.supplyAsync(java.util.function.Supplier,java.util.concurrent.Executor)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_supplyAsync_Supplier_Executor() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.CompletableFuture#supplyAsync(java.util.function.Supplier) public static java.util.concurrent.CompletableFuture java.util.concurrent.CompletableFuture.supplyAsync(java.util.function.Supplier)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_supplyAsync_Supplier() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.CompletableFuture#anyOf(java.util.concurrent.CompletableFuture...) public static java.util.concurrent.CompletableFuture java.util.concurrent.CompletableFuture.anyOf(java.util.concurrent.CompletableFuture...)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_anyOf_CompletableFutureArray() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.CompletableFuture#runAsync(java.lang.Runnable) public static java.util.concurrent.CompletableFuture java.util.concurrent.CompletableFuture.runAsync(java.lang.Runnable)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_runAsync_Runnable() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.CompletableFuture#runAsync(java.lang.Runnable,java.util.concurrent.Executor) public static java.util.concurrent.CompletableFuture java.util.concurrent.CompletableFuture.runAsync(java.lang.Runnable,java.util.concurrent.Executor)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_runAsync_Runnable_Executor() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.CompletableFuture#completedFuture(java.lang.Object) public static java.util.concurrent.CompletableFuture java.util.concurrent.CompletableFuture.completedFuture(java.lang.Object)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_completedFuture_Object() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.CompletableFuture#allOf(java.util.concurrent.CompletableFuture...) public static java.util.concurrent.CompletableFuture java.util.concurrent.CompletableFuture.allOf(java.util.concurrent.CompletableFuture...)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_allOf_CompletableFutureArray() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test class for {@link java.util.concurrent.CompletableFuture$AsynchronousCompletionTask interface java.util.concurrent.CompletableFuture$AsynchronousCompletionTask},
     * containing all class relevant test methods (at least the test methods of accessible constructors and
     * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
     * methods is {@link org.j8unit.repository.java.util.concurrent.CompletableFutureTests.AsynchronousCompletionTaskTests}.
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
     * @see org.j8unit.repository.java.util.concurrent.CompletableFutureTests.AsynchronousCompletionTaskTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface AsynchronousCompletionTaskClassTests<SUT extends Class<? extends java.util.concurrent.CompletableFuture.AsynchronousCompletionTask>>
    extends J8UnitTest<SUT>
    {

        @Test
        public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
            // create new instance
            Class<? extends java.util.concurrent.CompletableFuture.AsynchronousCompletionTask> sut = createNewSUT();
            // assert assignability
            assertTrue(java.util.concurrent.CompletableFuture.AsynchronousCompletionTask.class.isAssignableFrom(sut));
        }

    }

}