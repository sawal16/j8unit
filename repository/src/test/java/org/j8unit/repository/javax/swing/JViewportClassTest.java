package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JViewportClassTest
implements org.j8unit.repository.javax.swing.JViewportClassTests<javax.swing.JViewport> {

    @Override
    public Class<javax.swing.JViewport> createNewSUT() {
        return javax.swing.JViewport.class;
    }

}