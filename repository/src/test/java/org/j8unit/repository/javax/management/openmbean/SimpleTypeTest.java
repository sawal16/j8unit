package org.j8unit.repository.javax.management.openmbean;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SimpleTypeTest<T>
implements org.j8unit.repository.javax.management.openmbean.SimpleTypeTests<javax.management.openmbean.SimpleType<T>, T> {

    @Override
    public javax.management.openmbean.SimpleType<T> createNewSUT() {
        throw new AssertionError("There is no default constructor for [javax.management.openmbean.SimpleType] available.");
    }

}
