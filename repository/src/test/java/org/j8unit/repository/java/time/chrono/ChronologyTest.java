package org.j8unit.repository.java.time.chrono;

import java.time.chrono.Chronology;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ChronologyTest
implements org.j8unit.repository.java.time.chrono.ChronologyTests<Chronology> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.time.chrono.Chronology]

    @Override
    public Chronology createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.time.chrono.Chronology], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.time.chrono.Chronology]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.time.chrono.Chronology]

}
