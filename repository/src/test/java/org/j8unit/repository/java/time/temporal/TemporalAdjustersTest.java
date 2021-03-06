package org.j8unit.repository.java.time.temporal;

import java.time.temporal.TemporalAdjusters;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link TemporalAdjusters} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.time.temporal.TemporalAdjustersTests}).
 */
@RunWith(J8Unit4.class)
public class TemporalAdjustersTest
implements TemporalAdjustersTests<TemporalAdjusters> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.time.temporal.TemporalAdjusters]

    @Override
    public TemporalAdjusters createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.time.temporal.TemporalAdjusters], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.time.temporal.TemporalAdjusters]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.time.temporal.TemporalAdjusters]

}
