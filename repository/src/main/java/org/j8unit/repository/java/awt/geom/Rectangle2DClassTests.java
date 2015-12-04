package org.j8unit.repository.java.awt.geom;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link java.awt.geom.Rectangle2D class java.awt.geom.Rectangle2D},
 * containing all class relevant test methods (at least the test methods of accessible constructors and
 * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
 * methods is {@link org.j8unit.repository.java.awt.geom.Rectangle2DTests}.
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
 * @see org.j8unit.repository.java.awt.geom.Rectangle2DTests
 */
@Category(J8UnitRepository.class)
public abstract interface Rectangle2DClassTests<SUT extends Class<? extends java.awt.geom.Rectangle2D>>
extends org.j8unit.repository.java.awt.geom.RectangularShapeClassTests<SUT>
{

    @Test
    public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
        // create new instance
        Class<? extends java.awt.geom.Rectangle2D> sut = createNewSUT();
        // assert assignability
        assertTrue(java.awt.geom.Rectangle2D.class.isAssignableFrom(sut));
    }

    /**
     * <p>
     * Test method for {@link java.awt.geom.Rectangle2D#intersect(java.awt.geom.Rectangle2D,java.awt.geom.Rectangle2D,java.awt.geom.Rectangle2D) public static void java.awt.geom.Rectangle2D.intersect(java.awt.geom.Rectangle2D,java.awt.geom.Rectangle2D,java.awt.geom.Rectangle2D)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_intersect_Rectangle2D_Rectangle2D_Rectangle2D() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.geom.Rectangle2D#union(java.awt.geom.Rectangle2D,java.awt.geom.Rectangle2D,java.awt.geom.Rectangle2D) public static void java.awt.geom.Rectangle2D.union(java.awt.geom.Rectangle2D,java.awt.geom.Rectangle2D,java.awt.geom.Rectangle2D)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_union_Rectangle2D_Rectangle2D_Rectangle2D() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test class for {@link java.awt.geom.Rectangle2D$Double class java.awt.geom.Rectangle2D$Double},
     * containing all class relevant test methods (at least the test methods of accessible constructors and
     * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
     * methods is {@link org.j8unit.repository.java.awt.geom.Rectangle2DTests.DoubleTests}.
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
     * @see org.j8unit.repository.java.awt.geom.Rectangle2DTests.DoubleTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface DoubleClassTests<SUT extends Class<? extends java.awt.geom.Rectangle2D.Double>>
    extends org.j8unit.repository.java.io.SerializableClassTests<SUT>,
            org.j8unit.repository.java.awt.geom.Rectangle2DClassTests<SUT>
    {

        /**
         * Test method for {@link java.awt.geom.Rectangle2D.Double#Double() public java.awt.geom.Rectangle2D$Double()}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_Double() throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            java.awt.geom.Rectangle2D.Double sut = null; // = new Double();
        }

        /**
         * Test method for {@link java.awt.geom.Rectangle2D.Double#Double(double,double,double,double) public java.awt.geom.Rectangle2D$Double(double,double,double,double)}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_Double_double_double_double_double() throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            java.awt.geom.Rectangle2D.Double sut = null; // = new Double(double,double,double,double);
        }

        @Test
        public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
            // create new instance
            Class<? extends java.awt.geom.Rectangle2D.Double> sut = createNewSUT();
            // assert assignability
            assertTrue(java.awt.geom.Rectangle2D.Double.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link java.awt.geom.Rectangle2D$Float class java.awt.geom.Rectangle2D$Float},
     * containing all class relevant test methods (at least the test methods of accessible constructors and
     * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
     * methods is {@link org.j8unit.repository.java.awt.geom.Rectangle2DTests.FloatTests}.
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
     * @see org.j8unit.repository.java.awt.geom.Rectangle2DTests.FloatTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface FloatClassTests<SUT extends Class<? extends java.awt.geom.Rectangle2D.Float>>
    extends org.j8unit.repository.java.io.SerializableClassTests<SUT>,
            org.j8unit.repository.java.awt.geom.Rectangle2DClassTests<SUT>
    {

        /**
         * Test method for {@link java.awt.geom.Rectangle2D.Float#Float() public java.awt.geom.Rectangle2D$Float()}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_Float() throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            java.awt.geom.Rectangle2D.Float sut = null; // = new Float();
        }

        /**
         * Test method for {@link java.awt.geom.Rectangle2D.Float#Float(float,float,float,float) public java.awt.geom.Rectangle2D$Float(float,float,float,float)}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_Float_float_float_float_float() throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            java.awt.geom.Rectangle2D.Float sut = null; // = new Float(float,float,float,float);
        }

        @Test
        public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
            // create new instance
            Class<? extends java.awt.geom.Rectangle2D.Float> sut = createNewSUT();
            // assert assignability
            assertTrue(java.awt.geom.Rectangle2D.Float.class.isAssignableFrom(sut));
        }

    }

}