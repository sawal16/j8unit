package org.j8unit.repository.java.lang;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link IllegalMonitorStateException} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.java.lang.IllegalMonitorStateExceptionClassTests}).
 */

@RunWith(J8Unit4.class)
public class IllegalMonitorStateExceptionClassTest
implements IllegalMonitorStateExceptionClassTests<IllegalMonitorStateException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.IllegalMonitorStateException]

    @Override
    public Class<IllegalMonitorStateException> createNewSUT() {
        return IllegalMonitorStateException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link IllegalMonitorStateException#IllegalMonitorStateException() public
     * java.lang.IllegalMonitorStateException()}.
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
    public void create_IllegalMonitorStateException()
    throws Exception {
        // create new instance
        final IllegalMonitorStateException sut = new IllegalMonitorStateException();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link IllegalMonitorStateException#IllegalMonitorStateException(String) public
     * java.lang.IllegalMonitorStateException(java.lang.String)}.
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
    public void create_IllegalMonitorStateException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final IllegalMonitorStateException sut = null; // = new IllegalMonitorStateException(String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.IllegalMonitorStateException]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.IllegalMonitorStateException]

}