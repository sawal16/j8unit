package org.j8unit.repository.java.util.logging;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import java.util.logging.StreamHandler;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class StreamHandlerTest
implements FactoryBasedJ8UnitTest<StreamHandler>, StreamHandlerTests<StreamHandler> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.logging.StreamHandler]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(StreamHandler::new);
    }

    @Parameter(0)
    public Callable<StreamHandler> sutFactory;

    @Override
    public Callable<StreamHandler> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.logging.StreamHandler]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.logging.StreamHandler]

}
