package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TRANSIENTTest
implements org.j8unit.repository.org.omg.CORBA.TRANSIENTTests<org.omg.CORBA.TRANSIENT> {

    @Override
    public org.omg.CORBA.TRANSIENT createNewSUT() {
        return new org.omg.CORBA.TRANSIENT();
    }

}
