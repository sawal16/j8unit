package org.j8unit.repository.java.lang.reflect;

import java.lang.reflect.Field;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Field} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.lang.reflect.FieldTests}).
 */
@RunWith(J8Unit4.class)
public class FieldTest
implements org.j8unit.repository.java.lang.reflect.FieldTests<Field> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.reflect.Field]

    @Override
    public Field createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.lang.reflect.Field], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.lang.reflect.Field]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.lang.reflect.Field]

}
