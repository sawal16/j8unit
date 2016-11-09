package org.j8unit.repository.java.awt.image.renderable;

import java.awt.image.renderable.RenderedImageFactory;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link RenderedImageFactory} (by simply
 * reusing the J8Unit test interface {@link RenderedImageFactoryTests}).
 */

@RunWith(J8Unit4.class)
public class RenderedImageFactoryTest
implements RenderedImageFactoryTests<RenderedImageFactory> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.image.renderable.RenderedImageFactory]

    @Override
    public RenderedImageFactory createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.awt.image.renderable.RenderedImageFactory], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.image.renderable.RenderedImageFactory]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.image.renderable.RenderedImageFactory]

}
