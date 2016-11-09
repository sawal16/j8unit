package org.j8unit.repository.java.lang.invoke;

import java.lang.invoke.ConstantCallSite;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ConstantCallSite} (by simply reusing
 * the J8Unit test interface {@link ConstantCallSiteTests}).
 */

@RunWith(J8Unit4.class)
public class ConstantCallSiteTest
implements ConstantCallSiteTests<ConstantCallSite> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.invoke.ConstantCallSite]

    @Override
    public ConstantCallSite createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.lang.invoke.ConstantCallSite], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.lang.invoke.ConstantCallSite]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.lang.invoke.ConstantCallSite]

}
