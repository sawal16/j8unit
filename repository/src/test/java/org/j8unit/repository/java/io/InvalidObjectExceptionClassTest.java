package org.j8unit.repository.java.io;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InvalidObjectExceptionClassTest
implements org.j8unit.repository.java.io.InvalidObjectExceptionClassTests<java.io.InvalidObjectException> {

    @Override
    public Class<java.io.InvalidObjectException> createNewSUT() {
        return java.io.InvalidObjectException.class;
    }

}
