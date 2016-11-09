package org.j8unit.repository.org.omg.CORBA;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;
import org.omg.CORBA._IDLTypeStub;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class _IDLTypeStubTest
implements FactoryBasedJ8UnitTest<_IDLTypeStub>, _IDLTypeStubTests<_IDLTypeStub> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.CORBA._IDLTypeStub]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(_IDLTypeStub::new);
    }

    @Parameter(0)
    public Callable<_IDLTypeStub> sutFactory;

    @Override
    public Callable<_IDLTypeStub> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.CORBA._IDLTypeStub]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.CORBA._IDLTypeStub]

}
