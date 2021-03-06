package org.j8unit.repository.org.omg.CORBA;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;
import org.omg.CORBA.SetOverrideType;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link SetOverrideType} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.org.omg.CORBA.SetOverrideTypeTests}).
 */
@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class SetOverrideTypeTest
implements SetOverrideTypeTests<SetOverrideType> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.CORBA.SetOverrideType]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(SetOverrideType.ADD_OVERRIDE, //
                                SetOverrideType.SET_OVERRIDE);
    }

    @Parameter(0)
    public SetOverrideType sut;

    @Override
    public SetOverrideType createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.CORBA.SetOverrideType]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.CORBA.SetOverrideType]

}
