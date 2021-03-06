package org.j8unit.repository.java.security.cert;

import java.security.cert.CertificateParsingException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link CertificateParsingException} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.java.security.cert.CertificateParsingExceptionClassTests}).
 */
@RunWith(J8Unit4.class)
public class CertificateParsingExceptionClassTest
implements CertificateParsingExceptionClassTests<CertificateParsingException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.cert.CertificateParsingException]

    @Override
    public Class<CertificateParsingException> createNewSUT() {
        return CertificateParsingException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.security.cert.CertificateParsingException#CertificateParsingException(Throwable) public
     * java.security.cert.CertificateParsingException(java.lang.Throwable)}.
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
    public void create_CertificateParsingException_Throwable()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final CertificateParsingException sut = null; // = new CertificateParsingException(Throwable);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.security.cert.CertificateParsingException#CertificateParsingException(String, Throwable) public
     * java.security.cert.CertificateParsingException(java.lang.String,java.lang.Throwable)}.
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
    public void create_CertificateParsingException_String_Throwable()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final CertificateParsingException sut = null; // = new CertificateParsingException(String, Throwable);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.security.cert.CertificateParsingException#CertificateParsingException(String) public
     * java.security.cert.CertificateParsingException(java.lang.String)}.
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
    public void create_CertificateParsingException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final CertificateParsingException sut = null; // = new CertificateParsingException(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.security.cert.CertificateParsingException#CertificateParsingException() public
     * java.security.cert.CertificateParsingException()}.
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
    public void create_CertificateParsingException()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final CertificateParsingException sut = new CertificateParsingException();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.security.cert.CertificateParsingException]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.cert.CertificateParsingException]

}
