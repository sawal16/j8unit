package org.j8unit.repository.javax.swing.plaf.metal;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.swing.plaf.metal.MetalFileChooserUI class javax.swing.plaf.metal.MetalFileChooserUI},
 * containing all class relevant test methods (at least the test methods of accessible constructors and
 * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
 * methods is {@link org.j8unit.repository.javax.swing.plaf.metal.MetalFileChooserUITests}.
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
 * @see org.j8unit.repository.javax.swing.plaf.metal.MetalFileChooserUITests
 */
@Category(J8UnitRepository.class)
public abstract interface MetalFileChooserUIClassTests<SUT extends Class<? extends javax.swing.plaf.metal.MetalFileChooserUI>>
extends org.j8unit.repository.javax.swing.plaf.basic.BasicFileChooserUIClassTests<SUT>
{

    /**
     * Test method for {@link javax.swing.plaf.metal.MetalFileChooserUI#MetalFileChooserUI(javax.swing.JFileChooser) public javax.swing.plaf.metal.MetalFileChooserUI(javax.swing.JFileChooser)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_MetalFileChooserUI_JFileChooser() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        javax.swing.plaf.metal.MetalFileChooserUI sut = null; // = new MetalFileChooserUI(javax.swing.JFileChooser);
    }

    @Test
    public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
        // create new instance
        Class<? extends javax.swing.plaf.metal.MetalFileChooserUI> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.swing.plaf.metal.MetalFileChooserUI.class.isAssignableFrom(sut));
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.metal.MetalFileChooserUI#createUI(javax.swing.JComponent) public static javax.swing.plaf.ComponentUI javax.swing.plaf.metal.MetalFileChooserUI.createUI(javax.swing.JComponent)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_createUI_JComponent() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test class for {@link javax.swing.plaf.metal.MetalFileChooserUI$FilterComboBoxRenderer class javax.swing.plaf.metal.MetalFileChooserUI$FilterComboBoxRenderer},
     * containing all class relevant test methods (at least the test methods of accessible constructors and
     * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
     * methods is {@link org.j8unit.repository.javax.swing.plaf.metal.MetalFileChooserUITests.FilterComboBoxRendererTests}.
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
     * @see org.j8unit.repository.javax.swing.plaf.metal.MetalFileChooserUITests.FilterComboBoxRendererTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface FilterComboBoxRendererClassTests<SUT extends Class<? extends javax.swing.plaf.metal.MetalFileChooserUI.FilterComboBoxRenderer>>
    extends org.j8unit.repository.javax.swing.DefaultListCellRendererClassTests<SUT>
    {

        /**
         * Test method for {@link javax.swing.plaf.metal.MetalFileChooserUI.FilterComboBoxRenderer#FilterComboBoxRenderer(javax.swing.plaf.metal.MetalFileChooserUI) public javax.swing.plaf.metal.MetalFileChooserUI$FilterComboBoxRenderer(javax.swing.plaf.metal.MetalFileChooserUI)}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_FilterComboBoxRenderer_MetalFileChooserUI() throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            javax.swing.plaf.metal.MetalFileChooserUI.FilterComboBoxRenderer sut = null; // = new FilterComboBoxRenderer(javax.swing.plaf.metal.MetalFileChooserUI);
        }

        @Test
        public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
            // create new instance
            Class<? extends javax.swing.plaf.metal.MetalFileChooserUI.FilterComboBoxRenderer> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.plaf.metal.MetalFileChooserUI.FilterComboBoxRenderer.class.isAssignableFrom(sut));
        }

    }

}