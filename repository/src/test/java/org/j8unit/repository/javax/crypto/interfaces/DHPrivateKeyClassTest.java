package org.j8unit.repository.javax.crypto.interfaces;

import javax.crypto.interfaces.DHPrivateKey;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DHPrivateKeyClassTest
implements org.j8unit.repository.javax.crypto.interfaces.DHPrivateKeyClassTests<DHPrivateKey> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.crypto.interfaces.DHPrivateKey]

    @Override
    public Class<DHPrivateKey> createNewSUT() {
        return DHPrivateKey.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.crypto.interfaces.DHPrivateKey]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.crypto.interfaces.DHPrivateKey]

}
