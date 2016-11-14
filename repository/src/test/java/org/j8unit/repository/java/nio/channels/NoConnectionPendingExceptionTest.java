package org.j8unit.repository.java.nio.channels;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.nio.channels.NoConnectionPendingException;
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
public class NoConnectionPendingExceptionTest
implements FactoryBasedJ8UnitTest<NoConnectionPendingException>, NoConnectionPendingExceptionTests<NoConnectionPendingException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.channels.NoConnectionPendingException]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(NoConnectionPendingException::new);
    }

    @Parameter(0)
    public Callable<NoConnectionPendingException> sutFactory;

    @Override
    public Callable<NoConnectionPendingException> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.nio.channels.NoConnectionPendingException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.nio.channels.NoConnectionPendingException]

}
