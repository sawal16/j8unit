package org.j8unit.repository.java.lang.annotation;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TargetClassTest
implements org.j8unit.repository.java.lang.annotation.TargetClassTests<java.lang.annotation.Target> {

    @Override
    public Class<java.lang.annotation.Target> createNewSUT() {
        return java.lang.annotation.Target.class;
    }

}