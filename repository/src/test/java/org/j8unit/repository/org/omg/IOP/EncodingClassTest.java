package org.j8unit.repository.org.omg.IOP;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class EncodingClassTest
implements org.j8unit.repository.org.omg.IOP.EncodingClassTests<org.omg.IOP.Encoding> {

    @Override
    public Class<org.omg.IOP.Encoding> createNewSUT() {
        return org.omg.IOP.Encoding.class;
    }

}
