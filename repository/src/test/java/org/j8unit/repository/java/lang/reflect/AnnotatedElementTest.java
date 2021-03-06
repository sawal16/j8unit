package org.j8unit.repository.java.lang.reflect;

import java.lang.reflect.AnnotatedElement;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link AnnotatedElement} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.lang.reflect.AnnotatedElementTests}).
 */
@RunWith(J8Unit4.class)
public class AnnotatedElementTest
implements AnnotatedElementTests<AnnotatedElement> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.reflect.AnnotatedElement]

    @Override
    public AnnotatedElement createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.lang.reflect.AnnotatedElement], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.lang.reflect.AnnotatedElement]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.lang.reflect.AnnotatedElement]

}
