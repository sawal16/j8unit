package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ShortSeqHolderTest
implements org.j8unit.repository.org.omg.CORBA.ShortSeqHolderTests<org.omg.CORBA.ShortSeqHolder> {

    @Override
    public org.omg.CORBA.ShortSeqHolder createNewSUT() {
        return new org.omg.CORBA.ShortSeqHolder();
    }

}
