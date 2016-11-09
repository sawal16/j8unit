package org.j8unit.repository.javax.naming.event;

import javax.naming.event.NamingListener;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link NamingListener} (by simply reusing
 * the J8Unit test interface {@link NamingListenerTests}).
 */

@RunWith(J8Unit4.class)
public class NamingListenerTest
implements NamingListenerTests<NamingListener> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.naming.event.NamingListener]

    @Override
    public NamingListener createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.naming.event.NamingListener], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.naming.event.NamingListener]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.naming.event.NamingListener]

}
