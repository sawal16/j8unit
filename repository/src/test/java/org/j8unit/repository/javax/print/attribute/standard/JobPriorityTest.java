package org.j8unit.repository.javax.print.attribute.standard;

import javax.print.attribute.standard.JobPriority;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JobPriorityTest
implements org.j8unit.repository.javax.print.attribute.standard.JobPriorityTests<JobPriority> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.attribute.standard.JobPriority]

    @Override
    public JobPriority createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.print.attribute.standard.JobPriority], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.print.attribute.standard.JobPriority]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.print.attribute.standard.JobPriority]

}
