package org.j8unit.repository.javax.sql;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ConnectionEventListenerClassTest
implements org.j8unit.repository.javax.sql.ConnectionEventListenerClassTests<javax.sql.ConnectionEventListener> {

    @Override
    public Class<javax.sql.ConnectionEventListener> createNewSUT() {
        return javax.sql.ConnectionEventListener.class;
    }

}
