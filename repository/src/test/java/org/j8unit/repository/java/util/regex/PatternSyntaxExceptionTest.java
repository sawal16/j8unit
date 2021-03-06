package org.j8unit.repository.java.util.regex;

import java.util.regex.PatternSyntaxException;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link PatternSyntaxException} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.java.util.regex.PatternSyntaxExceptionTests}).
 */
@RunWith(J8Unit4.class)
public class PatternSyntaxExceptionTest
implements PatternSyntaxExceptionTests<PatternSyntaxException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.regex.PatternSyntaxException]

    @Override
    public PatternSyntaxException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.util.regex.PatternSyntaxException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.regex.PatternSyntaxException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.regex.PatternSyntaxException]

}
