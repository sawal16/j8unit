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
 * Test class for {@link javax.swing.plaf.metal.MetalBorders class javax.swing.plaf.metal.MetalBorders},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.swing.plaf.metal.MetalBordersClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface MetalBordersTests<SUT extends javax.swing.plaf.metal.MetalBorders>
extends org.j8unit.repository.java.lang.ObjectTests<SUT>
{

    /**
     * <p>
     * Test class for {@link javax.swing.plaf.metal.MetalBorders$ScrollPaneBorder class javax.swing.plaf.metal.MetalBorders$ScrollPaneBorder},
     * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
     * </p>
     *
     * @param SUT the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.javax.swing.plaf.metal.MetalBordersClassTests.ScrollPaneBorderClassTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface ScrollPaneBorderTests<SUT extends javax.swing.plaf.metal.MetalBorders.ScrollPaneBorder>
    extends org.j8unit.repository.javax.swing.plaf.UIResourceTests<SUT>,
            org.j8unit.repository.javax.swing.border.AbstractBorderTests<SUT>
    {

        /**
         * <p>
         * Test method for {@link javax.swing.plaf.metal.MetalBorders.ScrollPaneBorder#getBorderInsets(java.awt.Component,java.awt.Insets) public java.awt.Insets javax.swing.plaf.metal.MetalBorders$ScrollPaneBorder.getBorderInsets(java.awt.Component,java.awt.Insets)}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_getBorderInsets_Component_Insets() throws Exception {
            // query fresh subject-under-test
            SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.swing.plaf.metal.MetalBorders.ScrollPaneBorder#paintBorder(java.awt.Component,java.awt.Graphics,int,int,int,int) public void javax.swing.plaf.metal.MetalBorders$ScrollPaneBorder.paintBorder(java.awt.Component,java.awt.Graphics,int,int,int,int)}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_paintBorder_Component_Graphics_int_int_int_int() throws Exception {
            // query fresh subject-under-test
            SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Test class for {@link javax.swing.plaf.metal.MetalBorders$PaletteBorder class javax.swing.plaf.metal.MetalBorders$PaletteBorder},
     * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
     * </p>
     *
     * @param SUT the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.javax.swing.plaf.metal.MetalBordersClassTests.PaletteBorderClassTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface PaletteBorderTests<SUT extends javax.swing.plaf.metal.MetalBorders.PaletteBorder>
    extends org.j8unit.repository.javax.swing.plaf.UIResourceTests<SUT>,
            org.j8unit.repository.javax.swing.border.AbstractBorderTests<SUT>
    {

        /**
         * <p>
         * Test method for {@link javax.swing.plaf.metal.MetalBorders.PaletteBorder#paintBorder(java.awt.Component,java.awt.Graphics,int,int,int,int) public void javax.swing.plaf.metal.MetalBorders$PaletteBorder.paintBorder(java.awt.Component,java.awt.Graphics,int,int,int,int)}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_paintBorder_Component_Graphics_int_int_int_int() throws Exception {
            // query fresh subject-under-test
            SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.swing.plaf.metal.MetalBorders.PaletteBorder#getBorderInsets(java.awt.Component,java.awt.Insets) public java.awt.Insets javax.swing.plaf.metal.MetalBorders$PaletteBorder.getBorderInsets(java.awt.Component,java.awt.Insets)}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_getBorderInsets_Component_Insets() throws Exception {
            // query fresh subject-under-test
            SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Test class for {@link javax.swing.plaf.metal.MetalBorders$TextFieldBorder class javax.swing.plaf.metal.MetalBorders$TextFieldBorder},
     * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
     * </p>
     *
     * @param SUT the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.javax.swing.plaf.metal.MetalBordersClassTests.TextFieldBorderClassTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface TextFieldBorderTests<SUT extends javax.swing.plaf.metal.MetalBorders.TextFieldBorder>
    extends org.j8unit.repository.javax.swing.plaf.metal.MetalBordersTests.Flush3DBorderTests<SUT>
    {

        /**
         * <p>
         * Test method for {@link javax.swing.plaf.metal.MetalBorders.TextFieldBorder#paintBorder(java.awt.Component,java.awt.Graphics,int,int,int,int) public void javax.swing.plaf.metal.MetalBorders$TextFieldBorder.paintBorder(java.awt.Component,java.awt.Graphics,int,int,int,int)}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_paintBorder_Component_Graphics_int_int_int_int() throws Exception {
            // query fresh subject-under-test
            SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Test class for {@link javax.swing.plaf.metal.MetalBorders$ToggleButtonBorder class javax.swing.plaf.metal.MetalBorders$ToggleButtonBorder},
     * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
     * </p>
     *
     * @param SUT the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.javax.swing.plaf.metal.MetalBordersClassTests.ToggleButtonBorderClassTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface ToggleButtonBorderTests<SUT extends javax.swing.plaf.metal.MetalBorders.ToggleButtonBorder>
    extends org.j8unit.repository.javax.swing.plaf.metal.MetalBordersTests.ButtonBorderTests<SUT>
    {

        /**
         * <p>
         * Test method for {@link javax.swing.plaf.metal.MetalBorders.ToggleButtonBorder#paintBorder(java.awt.Component,java.awt.Graphics,int,int,int,int) public void javax.swing.plaf.metal.MetalBorders$ToggleButtonBorder.paintBorder(java.awt.Component,java.awt.Graphics,int,int,int,int)}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_paintBorder_Component_Graphics_int_int_int_int() throws Exception {
            // query fresh subject-under-test
            SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Test class for {@link javax.swing.plaf.metal.MetalBorders$MenuBarBorder class javax.swing.plaf.metal.MetalBorders$MenuBarBorder},
     * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
     * </p>
     *
     * @param SUT the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.javax.swing.plaf.metal.MetalBordersClassTests.MenuBarBorderClassTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface MenuBarBorderTests<SUT extends javax.swing.plaf.metal.MetalBorders.MenuBarBorder>
    extends org.j8unit.repository.javax.swing.plaf.UIResourceTests<SUT>,
            org.j8unit.repository.javax.swing.border.AbstractBorderTests<SUT>
    {

        /**
         * <p>
         * Test method for {@link javax.swing.plaf.metal.MetalBorders.MenuBarBorder#paintBorder(java.awt.Component,java.awt.Graphics,int,int,int,int) public void javax.swing.plaf.metal.MetalBorders$MenuBarBorder.paintBorder(java.awt.Component,java.awt.Graphics,int,int,int,int)}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_paintBorder_Component_Graphics_int_int_int_int() throws Exception {
            // query fresh subject-under-test
            SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.swing.plaf.metal.MetalBorders.MenuBarBorder#getBorderInsets(java.awt.Component,java.awt.Insets) public java.awt.Insets javax.swing.plaf.metal.MetalBorders$MenuBarBorder.getBorderInsets(java.awt.Component,java.awt.Insets)}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_getBorderInsets_Component_Insets() throws Exception {
            // query fresh subject-under-test
            SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Test class for {@link javax.swing.plaf.metal.MetalBorders$OptionDialogBorder class javax.swing.plaf.metal.MetalBorders$OptionDialogBorder},
     * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
     * </p>
     *
     * @param SUT the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.javax.swing.plaf.metal.MetalBordersClassTests.OptionDialogBorderClassTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface OptionDialogBorderTests<SUT extends javax.swing.plaf.metal.MetalBorders.OptionDialogBorder>
    extends org.j8unit.repository.javax.swing.plaf.UIResourceTests<SUT>,
            org.j8unit.repository.javax.swing.border.AbstractBorderTests<SUT>
    {

        /**
         * <p>
         * Test method for {@link javax.swing.plaf.metal.MetalBorders.OptionDialogBorder#getBorderInsets(java.awt.Component,java.awt.Insets) public java.awt.Insets javax.swing.plaf.metal.MetalBorders$OptionDialogBorder.getBorderInsets(java.awt.Component,java.awt.Insets)}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_getBorderInsets_Component_Insets() throws Exception {
            // query fresh subject-under-test
            SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.swing.plaf.metal.MetalBorders.OptionDialogBorder#paintBorder(java.awt.Component,java.awt.Graphics,int,int,int,int) public void javax.swing.plaf.metal.MetalBorders$OptionDialogBorder.paintBorder(java.awt.Component,java.awt.Graphics,int,int,int,int)}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_paintBorder_Component_Graphics_int_int_int_int() throws Exception {
            // query fresh subject-under-test
            SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Test class for {@link javax.swing.plaf.metal.MetalBorders$TableHeaderBorder class javax.swing.plaf.metal.MetalBorders$TableHeaderBorder},
     * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
     * </p>
     *
     * @param SUT the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.javax.swing.plaf.metal.MetalBordersClassTests.TableHeaderBorderClassTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface TableHeaderBorderTests<SUT extends javax.swing.plaf.metal.MetalBorders.TableHeaderBorder>
    extends org.j8unit.repository.javax.swing.border.AbstractBorderTests<SUT>
    {

        /**
         * <p>
         * Test method for {@link javax.swing.plaf.metal.MetalBorders.TableHeaderBorder#getBorderInsets(java.awt.Component,java.awt.Insets) public java.awt.Insets javax.swing.plaf.metal.MetalBorders$TableHeaderBorder.getBorderInsets(java.awt.Component,java.awt.Insets)}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_getBorderInsets_Component_Insets() throws Exception {
            // query fresh subject-under-test
            SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.swing.plaf.metal.MetalBorders.TableHeaderBorder#paintBorder(java.awt.Component,java.awt.Graphics,int,int,int,int) public void javax.swing.plaf.metal.MetalBorders$TableHeaderBorder.paintBorder(java.awt.Component,java.awt.Graphics,int,int,int,int)}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_paintBorder_Component_Graphics_int_int_int_int() throws Exception {
            // query fresh subject-under-test
            SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Test class for {@link javax.swing.plaf.metal.MetalBorders$ButtonBorder class javax.swing.plaf.metal.MetalBorders$ButtonBorder},
     * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
     * </p>
     *
     * @param SUT the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.javax.swing.plaf.metal.MetalBordersClassTests.ButtonBorderClassTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface ButtonBorderTests<SUT extends javax.swing.plaf.metal.MetalBorders.ButtonBorder>
    extends org.j8unit.repository.javax.swing.plaf.UIResourceTests<SUT>,
            org.j8unit.repository.javax.swing.border.AbstractBorderTests<SUT>
    {

        /**
         * <p>
         * Test method for {@link javax.swing.plaf.metal.MetalBorders.ButtonBorder#getBorderInsets(java.awt.Component,java.awt.Insets) public java.awt.Insets javax.swing.plaf.metal.MetalBorders$ButtonBorder.getBorderInsets(java.awt.Component,java.awt.Insets)}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_getBorderInsets_Component_Insets() throws Exception {
            // query fresh subject-under-test
            SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.swing.plaf.metal.MetalBorders.ButtonBorder#paintBorder(java.awt.Component,java.awt.Graphics,int,int,int,int) public void javax.swing.plaf.metal.MetalBorders$ButtonBorder.paintBorder(java.awt.Component,java.awt.Graphics,int,int,int,int)}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_paintBorder_Component_Graphics_int_int_int_int() throws Exception {
            // query fresh subject-under-test
            SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Test class for {@link javax.swing.plaf.metal.MetalBorders$Flush3DBorder class javax.swing.plaf.metal.MetalBorders$Flush3DBorder},
     * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
     * </p>
     *
     * @param SUT the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.javax.swing.plaf.metal.MetalBordersClassTests.Flush3DBorderClassTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface Flush3DBorderTests<SUT extends javax.swing.plaf.metal.MetalBorders.Flush3DBorder>
    extends org.j8unit.repository.javax.swing.plaf.UIResourceTests<SUT>,
            org.j8unit.repository.javax.swing.border.AbstractBorderTests<SUT>
    {

        /**
         * <p>
         * Test method for {@link javax.swing.plaf.metal.MetalBorders.Flush3DBorder#paintBorder(java.awt.Component,java.awt.Graphics,int,int,int,int) public void javax.swing.plaf.metal.MetalBorders$Flush3DBorder.paintBorder(java.awt.Component,java.awt.Graphics,int,int,int,int)}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_paintBorder_Component_Graphics_int_int_int_int() throws Exception {
            // query fresh subject-under-test
            SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.swing.plaf.metal.MetalBorders.Flush3DBorder#getBorderInsets(java.awt.Component,java.awt.Insets) public java.awt.Insets javax.swing.plaf.metal.MetalBorders$Flush3DBorder.getBorderInsets(java.awt.Component,java.awt.Insets)}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_getBorderInsets_Component_Insets() throws Exception {
            // query fresh subject-under-test
            SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Test class for {@link javax.swing.plaf.metal.MetalBorders$RolloverButtonBorder class javax.swing.plaf.metal.MetalBorders$RolloverButtonBorder},
     * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
     * </p>
     *
     * @param SUT the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.javax.swing.plaf.metal.MetalBordersClassTests.RolloverButtonBorderClassTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface RolloverButtonBorderTests<SUT extends javax.swing.plaf.metal.MetalBorders.RolloverButtonBorder>
    extends org.j8unit.repository.javax.swing.plaf.metal.MetalBordersTests.ButtonBorderTests<SUT>
    {

        /**
         * <p>
         * Test method for {@link javax.swing.plaf.metal.MetalBorders.RolloverButtonBorder#paintBorder(java.awt.Component,java.awt.Graphics,int,int,int,int) public void javax.swing.plaf.metal.MetalBorders$RolloverButtonBorder.paintBorder(java.awt.Component,java.awt.Graphics,int,int,int,int)}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_paintBorder_Component_Graphics_int_int_int_int() throws Exception {
            // query fresh subject-under-test
            SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Test class for {@link javax.swing.plaf.metal.MetalBorders$InternalFrameBorder class javax.swing.plaf.metal.MetalBorders$InternalFrameBorder},
     * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
     * </p>
     *
     * @param SUT the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.javax.swing.plaf.metal.MetalBordersClassTests.InternalFrameBorderClassTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface InternalFrameBorderTests<SUT extends javax.swing.plaf.metal.MetalBorders.InternalFrameBorder>
    extends org.j8unit.repository.javax.swing.plaf.UIResourceTests<SUT>,
            org.j8unit.repository.javax.swing.border.AbstractBorderTests<SUT>
    {

        /**
         * <p>
         * Test method for {@link javax.swing.plaf.metal.MetalBorders.InternalFrameBorder#paintBorder(java.awt.Component,java.awt.Graphics,int,int,int,int) public void javax.swing.plaf.metal.MetalBorders$InternalFrameBorder.paintBorder(java.awt.Component,java.awt.Graphics,int,int,int,int)}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_paintBorder_Component_Graphics_int_int_int_int() throws Exception {
            // query fresh subject-under-test
            SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.swing.plaf.metal.MetalBorders.InternalFrameBorder#getBorderInsets(java.awt.Component,java.awt.Insets) public java.awt.Insets javax.swing.plaf.metal.MetalBorders$InternalFrameBorder.getBorderInsets(java.awt.Component,java.awt.Insets)}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_getBorderInsets_Component_Insets() throws Exception {
            // query fresh subject-under-test
            SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Test class for {@link javax.swing.plaf.metal.MetalBorders$PopupMenuBorder class javax.swing.plaf.metal.MetalBorders$PopupMenuBorder},
     * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
     * </p>
     *
     * @param SUT the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.javax.swing.plaf.metal.MetalBordersClassTests.PopupMenuBorderClassTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface PopupMenuBorderTests<SUT extends javax.swing.plaf.metal.MetalBorders.PopupMenuBorder>
    extends org.j8unit.repository.javax.swing.plaf.UIResourceTests<SUT>,
            org.j8unit.repository.javax.swing.border.AbstractBorderTests<SUT>
    {

        /**
         * <p>
         * Test method for {@link javax.swing.plaf.metal.MetalBorders.PopupMenuBorder#getBorderInsets(java.awt.Component,java.awt.Insets) public java.awt.Insets javax.swing.plaf.metal.MetalBorders$PopupMenuBorder.getBorderInsets(java.awt.Component,java.awt.Insets)}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_getBorderInsets_Component_Insets() throws Exception {
            // query fresh subject-under-test
            SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.swing.plaf.metal.MetalBorders.PopupMenuBorder#paintBorder(java.awt.Component,java.awt.Graphics,int,int,int,int) public void javax.swing.plaf.metal.MetalBorders$PopupMenuBorder.paintBorder(java.awt.Component,java.awt.Graphics,int,int,int,int)}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_paintBorder_Component_Graphics_int_int_int_int() throws Exception {
            // query fresh subject-under-test
            SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Test class for {@link javax.swing.plaf.metal.MetalBorders$ToolBarBorder class javax.swing.plaf.metal.MetalBorders$ToolBarBorder},
     * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
     * </p>
     *
     * @param SUT the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.javax.swing.plaf.metal.MetalBordersClassTests.ToolBarBorderClassTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface ToolBarBorderTests<SUT extends javax.swing.plaf.metal.MetalBorders.ToolBarBorder>
    extends org.j8unit.repository.javax.swing.plaf.UIResourceTests<SUT>,
            org.j8unit.repository.javax.swing.SwingConstantsTests<SUT>,
            org.j8unit.repository.javax.swing.border.AbstractBorderTests<SUT>
    {

        /**
         * <p>
         * Test method for {@link javax.swing.plaf.metal.MetalBorders.ToolBarBorder#getBorderInsets(java.awt.Component,java.awt.Insets) public java.awt.Insets javax.swing.plaf.metal.MetalBorders$ToolBarBorder.getBorderInsets(java.awt.Component,java.awt.Insets)}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_getBorderInsets_Component_Insets() throws Exception {
            // query fresh subject-under-test
            SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.swing.plaf.metal.MetalBorders.ToolBarBorder#paintBorder(java.awt.Component,java.awt.Graphics,int,int,int,int) public void javax.swing.plaf.metal.MetalBorders$ToolBarBorder.paintBorder(java.awt.Component,java.awt.Graphics,int,int,int,int)}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_paintBorder_Component_Graphics_int_int_int_int() throws Exception {
            // query fresh subject-under-test
            SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Test class for {@link javax.swing.plaf.metal.MetalBorders$MenuItemBorder class javax.swing.plaf.metal.MetalBorders$MenuItemBorder},
     * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
     * </p>
     *
     * @param SUT the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.javax.swing.plaf.metal.MetalBordersClassTests.MenuItemBorderClassTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface MenuItemBorderTests<SUT extends javax.swing.plaf.metal.MetalBorders.MenuItemBorder>
    extends org.j8unit.repository.javax.swing.plaf.UIResourceTests<SUT>,
            org.j8unit.repository.javax.swing.border.AbstractBorderTests<SUT>
    {

        /**
         * <p>
         * Test method for {@link javax.swing.plaf.metal.MetalBorders.MenuItemBorder#paintBorder(java.awt.Component,java.awt.Graphics,int,int,int,int) public void javax.swing.plaf.metal.MetalBorders$MenuItemBorder.paintBorder(java.awt.Component,java.awt.Graphics,int,int,int,int)}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_paintBorder_Component_Graphics_int_int_int_int() throws Exception {
            // query fresh subject-under-test
            SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.swing.plaf.metal.MetalBorders.MenuItemBorder#getBorderInsets(java.awt.Component,java.awt.Insets) public java.awt.Insets javax.swing.plaf.metal.MetalBorders$MenuItemBorder.getBorderInsets(java.awt.Component,java.awt.Insets)}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_getBorderInsets_Component_Insets() throws Exception {
            // query fresh subject-under-test
            SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

}