package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.PortableServer.IdAssignmentPolicy;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link IdAssignmentPolicy} (by simply reusing
 * the J8Unit test interface {@link IdAssignmentPolicyClassTests}).
 */

@RunWith(J8Unit4.class)
public class IdAssignmentPolicyClassTest
implements IdAssignmentPolicyClassTests<IdAssignmentPolicy> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.PortableServer.IdAssignmentPolicy]

    @Override
    public Class<IdAssignmentPolicy> createNewSUT() {
        return IdAssignmentPolicy.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.PortableServer.IdAssignmentPolicy]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.PortableServer.IdAssignmentPolicy]

}
