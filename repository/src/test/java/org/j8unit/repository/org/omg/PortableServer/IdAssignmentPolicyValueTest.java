package org.j8unit.repository.org.omg.PortableServer;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;
import org.omg.PortableServer.IdAssignmentPolicyValue;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link IdAssignmentPolicyValue} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.org.omg.PortableServer.IdAssignmentPolicyValueTests}).
 */
@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class IdAssignmentPolicyValueTest
implements IdAssignmentPolicyValueTests<IdAssignmentPolicyValue> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.PortableServer.IdAssignmentPolicyValue]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(IdAssignmentPolicyValue.SYSTEM_ID, //
                                IdAssignmentPolicyValue.USER_ID);
    }

    @Parameter(0)
    public IdAssignmentPolicyValue sut;

    @Override
    public IdAssignmentPolicyValue createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.PortableServer.IdAssignmentPolicyValue]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.PortableServer.IdAssignmentPolicyValue]

}
