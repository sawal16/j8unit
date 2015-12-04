package org.j8unit.repository.java.time;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link java.time.ZoneOffset class java.time.ZoneOffset},
 * containing all class relevant test methods (at least the test methods of accessible constructors and
 * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
 * methods is {@link org.j8unit.repository.java.time.ZoneOffsetTests}.
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
 * @see org.j8unit.repository.java.time.ZoneOffsetTests
 */
@Category(J8UnitRepository.class)
public abstract interface ZoneOffsetClassTests<SUT extends Class<? extends java.time.ZoneOffset>>
extends org.j8unit.repository.java.time.temporal.TemporalAccessorClassTests<SUT>,
        org.j8unit.repository.java.time.temporal.TemporalAdjusterClassTests<SUT>,
        org.j8unit.repository.java.lang.ComparableClassTests<SUT,java.time.ZoneOffset>,
        org.j8unit.repository.java.io.SerializableClassTests<SUT>,
        org.j8unit.repository.java.time.ZoneIdClassTests<SUT>
{

    @Test
    public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
        // create new instance
        Class<? extends java.time.ZoneOffset> sut = createNewSUT();
        // assert assignability
        assertTrue(java.time.ZoneOffset.class.isAssignableFrom(sut));
    }

    /**
     * <p>
     * Test method for {@link java.time.ZoneOffset#from(java.time.temporal.TemporalAccessor) public static java.time.ZoneOffset java.time.ZoneOffset.from(java.time.temporal.TemporalAccessor)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_from_TemporalAccessor() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.ZoneOffset#ofTotalSeconds(int) public static java.time.ZoneOffset java.time.ZoneOffset.ofTotalSeconds(int)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_ofTotalSeconds_int() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.ZoneOffset#ofHoursMinutesSeconds(int,int,int) public static java.time.ZoneOffset java.time.ZoneOffset.ofHoursMinutesSeconds(int,int,int)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_ofHoursMinutesSeconds_int_int_int() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.ZoneOffset#of(java.lang.String) public static java.time.ZoneOffset java.time.ZoneOffset.of(java.lang.String)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_of_String() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.ZoneOffset#ofHoursMinutes(int,int) public static java.time.ZoneOffset java.time.ZoneOffset.ofHoursMinutes(int,int)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_ofHoursMinutes_int_int() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.ZoneOffset#ofHours(int) public static java.time.ZoneOffset java.time.ZoneOffset.ofHours(int)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_ofHours_int() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}