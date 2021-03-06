package org.j8unit.repository.org.omg.IOP;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.IOP.TaggedProfileHelper;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link TaggedProfileHelper} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.org.omg.IOP.TaggedProfileHelperTests}).
 */
@RunWith(J8Unit4.class)
public class TaggedProfileHelperTest
implements TaggedProfileHelperTests<TaggedProfileHelper> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.IOP.TaggedProfileHelper]

    @Override
    public TaggedProfileHelper createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.IOP.TaggedProfileHelper], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.IOP.TaggedProfileHelper]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.IOP.TaggedProfileHelper]

}
