package org.j8unit.repository.javax.naming;

import javax.naming.NameNotFoundException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NameNotFoundExceptionClassTest
implements org.j8unit.repository.javax.naming.NameNotFoundExceptionClassTests<NameNotFoundException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.naming.NameNotFoundException]

    @Override
    public Class<NameNotFoundException> createNewSUT() {
        return NameNotFoundException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.naming.NameNotFoundException#NameNotFoundException(String) public
     * javax.naming.NameNotFoundException(java.lang.String)}.
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
    public void create_NameNotFoundException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final NameNotFoundException sut = null; // = new NameNotFoundException(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.naming.NameNotFoundException#NameNotFoundException() public javax.naming.NameNotFoundException()}.
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
    public void create_NameNotFoundException()
    throws Exception {
        // create new instance
        final NameNotFoundException sut = new NameNotFoundException();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.naming.NameNotFoundException]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.naming.NameNotFoundException]

}
