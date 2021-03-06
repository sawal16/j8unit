package org.j8unit.repository.javax.crypto;

import javax.crypto.KeyAgreementSpi;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link KeyAgreementSpi} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.crypto.KeyAgreementSpiTests}).
 */
@RunWith(J8Unit4.class)
public class KeyAgreementSpiTest
implements KeyAgreementSpiTests<KeyAgreementSpi> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.crypto.KeyAgreementSpi]

    @Override
    public KeyAgreementSpi createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.crypto.KeyAgreementSpi], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.crypto.KeyAgreementSpi]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.crypto.KeyAgreementSpi]

}
