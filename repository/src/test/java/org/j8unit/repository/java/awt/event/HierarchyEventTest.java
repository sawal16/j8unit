package org.j8unit.repository.java.awt.event;

import java.awt.event.HierarchyEvent;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class HierarchyEventTest
implements org.j8unit.repository.java.awt.event.HierarchyEventTests<HierarchyEvent> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.event.HierarchyEvent]

    @Override
    public HierarchyEvent createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.awt.event.HierarchyEvent], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.event.HierarchyEvent]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.event.HierarchyEvent]

}
