package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LongSeqHolderTest
implements org.j8unit.repository.org.omg.CORBA.LongSeqHolderTests<org.omg.CORBA.LongSeqHolder> {

    @Override
    public org.omg.CORBA.LongSeqHolder createNewSUT() {
        return new org.omg.CORBA.LongSeqHolder();
    }

}
