package org.j8unit.repository.java.io;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.io.ByteArrayOutputStream;
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
public class ByteArrayOutputStreamTest
implements FactoryBasedJ8UnitTest<ByteArrayOutputStream>, ByteArrayOutputStreamTests<ByteArrayOutputStream> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.io.ByteArrayOutputStream]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(ByteArrayOutputStream::new);
    }

    @Parameter(0)
    public Callable<ByteArrayOutputStream> sutFactory;

    @Override
    public Callable<ByteArrayOutputStream> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.io.ByteArrayOutputStream]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.io.ByteArrayOutputStream]

}
