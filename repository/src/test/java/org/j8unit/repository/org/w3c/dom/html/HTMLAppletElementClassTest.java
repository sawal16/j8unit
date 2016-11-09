package org.j8unit.repository.org.w3c.dom.html;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.html.HTMLAppletElement;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link HTMLAppletElement} (by simply reusing the
 * J8Unit test interface {@link HTMLAppletElementClassTests}).
 */

@RunWith(J8Unit4.class)
public class HTMLAppletElementClassTest
implements HTMLAppletElementClassTests<HTMLAppletElement> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.html.HTMLAppletElement]

    @Override
    public Class<HTMLAppletElement> createNewSUT() {
        return HTMLAppletElement.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.html.HTMLAppletElement]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.html.HTMLAppletElement]

}
