package org.j8unit.repository.javax.management;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class StringValueExpClassTest
implements org.j8unit.repository.javax.management.StringValueExpClassTests<javax.management.StringValueExp> {

    @Override
    public Class<javax.management.StringValueExp> createNewSUT() {
        return javax.management.StringValueExp.class;
    }

}
