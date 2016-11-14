package org.j8unit.repository.java.io;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.io.NotActiveException;
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
public class NotActiveExceptionTest
implements FactoryBasedJ8UnitTest<NotActiveException>, NotActiveExceptionTests<NotActiveException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.io.NotActiveException]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(NotActiveException::new);
    }

    @Parameter(0)
    public Callable<NotActiveException> sutFactory;

    @Override
    public Callable<NotActiveException> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.io.NotActiveException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.io.NotActiveException]

}
