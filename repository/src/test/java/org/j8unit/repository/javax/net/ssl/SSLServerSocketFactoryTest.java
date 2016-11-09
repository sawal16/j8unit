package org.j8unit.repository.javax.net.ssl;

import javax.net.ssl.SSLServerSocketFactory;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link SSLServerSocketFactory} (by simply
 * reusing the J8Unit test interface {@link SSLServerSocketFactoryTests}).
 */

@RunWith(J8Unit4.class)
public class SSLServerSocketFactoryTest
implements SSLServerSocketFactoryTests<SSLServerSocketFactory> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.net.ssl.SSLServerSocketFactory]

    @Override
    public SSLServerSocketFactory createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.net.ssl.SSLServerSocketFactory], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.net.ssl.SSLServerSocketFactory]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.net.ssl.SSLServerSocketFactory]

}
