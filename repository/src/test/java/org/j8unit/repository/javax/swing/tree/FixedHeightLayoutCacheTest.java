package org.j8unit.repository.javax.swing.tree;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.swing.tree.FixedHeightLayoutCache;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class FixedHeightLayoutCacheTest
implements FactoryBasedJ8UnitTest<FixedHeightLayoutCache>, FixedHeightLayoutCacheTests<FixedHeightLayoutCache> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.tree.FixedHeightLayoutCache]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(FixedHeightLayoutCache::new);
    }

    @Parameter(0)
    public Callable<FixedHeightLayoutCache> sutFactory;

    @Override
    public Callable<FixedHeightLayoutCache> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.tree.FixedHeightLayoutCache]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.tree.FixedHeightLayoutCache]

}
