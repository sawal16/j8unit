package org.j8unit.repository.javax.xml.crypto.dsig;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ManifestClassTest
implements org.j8unit.repository.javax.xml.crypto.dsig.ManifestClassTests<javax.xml.crypto.dsig.Manifest> {

    @Override
    public Class<javax.xml.crypto.dsig.Manifest> createNewSUT() {
        return javax.xml.crypto.dsig.Manifest.class;
    }

}
