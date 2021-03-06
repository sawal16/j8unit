package org.j8unit.repository.javax.xml.bind.annotation;

import javax.xml.bind.annotation.XmlElements;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link XmlElements} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.xml.bind.annotation.XmlElementsClassTests}).
 */
@RunWith(J8Unit4.class)
public class XmlElementsClassTest
implements XmlElementsClassTests<XmlElements> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.bind.annotation.XmlElements]

    @Override
    public Class<XmlElements> createNewSUT() {
        return XmlElements.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.bind.annotation.XmlElements]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.bind.annotation.XmlElements]

}
