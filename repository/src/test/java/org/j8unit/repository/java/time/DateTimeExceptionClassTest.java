package org.j8unit.repository.java.time;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DateTimeExceptionClassTest
implements org.j8unit.repository.java.time.DateTimeExceptionClassTests<java.time.DateTimeException> {

    @Override
    public Class<java.time.DateTimeException> createNewSUT() {
        return java.time.DateTimeException.class;
    }

}
