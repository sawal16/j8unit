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
 * Test class for {@link java.util.concurrent.ConcurrentSkipListSet class java.util.concurrent.ConcurrentSkipListSet},
 * containing all class relevant test methods (at least the test methods of accessible constructors and
 * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
 * methods is {@link org.j8unit.repository.java.util.concurrent.ConcurrentSkipListSetTests}.
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
 * @see org.j8unit.repository.java.util.concurrent.ConcurrentSkipListSetTests
 */
@Category(J8UnitRepository.class)
public abstract interface ConcurrentSkipListSetClassTests<SUT extends Class<? extends java.util.concurrent.ConcurrentSkipListSet<E>>, E>
extends org.j8unit.repository.java.util.NavigableSetClassTests<SUT,E>,
        org.j8unit.repository.java.lang.CloneableClassTests<SUT>,
        org.j8unit.repository.java.io.SerializableClassTests<SUT>,
        org.j8unit.repository.java.util.AbstractSetClassTests<SUT,E>
{

    /**
     * Test method for {@link java.util.concurrent.ConcurrentSkipListSet#ConcurrentSkipListSet(java.util.SortedSet) public java.util.concurrent.ConcurrentSkipListSet(java.util.SortedSet)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_ConcurrentSkipListSet_SortedSet() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        java.util.concurrent.ConcurrentSkipListSet<E> sut = null; // = new ConcurrentSkipListSet(java.util.SortedSet);
    }

    /**
     * Test method for {@link java.util.concurrent.ConcurrentSkipListSet#ConcurrentSkipListSet(java.util.Collection) public java.util.concurrent.ConcurrentSkipListSet(java.util.Collection)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_ConcurrentSkipListSet_Collection() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        java.util.concurrent.ConcurrentSkipListSet<E> sut = null; // = new ConcurrentSkipListSet(java.util.Collection);
    }

    /**
     * Test method for {@link java.util.concurrent.ConcurrentSkipListSet#ConcurrentSkipListSet(java.util.Comparator) public java.util.concurrent.ConcurrentSkipListSet(java.util.Comparator)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_ConcurrentSkipListSet_Comparator() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        java.util.concurrent.ConcurrentSkipListSet<E> sut = null; // = new ConcurrentSkipListSet(java.util.Comparator);
    }

    /**
     * Test method for {@link java.util.concurrent.ConcurrentSkipListSet#ConcurrentSkipListSet() public java.util.concurrent.ConcurrentSkipListSet()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_ConcurrentSkipListSet() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        java.util.concurrent.ConcurrentSkipListSet<E> sut = null; // = new ConcurrentSkipListSet();
    }

    @Test
    public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
        // create new instance
        Class<? extends java.util.concurrent.ConcurrentSkipListSet<E>> sut = createNewSUT();
        // assert assignability
        assertTrue(java.util.concurrent.ConcurrentSkipListSet.class.isAssignableFrom(sut));
    }

}