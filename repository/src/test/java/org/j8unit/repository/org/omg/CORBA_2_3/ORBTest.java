package org.j8unit.repository.org.omg.CORBA_2_3;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.CORBA_2_3.ORB;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ORB} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.org.omg.CORBA_2_3.ORBTests}).
 */
@RunWith(J8Unit4.class)
public class ORBTest
implements org.j8unit.repository.org.omg.CORBA_2_3.ORBTests<ORB> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.CORBA_2_3.ORB]

    @Override
    public ORB createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.CORBA_2_3.ORB], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.CORBA_2_3.ORB]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.CORBA_2_3.ORB]

}
