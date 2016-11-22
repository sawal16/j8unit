package org.j8unit.repository.java.util;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.LongSummaryStatistics;
import java.util.concurrent.Callable;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class LongSummaryStatisticsTest
implements FactoryBasedJ8UnitTest<LongSummaryStatistics>, LongSummaryStatisticsTests<LongSummaryStatistics> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.LongSummaryStatistics]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(LongSummaryStatistics::new);
    }

    @Parameter(0)
    public Callable<LongSummaryStatistics> sutFactory;

    @Override
    public Callable<LongSummaryStatistics> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.LongSummaryStatistics]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.LongSummaryStatistics]

}