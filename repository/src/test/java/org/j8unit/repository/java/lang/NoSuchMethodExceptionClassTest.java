package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NoSuchMethodExceptionClassTest
implements org.j8unit.repository.java.lang.NoSuchMethodExceptionClassTests<java.lang.NoSuchMethodException> {

    @Override
    public Class<java.lang.NoSuchMethodException> createNewSUT() {
        return java.lang.NoSuchMethodException.class;
    }

}
