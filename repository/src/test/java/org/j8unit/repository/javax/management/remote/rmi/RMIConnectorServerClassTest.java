package org.j8unit.repository.javax.management.remote.rmi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RMIConnectorServerClassTest
implements org.j8unit.repository.javax.management.remote.rmi.RMIConnectorServerClassTests<javax.management.remote.rmi.RMIConnectorServer> {

    @Override
    public Class<javax.management.remote.rmi.RMIConnectorServer> createNewSUT() {
        return javax.management.remote.rmi.RMIConnectorServer.class;
    }

}
