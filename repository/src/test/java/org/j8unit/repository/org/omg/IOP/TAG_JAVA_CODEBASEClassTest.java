package org.j8unit.repository.org.omg.IOP;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.IOP.TAG_JAVA_CODEBASE;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link TAG_JAVA_CODEBASE} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.omg.IOP.TAG_JAVA_CODEBASEClassTests}).
 */
@RunWith(J8Unit4.class)
public class TAG_JAVA_CODEBASEClassTest
implements TAG_JAVA_CODEBASEClassTests<TAG_JAVA_CODEBASE> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.IOP.TAG_JAVA_CODEBASE]

    @Override
    public Class<TAG_JAVA_CODEBASE> createNewSUT() {
        return TAG_JAVA_CODEBASE.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.IOP.TAG_JAVA_CODEBASE]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.IOP.TAG_JAVA_CODEBASE]

}
