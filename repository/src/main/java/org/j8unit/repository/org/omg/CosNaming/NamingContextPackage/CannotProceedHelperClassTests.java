package org.j8unit.repository.org.omg.CosNaming.NamingContextPackage;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link org.omg.CosNaming.NamingContextPackage.CannotProceedHelper class org.omg.CosNaming.NamingContextPackage.CannotProceedHelper},
 * containing all class relevant test methods (at least the test methods of accessible constructors and
 * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
 * methods is {@link org.j8unit.repository.org.omg.CosNaming.NamingContextPackage.CannotProceedHelperTests}.
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
 * @see org.j8unit.repository.org.omg.CosNaming.NamingContextPackage.CannotProceedHelperTests
 */
@Category(J8UnitRepository.class)
public abstract interface CannotProceedHelperClassTests<SUT extends Class<? extends org.omg.CosNaming.NamingContextPackage.CannotProceedHelper>>
extends org.j8unit.repository.java.lang.ObjectClassTests<SUT>
{

    /**
     * Test method for {@link org.omg.CosNaming.NamingContextPackage.CannotProceedHelper#CannotProceedHelper() public org.omg.CosNaming.NamingContextPackage.CannotProceedHelper()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_CannotProceedHelper() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        org.omg.CosNaming.NamingContextPackage.CannotProceedHelper sut = null; // = new CannotProceedHelper();
    }

    @Test
    public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
        // create new instance
        Class<? extends org.omg.CosNaming.NamingContextPackage.CannotProceedHelper> sut = createNewSUT();
        // assert assignability
        assertTrue(org.omg.CosNaming.NamingContextPackage.CannotProceedHelper.class.isAssignableFrom(sut));
    }

    /**
     * <p>
     * Test method for {@link org.omg.CosNaming.NamingContextPackage.CannotProceedHelper#read(org.omg.CORBA.portable.InputStream) public static org.omg.CosNaming.NamingContextPackage.CannotProceed org.omg.CosNaming.NamingContextPackage.CannotProceedHelper.read(org.omg.CORBA.portable.InputStream)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_read_InputStream() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.CosNaming.NamingContextPackage.CannotProceedHelper#extract(org.omg.CORBA.Any) public static org.omg.CosNaming.NamingContextPackage.CannotProceed org.omg.CosNaming.NamingContextPackage.CannotProceedHelper.extract(org.omg.CORBA.Any)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_extract_Any() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.CosNaming.NamingContextPackage.CannotProceedHelper#type() public static synchronized org.omg.CORBA.TypeCode org.omg.CosNaming.NamingContextPackage.CannotProceedHelper.type()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_type() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.CosNaming.NamingContextPackage.CannotProceedHelper#write(org.omg.CORBA.portable.OutputStream,org.omg.CosNaming.NamingContextPackage.CannotProceed) public static void org.omg.CosNaming.NamingContextPackage.CannotProceedHelper.write(org.omg.CORBA.portable.OutputStream,org.omg.CosNaming.NamingContextPackage.CannotProceed)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_write_OutputStream_CannotProceed() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.CosNaming.NamingContextPackage.CannotProceedHelper#id() public static java.lang.String org.omg.CosNaming.NamingContextPackage.CannotProceedHelper.id()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_id() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.CosNaming.NamingContextPackage.CannotProceedHelper#insert(org.omg.CORBA.Any,org.omg.CosNaming.NamingContextPackage.CannotProceed) public static void org.omg.CosNaming.NamingContextPackage.CannotProceedHelper.insert(org.omg.CORBA.Any,org.omg.CosNaming.NamingContextPackage.CannotProceed)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_insert_Any_CannotProceed() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}