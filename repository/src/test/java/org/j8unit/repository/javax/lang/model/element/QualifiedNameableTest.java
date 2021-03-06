package org.j8unit.repository.javax.lang.model.element;

import javax.lang.model.element.QualifiedNameable;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link QualifiedNameable} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.lang.model.element.QualifiedNameableTests}).
 */
@RunWith(J8Unit4.class)
public class QualifiedNameableTest
implements QualifiedNameableTests<QualifiedNameable> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.lang.model.element.QualifiedNameable]

    @Override
    public QualifiedNameable createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.lang.model.element.QualifiedNameable], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.lang.model.element.QualifiedNameable]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.lang.model.element.QualifiedNameable]

}
