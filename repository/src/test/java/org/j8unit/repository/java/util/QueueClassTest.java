package org.j8unit.repository.java.util;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class QueueClassTest
implements org.j8unit.repository.java.util.QueueClassTests<java.util.Queue> {

    @Override
    public Class<java.util.Queue> createNewSUT() {
        return java.util.Queue.class;
    }

}
