package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Class} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.lang.ClassTests}).
 */
@RunWith(J8Unit4.class)
public class ClassTest<T>
implements ClassTests<Class<T>, T> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.Class]

    @Override
    public Class<T> createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.lang.Class], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.lang.Class]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.lang.Class]

}
