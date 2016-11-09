package org.j8unit.repository.org.xml.sax.ext;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;
import org.xml.sax.ext.Locator2Impl;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class Locator2ImplTest
implements FactoryBasedJ8UnitTest<Locator2Impl>, Locator2ImplTests<Locator2Impl> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.xml.sax.ext.Locator2Impl]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(Locator2Impl::new);
    }

    @Parameter(0)
    public Callable<Locator2Impl> sutFactory;

    @Override
    public Callable<Locator2Impl> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.xml.sax.ext.Locator2Impl]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.xml.sax.ext.Locator2Impl]

}
