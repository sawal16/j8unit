package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TRANSACTION_REQUIREDTest
implements org.j8unit.repository.org.omg.CORBA.TRANSACTION_REQUIREDTests<org.omg.CORBA.TRANSACTION_REQUIRED> {

    @Override
    public org.omg.CORBA.TRANSACTION_REQUIRED createNewSUT() {
        return new org.omg.CORBA.TRANSACTION_REQUIRED();
    }

}
