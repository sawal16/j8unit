package org.j8unit.repository.org.w3c.dom.css;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.w3c.dom.css.RGBColor;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link RGBColor} (by simply reusing the
 * J8Unit test interface {@link RGBColorTests}).
 */

@RunWith(J8Unit4.class)
public class RGBColorTest
implements RGBColorTests<RGBColor> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.w3c.dom.css.RGBColor]

    @Override
    public RGBColor createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.w3c.dom.css.RGBColor], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.w3c.dom.css.RGBColor]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.w3c.dom.css.RGBColor]

}
