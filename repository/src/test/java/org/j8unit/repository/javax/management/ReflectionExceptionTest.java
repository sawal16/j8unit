package org.j8unit.repository.javax.management;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ReflectionExceptionTest
implements org.j8unit.repository.javax.management.ReflectionExceptionTests<javax.management.ReflectionException> {

    @Override
    public javax.management.ReflectionException createNewSUT() {
        throw new AssertionError("There is no default constructor for [javax.management.ReflectionException] available.");
    }

}
