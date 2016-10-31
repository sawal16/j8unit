package org.j8unit.repository.java.lang;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class BooleanTest
implements org.j8unit.repository.java.lang.BooleanTests<Boolean> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.Boolean]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(Boolean.TRUE, //
                                Boolean.FALSE);
    }

    @Parameter(0)
    public Boolean sut;

    @Override
    public Boolean createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.lang.Boolean]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.lang.Boolean]

}
