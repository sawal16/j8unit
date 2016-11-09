package org.j8unit.repository.javax.swing.text;

import javax.swing.text.ChangedCharSetException;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ChangedCharSetException} (by simply
 * reusing the J8Unit test interface {@link ChangedCharSetExceptionTests}).
 */

@RunWith(J8Unit4.class)
public class ChangedCharSetExceptionTest
implements ChangedCharSetExceptionTests<ChangedCharSetException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.ChangedCharSetException]

    @Override
    public ChangedCharSetException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.text.ChangedCharSetException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.ChangedCharSetException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.ChangedCharSetException]

}
