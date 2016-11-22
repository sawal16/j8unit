package org.j8unit.repository.javax.swing.plaf.basic;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.swing.plaf.basic.BasicMenuUI;
import javax.swing.plaf.basic.BasicMenuUI.ChangeHandler;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.J8Unit4;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class BasicMenuUITest
implements FactoryBasedJ8UnitTest<BasicMenuUI>, BasicMenuUITests<BasicMenuUI> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicMenuUI]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(BasicMenuUI::new);
    }

    @Parameter(0)
    public Callable<BasicMenuUI> sutFactory;

    @Override
    public Callable<BasicMenuUI> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.basic.BasicMenuUI]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.basic.BasicMenuUI]

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link ChangeHandler} (by simply reusing
     * the J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicMenuUITests.ChangeHandlerTests}).
     */

    @RunWith(J8Unit4.class)
    public static class ChangeHandlerTest
    implements ChangeHandlerTests<ChangeHandler> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicMenuUI$ChangeHandler]

        @Override
        public ChangeHandler createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.plaf.basic.BasicMenuUI.ChangeHandler], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.basic.BasicMenuUI$ChangeHandler]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.basic.BasicMenuUI$ChangeHandler]

    }

}
