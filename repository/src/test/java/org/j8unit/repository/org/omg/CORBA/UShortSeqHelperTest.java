package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.CORBA.UShortSeqHelper;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link UShortSeqHelper} (by simply reusing
 * the J8Unit test interface {@link UShortSeqHelperTests}).
 */

@RunWith(J8Unit4.class)
public class UShortSeqHelperTest
implements UShortSeqHelperTests<UShortSeqHelper> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.CORBA.UShortSeqHelper]

    @Override
    public UShortSeqHelper createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.CORBA.UShortSeqHelper], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.CORBA.UShortSeqHelper]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.CORBA.UShortSeqHelper]

}
