package org.j8unit.repository.org.omg.CosNaming;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;
import org.omg.CosNaming.BindingTypeHolder;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class BindingTypeHolderTest
implements FactoryBasedJ8UnitTest<BindingTypeHolder>, org.j8unit.repository.org.omg.CosNaming.BindingTypeHolderTests<BindingTypeHolder> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.CosNaming.BindingTypeHolder]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(BindingTypeHolder::new);
    }

    @Parameter(0)
    public Callable<BindingTypeHolder> sutFactory;

    @Override
    public Callable<BindingTypeHolder> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.CosNaming.BindingTypeHolder]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.CosNaming.BindingTypeHolder]

}
