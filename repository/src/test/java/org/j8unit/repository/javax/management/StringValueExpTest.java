package org.j8unit.repository.javax.management;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class StringValueExpTest
implements org.j8unit.repository.javax.management.StringValueExpTests<javax.management.StringValueExp> {

    @Override
    public javax.management.StringValueExp createNewSUT() {
        return new javax.management.StringValueExp();
    }

}
