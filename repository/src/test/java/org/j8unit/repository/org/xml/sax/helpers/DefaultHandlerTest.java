package org.j8unit.repository.org.xml.sax.helpers;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;
import org.xml.sax.helpers.DefaultHandler;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class DefaultHandlerTest
implements FactoryBasedJ8UnitTest<DefaultHandler>, DefaultHandlerTests<DefaultHandler> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.xml.sax.helpers.DefaultHandler]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(DefaultHandler::new);
    }

    @Parameter(0)
    public Callable<DefaultHandler> sutFactory;

    @Override
    public Callable<DefaultHandler> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.xml.sax.helpers.DefaultHandler]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.xml.sax.helpers.DefaultHandler]

}
