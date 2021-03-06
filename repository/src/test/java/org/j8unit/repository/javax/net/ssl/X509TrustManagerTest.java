package org.j8unit.repository.javax.net.ssl;

import javax.net.ssl.X509TrustManager;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link X509TrustManager} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.net.ssl.X509TrustManagerTests}).
 */
@RunWith(J8Unit4.class)
public class X509TrustManagerTest
implements X509TrustManagerTests<X509TrustManager> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.net.ssl.X509TrustManager]

    @Override
    public X509TrustManager createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.net.ssl.X509TrustManager], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.net.ssl.X509TrustManager]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.net.ssl.X509TrustManager]

}
