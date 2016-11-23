package org.j8unit.repository.java.rmi.server;

import java.rmi.server.SkeletonNotFoundException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link SkeletonNotFoundException} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.java.rmi.server.SkeletonNotFoundExceptionClassTests}).
 */

@RunWith(J8Unit4.class)
@SuppressWarnings("deprecation")
public class SkeletonNotFoundExceptionClassTest
implements SkeletonNotFoundExceptionClassTests<SkeletonNotFoundException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.rmi.server.SkeletonNotFoundException]

    @Override
    public Class<SkeletonNotFoundException> createNewSUT() {
        return SkeletonNotFoundException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.rmi.server.SkeletonNotFoundException#SkeletonNotFoundException(String) public
     * java.rmi.server.SkeletonNotFoundException(java.lang.String)}.
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
    public void create_SkeletonNotFoundException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final SkeletonNotFoundException sut = null; // = new SkeletonNotFoundException(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.rmi.server.SkeletonNotFoundException#SkeletonNotFoundException(String, Exception) public
     * java.rmi.server.SkeletonNotFoundException(java.lang.String,java.lang.Exception)}.
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
    public void create_SkeletonNotFoundException_String_Exception()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final SkeletonNotFoundException sut = null; // = new SkeletonNotFoundException(String, Exception);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.rmi.server.SkeletonNotFoundException]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.rmi.server.SkeletonNotFoundException]

}
