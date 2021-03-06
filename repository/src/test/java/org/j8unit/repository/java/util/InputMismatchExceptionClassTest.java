package org.j8unit.repository.java.util;

import java.util.InputMismatchException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link InputMismatchException} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.java.util.InputMismatchExceptionClassTests}).
 */
@RunWith(J8Unit4.class)
public class InputMismatchExceptionClassTest
implements InputMismatchExceptionClassTests<InputMismatchException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.InputMismatchException]

    @Override
    public Class<InputMismatchException> createNewSUT() {
        return InputMismatchException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.util.InputMismatchException#InputMismatchException() public java.util.InputMismatchException()}.
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
    public void create_InputMismatchException()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final InputMismatchException sut = new InputMismatchException();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.util.InputMismatchException#InputMismatchException(String) public
     * java.util.InputMismatchException(java.lang.String)}.
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
    public void create_InputMismatchException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final InputMismatchException sut = null; // = new InputMismatchException(String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.InputMismatchException]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.InputMismatchException]

}
