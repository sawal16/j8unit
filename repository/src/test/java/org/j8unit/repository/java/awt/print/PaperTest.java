package org.j8unit.repository.java.awt.print;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.awt.print.Paper;
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
public class PaperTest
implements FactoryBasedJ8UnitTest<Paper>, PaperTests<Paper> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.print.Paper]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(Paper::new);
    }

    @Parameter(0)
    public Callable<Paper> sutFactory;

    @Override
    public Callable<Paper> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.print.Paper]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.print.Paper]

}
