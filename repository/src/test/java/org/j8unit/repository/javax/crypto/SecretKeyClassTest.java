package org.j8unit.repository.javax.crypto;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SecretKeyClassTest
implements org.j8unit.repository.javax.crypto.SecretKeyClassTests<javax.crypto.SecretKey> {

    @Override
    public Class<javax.crypto.SecretKey> createNewSUT() {
        return javax.crypto.SecretKey.class;
    }

}