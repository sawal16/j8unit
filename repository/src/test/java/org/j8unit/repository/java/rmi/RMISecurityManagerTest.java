package org.j8unit.repository.java.rmi;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.rmi.RMISecurityManager;
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
@SuppressWarnings("deprecation")
public class RMISecurityManagerTest
implements FactoryBasedJ8UnitTest<RMISecurityManager>, RMISecurityManagerTests<RMISecurityManager> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.rmi.RMISecurityManager]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(RMISecurityManager::new);
    }

    @Parameter(0)
    public Callable<RMISecurityManager> sutFactory;

    @Override
    public Callable<RMISecurityManager> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.rmi.RMISecurityManager]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.rmi.RMISecurityManager]

}
