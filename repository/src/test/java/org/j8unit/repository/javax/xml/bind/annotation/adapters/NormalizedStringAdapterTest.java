package org.j8unit.repository.javax.xml.bind.annotation.adapters;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class NormalizedStringAdapterTest
implements FactoryBasedJ8UnitTest<NormalizedStringAdapter>,
org.j8unit.repository.javax.xml.bind.annotation.adapters.NormalizedStringAdapterTests<NormalizedStringAdapter> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.bind.annotation.adapters.NormalizedStringAdapter]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(NormalizedStringAdapter::new);
    }

    @Parameter(0)
    public Callable<NormalizedStringAdapter> sutFactory;

    @Override
    public Callable<NormalizedStringAdapter> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.bind.annotation.adapters.NormalizedStringAdapter]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.bind.annotation.adapters.NormalizedStringAdapter]

}
