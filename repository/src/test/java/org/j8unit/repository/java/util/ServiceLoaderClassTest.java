package org.j8unit.repository.java.util;

import java.util.ServiceLoader;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ServiceLoader} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.util.ServiceLoaderClassTests}).
 */
@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class ServiceLoaderClassTest
implements ServiceLoaderClassTests<ServiceLoader> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.ServiceLoader]

    @Override
    public Class<ServiceLoader> createNewSUT() {
        return ServiceLoader.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.util.ServiceLoader#loadInstalled(Class) public
     * static <S> java.util.ServiceLoader<S> java.util.ServiceLoader.loadInstalled(java.lang.Class<S>)}.
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
    public void test_loadInstalled_Class()
    throws Exception {
        // write some test for {@link java.util.ServiceLoader#loadInstalled(Class)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.util.ServiceLoader#load(Class) public static
     * <S> java.util.ServiceLoader<S> java.util.ServiceLoader.load(java.lang.Class<S>)}.
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
    public void test_load_Class()
    throws Exception {
        // write some test for {@link java.util.ServiceLoader#load(Class)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.util.ServiceLoader#load(Class, ClassLoader)
     * public static <S> java.util.ServiceLoader<S>
     * java.util.ServiceLoader.load(java.lang.Class<S>,java.lang.ClassLoader)}.
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
    public void test_load_Class_ClassLoader()
    throws Exception {
        // write some test for {@link java.util.ServiceLoader#load(Class, ClassLoader)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.ServiceLoader]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.ServiceLoader]

}
