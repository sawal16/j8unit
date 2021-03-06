package org.j8unit.repository.java.awt;

import java.awt.GraphicsEnvironment;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link GraphicsEnvironment} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.awt.GraphicsEnvironmentClassTests}).
 */
@RunWith(J8Unit4.class)
public class GraphicsEnvironmentClassTest
implements GraphicsEnvironmentClassTests<GraphicsEnvironment> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.GraphicsEnvironment]

    @Override
    public Class<GraphicsEnvironment> createNewSUT() {
        return GraphicsEnvironment.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.awt.GraphicsEnvironment#getLocalGraphicsEnvironment() public static synchronized
     * java.awt.GraphicsEnvironment java.awt.GraphicsEnvironment.getLocalGraphicsEnvironment()}.
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
    public void test_getLocalGraphicsEnvironment()
    throws Exception {
        // write some test for {@link java.awt.GraphicsEnvironment#getLocalGraphicsEnvironment()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.awt.GraphicsEnvironment#isHeadless() public
     * static boolean java.awt.GraphicsEnvironment.isHeadless()}.
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
    public void test_isHeadless()
    throws Exception {
        // write some test for {@link java.awt.GraphicsEnvironment#isHeadless()}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.GraphicsEnvironment]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.GraphicsEnvironment]

}
