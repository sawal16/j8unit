package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TimerClassTest
implements org.j8unit.repository.javax.swing.TimerClassTests<javax.swing.Timer> {

    @Override
    public Class<javax.swing.Timer> createNewSUT() {
        return javax.swing.Timer.class;
    }

}
