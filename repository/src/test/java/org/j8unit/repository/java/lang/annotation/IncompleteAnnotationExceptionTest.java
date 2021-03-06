package org.j8unit.repository.java.lang.annotation;

import java.lang.annotation.IncompleteAnnotationException;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link IncompleteAnnotationException} (by
 * simply reusing the J8Unit test interface
 * {@link org.j8unit.repository.java.lang.annotation.IncompleteAnnotationExceptionTests}).
 */
@RunWith(J8Unit4.class)
public class IncompleteAnnotationExceptionTest
implements IncompleteAnnotationExceptionTests<IncompleteAnnotationException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.annotation.IncompleteAnnotationException]

    @Override
    public IncompleteAnnotationException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.lang.annotation.IncompleteAnnotationException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.lang.annotation.IncompleteAnnotationException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.lang.annotation.IncompleteAnnotationException]

}
