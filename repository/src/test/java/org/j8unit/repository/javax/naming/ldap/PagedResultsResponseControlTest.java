package org.j8unit.repository.javax.naming.ldap;

import javax.naming.ldap.PagedResultsResponseControl;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link PagedResultsResponseControl} (by
 * simply reusing the J8Unit test interface
 * {@link org.j8unit.repository.javax.naming.ldap.PagedResultsResponseControlTests}).
 */
@RunWith(J8Unit4.class)
public class PagedResultsResponseControlTest
implements PagedResultsResponseControlTests<PagedResultsResponseControl> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.naming.ldap.PagedResultsResponseControl]

    @Override
    public PagedResultsResponseControl createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.naming.ldap.PagedResultsResponseControl], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.naming.ldap.PagedResultsResponseControl]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.naming.ldap.PagedResultsResponseControl]

}
