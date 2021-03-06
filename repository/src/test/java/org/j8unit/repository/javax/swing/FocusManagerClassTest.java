package org.j8unit.repository.javax.swing;

import static org.junit.Assert.fail;
import javax.swing.FocusManager;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link FocusManager} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.swing.FocusManagerClassTests}).
 */
@RunWith(J8Unit4.class)
public class FocusManagerClassTest
implements FocusManagerClassTests<FocusManager> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.FocusManager]

    @Override
    public Class<FocusManager> createNewSUT() {
        return FocusManager.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link javax.swing.FocusManager#FocusManager() public
     * javax.swing.FocusManager()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("Cannot construct an abstract class!")
    @Test
    @Category(Draft.class)
    public void create_FocusManager()
    throws Exception {
        fail("Cannot construct an abstract class!");
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.swing.FocusManager#setCurrentManager(javax.swing.FocusManager) public static void
     * javax.swing.FocusManager.setCurrentManager(javax.swing.FocusManager) throws java.lang.SecurityException}.
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
    public void test_setCurrentManager_FocusManager()
    throws Exception {
        // write some test for {@link javax.swing.FocusManager#setCurrentManager(javax.swing.FocusManager)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link javax.swing.FocusManager#isFocusManagerEnabled()
     * public static boolean javax.swing.FocusManager.isFocusManagerEnabled()}.
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
    public void test_isFocusManagerEnabled()
    throws Exception {
        // write some test for {@link javax.swing.FocusManager#isFocusManagerEnabled()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link javax.swing.FocusManager#getCurrentManager() public
     * static javax.swing.FocusManager javax.swing.FocusManager.getCurrentManager()}.
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
    public void test_getCurrentManager()
    throws Exception {
        // write some test for {@link javax.swing.FocusManager#getCurrentManager()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link javax.swing.FocusManager#disableSwingFocusManager()
     * public static void javax.swing.FocusManager.disableSwingFocusManager()}.
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
    public void test_disableSwingFocusManager()
    throws Exception {
        // write some test for {@link javax.swing.FocusManager#disableSwingFocusManager()}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.FocusManager]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.FocusManager]

}
