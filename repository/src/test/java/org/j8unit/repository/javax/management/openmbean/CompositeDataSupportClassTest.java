package org.j8unit.repository.javax.management.openmbean;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CompositeDataSupportClassTest
implements org.j8unit.repository.javax.management.openmbean.CompositeDataSupportClassTests<javax.management.openmbean.CompositeDataSupport> {

    @Override
    public Class<javax.management.openmbean.CompositeDataSupport> createNewSUT() {
        return javax.management.openmbean.CompositeDataSupport.class;
    }

}