package org.j8unit.repository.org.omg.CosNaming;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.CosNaming._NamingContextImplBase;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link _NamingContextImplBase} (by simply
 * reusing the J8Unit test interface {@link _NamingContextImplBaseTests}).
 */

@RunWith(J8Unit4.class)
public class _NamingContextImplBaseTest
implements _NamingContextImplBaseTests<_NamingContextImplBase> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.CosNaming._NamingContextImplBase]

    @Override
    public _NamingContextImplBase createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.CosNaming._NamingContextImplBase], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.CosNaming._NamingContextImplBase]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.CosNaming._NamingContextImplBase]

}
