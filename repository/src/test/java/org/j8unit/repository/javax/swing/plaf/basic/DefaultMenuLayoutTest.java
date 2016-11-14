package org.j8unit.repository.javax.swing.plaf.basic;

import javax.swing.plaf.basic.DefaultMenuLayout;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link DefaultMenuLayout} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.swing.plaf.basic.DefaultMenuLayoutTests}).
 */

@RunWith(J8Unit4.class)
public class DefaultMenuLayoutTest
implements DefaultMenuLayoutTests<DefaultMenuLayout> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.DefaultMenuLayout]

    @Override
    public DefaultMenuLayout createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.plaf.basic.DefaultMenuLayout], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.basic.DefaultMenuLayout]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.basic.DefaultMenuLayout]

}
