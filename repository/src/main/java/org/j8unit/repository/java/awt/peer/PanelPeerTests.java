package org.j8unit.repository.java.awt.peer;

import java.awt.peer.PanelPeer;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
 * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test {@link PanelPeer
 * public abstract interface java.awt.peer.PanelPeer}.
 * </p>
 *
 * <p>
 * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints. For
 * this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects (see
 * {@link org.j8unit.repository.java.awt.peer.PanelPeerClassTests}).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface PanelPeerTests<SUT extends PanelPeer>
extends ContainerPeerTests<SUT> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.peer.PanelPeer]

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.peer.PanelPeer]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.peer.PanelPeer]

}
