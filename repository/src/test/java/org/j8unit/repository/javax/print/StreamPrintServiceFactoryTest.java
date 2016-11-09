package org.j8unit.repository.javax.print;

import javax.print.StreamPrintServiceFactory;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link StreamPrintServiceFactory} (by simply
 * reusing the J8Unit test interface {@link StreamPrintServiceFactoryTests}).
 */

@RunWith(J8Unit4.class)
public class StreamPrintServiceFactoryTest
implements StreamPrintServiceFactoryTests<StreamPrintServiceFactory> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.StreamPrintServiceFactory]

    @Override
    public StreamPrintServiceFactory createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.print.StreamPrintServiceFactory], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.print.StreamPrintServiceFactory]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.print.StreamPrintServiceFactory]

}
