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
 * Test class for {@link javax.swing.RowFilter class javax.swing.RowFilter},
 * containing all class relevant test methods (at least the test methods of accessible constructors and
 * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
 * methods is {@link org.j8unit.repository.javax.swing.RowFilterTests}.
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
 * @see org.j8unit.repository.javax.swing.RowFilterTests
 */
@Category(J8UnitRepository.class)
public abstract interface RowFilterClassTests<SUT extends Class<? extends javax.swing.RowFilter<M,I>>, M, I>
extends org.j8unit.repository.java.lang.ObjectClassTests<SUT>
{

    /**
     * Test method for {@link javax.swing.RowFilter#RowFilter() public javax.swing.RowFilter()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_RowFilter() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        javax.swing.RowFilter<M,I> sut = null; // = new RowFilter();
    }

    @Test
    public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
        // create new instance
        Class<? extends javax.swing.RowFilter<M,I>> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.swing.RowFilter.class.isAssignableFrom(sut));
    }

    /**
     * <p>
     * Test method for {@link javax.swing.RowFilter#dateFilter(javax.swing.RowFilter.ComparisonType,java.util.Date,int...) public static javax.swing.RowFilter javax.swing.RowFilter.dateFilter(javax.swing.RowFilter$ComparisonType,java.util.Date,int...)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_dateFilter_ComparisonType_Date_intArray() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.RowFilter#orFilter(java.lang.Iterable) public static javax.swing.RowFilter javax.swing.RowFilter.orFilter(java.lang.Iterable)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_orFilter_Iterable() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.RowFilter#numberFilter(javax.swing.RowFilter.ComparisonType,java.lang.Number,int...) public static javax.swing.RowFilter javax.swing.RowFilter.numberFilter(javax.swing.RowFilter$ComparisonType,java.lang.Number,int...)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_numberFilter_ComparisonType_Number_intArray() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.RowFilter#andFilter(java.lang.Iterable) public static javax.swing.RowFilter javax.swing.RowFilter.andFilter(java.lang.Iterable)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_andFilter_Iterable() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.RowFilter#notFilter(javax.swing.RowFilter) public static javax.swing.RowFilter javax.swing.RowFilter.notFilter(javax.swing.RowFilter)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_notFilter_RowFilter() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.RowFilter#regexFilter(java.lang.String,int...) public static javax.swing.RowFilter javax.swing.RowFilter.regexFilter(java.lang.String,int...)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_regexFilter_String_intArray() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test class for {@link javax.swing.RowFilter$ComparisonType class javax.swing.RowFilter$ComparisonType},
     * containing all class relevant test methods (at least the test methods of accessible constructors and
     * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
     * methods is {@link org.j8unit.repository.javax.swing.RowFilterTests.ComparisonTypeTests}.
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
     * @see org.j8unit.repository.javax.swing.RowFilterTests.ComparisonTypeTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface ComparisonTypeClassTests<SUT extends Class<? extends javax.swing.RowFilter.ComparisonType>>
    extends org.j8unit.repository.java.lang.EnumClassTests<SUT,javax.swing.RowFilter.ComparisonType>
    {

        @Test
        public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
            // create new instance
            Class<? extends javax.swing.RowFilter.ComparisonType> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.RowFilter.ComparisonType.class.isAssignableFrom(sut));
        }

        /**
         * <p>
         * Test method for {@link javax.swing.RowFilter.ComparisonType#valueOf(java.lang.String) public static javax.swing.RowFilter$ComparisonType javax.swing.RowFilter$ComparisonType.valueOf(java.lang.String)}.
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
         * Test method for {@link javax.swing.RowFilter.ComparisonType#values() public static javax.swing.RowFilter$ComparisonType[] javax.swing.RowFilter$ComparisonType.values()}.
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

    /**
     * <p>
     * Test class for {@link javax.swing.RowFilter$Entry class javax.swing.RowFilter$Entry},
     * containing all class relevant test methods (at least the test methods of accessible constructors and
     * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
     * methods is {@link org.j8unit.repository.javax.swing.RowFilterTests.EntryTests}.
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
     * @see org.j8unit.repository.javax.swing.RowFilterTests.EntryTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface EntryClassTests<SUT extends Class<? extends javax.swing.RowFilter.Entry<M,I>>, M, I>
    extends org.j8unit.repository.java.lang.ObjectClassTests<SUT>
    {

        /**
         * Test method for {@link javax.swing.RowFilter.Entry#Entry() public javax.swing.RowFilter$Entry()}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_Entry() throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            javax.swing.RowFilter.Entry<M,I> sut = null; // = new Entry();
        }

        @Test
        public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
            // create new instance
            Class<? extends javax.swing.RowFilter.Entry<M,I>> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.RowFilter.Entry.class.isAssignableFrom(sut));
        }

    }

}