package org.j8unit.repository.javax.xml.stream;

import javax.xml.stream.XMLStreamConstants;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link XMLStreamConstants} (by simply reusing
 * the J8Unit test interface {@link XMLStreamConstantsClassTests}).
 */

@RunWith(J8Unit4.class)
public class XMLStreamConstantsClassTest
implements XMLStreamConstantsClassTests<XMLStreamConstants> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.stream.XMLStreamConstants]

    @Override
    public Class<XMLStreamConstants> createNewSUT() {
        return XMLStreamConstants.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.stream.XMLStreamConstants]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.stream.XMLStreamConstants]

}
