package org.j8unit.repository.javax.swing;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.swing.JToolBar;
import javax.swing.JToolBar.Separator;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.j8unit.util.TestParametersUtil;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class JToolBarTest
implements FactoryBasedJ8UnitTest<JToolBar>, JToolBarTests<JToolBar> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.JToolBar]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(JToolBar::new);
    }

    @Parameter(0)
    public Callable<JToolBar> sutFactory;

    @Override
    public Callable<JToolBar> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.JToolBar]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.JToolBar]

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class SeparatorTest
    implements FactoryBasedJ8UnitTest<Separator>, SeparatorTests<Separator> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.JToolBar$Separator]

        @Parameters(name = "{index}: {0}")
        public static Iterable<? extends Object> sutData() {
            return TestParametersUtil.testParametersOf(Separator::new);
        }

        @Parameter(0)
        public Callable<Separator> sutFactory;

        @Override
        public Callable<Separator> getSUTFactory() {
            return this.sutFactory;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.JToolBar$Separator]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.JToolBar$Separator]

    }

}
