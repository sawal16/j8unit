package org.j8unit.repository.java.lang.annotation;

import java.lang.annotation.Documented;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Documented} (by simply reusing the
 * J8Unit test interface {@link DocumentedTests}).
 */

@RunWith(J8Unit4.class)
public class DocumentedTest
implements DocumentedTests<Documented> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.annotation.Documented]

    @Override
    public Documented createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.lang.annotation.Documented], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.lang.annotation.Documented]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.lang.annotation.Documented]

}
