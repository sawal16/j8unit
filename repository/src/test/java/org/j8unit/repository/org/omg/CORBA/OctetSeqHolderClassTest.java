package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class OctetSeqHolderClassTest
implements org.j8unit.repository.org.omg.CORBA.OctetSeqHolderClassTests<org.omg.CORBA.OctetSeqHolder> {

    @Override
    public Class<org.omg.CORBA.OctetSeqHolder> createNewSUT() {
        return org.omg.CORBA.OctetSeqHolder.class;
    }

}