package org.j8unit.repository.java.rmi;

import java.rmi.NotBoundException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link NotBoundException} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.rmi.NotBoundExceptionClassTests}).
 */

@RunWith(J8Unit4.class)
public class NotBoundExceptionClassTest
implements NotBoundExceptionClassTests<NotBoundException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.rmi.NotBoundException]

    @Override
    public Class<NotBoundException> createNewSUT() {
        return NotBoundException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.rmi.NotBoundException#NotBoundException()
     * public java.rmi.NotBoundException()}.
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
    public void create_NotBoundException()
    throws Exception {
        // create new instance
        final NotBoundException sut = new NotBoundException();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.rmi.NotBoundException#NotBoundException(String) public java.rmi.NotBoundException(java.lang.String)}.
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
    public void create_NotBoundException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final NotBoundException sut = null; // = new NotBoundException(String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.rmi.NotBoundException]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.rmi.NotBoundException]

}