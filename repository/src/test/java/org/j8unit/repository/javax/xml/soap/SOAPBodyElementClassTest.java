package org.j8unit.repository.javax.xml.soap;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SOAPBodyElementClassTest
implements org.j8unit.repository.javax.xml.soap.SOAPBodyElementClassTests<javax.xml.soap.SOAPBodyElement> {

    @Override
    public Class<javax.xml.soap.SOAPBodyElement> createNewSUT() {
        return javax.xml.soap.SOAPBodyElement.class;
    }

}
