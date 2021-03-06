package org.j8unit.repository.javax.xml.stream.events;

import javax.xml.stream.events.StartElement;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link StartElement} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.xml.stream.events.StartElementTests}).
 */
@RunWith(J8Unit4.class)
public class StartElementTest
implements StartElementTests<StartElement> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.stream.events.StartElement]

    @Override
    public StartElement createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.stream.events.StartElement], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.stream.events.StartElement]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.stream.events.StartElement]

}
