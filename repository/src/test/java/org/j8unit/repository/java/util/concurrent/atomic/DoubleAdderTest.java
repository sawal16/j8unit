package org.j8unit.repository.java.util.concurrent.atomic;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DoubleAdderTest
implements org.j8unit.repository.java.util.concurrent.atomic.DoubleAdderTests<java.util.concurrent.atomic.DoubleAdder> {

    @Override
    public java.util.concurrent.atomic.DoubleAdder createNewSUT() {
        return new java.util.concurrent.atomic.DoubleAdder();
    }

}