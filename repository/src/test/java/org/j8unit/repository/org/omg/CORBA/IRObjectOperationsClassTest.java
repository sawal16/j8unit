package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class IRObjectOperationsClassTest
implements org.j8unit.repository.org.omg.CORBA.IRObjectOperationsClassTests<org.omg.CORBA.IRObjectOperations> {

    @Override
    public Class<org.omg.CORBA.IRObjectOperations> createNewSUT() {
        return org.omg.CORBA.IRObjectOperations.class;
    }

}
