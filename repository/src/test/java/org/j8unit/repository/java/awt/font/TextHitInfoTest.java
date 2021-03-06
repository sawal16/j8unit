package org.j8unit.repository.java.awt.font;

import java.awt.font.TextHitInfo;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link TextHitInfo} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.awt.font.TextHitInfoTests}).
 */
@RunWith(J8Unit4.class)
public class TextHitInfoTest
implements TextHitInfoTests<TextHitInfo> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.font.TextHitInfo]

    @Override
    public TextHitInfo createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.awt.font.TextHitInfo], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.font.TextHitInfo]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.font.TextHitInfo]

}
