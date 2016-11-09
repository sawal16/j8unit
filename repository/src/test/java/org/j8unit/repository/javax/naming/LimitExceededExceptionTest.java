package org.j8unit.repository.javax.naming;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.naming.LimitExceededException;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class LimitExceededExceptionTest
implements FactoryBasedJ8UnitTest<LimitExceededException>, LimitExceededExceptionTests<LimitExceededException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.naming.LimitExceededException]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(LimitExceededException::new);
    }

    @Parameter(0)
    public Callable<LimitExceededException> sutFactory;

    @Override
    public Callable<LimitExceededException> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.naming.LimitExceededException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.naming.LimitExceededException]

}
