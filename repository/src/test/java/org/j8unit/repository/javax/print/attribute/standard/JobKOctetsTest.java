package org.j8unit.repository.javax.print.attribute.standard;

import javax.print.attribute.standard.JobKOctets;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link JobKOctets} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.print.attribute.standard.JobKOctetsTests}).
 */

@RunWith(J8Unit4.class)
public class JobKOctetsTest
implements JobKOctetsTests<JobKOctets> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.attribute.standard.JobKOctets]

    @Override
    public JobKOctets createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.print.attribute.standard.JobKOctets], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.print.attribute.standard.JobKOctets]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.print.attribute.standard.JobKOctets]

}
