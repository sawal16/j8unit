package org.j8unit.repository.javax.swing.plaf.multi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MultiTreeUITest
implements org.j8unit.repository.javax.swing.plaf.multi.MultiTreeUITests<javax.swing.plaf.multi.MultiTreeUI> {

    @Override
    public javax.swing.plaf.multi.MultiTreeUI createNewSUT() {
        return new javax.swing.plaf.multi.MultiTreeUI();
    }

}