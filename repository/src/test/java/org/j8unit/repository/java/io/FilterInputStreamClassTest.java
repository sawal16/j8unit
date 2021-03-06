package org.j8unit.repository.java.io;

import java.io.FilterInputStream;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link FilterInputStream} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.io.FilterInputStreamClassTests}).
 */
@RunWith(J8Unit4.class)
public class FilterInputStreamClassTest
implements FilterInputStreamClassTests<FilterInputStream> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.io.FilterInputStream]

    @Override
    public Class<FilterInputStream> createNewSUT() {
        return FilterInputStream.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.io.FilterInputStream]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.io.FilterInputStream]

}
