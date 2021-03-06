package org.j8unit.repository.java.awt.event;

import java.awt.event.FocusEvent;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link FocusEvent} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.awt.event.FocusEventTests}).
 */
@RunWith(J8Unit4.class)
public class FocusEventTest
implements FocusEventTests<FocusEvent> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.event.FocusEvent]

    @Override
    public FocusEvent createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.awt.event.FocusEvent], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.event.FocusEvent]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.event.FocusEvent]

}
