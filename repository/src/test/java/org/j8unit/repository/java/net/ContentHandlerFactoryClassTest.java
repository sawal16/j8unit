package org.j8unit.repository.java.net;

import java.net.ContentHandlerFactory;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ContentHandlerFactory} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.net.ContentHandlerFactoryClassTests}).
 */
@RunWith(J8Unit4.class)
public class ContentHandlerFactoryClassTest
implements ContentHandlerFactoryClassTests<ContentHandlerFactory> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.net.ContentHandlerFactory]

    @Override
    public Class<ContentHandlerFactory> createNewSUT() {
        return ContentHandlerFactory.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.net.ContentHandlerFactory]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.net.ContentHandlerFactory]

}
