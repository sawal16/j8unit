package org.j8unit.repository.javax.xml.xpath;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class XPathExceptionTest
implements org.j8unit.repository.javax.xml.xpath.XPathExceptionTests<javax.xml.xpath.XPathException> {

    @Override
    public javax.xml.xpath.XPathException createNewSUT() {
        throw new AssertionError("There is no default constructor for [javax.xml.xpath.XPathException] available.");
    }

}
