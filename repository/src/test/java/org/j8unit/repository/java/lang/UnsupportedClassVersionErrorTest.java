package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UnsupportedClassVersionErrorTest
implements org.j8unit.repository.java.lang.UnsupportedClassVersionErrorTests<java.lang.UnsupportedClassVersionError> {

    @Override
    public java.lang.UnsupportedClassVersionError createNewSUT() {
        return new java.lang.UnsupportedClassVersionError();
    }

}
