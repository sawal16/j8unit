package org.j8unit.repository.java.nio.channels;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AlreadyBoundExceptionTest
implements org.j8unit.repository.java.nio.channels.AlreadyBoundExceptionTests<java.nio.channels.AlreadyBoundException> {

    @Override
    public java.nio.channels.AlreadyBoundException createNewSUT() {
        return new java.nio.channels.AlreadyBoundException();
    }

}
