package org.j8unit.repository.javax.security.auth.kerberos;

import javax.security.auth.kerberos.KeyTab;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link KeyTab} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.security.auth.kerberos.KeyTabTests}).
 */
@RunWith(J8Unit4.class)
public class KeyTabTest
implements KeyTabTests<KeyTab> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.security.auth.kerberos.KeyTab]

    @Override
    public KeyTab createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.security.auth.kerberos.KeyTab], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.security.auth.kerberos.KeyTab]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.security.auth.kerberos.KeyTab]

}
