package org.j8unit.repository.java.awt;

import java.awt.RadialGradientPaint;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link RadialGradientPaint} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.java.awt.RadialGradientPaintTests}).
 */
@RunWith(J8Unit4.class)
public class RadialGradientPaintTest
implements RadialGradientPaintTests<RadialGradientPaint> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.RadialGradientPaint]

    @Override
    public RadialGradientPaint createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.awt.RadialGradientPaint], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.RadialGradientPaint]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.RadialGradientPaint]

}
