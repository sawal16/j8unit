package org.j8unit.repository.javax.crypto;

import javax.crypto.SecretKeyFactory;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link SecretKeyFactory} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.crypto.SecretKeyFactoryClassTests}).
 */
@RunWith(J8Unit4.class)
public class SecretKeyFactoryClassTest
implements SecretKeyFactoryClassTests<SecretKeyFactory> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.crypto.SecretKeyFactory]

    @Override
    public Class<SecretKeyFactory> createNewSUT() {
        return SecretKeyFactory.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.crypto.SecretKeyFactory#getInstance(String, java.security.Provider) public static final
     * javax.crypto.SecretKeyFactory javax.crypto.SecretKeyFactory.getInstance(java.lang.String,java.security.Provider)
     * throws java.security.NoSuchAlgorithmException}.
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
    public void test_getInstance_String_Provider()
    throws Exception {
        // write some test for {@link javax.crypto.SecretKeyFactory#getInstance(String, java.security.Provider)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link javax.crypto.SecretKeyFactory#getInstance(String)
     * public static final javax.crypto.SecretKeyFactory javax.crypto.SecretKeyFactory.getInstance(java.lang.String)
     * throws java.security.NoSuchAlgorithmException}.
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
    public void test_getInstance_String()
    throws Exception {
        // write some test for {@link javax.crypto.SecretKeyFactory#getInstance(String)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.crypto.SecretKeyFactory#getInstance(String, String) public static final
     * javax.crypto.SecretKeyFactory javax.crypto.SecretKeyFactory.getInstance(java.lang.String,java.lang.String) throws
     * java.security.NoSuchAlgorithmException,java.security.NoSuchProviderException}.
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
    public void test_getInstance_String_String()
    throws Exception {
        // write some test for {@link javax.crypto.SecretKeyFactory#getInstance(String, String)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.crypto.SecretKeyFactory]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.crypto.SecretKeyFactory]

}
