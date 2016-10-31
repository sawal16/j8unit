package org.j8unit.repository.javax.management.relation;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.management.relation.RoleUnresolvedList;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class RoleUnresolvedListTest
implements FactoryBasedJ8UnitTest<RoleUnresolvedList>, org.j8unit.repository.javax.management.relation.RoleUnresolvedListTests<RoleUnresolvedList> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.relation.RoleUnresolvedList]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(RoleUnresolvedList::new);
    }

    @Parameter(0)
    public Callable<RoleUnresolvedList> sutFactory;

    @Override
    public Callable<RoleUnresolvedList> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.management.relation.RoleUnresolvedList]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.management.relation.RoleUnresolvedList]

}
