package org.j8unit.repository.java.nio.channels;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AlreadyConnectedExceptionTest
implements org.j8unit.repository.java.nio.channels.AlreadyConnectedExceptionTests<java.nio.channels.AlreadyConnectedException> {

    @Override
    public java.nio.channels.AlreadyConnectedException createNewSUT() {
        return new java.nio.channels.AlreadyConnectedException();
    }

}