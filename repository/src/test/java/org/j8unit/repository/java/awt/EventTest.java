package org.j8unit.repository.java.awt;

import java.awt.Event;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class EventTest
implements org.j8unit.repository.java.awt.EventTests<Event> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.Event]

    @Override
    public Event createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.awt.Event], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.Event]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.Event]

}
