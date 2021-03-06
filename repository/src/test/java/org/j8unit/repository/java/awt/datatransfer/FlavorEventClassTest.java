package org.j8unit.repository.java.awt.datatransfer;

import java.awt.datatransfer.FlavorEvent;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link FlavorEvent} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.awt.datatransfer.FlavorEventClassTests}).
 */
@RunWith(J8Unit4.class)
public class FlavorEventClassTest
implements FlavorEventClassTests<FlavorEvent> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.datatransfer.FlavorEvent]

    @Override
    public Class<FlavorEvent> createNewSUT() {
        return FlavorEvent.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.awt.datatransfer.FlavorEvent#FlavorEvent(java.awt.datatransfer.Clipboard) public
     * java.awt.datatransfer.FlavorEvent(java.awt.datatransfer.Clipboard)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_FlavorEvent_Clipboard()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final FlavorEvent sut = null; // = new FlavorEvent(java.awt.datatransfer.Clipboard);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.datatransfer.FlavorEvent]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.datatransfer.FlavorEvent]

}
