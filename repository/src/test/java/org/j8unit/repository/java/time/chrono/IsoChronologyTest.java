package org.j8unit.repository.java.time.chrono;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.time.chrono.IsoChronology;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link IsoChronology} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.time.chrono.IsoChronologyTests}).
 */
@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class IsoChronologyTest
implements IsoChronologyTests<IsoChronology> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.time.chrono.IsoChronology]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(IsoChronology.INSTANCE);
    }

    @Parameter(0)
    public IsoChronology sut;

    @Override
    public IsoChronology createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.time.chrono.IsoChronology]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.time.chrono.IsoChronology]

}
