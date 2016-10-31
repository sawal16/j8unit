package org.j8unit.repository.javax.naming.spi;

import javax.naming.spi.DirObjectFactory;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DirObjectFactoryClassTest
implements org.j8unit.repository.javax.naming.spi.DirObjectFactoryClassTests<DirObjectFactory> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.naming.spi.DirObjectFactory]

    @Override
    public Class<DirObjectFactory> createNewSUT() {
        return DirObjectFactory.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.naming.spi.DirObjectFactory]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.naming.spi.DirObjectFactory]

}
