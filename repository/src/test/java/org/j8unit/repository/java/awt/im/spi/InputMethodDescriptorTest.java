package org.j8unit.repository.java.awt.im.spi;

import java.awt.im.spi.InputMethodDescriptor;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link InputMethodDescriptor} (by simply
 * reusing the J8Unit test interface {@link InputMethodDescriptorTests}).
 */

@RunWith(J8Unit4.class)
public class InputMethodDescriptorTest
implements InputMethodDescriptorTests<InputMethodDescriptor> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.im.spi.InputMethodDescriptor]

    @Override
    public InputMethodDescriptor createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.awt.im.spi.InputMethodDescriptor], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.im.spi.InputMethodDescriptor]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.im.spi.InputMethodDescriptor]

}
