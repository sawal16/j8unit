package org.j8unit.repository.java.awt;

import java.awt.GraphicsConfiguration;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link GraphicsConfiguration} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.java.awt.GraphicsConfigurationTests}).
 */
@RunWith(J8Unit4.class)
public class GraphicsConfigurationTest
implements GraphicsConfigurationTests<GraphicsConfiguration> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.GraphicsConfiguration]

    @Override
    public GraphicsConfiguration createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.awt.GraphicsConfiguration], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.GraphicsConfiguration]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.GraphicsConfiguration]

}
