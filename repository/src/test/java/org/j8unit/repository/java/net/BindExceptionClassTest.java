package org.j8unit.repository.java.net;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BindExceptionClassTest
implements org.j8unit.repository.java.net.BindExceptionClassTests<java.net.BindException> {

    @Override
    public Class<java.net.BindException> createNewSUT() {
        return java.net.BindException.class;
    }

}