package org.j8unit.repository.java.util;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ServiceLoaderTest<S>
implements org.j8unit.repository.java.util.ServiceLoaderTests<java.util.ServiceLoader<S>, S> {

    @Override
    public java.util.ServiceLoader<S> createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.util.ServiceLoader] available.");
    }

}