package org.j8unit.repository.java.nio;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CharBufferClassTest
implements org.j8unit.repository.java.nio.CharBufferClassTests<java.nio.CharBuffer> {

    @Override
    public Class<java.nio.CharBuffer> createNewSUT() {
        return java.nio.CharBuffer.class;
    }

}
