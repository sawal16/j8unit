package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.PortableInterceptor.ORBInitInfoOperations;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ORBInitInfoOperations} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.org.omg.PortableInterceptor.ORBInitInfoOperationsClassTests}).
 */
@RunWith(J8Unit4.class)
public class ORBInitInfoOperationsClassTest
implements ORBInitInfoOperationsClassTests<ORBInitInfoOperations> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.PortableInterceptor.ORBInitInfoOperations]

    @Override
    public Class<ORBInitInfoOperations> createNewSUT() {
        return ORBInitInfoOperations.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.PortableInterceptor.ORBInitInfoOperations]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.PortableInterceptor.ORBInitInfoOperations]

}
