package org.j8unit.repository.java.lang.annotation;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NativeClassTest
implements org.j8unit.repository.java.lang.annotation.NativeClassTests<java.lang.annotation.Native> {

    @Override
    public Class<java.lang.annotation.Native> createNewSUT() {
        return java.lang.annotation.Native.class;
    }

}
