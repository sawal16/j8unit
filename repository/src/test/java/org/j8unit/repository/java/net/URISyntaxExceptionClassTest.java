package org.j8unit.repository.java.net;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class URISyntaxExceptionClassTest
implements org.j8unit.repository.java.net.URISyntaxExceptionClassTests<java.net.URISyntaxException> {

    @Override
    public Class<java.net.URISyntaxException> createNewSUT() {
        return java.net.URISyntaxException.class;
    }

}