package org.j8unit.repository.java.security.spec;

import java.security.spec.ECFieldFp;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ECFieldFpTest
implements org.j8unit.repository.java.security.spec.ECFieldFpTests<ECFieldFp> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.spec.ECFieldFp]

    @Override
    public ECFieldFp createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.security.spec.ECFieldFp], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.security.spec.ECFieldFp]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.security.spec.ECFieldFp]

}
