package org.j8unit.repository.java.security.spec;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class KeySpecClassTest
implements org.j8unit.repository.java.security.spec.KeySpecClassTests<java.security.spec.KeySpec> {

    @Override
    public Class<java.security.spec.KeySpec> createNewSUT() {
        return java.security.spec.KeySpec.class;
    }

}
