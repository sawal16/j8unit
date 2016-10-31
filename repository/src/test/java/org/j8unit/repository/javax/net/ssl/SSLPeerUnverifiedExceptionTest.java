package org.j8unit.repository.javax.net.ssl;

import javax.net.ssl.SSLPeerUnverifiedException;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SSLPeerUnverifiedExceptionTest
implements org.j8unit.repository.javax.net.ssl.SSLPeerUnverifiedExceptionTests<SSLPeerUnverifiedException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.net.ssl.SSLPeerUnverifiedException]

    @Override
    public SSLPeerUnverifiedException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.net.ssl.SSLPeerUnverifiedException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.net.ssl.SSLPeerUnverifiedException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.net.ssl.SSLPeerUnverifiedException]

}
