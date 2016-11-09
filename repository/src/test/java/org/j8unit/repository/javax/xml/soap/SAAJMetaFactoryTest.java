package org.j8unit.repository.javax.xml.soap;

import javax.xml.soap.SAAJMetaFactory;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link SAAJMetaFactory} (by simply reusing
 * the J8Unit test interface {@link SAAJMetaFactoryTests}).
 */

@RunWith(J8Unit4.class)
public class SAAJMetaFactoryTest
implements SAAJMetaFactoryTests<SAAJMetaFactory> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.soap.SAAJMetaFactory]

    @Override
    public SAAJMetaFactory createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.soap.SAAJMetaFactory], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.soap.SAAJMetaFactory]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.soap.SAAJMetaFactory]

}
