package org.j8unit.repository.java.sql;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DriverActionClassTest
implements org.j8unit.repository.java.sql.DriverActionClassTests<java.sql.DriverAction> {

    @Override
    public Class<java.sql.DriverAction> createNewSUT() {
        return java.sql.DriverAction.class;
    }

}