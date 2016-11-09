package org.j8unit.repository.javax.security.auth.login;

import javax.security.auth.login.AccountNotFoundException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link AccountNotFoundException} (by simply
 * reusing the J8Unit test interface {@link AccountNotFoundExceptionClassTests}).
 */

@RunWith(J8Unit4.class)
public class AccountNotFoundExceptionClassTest
implements AccountNotFoundExceptionClassTests<AccountNotFoundException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.security.auth.login.AccountNotFoundException]

    @Override
    public Class<AccountNotFoundException> createNewSUT() {
        return AccountNotFoundException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.security.auth.login.AccountNotFoundException#AccountNotFoundException() public
     * javax.security.auth.login.AccountNotFoundException()}.
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
    public void create_AccountNotFoundException()
    throws Exception {
        // create new instance
        final AccountNotFoundException sut = new AccountNotFoundException();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.security.auth.login.AccountNotFoundException#AccountNotFoundException(String) public
     * javax.security.auth.login.AccountNotFoundException(java.lang.String)}.
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
    public void create_AccountNotFoundException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final AccountNotFoundException sut = null; // = new AccountNotFoundException(String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.security.auth.login.AccountNotFoundException]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.security.auth.login.AccountNotFoundException]

}
