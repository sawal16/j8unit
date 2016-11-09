package org.j8unit.repository.java.lang;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class AssertionErrorTest
implements FactoryBasedJ8UnitTest<AssertionError>, AssertionErrorTests<AssertionError> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.AssertionError]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(AssertionError::new);
    }

    @Parameter(0)
    public Callable<AssertionError> sutFactory;

    @Override
    public Callable<AssertionError> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.lang.AssertionError]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.lang.AssertionError]

}
