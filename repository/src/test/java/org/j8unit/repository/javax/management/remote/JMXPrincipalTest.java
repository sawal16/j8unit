package org.j8unit.repository.javax.management.remote;

import javax.management.remote.JMXPrincipal;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JMXPrincipalTest
implements org.j8unit.repository.javax.management.remote.JMXPrincipalTests<JMXPrincipal> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.remote.JMXPrincipal]

    @Override
    public JMXPrincipal createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.management.remote.JMXPrincipal], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.management.remote.JMXPrincipal]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.management.remote.JMXPrincipal]

}
