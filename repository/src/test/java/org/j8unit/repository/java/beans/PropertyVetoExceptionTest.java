package org.j8unit.repository.java.beans;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PropertyVetoExceptionTest
implements org.j8unit.repository.java.beans.PropertyVetoExceptionTests<java.beans.PropertyVetoException> {

    @Override
    public java.beans.PropertyVetoException createNewSUT() {
        throw new AssertionError("There is no default constructor for [java.beans.PropertyVetoException] available.");
    }

}
