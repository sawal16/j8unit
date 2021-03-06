package org.j8unit.repository.org.w3c.dom.html;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.html.HTMLParamElement;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link HTMLParamElement} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.w3c.dom.html.HTMLParamElementClassTests}).
 */
@RunWith(J8Unit4.class)
public class HTMLParamElementClassTest
implements HTMLParamElementClassTests<HTMLParamElement> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.html.HTMLParamElement]

    @Override
    public Class<HTMLParamElement> createNewSUT() {
        return HTMLParamElement.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.html.HTMLParamElement]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.html.HTMLParamElement]

}
