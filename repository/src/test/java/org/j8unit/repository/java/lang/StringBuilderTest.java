package org.j8unit.repository.java.lang;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
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
public class StringBuilderTest
implements FactoryBasedJ8UnitTest<StringBuilder>, StringBuilderTests<StringBuilder> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.StringBuilder]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(StringBuilder::new);
    }

    @Parameter(0)
    public Callable<StringBuilder> sutFactory;

    @Override
    public Callable<StringBuilder> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.lang.StringBuilder]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.lang.StringBuilder]

}
