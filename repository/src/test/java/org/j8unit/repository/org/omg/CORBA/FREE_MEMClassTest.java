package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FREE_MEMClassTest
implements org.j8unit.repository.org.omg.CORBA.FREE_MEMClassTests<org.omg.CORBA.FREE_MEM> {

    @Override
    public Class<org.omg.CORBA.FREE_MEM> createNewSUT() {
        return org.omg.CORBA.FREE_MEM.class;
    }

}
