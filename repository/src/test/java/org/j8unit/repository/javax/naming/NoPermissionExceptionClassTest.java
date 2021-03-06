package org.j8unit.repository.javax.naming;

import javax.naming.NoPermissionException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link NoPermissionException} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.naming.NoPermissionExceptionClassTests}).
 */
@RunWith(J8Unit4.class)
public class NoPermissionExceptionClassTest
implements NoPermissionExceptionClassTests<NoPermissionException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.naming.NoPermissionException]

    @Override
    public Class<NoPermissionException> createNewSUT() {
        return NoPermissionException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.naming.NoPermissionException#NoPermissionException(String) public
     * javax.naming.NoPermissionException(java.lang.String)}.
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
    public void create_NoPermissionException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final NoPermissionException sut = null; // = new NoPermissionException(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.naming.NoPermissionException#NoPermissionException() public javax.naming.NoPermissionException()}.
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
    public void create_NoPermissionException()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final NoPermissionException sut = new NoPermissionException();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.naming.NoPermissionException]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.naming.NoPermissionException]

}
