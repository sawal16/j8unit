package org.j8unit.repository.java.awt.dnd;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link java.awt.dnd.DragSourceMotionListener interface java.awt.dnd.DragSourceMotionListener},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.awt.dnd.DragSourceMotionListenerClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface DragSourceMotionListenerTests<SUT extends java.awt.dnd.DragSourceMotionListener>
extends org.j8unit.repository.java.util.EventListenerTests<SUT>
{

    /**
     * <p>
     * Test method for {@link java.awt.dnd.DragSourceMotionListener#dragMouseMoved(java.awt.dnd.DragSourceDragEvent) public abstract void java.awt.dnd.DragSourceMotionListener.dragMouseMoved(java.awt.dnd.DragSourceDragEvent)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_dragMouseMoved_DragSourceDragEvent() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}