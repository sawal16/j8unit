package org.j8unit.repository.java.io;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PipedReaderTest
implements org.j8unit.repository.java.io.PipedReaderTests<java.io.PipedReader> {

    @Override
    public java.io.PipedReader createNewSUT() {
        return new java.io.PipedReader();
    }

}
