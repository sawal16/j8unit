package org.j8unit.repository.javax.swing;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.swing.DefaultFocusManager;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class DefaultFocusManagerTest
implements FactoryBasedJ8UnitTest<DefaultFocusManager>, DefaultFocusManagerTests<DefaultFocusManager> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.DefaultFocusManager]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(DefaultFocusManager::new);
    }

    @Parameter(0)
    public Callable<DefaultFocusManager> sutFactory;

    @Override
    public Callable<DefaultFocusManager> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.DefaultFocusManager]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.DefaultFocusManager]

}
