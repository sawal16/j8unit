package org.j8unit.repository.java.net;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class StandardProtocolFamilyClassTest
implements org.j8unit.repository.java.net.StandardProtocolFamilyClassTests<java.net.StandardProtocolFamily> {

    @Override
    public Class<java.net.StandardProtocolFamily> createNewSUT() {
        return java.net.StandardProtocolFamily.class;
    }

}
