package org.j8unit.repository.javax.print.attribute;

import javax.print.attribute.AttributeSetUtilities;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link AttributeSetUtilities} (by simply
 * reusing the J8Unit test interface {@link AttributeSetUtilitiesTests}).
 */

@RunWith(J8Unit4.class)
public class AttributeSetUtilitiesTest
implements AttributeSetUtilitiesTests<AttributeSetUtilities> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.attribute.AttributeSetUtilities]

    @Override
    public AttributeSetUtilities createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.print.attribute.AttributeSetUtilities], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.print.attribute.AttributeSetUtilities]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.print.attribute.AttributeSetUtilities]

}
