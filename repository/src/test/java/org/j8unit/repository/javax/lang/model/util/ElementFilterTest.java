package org.j8unit.repository.javax.lang.model.util;

import javax.lang.model.util.ElementFilter;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ElementFilter} (by simply reusing the
 * J8Unit test interface {@link ElementFilterTests}).
 */

@RunWith(J8Unit4.class)
public class ElementFilterTest
implements ElementFilterTests<ElementFilter> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.lang.model.util.ElementFilter]

    @Override
    public ElementFilter createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.lang.model.util.ElementFilter], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.lang.model.util.ElementFilter]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.lang.model.util.ElementFilter]

}
