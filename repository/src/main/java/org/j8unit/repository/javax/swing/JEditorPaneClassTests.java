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
 * Test class for {@link javax.swing.JEditorPane class javax.swing.JEditorPane},
 * containing all class relevant test methods (at least the test methods of accessible constructors and
 * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
 * methods is {@link org.j8unit.repository.javax.swing.JEditorPaneTests}.
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
 * @see org.j8unit.repository.javax.swing.JEditorPaneTests
 */
@Category(J8UnitRepository.class)
public abstract interface JEditorPaneClassTests<SUT extends Class<? extends javax.swing.JEditorPane>>
extends org.j8unit.repository.javax.swing.text.JTextComponentClassTests<SUT>
{

    /**
     * Test method for {@link javax.swing.JEditorPane#JEditorPane(java.lang.String,java.lang.String) public javax.swing.JEditorPane(java.lang.String,java.lang.String)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JEditorPane_String_String() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        javax.swing.JEditorPane sut = null; // = new JEditorPane(java.lang.String,java.lang.String);
    }

    /**
     * Test method for {@link javax.swing.JEditorPane#JEditorPane(java.lang.String) public javax.swing.JEditorPane(java.lang.String) throws java.io.IOException}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JEditorPane_String() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        javax.swing.JEditorPane sut = null; // = new JEditorPane(java.lang.String);
    }

    /**
     * Test method for {@link javax.swing.JEditorPane#JEditorPane(java.net.URL) public javax.swing.JEditorPane(java.net.URL) throws java.io.IOException}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JEditorPane_URL() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        javax.swing.JEditorPane sut = null; // = new JEditorPane(java.net.URL);
    }

    /**
     * Test method for {@link javax.swing.JEditorPane#JEditorPane() public javax.swing.JEditorPane()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JEditorPane() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        javax.swing.JEditorPane sut = null; // = new JEditorPane();
    }

    @Test
    public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
        // create new instance
        Class<? extends javax.swing.JEditorPane> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.swing.JEditorPane.class.isAssignableFrom(sut));
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JEditorPane#createEditorKitForContentType(java.lang.String) public static javax.swing.text.EditorKit javax.swing.JEditorPane.createEditorKitForContentType(java.lang.String)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createEditorKitForContentType_String() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JEditorPane#registerEditorKitForContentType(java.lang.String,java.lang.String,java.lang.ClassLoader) public static void javax.swing.JEditorPane.registerEditorKitForContentType(java.lang.String,java.lang.String,java.lang.ClassLoader)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_registerEditorKitForContentType_String_String_ClassLoader() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JEditorPane#registerEditorKitForContentType(java.lang.String,java.lang.String) public static void javax.swing.JEditorPane.registerEditorKitForContentType(java.lang.String,java.lang.String)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_registerEditorKitForContentType_String_String() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JEditorPane#getEditorKitClassNameForContentType(java.lang.String) public static java.lang.String javax.swing.JEditorPane.getEditorKitClassNameForContentType(java.lang.String)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getEditorKitClassNameForContentType_String() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}