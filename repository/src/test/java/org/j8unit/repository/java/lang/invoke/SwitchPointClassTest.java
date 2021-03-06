package org.j8unit.repository.java.lang.invoke;

import java.lang.invoke.SwitchPoint;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link SwitchPoint} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.lang.invoke.SwitchPointClassTests}).
 */
@RunWith(J8Unit4.class)
public class SwitchPointClassTest
implements SwitchPointClassTests<SwitchPoint> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.invoke.SwitchPoint]

    @Override
    public Class<SwitchPoint> createNewSUT() {
        return SwitchPoint.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.lang.invoke.SwitchPoint#SwitchPoint()
     * public java.lang.invoke.SwitchPoint()}.
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
    public void create_SwitchPoint()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final SwitchPoint sut = new SwitchPoint();
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.lang.invoke.SwitchPoint#invalidateAll(java.lang.invoke.SwitchPoint[]) public static void
     * java.lang.invoke.SwitchPoint.invalidateAll(java.lang.invoke.SwitchPoint[])}.
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
    public void test_invalidateAll_SwitchPointArray()
    throws Exception {
        // write some test for {@link java.lang.invoke.SwitchPoint#invalidateAll(java.lang.invoke.SwitchPoint[])}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.invoke.SwitchPoint]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.invoke.SwitchPoint]

}
