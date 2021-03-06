package org.j8unit.repository.javax.tools;

import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import javax.tools.StandardLocation;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link StandardLocation} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.tools.StandardLocationTests}).
 */
@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class StandardLocationTest
implements StandardLocationTests<StandardLocation> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.tools.StandardLocation]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOfEnumClass(StandardLocation.class);
    }

    @Parameter(0)
    public StandardLocation sut;

    @Override
    public StandardLocation createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.tools.StandardLocation]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.tools.StandardLocation]

}
