package org.j8unit.repository.java.util.logging;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import java.util.logging.FileHandler;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class FileHandlerTest
implements FactoryBasedJ8UnitTest<FileHandler>, FileHandlerTests<FileHandler> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.logging.FileHandler]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(FileHandler::new);
    }

    @Parameter(0)
    public Callable<FileHandler> sutFactory;

    @Override
    public Callable<FileHandler> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.logging.FileHandler]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.logging.FileHandler]

}
