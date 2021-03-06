package org.j8unit.repository.java.util.concurrent;

import java.util.concurrent.CyclicBarrier;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link CyclicBarrier} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.util.concurrent.CyclicBarrierTests}).
 */
@RunWith(J8Unit4.class)
public class CyclicBarrierTest
implements CyclicBarrierTests<CyclicBarrier> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.concurrent.CyclicBarrier]

    @Override
    public CyclicBarrier createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.util.concurrent.CyclicBarrier], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.concurrent.CyclicBarrier]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.concurrent.CyclicBarrier]

}
