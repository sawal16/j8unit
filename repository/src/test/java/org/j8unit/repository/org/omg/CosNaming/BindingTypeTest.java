package org.j8unit.repository.org.omg.CosNaming;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;
import org.omg.CosNaming.BindingType;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link BindingType} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.omg.CosNaming.BindingTypeTests}).
 */
@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class BindingTypeTest
implements BindingTypeTests<BindingType> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.CosNaming.BindingType]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(BindingType.ncontext, //
                                BindingType.nobject);
    }

    @Parameter(0)
    public BindingType sut;

    @Override
    public BindingType createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.CosNaming.BindingType]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.CosNaming.BindingType]

}
