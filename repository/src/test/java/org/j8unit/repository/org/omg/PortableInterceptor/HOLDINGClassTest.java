package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class HOLDINGClassTest
implements org.j8unit.repository.org.omg.PortableInterceptor.HOLDINGClassTests<org.omg.PortableInterceptor.HOLDING> {

    @Override
    public Class<org.omg.PortableInterceptor.HOLDING> createNewSUT() {
        return org.omg.PortableInterceptor.HOLDING.class;
    }

}