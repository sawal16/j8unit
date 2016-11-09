package org.j8unit.repository.javax.lang.model.util;

import javax.lang.model.util.AbstractTypeVisitor7;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link AbstractTypeVisitor7} (by simply
 * reusing the J8Unit test interface {@link AbstractTypeVisitor7Tests}).
 */

@RunWith(J8Unit4.class)
public class AbstractTypeVisitor7Test<R, P>
implements AbstractTypeVisitor7Tests<AbstractTypeVisitor7<R, P>, R, P> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.lang.model.util.AbstractTypeVisitor7]

    @Override
    public AbstractTypeVisitor7<R, P> createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.lang.model.util.AbstractTypeVisitor7], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.lang.model.util.AbstractTypeVisitor7]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.lang.model.util.AbstractTypeVisitor7]

}
