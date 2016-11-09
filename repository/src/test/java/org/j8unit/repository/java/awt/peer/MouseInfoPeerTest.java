package org.j8unit.repository.java.awt.peer;

import java.awt.peer.MouseInfoPeer;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link MouseInfoPeer} (by simply reusing the
 * J8Unit test interface {@link MouseInfoPeerTests}).
 */

@RunWith(J8Unit4.class)
public class MouseInfoPeerTest
implements MouseInfoPeerTests<MouseInfoPeer> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.peer.MouseInfoPeer]

    @Override
    public MouseInfoPeer createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.awt.peer.MouseInfoPeer], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.peer.MouseInfoPeer]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.peer.MouseInfoPeer]

}
