package org.j8unit.repository.javax.management;

import javax.management.MBeanOperationInfo;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MBeanOperationInfoTest
implements org.j8unit.repository.javax.management.MBeanOperationInfoTests<MBeanOperationInfo> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.MBeanOperationInfo]

    @Override
    public MBeanOperationInfo createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.management.MBeanOperationInfo], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.management.MBeanOperationInfo]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.management.MBeanOperationInfo]

}
