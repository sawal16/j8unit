package org.j8unit.repository.org.omg.PortableServer.POAPackage;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InvalidPolicyHelperClassTest
implements org.j8unit.repository.org.omg.PortableServer.POAPackage.InvalidPolicyHelperClassTests<org.omg.PortableServer.POAPackage.InvalidPolicyHelper> {

    @Override
    public Class<org.omg.PortableServer.POAPackage.InvalidPolicyHelper> createNewSUT() {
        return org.omg.PortableServer.POAPackage.InvalidPolicyHelper.class;
    }

}
