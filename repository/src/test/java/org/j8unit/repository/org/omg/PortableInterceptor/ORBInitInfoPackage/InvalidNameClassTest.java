package org.j8unit.repository.org.omg.PortableInterceptor.ORBInitInfoPackage;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.PortableInterceptor.ORBInitInfoPackage.InvalidName;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link InvalidName} (by simply reusing the
 * J8Unit test interface
 * {@link org.j8unit.repository.org.omg.PortableInterceptor.ORBInitInfoPackage.InvalidNameClassTests}).
 */
@RunWith(J8Unit4.class)
public class InvalidNameClassTest
implements org.j8unit.repository.org.omg.PortableInterceptor.ORBInitInfoPackage.InvalidNameClassTests<InvalidName> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.PortableInterceptor.ORBInitInfoPackage.InvalidName]

    @Override
    public Class<InvalidName> createNewSUT() {
        return InvalidName.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.PortableInterceptor.ORBInitInfoPackage.InvalidName#InvalidName() public
     * org.omg.PortableInterceptor.ORBInitInfoPackage.InvalidName()}.
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
    public void create_InvalidName()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final InvalidName sut = new InvalidName();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.PortableInterceptor.ORBInitInfoPackage.InvalidName#InvalidName(String) public
     * org.omg.PortableInterceptor.ORBInitInfoPackage.InvalidName(java.lang.String)}.
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
    public void create_InvalidName_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final InvalidName sut = null; // = new InvalidName(String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.PortableInterceptor.ORBInitInfoPackage.InvalidName]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.PortableInterceptor.ORBInitInfoPackage.InvalidName]

}
