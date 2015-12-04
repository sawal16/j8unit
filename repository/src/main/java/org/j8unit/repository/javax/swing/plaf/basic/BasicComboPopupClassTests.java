package org.j8unit.repository.javax.swing.plaf.basic;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.swing.plaf.basic.BasicComboPopup class javax.swing.plaf.basic.BasicComboPopup},
 * containing all class relevant test methods (at least the test methods of accessible constructors and
 * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
 * methods is {@link org.j8unit.repository.javax.swing.plaf.basic.BasicComboPopupTests}.
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
 * @see org.j8unit.repository.javax.swing.plaf.basic.BasicComboPopupTests
 */
@Category(J8UnitRepository.class)
public abstract interface BasicComboPopupClassTests<SUT extends Class<? extends javax.swing.plaf.basic.BasicComboPopup>>
extends org.j8unit.repository.javax.swing.plaf.basic.ComboPopupClassTests<SUT>,
        org.j8unit.repository.javax.swing.JPopupMenuClassTests<SUT>
{

    /**
     * Test method for {@link javax.swing.plaf.basic.BasicComboPopup#BasicComboPopup(javax.swing.JComboBox) public javax.swing.plaf.basic.BasicComboPopup(javax.swing.JComboBox)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_BasicComboPopup_JComboBox() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        javax.swing.plaf.basic.BasicComboPopup sut = null; // = new BasicComboPopup(javax.swing.JComboBox);
    }

    @Test
    public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
        // create new instance
        Class<? extends javax.swing.plaf.basic.BasicComboPopup> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.swing.plaf.basic.BasicComboPopup.class.isAssignableFrom(sut));
    }

    /**
     * <p>
     * Test class for {@link javax.swing.plaf.basic.BasicComboPopup$ListDataHandler class javax.swing.plaf.basic.BasicComboPopup$ListDataHandler},
     * containing all class relevant test methods (at least the test methods of accessible constructors and
     * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
     * methods is {@link org.j8unit.repository.javax.swing.plaf.basic.BasicComboPopupTests.ListDataHandlerTests}.
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
     * @see org.j8unit.repository.javax.swing.plaf.basic.BasicComboPopupTests.ListDataHandlerTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface ListDataHandlerClassTests<SUT extends Class<? extends javax.swing.plaf.basic.BasicComboPopup.ListDataHandler>>
    extends org.j8unit.repository.javax.swing.event.ListDataListenerClassTests<SUT>,
            org.j8unit.repository.java.lang.ObjectClassTests<SUT>
    {

        /**
         * Test method for {@link javax.swing.plaf.basic.BasicComboPopup.ListDataHandler#ListDataHandler(javax.swing.plaf.basic.BasicComboPopup) public javax.swing.plaf.basic.BasicComboPopup$ListDataHandler(javax.swing.plaf.basic.BasicComboPopup)}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_ListDataHandler_BasicComboPopup() throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            javax.swing.plaf.basic.BasicComboPopup.ListDataHandler sut = null; // = new ListDataHandler(javax.swing.plaf.basic.BasicComboPopup);
        }

        @Test
        public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
            // create new instance
            Class<? extends javax.swing.plaf.basic.BasicComboPopup.ListDataHandler> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.plaf.basic.BasicComboPopup.ListDataHandler.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link javax.swing.plaf.basic.BasicComboPopup$InvocationKeyHandler class javax.swing.plaf.basic.BasicComboPopup$InvocationKeyHandler},
     * containing all class relevant test methods (at least the test methods of accessible constructors and
     * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
     * methods is {@link org.j8unit.repository.javax.swing.plaf.basic.BasicComboPopupTests.InvocationKeyHandlerTests}.
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
     * @see org.j8unit.repository.javax.swing.plaf.basic.BasicComboPopupTests.InvocationKeyHandlerTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface InvocationKeyHandlerClassTests<SUT extends Class<? extends javax.swing.plaf.basic.BasicComboPopup.InvocationKeyHandler>>
    extends org.j8unit.repository.java.awt.event.KeyAdapterClassTests<SUT>
    {

        /**
         * Test method for {@link javax.swing.plaf.basic.BasicComboPopup.InvocationKeyHandler#InvocationKeyHandler(javax.swing.plaf.basic.BasicComboPopup) public javax.swing.plaf.basic.BasicComboPopup$InvocationKeyHandler(javax.swing.plaf.basic.BasicComboPopup)}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_InvocationKeyHandler_BasicComboPopup() throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            javax.swing.plaf.basic.BasicComboPopup.InvocationKeyHandler sut = null; // = new InvocationKeyHandler(javax.swing.plaf.basic.BasicComboPopup);
        }

        @Test
        public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
            // create new instance
            Class<? extends javax.swing.plaf.basic.BasicComboPopup.InvocationKeyHandler> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.plaf.basic.BasicComboPopup.InvocationKeyHandler.class.isAssignableFrom(sut));
        }

    }

}