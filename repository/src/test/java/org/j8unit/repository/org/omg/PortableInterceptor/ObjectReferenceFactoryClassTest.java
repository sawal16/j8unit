package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.PortableInterceptor.ObjectReferenceFactory;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ObjectReferenceFactory} (by simply
 * reusing the J8Unit test interface {@link ObjectReferenceFactoryClassTests}).
 */

@RunWith(J8Unit4.class)
public class ObjectReferenceFactoryClassTest
implements ObjectReferenceFactoryClassTests<ObjectReferenceFactory> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.PortableInterceptor.ObjectReferenceFactory]

    @Override
    public Class<ObjectReferenceFactory> createNewSUT() {
        return ObjectReferenceFactory.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.PortableInterceptor.ObjectReferenceFactory]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.PortableInterceptor.ObjectReferenceFactory]

}
