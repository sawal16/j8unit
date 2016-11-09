package org.j8unit.repository.javax.print;

import javax.print.URIException;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link URIException} (by simply reusing the
 * J8Unit test interface {@link URIExceptionTests}).
 */

@RunWith(J8Unit4.class)
public class URIExceptionTest
implements URIExceptionTests<URIException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.URIException]

    @Override
    public URIException createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.print.URIException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.print.URIException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.print.URIException]

}
