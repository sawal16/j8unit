package org.j8unit.repository.java.security.cert;

import java.security.cert.PolicyQualifierInfo;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link PolicyQualifierInfo} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.security.cert.PolicyQualifierInfoClassTests}).
 */
@RunWith(J8Unit4.class)
public class PolicyQualifierInfoClassTest
implements PolicyQualifierInfoClassTests<PolicyQualifierInfo> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.cert.PolicyQualifierInfo]

    @Override
    public Class<PolicyQualifierInfo> createNewSUT() {
        return PolicyQualifierInfo.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.security.cert.PolicyQualifierInfo#PolicyQualifierInfo(byte[]) public
     * java.security.cert.PolicyQualifierInfo(byte[]) throws java.io.IOException}.
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
    public void create_PolicyQualifierInfo_byteArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final PolicyQualifierInfo sut = null; // = new PolicyQualifierInfo(byte[]);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.security.cert.PolicyQualifierInfo]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.cert.PolicyQualifierInfo]

}
