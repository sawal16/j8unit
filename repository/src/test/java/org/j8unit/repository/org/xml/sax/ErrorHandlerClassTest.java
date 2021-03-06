package org.j8unit.repository.org.xml.sax;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.xml.sax.ErrorHandler;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ErrorHandler} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.xml.sax.ErrorHandlerClassTests}).
 */
@RunWith(J8Unit4.class)
public class ErrorHandlerClassTest
implements ErrorHandlerClassTests<ErrorHandler> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.xml.sax.ErrorHandler]

    @Override
    public Class<ErrorHandler> createNewSUT() {
        return ErrorHandler.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.xml.sax.ErrorHandler]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.xml.sax.ErrorHandler]

}
