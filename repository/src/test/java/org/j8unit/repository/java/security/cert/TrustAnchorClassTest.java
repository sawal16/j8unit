package org.j8unit.repository.java.security.cert;

import java.security.cert.TrustAnchor;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link TrustAnchor} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.security.cert.TrustAnchorClassTests}).
 */
@RunWith(J8Unit4.class)
public class TrustAnchorClassTest
implements TrustAnchorClassTests<TrustAnchor> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.cert.TrustAnchor]

    @Override
    public Class<TrustAnchor> createNewSUT() {
        return TrustAnchor.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.security.cert.TrustAnchor#TrustAnchor(javax.security.auth.x500.X500Principal, java.security.PublicKey, byte[])
     * public java.security.cert.TrustAnchor(javax.security.auth.x500.X500Principal,java.security.PublicKey,byte[])}.
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
    public void create_TrustAnchor_X500Principal_PublicKey_byteArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final TrustAnchor sut = null; // = new TrustAnchor(javax.security.auth.x500.X500Principal,
                                      // java.security.PublicKey, byte[]);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.security.cert.TrustAnchor#TrustAnchor(String, java.security.PublicKey, byte[]) public
     * java.security.cert.TrustAnchor(java.lang.String,java.security.PublicKey,byte[])}.
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
    public void create_TrustAnchor_String_PublicKey_byteArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final TrustAnchor sut = null; // = new TrustAnchor(String, java.security.PublicKey, byte[]);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.security.cert.TrustAnchor#TrustAnchor(java.security.cert.X509Certificate, byte[]) public
     * java.security.cert.TrustAnchor(java.security.cert.X509Certificate,byte[])}.
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
    public void create_TrustAnchor_X509Certificate_byteArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final TrustAnchor sut = null; // = new TrustAnchor(java.security.cert.X509Certificate, byte[]);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.security.cert.TrustAnchor]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.cert.TrustAnchor]

}
