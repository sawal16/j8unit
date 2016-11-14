package org.j8unit.repository.org.omg.IOP.CodecFactoryPackage;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.IOP.CodecFactoryPackage.UnknownEncodingHelper;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link UnknownEncodingHelper} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.org.omg.IOP.CodecFactoryPackage.UnknownEncodingHelperTests}).
 */

@RunWith(J8Unit4.class)
public class UnknownEncodingHelperTest
implements UnknownEncodingHelperTests<UnknownEncodingHelper> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.IOP.CodecFactoryPackage.UnknownEncodingHelper]

    @Override
    public UnknownEncodingHelper createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.IOP.CodecFactoryPackage.UnknownEncodingHelper], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.IOP.CodecFactoryPackage.UnknownEncodingHelper]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.IOP.CodecFactoryPackage.UnknownEncodingHelper]

}
