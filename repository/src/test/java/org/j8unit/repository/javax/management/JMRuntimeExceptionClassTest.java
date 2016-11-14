package org.j8unit.repository.javax.management;

import javax.management.JMRuntimeException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link JMRuntimeException} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.management.JMRuntimeExceptionClassTests}).
 */

@RunWith(J8Unit4.class)
public class JMRuntimeExceptionClassTest
implements JMRuntimeExceptionClassTests<JMRuntimeException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.JMRuntimeException]

    @Override
    public Class<JMRuntimeException> createNewSUT() {
        return JMRuntimeException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.JMRuntimeException#JMRuntimeException() public javax.management.JMRuntimeException()}.
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
    public void create_JMRuntimeException()
    throws Exception {
        // create new instance
        final JMRuntimeException sut = new JMRuntimeException();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.JMRuntimeException#JMRuntimeException(String) public
     * javax.management.JMRuntimeException(java.lang.String)}.
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
    public void create_JMRuntimeException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final JMRuntimeException sut = null; // = new JMRuntimeException(String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.management.JMRuntimeException]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.JMRuntimeException]

}
