package org.j8unit.repository.javax.swing.plaf.multi;

import javax.swing.plaf.multi.MultiOptionPaneUI;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link MultiOptionPaneUI} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.swing.plaf.multi.MultiOptionPaneUIClassTests}).
 */
@RunWith(J8Unit4.class)
public class MultiOptionPaneUIClassTest
implements MultiOptionPaneUIClassTests<MultiOptionPaneUI> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.plaf.multi.MultiOptionPaneUI]

    @Override
    public Class<MultiOptionPaneUI> createNewSUT() {
        return MultiOptionPaneUI.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.plaf.multi.MultiOptionPaneUI#MultiOptionPaneUI() public
     * javax.swing.plaf.multi.MultiOptionPaneUI()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_MultiOptionPaneUI()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final MultiOptionPaneUI sut = new MultiOptionPaneUI();
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.swing.plaf.multi.MultiOptionPaneUI#createUI(javax.swing.JComponent) public static
     * javax.swing.plaf.ComponentUI javax.swing.plaf.multi.MultiOptionPaneUI.createUI(javax.swing.JComponent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_createUI_JComponent()
    throws Exception {
        // write some test for {@link javax.swing.plaf.multi.MultiOptionPaneUI#createUI(javax.swing.JComponent)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.plaf.multi.MultiOptionPaneUI]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.plaf.multi.MultiOptionPaneUI]

}
