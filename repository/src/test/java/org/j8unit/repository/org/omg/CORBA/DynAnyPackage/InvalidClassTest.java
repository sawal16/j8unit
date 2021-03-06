package org.j8unit.repository.org.omg.CORBA.DynAnyPackage;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.CORBA.DynAnyPackage.Invalid;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Invalid} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.org.omg.CORBA.DynAnyPackage.InvalidClassTests}).
 */
@RunWith(J8Unit4.class)
public class InvalidClassTest
implements InvalidClassTests<Invalid> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.DynAnyPackage.Invalid]

    @Override
    public Class<Invalid> createNewSUT() {
        return Invalid.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link org.omg.CORBA.DynAnyPackage.Invalid#Invalid()
     * public org.omg.CORBA.DynAnyPackage.Invalid()}.
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
    public void create_Invalid()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final Invalid sut = new Invalid();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.CORBA.DynAnyPackage.Invalid#Invalid(String) public
     * org.omg.CORBA.DynAnyPackage.Invalid(java.lang.String)}.
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
    public void create_Invalid_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final Invalid sut = null; // = new Invalid(String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CORBA.DynAnyPackage.Invalid]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.DynAnyPackage.Invalid]

}
