package org.j8unit.repository.javax.swing.text;

import javax.swing.text.CompositeView;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link CompositeView} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.swing.text.CompositeViewTests}).
 */
@RunWith(J8Unit4.class)
public class CompositeViewTest
implements CompositeViewTests<CompositeView> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.CompositeView]

    @Override
    public CompositeView createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.text.CompositeView], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.CompositeView]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.CompositeView]

}
