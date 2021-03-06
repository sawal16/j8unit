package org.j8unit.repository.javax.xml.crypto.dsig;

import javax.xml.crypto.dsig.XMLValidateContext;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link XMLValidateContext} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.xml.crypto.dsig.XMLValidateContextTests}).
 */
@RunWith(J8Unit4.class)
public class XMLValidateContextTest
implements XMLValidateContextTests<XMLValidateContext> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.crypto.dsig.XMLValidateContext]

    @Override
    public XMLValidateContext createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.crypto.dsig.XMLValidateContext], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.crypto.dsig.XMLValidateContext]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.crypto.dsig.XMLValidateContext]

}
