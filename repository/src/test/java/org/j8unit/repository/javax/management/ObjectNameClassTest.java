package org.j8unit.repository.javax.management;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ObjectNameClassTest
implements org.j8unit.repository.javax.management.ObjectNameClassTests<javax.management.ObjectName> {

    @Override
    public Class<javax.management.ObjectName> createNewSUT() {
        return javax.management.ObjectName.class;
    }

}