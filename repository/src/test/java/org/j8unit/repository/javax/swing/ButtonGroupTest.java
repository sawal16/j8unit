package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ButtonGroupTest
implements org.j8unit.repository.javax.swing.ButtonGroupTests<javax.swing.ButtonGroup> {

    @Override
    public javax.swing.ButtonGroup createNewSUT() {
        return new javax.swing.ButtonGroup();
    }

}
