package org.j8unit.repository.java.awt.color;

import java.awt.color.ICC_ProfileGray;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ICC_ProfileGray} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.awt.color.ICC_ProfileGrayTests}).
 */
@RunWith(J8Unit4.class)
public class ICC_ProfileGrayTest
implements ICC_ProfileGrayTests<ICC_ProfileGray> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.color.ICC_ProfileGray]

    @Override
    public ICC_ProfileGray createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.awt.color.ICC_ProfileGray], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.color.ICC_ProfileGray]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.color.ICC_ProfileGray]

}
