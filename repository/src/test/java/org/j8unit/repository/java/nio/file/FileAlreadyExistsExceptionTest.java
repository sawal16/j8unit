package org.j8unit.repository.java.nio.file;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FileAlreadyExistsExceptionTest
implements org.j8unit.repository.java.nio.file.FileAlreadyExistsExceptionTests<java.nio.file.FileAlreadyExistsException> {

    @Override
    public java.nio.file.FileAlreadyExistsException createNewSUT() {
        throw new AssertionError("There is no default constructor for [java.nio.file.FileAlreadyExistsException] available.");
    }

}
