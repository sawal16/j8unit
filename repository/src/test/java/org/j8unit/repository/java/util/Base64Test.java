package org.j8unit.repository.java.util;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class Base64Test
implements org.j8unit.repository.java.util.Base64Tests<java.util.Base64> {

    @RunWith(J8Unit4.class)
    public static class DecoderTest
    implements org.j8unit.repository.java.util.Base64Tests.DecoderTests<java.util.Base64.Decoder> {

        @Override
        public java.util.Base64.Decoder createNewSUT() {
            throw new AssertionError("There is no default constructor for [java.util.Base64.Decoder] available.");
        }

    }

    @RunWith(J8Unit4.class)
    public static class EncoderTest
    implements org.j8unit.repository.java.util.Base64Tests.EncoderTests<java.util.Base64.Encoder> {

        @Override
        public java.util.Base64.Encoder createNewSUT() {
            throw new AssertionError("There is no default constructor for [java.util.Base64.Encoder] available.");
        }

    }

    @Override
    public java.util.Base64 createNewSUT() {
        throw new AssertionError("There is no default constructor for [java.util.Base64] available.");
    }

}
