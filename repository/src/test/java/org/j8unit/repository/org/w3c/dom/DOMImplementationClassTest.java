package org.j8unit.repository.org.w3c.dom;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DOMImplementationClassTest
implements org.j8unit.repository.org.w3c.dom.DOMImplementationClassTests<org.w3c.dom.DOMImplementation> {

    @Override
    public Class<org.w3c.dom.DOMImplementation> createNewSUT() {
        return org.w3c.dom.DOMImplementation.class;
    }

}
