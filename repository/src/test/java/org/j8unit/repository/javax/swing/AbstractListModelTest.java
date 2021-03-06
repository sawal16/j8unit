package org.j8unit.repository.javax.swing;

import javax.swing.AbstractListModel;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link AbstractListModel} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.swing.AbstractListModelTests}).
 */
@RunWith(J8Unit4.class)
public class AbstractListModelTest<E>
implements AbstractListModelTests<AbstractListModel<E>, E> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.AbstractListModel]

    @Override
    public AbstractListModel<E> createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.AbstractListModel], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.AbstractListModel]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.AbstractListModel]

}
