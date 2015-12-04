package org.j8unit.repository.javax.crypto.spec;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.crypto.spec.DESKeySpec class javax.crypto.spec.DESKeySpec},
 * containing all class relevant test methods (at least the test methods of accessible constructors and
 * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
 * methods is {@link org.j8unit.repository.javax.crypto.spec.DESKeySpecTests}.
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
 * @see org.j8unit.repository.javax.crypto.spec.DESKeySpecTests
 */
@Category(J8UnitRepository.class)
public abstract interface DESKeySpecClassTests<SUT extends Class<? extends javax.crypto.spec.DESKeySpec>>
extends org.j8unit.repository.java.security.spec.KeySpecClassTests<SUT>,
        org.j8unit.repository.java.lang.ObjectClassTests<SUT>
{

    /**
     * Test method for {@link javax.crypto.spec.DESKeySpec#DESKeySpec(byte[]) public javax.crypto.spec.DESKeySpec(byte[]) throws java.security.InvalidKeyException}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_DESKeySpec_byteArray() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        javax.crypto.spec.DESKeySpec sut = null; // = new DESKeySpec(byte[]);
    }

    /**
     * Test method for {@link javax.crypto.spec.DESKeySpec#DESKeySpec(byte[],int) public javax.crypto.spec.DESKeySpec(byte[],int) throws java.security.InvalidKeyException}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_DESKeySpec_byteArray_int() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        javax.crypto.spec.DESKeySpec sut = null; // = new DESKeySpec(byte[],int);
    }

    @Test
    public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
        // create new instance
        Class<? extends javax.crypto.spec.DESKeySpec> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.crypto.spec.DESKeySpec.class.isAssignableFrom(sut));
    }

    /**
     * <p>
     * Test method for {@link javax.crypto.spec.DESKeySpec#isParityAdjusted(byte[],int) public static boolean javax.crypto.spec.DESKeySpec.isParityAdjusted(byte[],int) throws java.security.InvalidKeyException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isParityAdjusted_byteArray_int() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.crypto.spec.DESKeySpec#isWeak(byte[],int) public static boolean javax.crypto.spec.DESKeySpec.isWeak(byte[],int) throws java.security.InvalidKeyException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isWeak_byteArray_int() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}