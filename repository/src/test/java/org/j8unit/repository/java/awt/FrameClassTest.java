package org.j8unit.repository.java.awt;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FrameClassTest
implements org.j8unit.repository.java.awt.FrameClassTests<java.awt.Frame> {

    @Override
    public Class<java.awt.Frame> createNewSUT() {
        return java.awt.Frame.class;
    }

}
