package org.j8unit.repository.java.time.temporal;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TemporalAmountClassTest
implements org.j8unit.repository.java.time.temporal.TemporalAmountClassTests<java.time.temporal.TemporalAmount> {

    @Override
    public Class<java.time.temporal.TemporalAmount> createNewSUT() {
        return java.time.temporal.TemporalAmount.class;
    }

}
