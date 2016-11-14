package org.j8unit.repository.java.time.temporal;

import java.time.temporal.TemporalQuery;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link TemporalQuery} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.time.temporal.TemporalQueryClassTests}).
 */
@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class TemporalQueryClassTest
implements TemporalQueryClassTests<TemporalQuery> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.time.temporal.TemporalQuery]

    @Override
    public Class<TemporalQuery> createNewSUT() {
        return TemporalQuery.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.time.temporal.TemporalQuery]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.time.temporal.TemporalQuery]

}
