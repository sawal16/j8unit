package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SortOrderClassTest
implements org.j8unit.repository.javax.swing.SortOrderClassTests<javax.swing.SortOrder> {

    @Override
    public Class<javax.swing.SortOrder> createNewSUT() {
        return javax.swing.SortOrder.class;
    }

}
