package org.j8unit.repository.javax.swing.plaf;

import javax.swing.plaf.ListUI;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ListUI} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.swing.plaf.ListUITests}).
 */

@RunWith(J8Unit4.class)
public class ListUITest
implements ListUITests<ListUI> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.ListUI]

    @Override
    public ListUI createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.plaf.ListUI], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.ListUI]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.ListUI]

}
