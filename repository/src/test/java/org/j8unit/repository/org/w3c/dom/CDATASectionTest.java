package org.j8unit.repository.org.w3c.dom;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.w3c.dom.CDATASection;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link CDATASection} (by simply reusing the
 * J8Unit test interface {@link CDATASectionTests}).
 */

@RunWith(J8Unit4.class)
public class CDATASectionTest
implements CDATASectionTests<CDATASection> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.w3c.dom.CDATASection]

    @Override
    public CDATASection createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.w3c.dom.CDATASection], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.w3c.dom.CDATASection]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.w3c.dom.CDATASection]

}
