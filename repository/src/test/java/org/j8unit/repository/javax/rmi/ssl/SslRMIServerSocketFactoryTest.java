package org.j8unit.repository.javax.rmi.ssl;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.rmi.ssl.SslRMIServerSocketFactory;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class SslRMIServerSocketFactoryTest
implements FactoryBasedJ8UnitTest<SslRMIServerSocketFactory>, SslRMIServerSocketFactoryTests<SslRMIServerSocketFactory> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.rmi.ssl.SslRMIServerSocketFactory]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(SslRMIServerSocketFactory::new);
    }

    @Parameter(0)
    public Callable<SslRMIServerSocketFactory> sutFactory;

    @Override
    public Callable<SslRMIServerSocketFactory> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.rmi.ssl.SslRMIServerSocketFactory]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.rmi.ssl.SslRMIServerSocketFactory]

}
