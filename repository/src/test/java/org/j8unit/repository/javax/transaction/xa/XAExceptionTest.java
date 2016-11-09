package org.j8unit.repository.javax.transaction.xa;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.transaction.xa.XAException;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class XAExceptionTest
implements FactoryBasedJ8UnitTest<XAException>, XAExceptionTests<XAException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.transaction.xa.XAException]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(XAException::new);
    }

    @Parameter(0)
    public Callable<XAException> sutFactory;

    @Override
    public Callable<XAException> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.transaction.xa.XAException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.transaction.xa.XAException]

}
