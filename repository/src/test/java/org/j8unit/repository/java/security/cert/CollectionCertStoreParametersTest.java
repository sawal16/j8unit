package org.j8unit.repository.java.security.cert;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CollectionCertStoreParametersTest
implements org.j8unit.repository.java.security.cert.CollectionCertStoreParametersTests<java.security.cert.CollectionCertStoreParameters> {

    @Override
    public java.security.cert.CollectionCertStoreParameters createNewSUT() {
        return new java.security.cert.CollectionCertStoreParameters();
    }

}
