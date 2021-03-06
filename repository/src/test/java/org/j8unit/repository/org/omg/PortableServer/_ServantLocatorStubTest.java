package org.j8unit.repository.org.omg.PortableServer;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;
import org.omg.PortableServer._ServantLocatorStub;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class _ServantLocatorStubTest
implements FactoryBasedJ8UnitTest<_ServantLocatorStub>, _ServantLocatorStubTests<_ServantLocatorStub> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.PortableServer._ServantLocatorStub]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(_ServantLocatorStub::new);
    }

    @Parameter(0)
    public Callable<_ServantLocatorStub> sutFactory;

    @Override
    public Callable<_ServantLocatorStub> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.PortableServer._ServantLocatorStub]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.PortableServer._ServantLocatorStub]

}
