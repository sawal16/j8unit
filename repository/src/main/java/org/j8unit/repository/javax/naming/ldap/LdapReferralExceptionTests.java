package org.j8unit.repository.javax.naming.ldap;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.naming.ldap.LdapReferralException class javax.naming.ldap.LdapReferralException},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.naming.ldap.LdapReferralExceptionClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface LdapReferralExceptionTests<SUT extends javax.naming.ldap.LdapReferralException>
extends org.j8unit.repository.javax.naming.ReferralExceptionTests<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.naming.ldap.LdapReferralException#getReferralContext(java.util.Hashtable) public abstract javax.naming.Context javax.naming.ldap.LdapReferralException.getReferralContext(java.util.Hashtable) throws javax.naming.NamingException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getReferralContext_Hashtable() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.naming.ldap.LdapReferralException#getReferralContext(java.util.Hashtable,javax.naming.ldap.Control[]) public abstract javax.naming.Context javax.naming.ldap.LdapReferralException.getReferralContext(java.util.Hashtable,javax.naming.ldap.Control[]) throws javax.naming.NamingException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getReferralContext_Hashtable_ControlArray() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.naming.ldap.LdapReferralException#getReferralContext() public abstract javax.naming.Context javax.naming.ldap.LdapReferralException.getReferralContext() throws javax.naming.NamingException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getReferralContext() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}