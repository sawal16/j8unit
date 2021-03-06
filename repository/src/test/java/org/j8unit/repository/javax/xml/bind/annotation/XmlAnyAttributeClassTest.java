package org.j8unit.repository.javax.xml.bind.annotation;

import javax.xml.bind.annotation.XmlAnyAttribute;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link XmlAnyAttribute} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.xml.bind.annotation.XmlAnyAttributeClassTests}).
 */
@RunWith(J8Unit4.class)
public class XmlAnyAttributeClassTest
implements XmlAnyAttributeClassTests<XmlAnyAttribute> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.bind.annotation.XmlAnyAttribute]

    @Override
    public Class<XmlAnyAttribute> createNewSUT() {
        return XmlAnyAttribute.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.bind.annotation.XmlAnyAttribute]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.bind.annotation.XmlAnyAttribute]

}
