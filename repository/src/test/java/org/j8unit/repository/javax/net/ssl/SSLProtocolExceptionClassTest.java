package org.j8unit.repository.javax.net.ssl;

import javax.net.ssl.SSLProtocolException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link SSLProtocolException} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.net.ssl.SSLProtocolExceptionClassTests}).
 */
@RunWith(J8Unit4.class)
public class SSLProtocolExceptionClassTest
implements SSLProtocolExceptionClassTests<SSLProtocolException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.net.ssl.SSLProtocolException]

    @Override
    public Class<SSLProtocolException> createNewSUT() {
        return SSLProtocolException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.net.ssl.SSLProtocolException#SSLProtocolException(String) public
     * javax.net.ssl.SSLProtocolException(java.lang.String)}.
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
    public void create_SSLProtocolException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final SSLProtocolException sut = null; // = new SSLProtocolException(String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.net.ssl.SSLProtocolException]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.net.ssl.SSLProtocolException]

}
