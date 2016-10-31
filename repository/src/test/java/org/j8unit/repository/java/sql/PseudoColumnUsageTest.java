package org.j8unit.repository.java.sql;

import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import java.sql.PseudoColumnUsage;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class PseudoColumnUsageTest
implements org.j8unit.repository.java.sql.PseudoColumnUsageTests<PseudoColumnUsage> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.sql.PseudoColumnUsage]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOfEnumClass(PseudoColumnUsage.class);
    }

    @Parameter(0)
    public PseudoColumnUsage sut;

    @Override
    public PseudoColumnUsage createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.sql.PseudoColumnUsage]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.sql.PseudoColumnUsage]

}
