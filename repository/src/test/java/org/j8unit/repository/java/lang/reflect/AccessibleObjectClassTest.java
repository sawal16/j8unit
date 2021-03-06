package org.j8unit.repository.java.lang.reflect;

import java.lang.reflect.AccessibleObject;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link AccessibleObject} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.lang.reflect.AccessibleObjectClassTests}).
 */
@RunWith(J8Unit4.class)
public class AccessibleObjectClassTest
implements AccessibleObjectClassTests<AccessibleObject> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.reflect.AccessibleObject]

    @Override
    public Class<AccessibleObject> createNewSUT() {
        return AccessibleObject.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.lang.reflect.AccessibleObject#setAccessible(java.lang.reflect.AccessibleObject[], boolean) public
     * static void java.lang.reflect.AccessibleObject.setAccessible(java.lang.reflect.AccessibleObject[],boolean) throws
     * java.lang.SecurityException}.
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
    public void test_setAccessible_AccessibleObjectArray_boolean()
    throws Exception {
        // write some test for {@link
        // java.lang.reflect.AccessibleObject#setAccessible(java.lang.reflect.AccessibleObject[], boolean)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.reflect.AccessibleObject]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.reflect.AccessibleObject]

}
