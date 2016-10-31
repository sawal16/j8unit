package org.j8unit.repository.javax.swing.plaf.basic;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.swing.plaf.basic.BasicPopupMenuSeparatorUI;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class BasicPopupMenuSeparatorUITest
implements FactoryBasedJ8UnitTest<BasicPopupMenuSeparatorUI>,
org.j8unit.repository.javax.swing.plaf.basic.BasicPopupMenuSeparatorUITests<BasicPopupMenuSeparatorUI> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicPopupMenuSeparatorUI]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(BasicPopupMenuSeparatorUI::new);
    }

    @Parameter(0)
    public Callable<BasicPopupMenuSeparatorUI> sutFactory;

    @Override
    public Callable<BasicPopupMenuSeparatorUI> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.basic.BasicPopupMenuSeparatorUI]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.basic.BasicPopupMenuSeparatorUI]

}
