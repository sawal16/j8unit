package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ClassLoaderClassTest
implements org.j8unit.repository.java.lang.ClassLoaderClassTests<java.lang.ClassLoader> {

    @Override
    public Class<java.lang.ClassLoader> createNewSUT() {
        return java.lang.ClassLoader.class;
    }

}
