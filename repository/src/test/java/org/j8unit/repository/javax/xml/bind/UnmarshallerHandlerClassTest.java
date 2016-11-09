package org.j8unit.repository.javax.xml.bind;

import javax.xml.bind.UnmarshallerHandler;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link UnmarshallerHandler} (by simply reusing
 * the J8Unit test interface {@link UnmarshallerHandlerClassTests}).
 */

@RunWith(J8Unit4.class)
public class UnmarshallerHandlerClassTest
implements UnmarshallerHandlerClassTests<UnmarshallerHandler> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.bind.UnmarshallerHandler]

    @Override
    public Class<UnmarshallerHandler> createNewSUT() {
        return UnmarshallerHandler.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.bind.UnmarshallerHandler]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.bind.UnmarshallerHandler]

}
