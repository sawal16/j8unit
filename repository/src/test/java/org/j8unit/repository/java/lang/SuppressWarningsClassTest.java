package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SuppressWarningsClassTest
implements org.j8unit.repository.java.lang.SuppressWarningsClassTests<java.lang.SuppressWarnings> {

    @Override
    public Class<java.lang.SuppressWarnings> createNewSUT() {
        return java.lang.SuppressWarnings.class;
    }

}
