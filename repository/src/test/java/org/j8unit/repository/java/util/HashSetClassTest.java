package org.j8unit.repository.java.util;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class HashSetClassTest
implements org.j8unit.repository.java.util.HashSetClassTests<java.util.HashSet> {

    @Override
    public Class<java.util.HashSet> createNewSUT() {
        return java.util.HashSet.class;
    }

}
