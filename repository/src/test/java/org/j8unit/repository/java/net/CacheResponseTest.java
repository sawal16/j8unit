package org.j8unit.repository.java.net;

import java.net.CacheResponse;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CacheResponseTest
implements org.j8unit.repository.java.net.CacheResponseTests<CacheResponse> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.net.CacheResponse]

    @Override
    public CacheResponse createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.net.CacheResponse], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.net.CacheResponse]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.net.CacheResponse]

}
