package org.j8unit.repository.javax.xml.bind;

import javax.xml.bind.Element;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ElementTest
implements org.j8unit.repository.javax.xml.bind.ElementTests<Element> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.bind.Element]

    @Override
    public Element createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.bind.Element], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.bind.Element]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.bind.Element]

}
