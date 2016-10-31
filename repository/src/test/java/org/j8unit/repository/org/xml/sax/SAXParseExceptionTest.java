package org.j8unit.repository.org.xml.sax;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.xml.sax.SAXParseException;

@RunWith(J8Unit4.class)
public class SAXParseExceptionTest
implements org.j8unit.repository.org.xml.sax.SAXParseExceptionTests<SAXParseException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.xml.sax.SAXParseException]

    @Override
    public SAXParseException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [org.xml.sax.SAXParseException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.xml.sax.SAXParseException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.xml.sax.SAXParseException]

}
