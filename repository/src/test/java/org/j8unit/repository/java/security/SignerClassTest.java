package org.j8unit.repository.java.security;

import static org.junit.Assert.fail;
import java.security.Signer;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Signer} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.security.SignerClassTests}).
 */
@RunWith(J8Unit4.class)
@SuppressWarnings("deprecation")
public class SignerClassTest
implements SignerClassTests<Signer> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.Signer]

    @Override
    public Class<Signer> createNewSUT() {
        return Signer.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.security.Signer#Signer(String, java.security.IdentityScope) public
     * java.security.Signer(java.lang.String,java.security.IdentityScope) throws java.security.KeyManagementException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("Cannot construct an abstract class!")
    @Test
    @Category(Draft.class)
    public void create_Signer_String_IdentityScope()
    throws Exception {
        fail("Cannot construct an abstract class!");
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.security.Signer#Signer(String) public
     * java.security.Signer(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("Cannot construct an abstract class!")
    @Test
    @Category(Draft.class)
    public void create_Signer_String()
    throws Exception {
        Assert.fail("Cannot construct an abstract class!");
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.security.Signer]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.Signer]

}
