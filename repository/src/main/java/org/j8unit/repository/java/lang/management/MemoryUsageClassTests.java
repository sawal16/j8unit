package org.j8unit.repository.java.lang.management;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link java.lang.management.MemoryUsage class java.lang.management.MemoryUsage},
 * containing all class relevant test methods (at least the test methods of accessible constructors and
 * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
 * methods is {@link org.j8unit.repository.java.lang.management.MemoryUsageTests}.
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
 * @see org.j8unit.repository.java.lang.management.MemoryUsageTests
 */
@Category(J8UnitRepository.class)
public abstract interface MemoryUsageClassTests<SUT extends Class<? extends java.lang.management.MemoryUsage>>
extends org.j8unit.repository.java.lang.ObjectClassTests<SUT>
{

    /**
     * Test method for {@link java.lang.management.MemoryUsage#MemoryUsage(long,long,long,long) public java.lang.management.MemoryUsage(long,long,long,long)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_MemoryUsage_long_long_long_long() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        java.lang.management.MemoryUsage sut = null; // = new MemoryUsage(long,long,long,long);
    }

    @Test
    public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
        // create new instance
        Class<? extends java.lang.management.MemoryUsage> sut = createNewSUT();
        // assert assignability
        assertTrue(java.lang.management.MemoryUsage.class.isAssignableFrom(sut));
    }

    /**
     * <p>
     * Test method for {@link java.lang.management.MemoryUsage#from(javax.management.openmbean.CompositeData) public static java.lang.management.MemoryUsage java.lang.management.MemoryUsage.from(javax.management.openmbean.CompositeData)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_from_CompositeData() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}