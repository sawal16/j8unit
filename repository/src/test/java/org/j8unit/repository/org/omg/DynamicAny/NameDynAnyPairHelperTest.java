package org.j8unit.repository.org.omg.DynamicAny;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.DynamicAny.NameDynAnyPairHelper;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link NameDynAnyPairHelper} (by simply
 * reusing the J8Unit test interface {@link NameDynAnyPairHelperTests}).
 */

@RunWith(J8Unit4.class)
public class NameDynAnyPairHelperTest
implements NameDynAnyPairHelperTests<NameDynAnyPairHelper> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.DynamicAny.NameDynAnyPairHelper]

    @Override
    public NameDynAnyPairHelper createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.DynamicAny.NameDynAnyPairHelper], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.DynamicAny.NameDynAnyPairHelper]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.DynamicAny.NameDynAnyPairHelper]

}
