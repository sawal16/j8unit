package org.j8unit.repository.java.awt.geom;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NoninvertibleTransformExceptionTest
implements org.j8unit.repository.java.awt.geom.NoninvertibleTransformExceptionTests<java.awt.geom.NoninvertibleTransformException> {

    @Override
    public java.awt.geom.NoninvertibleTransformException createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.awt.geom.NoninvertibleTransformException] available.");
    }

}