package org.j8unit.repository.org.omg.CosNaming.NamingContextPackage;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.CosNaming.NamingContextPackage.AlreadyBoundHelper;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link AlreadyBoundHelper} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.org.omg.CosNaming.NamingContextPackage.AlreadyBoundHelperTests}).
 */
@RunWith(J8Unit4.class)
public class AlreadyBoundHelperTest
implements AlreadyBoundHelperTests<AlreadyBoundHelper> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.CosNaming.NamingContextPackage.AlreadyBoundHelper]

    @Override
    public AlreadyBoundHelper createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.CosNaming.NamingContextPackage.AlreadyBoundHelper], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.CosNaming.NamingContextPackage.AlreadyBoundHelper]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.CosNaming.NamingContextPackage.AlreadyBoundHelper]

}
