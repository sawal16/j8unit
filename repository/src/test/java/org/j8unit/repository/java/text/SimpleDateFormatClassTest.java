package org.j8unit.repository.java.text;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SimpleDateFormatClassTest
implements org.j8unit.repository.java.text.SimpleDateFormatClassTests<java.text.SimpleDateFormat> {

    @Override
    public Class<java.text.SimpleDateFormat> createNewSUT() {
        return java.text.SimpleDateFormat.class;
    }

}
