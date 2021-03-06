package org.j8unit.repository.java.io;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.io.NotSerializableException;
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
public class NotSerializableExceptionTest
implements FactoryBasedJ8UnitTest<NotSerializableException>, NotSerializableExceptionTests<NotSerializableException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.io.NotSerializableException]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(NotSerializableException::new);
    }

    @Parameter(0)
    public Callable<NotSerializableException> sutFactory;

    @Override
    public Callable<NotSerializableException> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.io.NotSerializableException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.io.NotSerializableException]

}
