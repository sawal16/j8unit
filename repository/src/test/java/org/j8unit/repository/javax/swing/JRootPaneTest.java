package org.j8unit.repository.javax.swing;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.swing.JRootPane;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class JRootPaneTest
implements FactoryBasedJ8UnitTest<JRootPane>, JRootPaneTests<JRootPane> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.JRootPane]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(JRootPane::new);
    }

    @Parameter(0)
    public Callable<JRootPane> sutFactory;

    @Override
    public Callable<JRootPane> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.JRootPane]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.JRootPane]

}
