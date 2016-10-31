package org.j8unit.repository.javax.swing;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.swing.MenuSelectionManager;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class MenuSelectionManagerTest
implements FactoryBasedJ8UnitTest<MenuSelectionManager>, org.j8unit.repository.javax.swing.MenuSelectionManagerTests<MenuSelectionManager> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.MenuSelectionManager]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(MenuSelectionManager::new);
    }

    @Parameter(0)
    public Callable<MenuSelectionManager> sutFactory;

    @Override
    public Callable<MenuSelectionManager> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.MenuSelectionManager]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.MenuSelectionManager]

}
