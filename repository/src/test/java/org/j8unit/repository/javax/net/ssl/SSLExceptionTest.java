package org.j8unit.repository.javax.net.ssl;

import javax.net.ssl.SSLException;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link SSLException} (by simply reusing the
 * J8Unit test interface {@link SSLExceptionTests}).
 */

@RunWith(J8Unit4.class)
public class SSLExceptionTest
implements SSLExceptionTests<SSLException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.net.ssl.SSLException]

    @Override
    public SSLException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.net.ssl.SSLException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.net.ssl.SSLException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.net.ssl.SSLException]

}
