package org.j8unit.repository.javax.management.loading;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.management.loading.DefaultLoaderRepository;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
@SuppressWarnings("deprecation")
public class DefaultLoaderRepositoryTest
implements FactoryBasedJ8UnitTest<DefaultLoaderRepository>, DefaultLoaderRepositoryTests<DefaultLoaderRepository> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.loading.DefaultLoaderRepository]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(DefaultLoaderRepository::new);
    }

    @Parameter(0)
    public Callable<DefaultLoaderRepository> sutFactory;

    @Override
    public Callable<DefaultLoaderRepository> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.management.loading.DefaultLoaderRepository]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.management.loading.DefaultLoaderRepository]

}
