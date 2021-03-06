package org.j8unit.repository.java.awt.geom;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.awt.geom.CubicCurve2D;
import java.awt.geom.CubicCurve2D.Double;
import java.awt.geom.CubicCurve2D.Float;
import java.util.concurrent.Callable;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.J8Unit4;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.j8unit.util.TestParametersUtil;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link CubicCurve2D} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.awt.geom.CubicCurve2DTests}).
 */
@RunWith(J8Unit4.class)
public class CubicCurve2DTest
implements CubicCurve2DTests<CubicCurve2D> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.geom.CubicCurve2D]

    @Override
    public CubicCurve2D createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.awt.geom.CubicCurve2D], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.geom.CubicCurve2D]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.geom.CubicCurve2D]

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class FloatTest
    implements FactoryBasedJ8UnitTest<Float>, org.j8unit.repository.java.awt.geom.CubicCurve2DTests.FloatTests<Float> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.geom.CubicCurve2D$Float]

        @Parameters(name = "{index}: {0}")
        public static Iterable<? extends Object> sutData() {
            return testParametersOf(Float::new);
        }

        @Parameter(0)
        public Callable<Float> sutFactory;

        @Override
        public Callable<Float> getSUTFactory() {
            return this.sutFactory;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.geom.CubicCurve2D$Float]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.geom.CubicCurve2D$Float]

    }

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class DoubleTest
    implements FactoryBasedJ8UnitTest<Double>, org.j8unit.repository.java.awt.geom.CubicCurve2DTests.DoubleTests<Double> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.geom.CubicCurve2D$Double]

        @Parameters(name = "{index}: {0}")
        public static Iterable<? extends Object> sutData() {
            return TestParametersUtil.testParametersOf(Double::new);
        }

        @Parameter(0)
        public Callable<Double> sutFactory;

        @Override
        public Callable<Double> getSUTFactory() {
            return this.sutFactory;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.geom.CubicCurve2D$Double]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.geom.CubicCurve2D$Double]

    }

}
