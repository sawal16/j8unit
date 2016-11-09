package org.j8unit.repository.java.security.interfaces;

import java.security.interfaces.RSAPublicKey;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link RSAPublicKey} (by simply reusing the
 * J8Unit test interface {@link RSAPublicKeyClassTests}).
 */

@RunWith(J8Unit4.class)
public class RSAPublicKeyClassTest
implements RSAPublicKeyClassTests<RSAPublicKey> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.interfaces.RSAPublicKey]

    @Override
    public Class<RSAPublicKey> createNewSUT() {
        return RSAPublicKey.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.security.interfaces.RSAPublicKey]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.interfaces.RSAPublicKey]

}
