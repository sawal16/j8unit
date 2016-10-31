package org.j8unit.repository.java.time;

import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import java.time.Month;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class MonthTest
implements org.j8unit.repository.java.time.MonthTests<Month> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.time.Month]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOfEnumClass(Month.class);
    }

    @Parameter(0)
    public Month sut;

    @Override
    public Month createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.time.Month]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.time.Month]

}
