package org.j8unit.repository.javax.xml.crypto.dsig;

import javax.xml.crypto.dsig.SignatureProperty;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link SignatureProperty} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.xml.crypto.dsig.SignaturePropertyTests}).
 */
@RunWith(J8Unit4.class)
public class SignaturePropertyTest
implements SignaturePropertyTests<SignatureProperty> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.crypto.dsig.SignatureProperty]

    @Override
    public SignatureProperty createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.crypto.dsig.SignatureProperty], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.crypto.dsig.SignatureProperty]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.crypto.dsig.SignatureProperty]

}
