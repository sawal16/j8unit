package org.j8unit.repository.java.text;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.text.DecimalFormat;
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
public class DecimalFormatTest
implements FactoryBasedJ8UnitTest<DecimalFormat>, org.j8unit.repository.java.text.DecimalFormatTests<DecimalFormat> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.text.DecimalFormat]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(DecimalFormat::new);
    }

    @Parameter(0)
    public Callable<DecimalFormat> sutFactory;

    @Override
    public Callable<DecimalFormat> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.text.DecimalFormat]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.text.DecimalFormat]

}
