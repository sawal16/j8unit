package org.j8unit.repository.java.util;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.ConcurrentModificationException;
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
public class ConcurrentModificationExceptionTest
implements FactoryBasedJ8UnitTest<ConcurrentModificationException>, ConcurrentModificationExceptionTests<ConcurrentModificationException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.ConcurrentModificationException]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(ConcurrentModificationException::new);
    }

    @Parameter(0)
    public Callable<ConcurrentModificationException> sutFactory;

    @Override
    public Callable<ConcurrentModificationException> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.ConcurrentModificationException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.ConcurrentModificationException]

}
