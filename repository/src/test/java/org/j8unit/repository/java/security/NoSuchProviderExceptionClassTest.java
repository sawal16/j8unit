package org.j8unit.repository.java.security;

import java.security.NoSuchProviderException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link NoSuchProviderException} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.java.security.NoSuchProviderExceptionClassTests}).
 */
@RunWith(J8Unit4.class)
public class NoSuchProviderExceptionClassTest
implements NoSuchProviderExceptionClassTests<NoSuchProviderException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.NoSuchProviderException]

    @Override
    public Class<NoSuchProviderException> createNewSUT() {
        return NoSuchProviderException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.security.NoSuchProviderException#NoSuchProviderException() public
     * java.security.NoSuchProviderException()}.
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
    public void create_NoSuchProviderException()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final NoSuchProviderException sut = new NoSuchProviderException();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.security.NoSuchProviderException#NoSuchProviderException(String) public
     * java.security.NoSuchProviderException(java.lang.String)}.
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
    public void create_NoSuchProviderException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final NoSuchProviderException sut = null; // = new NoSuchProviderException(String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.security.NoSuchProviderException]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.NoSuchProviderException]

}
