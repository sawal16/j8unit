package org.j8unit.repository.org.w3c.dom;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.NameList;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link NameList} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.org.w3c.dom.NameListClassTests}).
 */
@RunWith(J8Unit4.class)
public class NameListClassTest
implements NameListClassTests<NameList> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.NameList]

    @Override
    public Class<NameList> createNewSUT() {
        return NameList.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.NameList]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.NameList]

}
