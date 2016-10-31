package org.j8unit.repository.org.omg.IOP;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;
import org.omg.IOP.TaggedProfileHolder;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class TaggedProfileHolderTest
implements FactoryBasedJ8UnitTest<TaggedProfileHolder>, org.j8unit.repository.org.omg.IOP.TaggedProfileHolderTests<TaggedProfileHolder> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.IOP.TaggedProfileHolder]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(TaggedProfileHolder::new);
    }

    @Parameter(0)
    public Callable<TaggedProfileHolder> sutFactory;

    @Override
    public Callable<TaggedProfileHolder> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.IOP.TaggedProfileHolder]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.IOP.TaggedProfileHolder]

}
