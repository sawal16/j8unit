package org.j8unit.repository.java.time;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class OffsetTimeClassTest
implements org.j8unit.repository.java.time.OffsetTimeClassTests<java.time.OffsetTime> {

    @Override
    public Class<java.time.OffsetTime> createNewSUT() {
        return java.time.OffsetTime.class;
    }

}