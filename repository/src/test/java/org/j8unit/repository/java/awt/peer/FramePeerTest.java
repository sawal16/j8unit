package org.j8unit.repository.java.awt.peer;

import java.awt.peer.FramePeer;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FramePeerTest
implements org.j8unit.repository.java.awt.peer.FramePeerTests<FramePeer> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.peer.FramePeer]

    @Override
    public FramePeer createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.awt.peer.FramePeer], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.peer.FramePeer]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.peer.FramePeer]

}
