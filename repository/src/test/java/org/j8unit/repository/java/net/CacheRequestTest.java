package org.j8unit.repository.java.net;

import java.net.CacheRequest;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CacheRequestTest
implements org.j8unit.repository.java.net.CacheRequestTests<CacheRequest> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.net.CacheRequest]

    @Override
    public CacheRequest createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.net.CacheRequest], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.net.CacheRequest]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.net.CacheRequest]

}
