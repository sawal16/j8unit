package org.j8unit.repository.javax.management;

import javax.management.NotificationEmitter;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link NotificationEmitter} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.management.NotificationEmitterTests}).
 */
@RunWith(J8Unit4.class)
public class NotificationEmitterTest
implements NotificationEmitterTests<NotificationEmitter> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.NotificationEmitter]

    @Override
    public NotificationEmitter createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.management.NotificationEmitter], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.management.NotificationEmitter]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.management.NotificationEmitter]

}
