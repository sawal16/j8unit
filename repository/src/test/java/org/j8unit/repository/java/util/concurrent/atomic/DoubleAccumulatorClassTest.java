package org.j8unit.repository.java.util.concurrent.atomic;

import java.util.concurrent.atomic.DoubleAccumulator;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DoubleAccumulator} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.util.concurrent.atomic.DoubleAccumulatorClassTests}).
 */

@RunWith(J8Unit4.class)
public class DoubleAccumulatorClassTest
implements DoubleAccumulatorClassTests<DoubleAccumulator> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.concurrent.atomic.DoubleAccumulator]

    @Override
    public Class<DoubleAccumulator> createNewSUT() {
        return DoubleAccumulator.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.util.concurrent.atomic.DoubleAccumulator#DoubleAccumulator(java.util.function.DoubleBinaryOperator, double)
     * public java.util.concurrent.atomic.DoubleAccumulator(java.util.function.DoubleBinaryOperator,double)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_DoubleAccumulator_DoubleBinaryOperator_double()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final DoubleAccumulator sut = null; // = new DoubleAccumulator(java.util.function.DoubleBinaryOperator, double);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.concurrent.atomic.DoubleAccumulator]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.concurrent.atomic.DoubleAccumulator]

}