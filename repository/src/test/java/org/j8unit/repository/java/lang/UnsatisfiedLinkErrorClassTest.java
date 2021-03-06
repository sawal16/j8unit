package org.j8unit.repository.java.lang;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link UnsatisfiedLinkError} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.lang.UnsatisfiedLinkErrorClassTests}).
 */
@RunWith(J8Unit4.class)
public class UnsatisfiedLinkErrorClassTest
implements UnsatisfiedLinkErrorClassTests<UnsatisfiedLinkError> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.UnsatisfiedLinkError]

    @Override
    public Class<UnsatisfiedLinkError> createNewSUT() {
        return UnsatisfiedLinkError.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link UnsatisfiedLinkError#UnsatisfiedLinkError()
     * public java.lang.UnsatisfiedLinkError()}.
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
    public void create_UnsatisfiedLinkError()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final UnsatisfiedLinkError sut = new UnsatisfiedLinkError();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link UnsatisfiedLinkError#UnsatisfiedLinkError(String) public
     * java.lang.UnsatisfiedLinkError(java.lang.String)}.
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
    public void create_UnsatisfiedLinkError_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final UnsatisfiedLinkError sut = null; // = new UnsatisfiedLinkError(String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.UnsatisfiedLinkError]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.UnsatisfiedLinkError]

}
