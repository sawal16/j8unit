package org.j8unit.repository.java.util.logging;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SocketHandlerClassTest
implements org.j8unit.repository.java.util.logging.SocketHandlerClassTests<java.util.logging.SocketHandler> {

    @Override
    public Class<java.util.logging.SocketHandler> createNewSUT() {
        return java.util.logging.SocketHandler.class;
    }

}
