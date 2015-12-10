package org.j8unit.repository.java.io;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InvalidClassExceptionTest
implements org.j8unit.repository.java.io.InvalidClassExceptionTests<java.io.InvalidClassException> {

    @Override
    public java.io.InvalidClassException createNewSUT() {
        throw new AssertionError("There is no default constructor for [java.io.InvalidClassException] available.");
    }

}
