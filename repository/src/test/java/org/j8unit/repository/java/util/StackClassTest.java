package org.j8unit.repository.java.util;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class StackClassTest
implements org.j8unit.repository.java.util.StackClassTests<java.util.Stack> {

    @Override
    public Class<java.util.Stack> createNewSUT() {
        return java.util.Stack.class;
    }

}