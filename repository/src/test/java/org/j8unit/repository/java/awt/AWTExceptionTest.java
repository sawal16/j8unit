package org.j8unit.repository.java.awt;

import java.awt.AWTException;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AWTExceptionTest
implements org.j8unit.repository.java.awt.AWTExceptionTests<AWTException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.AWTException]

    @Override
    public AWTException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.awt.AWTException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.AWTException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.AWTException]

}
