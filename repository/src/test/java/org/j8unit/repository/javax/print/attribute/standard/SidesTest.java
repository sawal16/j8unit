package org.j8unit.repository.javax.print.attribute.standard;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import javax.print.attribute.standard.Sides;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Sides} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.print.attribute.standard.SidesTests}).
 */
@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class SidesTest
implements SidesTests<Sides> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.attribute.standard.Sides]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(Sides.TWO_SIDED_SHORT_EDGE, //
                                Sides.TUMBLE, //
                                Sides.ONE_SIDED, //
                                Sides.DUPLEX, //
                                Sides.TWO_SIDED_LONG_EDGE);
    }

    @Parameter(0)
    public Sides sut;

    @Override
    public Sides createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.print.attribute.standard.Sides]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.print.attribute.standard.Sides]

}
