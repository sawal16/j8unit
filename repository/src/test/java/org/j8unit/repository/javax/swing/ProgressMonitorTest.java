package org.j8unit.repository.javax.swing;

import javax.swing.ProgressMonitor;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ProgressMonitor} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.swing.ProgressMonitorTests}).
 */
@RunWith(J8Unit4.class)
public class ProgressMonitorTest
implements ProgressMonitorTests<ProgressMonitor> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.ProgressMonitor]

    @Override
    public ProgressMonitor createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.ProgressMonitor], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.ProgressMonitor]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.ProgressMonitor]

}
