package org.j8unit.repository.java.io;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PushbackReaderClassTest
implements org.j8unit.repository.java.io.PushbackReaderClassTests<java.io.PushbackReader> {

    @Override
    public Class<java.io.PushbackReader> createNewSUT() {
        return java.io.PushbackReader.class;
    }

}
