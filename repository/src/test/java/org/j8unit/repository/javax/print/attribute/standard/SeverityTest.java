package org.j8unit.repository.javax.print.attribute.standard;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import javax.print.attribute.standard.Severity;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Severity} (by simply reusing the
 * J8Unit test interface {@link SeverityTests}).
 */

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class SeverityTest
implements SeverityTests<Severity> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.attribute.standard.Severity]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(Severity.WARNING, //
                                Severity.REPORT, //
                                Severity.ERROR);
    }

    @Parameter(0)
    public Severity sut;

    @Override
    public Severity createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.print.attribute.standard.Severity]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.print.attribute.standard.Severity]

}
