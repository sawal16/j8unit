package org.j8unit.repository.javax.xml.ws;

import javax.xml.ws.WebServiceException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link WebServiceException} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.xml.ws.WebServiceExceptionClassTests}).
 */
@RunWith(J8Unit4.class)
public class WebServiceExceptionClassTest
implements WebServiceExceptionClassTests<WebServiceException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.ws.WebServiceException]

    @Override
    public Class<WebServiceException> createNewSUT() {
        return WebServiceException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.xml.ws.WebServiceException#WebServiceException(Throwable) public
     * javax.xml.ws.WebServiceException(java.lang.Throwable)}.
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
    public void create_WebServiceException_Throwable()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final WebServiceException sut = null; // = new WebServiceException(Throwable);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.xml.ws.WebServiceException#WebServiceException(String, Throwable) public
     * javax.xml.ws.WebServiceException(java.lang.String,java.lang.Throwable)}.
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
    public void create_WebServiceException_String_Throwable()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final WebServiceException sut = null; // = new WebServiceException(String, Throwable);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.xml.ws.WebServiceException#WebServiceException(String) public
     * javax.xml.ws.WebServiceException(java.lang.String)}.
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
    public void create_WebServiceException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final WebServiceException sut = null; // = new WebServiceException(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.xml.ws.WebServiceException#WebServiceException() public javax.xml.ws.WebServiceException()}.
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
    public void create_WebServiceException()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final WebServiceException sut = new WebServiceException();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.ws.WebServiceException]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.ws.WebServiceException]

}
