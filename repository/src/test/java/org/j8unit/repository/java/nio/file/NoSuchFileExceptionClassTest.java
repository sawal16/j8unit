package org.j8unit.repository.java.nio.file;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NoSuchFileExceptionClassTest
implements org.j8unit.repository.java.nio.file.NoSuchFileExceptionClassTests<java.nio.file.NoSuchFileException> {

    @Override
    public Class<java.nio.file.NoSuchFileException> createNewSUT() {
        return java.nio.file.NoSuchFileException.class;
    }

}