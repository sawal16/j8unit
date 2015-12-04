package org.j8unit.repository.javax.print.attribute.standard;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.print.attribute.standard.PageRanges class javax.print.attribute.standard.PageRanges},
 * containing all class relevant test methods (at least the test methods of accessible constructors and
 * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
 * methods is {@link org.j8unit.repository.javax.print.attribute.standard.PageRangesTests}.
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
 * @see org.j8unit.repository.javax.print.attribute.standard.PageRangesTests
 */
@Category(J8UnitRepository.class)
public abstract interface PageRangesClassTests<SUT extends Class<? extends javax.print.attribute.standard.PageRanges>>
extends org.j8unit.repository.javax.print.attribute.DocAttributeClassTests<SUT>,
        org.j8unit.repository.javax.print.attribute.PrintRequestAttributeClassTests<SUT>,
        org.j8unit.repository.javax.print.attribute.PrintJobAttributeClassTests<SUT>,
        org.j8unit.repository.javax.print.attribute.SetOfIntegerSyntaxClassTests<SUT>
{

    /**
     * Test method for {@link javax.print.attribute.standard.PageRanges#PageRanges(int,int) public javax.print.attribute.standard.PageRanges(int,int)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_PageRanges_int_int() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        javax.print.attribute.standard.PageRanges sut = null; // = new PageRanges(int,int);
    }

    /**
     * Test method for {@link javax.print.attribute.standard.PageRanges#PageRanges(int) public javax.print.attribute.standard.PageRanges(int)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_PageRanges_int() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        javax.print.attribute.standard.PageRanges sut = null; // = new PageRanges(int);
    }

    /**
     * Test method for {@link javax.print.attribute.standard.PageRanges#PageRanges(int[][]) public javax.print.attribute.standard.PageRanges(int[][])}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_PageRanges_intArrayArray() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        javax.print.attribute.standard.PageRanges sut = null; // = new PageRanges(int[][]);
    }

    /**
     * Test method for {@link javax.print.attribute.standard.PageRanges#PageRanges(java.lang.String) public javax.print.attribute.standard.PageRanges(java.lang.String)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_PageRanges_String() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        javax.print.attribute.standard.PageRanges sut = null; // = new PageRanges(java.lang.String);
    }

    @Test
    public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
        // create new instance
        Class<? extends javax.print.attribute.standard.PageRanges> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.print.attribute.standard.PageRanges.class.isAssignableFrom(sut));
    }

}