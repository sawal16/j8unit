package org.j8unit.repository.java.util.function;

import java.util.function.ToIntBiFunction;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ToIntBiFunctionTest<T, U>
implements org.j8unit.repository.java.util.function.ToIntBiFunctionTests<ToIntBiFunction<T, U>, T, U> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.function.ToIntBiFunction]

    @Override
    public ToIntBiFunction<T, U> createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.function.ToIntBiFunction], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.function.ToIntBiFunction]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.function.ToIntBiFunction]

}
