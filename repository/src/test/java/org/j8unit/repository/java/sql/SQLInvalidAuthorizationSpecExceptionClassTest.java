package org.j8unit.repository.java.sql;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SQLInvalidAuthorizationSpecExceptionClassTest
implements org.j8unit.repository.java.sql.SQLInvalidAuthorizationSpecExceptionClassTests<java.sql.SQLInvalidAuthorizationSpecException> {

    @Override
    public Class<java.sql.SQLInvalidAuthorizationSpecException> createNewSUT() {
        return java.sql.SQLInvalidAuthorizationSpecException.class;
    }

}
