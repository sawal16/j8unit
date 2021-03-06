package org.j8unit.repository.javax.xml.crypto.dsig.dom;

import javax.xml.crypto.dsig.dom.DOMSignContext;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link DOMSignContext} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.xml.crypto.dsig.dom.DOMSignContextTests}).
 */
@RunWith(J8Unit4.class)
public class DOMSignContextTest
implements DOMSignContextTests<DOMSignContext> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.crypto.dsig.dom.DOMSignContext]

    @Override
    public DOMSignContext createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.xml.crypto.dsig.dom.DOMSignContext], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.crypto.dsig.dom.DOMSignContext]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.crypto.dsig.dom.DOMSignContext]

}
