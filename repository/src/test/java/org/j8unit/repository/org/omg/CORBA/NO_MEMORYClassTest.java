package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.CORBA.NO_MEMORY;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link NO_MEMORY} (by simply reusing the J8Unit
 * test interface {@link NO_MEMORYClassTests}).
 */

@RunWith(J8Unit4.class)
public class NO_MEMORYClassTest
implements NO_MEMORYClassTests<NO_MEMORY> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.NO_MEMORY]

    @Override
    public Class<NO_MEMORY> createNewSUT() {
        return NO_MEMORY.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.CORBA.NO_MEMORY#NO_MEMORY(String, int, org.omg.CORBA.CompletionStatus) public
     * org.omg.CORBA.NO_MEMORY(java.lang.String,int,org.omg.CORBA.CompletionStatus)}.
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
    public void create_NO_MEMORY_String_int_CompletionStatus()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final NO_MEMORY sut = null; // = new NO_MEMORY(String, int, org.omg.CORBA.CompletionStatus);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.CORBA.NO_MEMORY#NO_MEMORY(int, org.omg.CORBA.CompletionStatus) public
     * org.omg.CORBA.NO_MEMORY(int,org.omg.CORBA.CompletionStatus)}.
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
    public void create_NO_MEMORY_int_CompletionStatus()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final NO_MEMORY sut = null; // = new NO_MEMORY(int, org.omg.CORBA.CompletionStatus);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link org.omg.CORBA.NO_MEMORY#NO_MEMORY(String)
     * public org.omg.CORBA.NO_MEMORY(java.lang.String)}.
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
    public void create_NO_MEMORY_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final NO_MEMORY sut = null; // = new NO_MEMORY(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link org.omg.CORBA.NO_MEMORY#NO_MEMORY() public
     * org.omg.CORBA.NO_MEMORY()}.
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
    public void create_NO_MEMORY()
    throws Exception {
        // create new instance
        final NO_MEMORY sut = new NO_MEMORY();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CORBA.NO_MEMORY]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.NO_MEMORY]

}
