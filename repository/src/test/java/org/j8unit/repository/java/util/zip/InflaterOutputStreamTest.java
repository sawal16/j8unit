package org.j8unit.repository.java.util.zip;

import java.util.zip.InflaterOutputStream;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link InflaterOutputStream} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.java.util.zip.InflaterOutputStreamTests}).
 */
@RunWith(J8Unit4.class)
public class InflaterOutputStreamTest
implements InflaterOutputStreamTests<InflaterOutputStream> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.zip.InflaterOutputStream]

    @Override
    public InflaterOutputStream createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.util.zip.InflaterOutputStream], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.zip.InflaterOutputStream]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.zip.InflaterOutputStream]

}
