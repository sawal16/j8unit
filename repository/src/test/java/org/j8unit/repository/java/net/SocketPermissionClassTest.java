package org.j8unit.repository.java.net;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SocketPermissionClassTest
implements org.j8unit.repository.java.net.SocketPermissionClassTests<java.net.SocketPermission> {

    @Override
    public Class<java.net.SocketPermission> createNewSUT() {
        return java.net.SocketPermission.class;
    }

}
