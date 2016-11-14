package org.j8unit.repository.java.awt.event;

import static org.junit.Assert.fail;
import java.awt.event.ComponentAdapter;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ComponentAdapter} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.awt.event.ComponentAdapterClassTests}).
 */

@RunWith(J8Unit4.class)
public class ComponentAdapterClassTest
implements ComponentAdapterClassTests<ComponentAdapter> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.event.ComponentAdapter]

    @Override
    public Class<ComponentAdapter> createNewSUT() {
        return ComponentAdapter.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.awt.event.ComponentAdapter#ComponentAdapter() public java.awt.event.ComponentAdapter()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("Cannot construct an abstract class!")
    @Test
    @Category(Draft.class)
    public void create_ComponentAdapter()
    throws Exception {
        fail("Cannot construct an abstract class!");
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.event.ComponentAdapter]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.event.ComponentAdapter]

}
