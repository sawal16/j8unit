package org.j8unit.repository.javax.management.openmbean;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CompositeDataViewClassTest
implements org.j8unit.repository.javax.management.openmbean.CompositeDataViewClassTests<javax.management.openmbean.CompositeDataView> {

    @Override
    public Class<javax.management.openmbean.CompositeDataView> createNewSUT() {
        return javax.management.openmbean.CompositeDataView.class;
    }

}