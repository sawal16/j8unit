package org.j8unit.repository.java.security;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PKCS12AttributeClassTest
implements org.j8unit.repository.java.security.PKCS12AttributeClassTests<java.security.PKCS12Attribute> {

    @Override
    public Class<java.security.PKCS12Attribute> createNewSUT() {
        return java.security.PKCS12Attribute.class;
    }

}