package org.j8unit.repository.javax.lang.model.element;

import javax.lang.model.element.NestingKind;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link NestingKind} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.lang.model.element.NestingKindClassTests}).
 */
@RunWith(J8Unit4.class)
public class NestingKindClassTest
implements NestingKindClassTests<NestingKind> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.lang.model.element.NestingKind]

    @Override
    public Class<NestingKind> createNewSUT() {
        return NestingKind.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link javax.lang.model.element.NestingKind#valueOf(String)
     * public static javax.lang.model.element.NestingKind
     * javax.lang.model.element.NestingKind.valueOf(java.lang.String)}.
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
    public void test_valueOf_String()
    throws Exception {
        // write some test for {@link javax.lang.model.element.NestingKind#valueOf(String)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link javax.lang.model.element.NestingKind#values() public
     * static javax.lang.model.element.NestingKind[] javax.lang.model.element.NestingKind.values()}.
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
    public void test_values()
    throws Exception {
        // write some test for {@link javax.lang.model.element.NestingKind#values()}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.lang.model.element.NestingKind]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.lang.model.element.NestingKind]

}
