package org.j8unit.repository.javax.sql.rowset;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JoinRowSetClassTest
implements org.j8unit.repository.javax.sql.rowset.JoinRowSetClassTests<javax.sql.rowset.JoinRowSet> {

    @Override
    public Class<javax.sql.rowset.JoinRowSet> createNewSUT() {
        return javax.sql.rowset.JoinRowSet.class;
    }

}
