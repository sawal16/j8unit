package org.j8unit.repository.javax.management.openmbean;

import javax.management.openmbean.CompositeDataInvocationHandler;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link CompositeDataInvocationHandler} (by
 * simply reusing the J8Unit test interface
 * {@link org.j8unit.repository.javax.management.openmbean.CompositeDataInvocationHandlerClassTests}).
 */
@RunWith(J8Unit4.class)
public class CompositeDataInvocationHandlerClassTest
implements CompositeDataInvocationHandlerClassTests<CompositeDataInvocationHandler> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.openmbean.CompositeDataInvocationHandler]

    @Override
    public Class<CompositeDataInvocationHandler> createNewSUT() {
        return CompositeDataInvocationHandler.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.openmbean.CompositeDataInvocationHandler#CompositeDataInvocationHandler(javax.management.openmbean.CompositeData)
     * public javax.management.openmbean.CompositeDataInvocationHandler(javax.management.openmbean.CompositeData)}.
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
    public void create_CompositeDataInvocationHandler_CompositeData()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final CompositeDataInvocationHandler sut = null; // = new
                                                         // CompositeDataInvocationHandler(javax.management.openmbean.CompositeData);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.management.openmbean.CompositeDataInvocationHandler]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.openmbean.CompositeDataInvocationHandler]

}
