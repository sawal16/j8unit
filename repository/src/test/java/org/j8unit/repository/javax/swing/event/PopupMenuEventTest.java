package org.j8unit.repository.javax.swing.event;

import javax.swing.event.PopupMenuEvent;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PopupMenuEventTest
implements org.j8unit.repository.javax.swing.event.PopupMenuEventTests<PopupMenuEvent> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.event.PopupMenuEvent]

    @Override
    public PopupMenuEvent createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.event.PopupMenuEvent], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.event.PopupMenuEvent]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.event.PopupMenuEvent]

}
