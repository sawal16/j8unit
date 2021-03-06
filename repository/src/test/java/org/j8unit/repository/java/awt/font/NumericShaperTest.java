package org.j8unit.repository.java.awt.font;

import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import java.awt.font.NumericShaper;
import java.awt.font.NumericShaper.Range;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.J8Unit4;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link NumericShaper} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.awt.font.NumericShaperTests}).
 */
@RunWith(J8Unit4.class)
public class NumericShaperTest
implements NumericShaperTests<NumericShaper> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.font.NumericShaper]

    @Override
    public NumericShaper createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.awt.font.NumericShaper], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.font.NumericShaper]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.font.NumericShaper]

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link Range} (by simply reusing the
     * J8Unit test interface {@link org.j8unit.repository.java.awt.font.NumericShaperTests.RangeTests}).
     */
    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class RangeTest
    implements RangeTests<Range> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.font.NumericShaper$Range]

        @Parameters(name = "{index}: {0}")
        public static Iterable<? extends Object> sutData() {
            return testParametersOfEnumClass(Range.class);
        }

        @Parameter(0)
        public Range sut;

        @Override
        public Range createNewSUT() {
            return this.sut;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.font.NumericShaper$Range]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.font.NumericShaper$Range]

    }

}
