package org.j8unit.repository.org.omg.CORBA;

import static org.junit.Assert.fail;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.CORBA.Request;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Request} (by simply reusing the J8Unit
 * test interface {@link RequestClassTests}).
 */

@RunWith(J8Unit4.class)
public class RequestClassTest
implements RequestClassTests<Request> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.Request]

    @Override
    public Class<Request> createNewSUT() {
        return Request.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link org.omg.CORBA.Request#Request() public
     * org.omg.CORBA.Request()}.
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
    public void create_Request()
    throws Exception {
        fail("Cannot construct an abstract class!");
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CORBA.Request]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.Request]

}
