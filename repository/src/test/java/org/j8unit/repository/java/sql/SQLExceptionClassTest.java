package org.j8unit.repository.java.sql;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SQLExceptionClassTest
implements org.j8unit.repository.java.sql.SQLExceptionClassTests<java.sql.SQLException> {

    @Override
    public Class<java.sql.SQLException> createNewSUT() {
        return java.sql.SQLException.class;
    }

}
