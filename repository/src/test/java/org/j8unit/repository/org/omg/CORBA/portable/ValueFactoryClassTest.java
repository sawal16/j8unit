package org.j8unit.repository.org.omg.CORBA.portable;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ValueFactoryClassTest
implements org.j8unit.repository.org.omg.CORBA.portable.ValueFactoryClassTests<org.omg.CORBA.portable.ValueFactory> {

    @Override
    public Class<org.omg.CORBA.portable.ValueFactory> createNewSUT() {
        return org.omg.CORBA.portable.ValueFactory.class;
    }

}
