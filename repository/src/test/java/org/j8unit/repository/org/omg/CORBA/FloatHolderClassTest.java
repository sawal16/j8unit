package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.CORBA.FloatHolder;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link FloatHolder} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.omg.CORBA.FloatHolderClassTests}).
 */
@RunWith(J8Unit4.class)
public class FloatHolderClassTest
implements FloatHolderClassTests<FloatHolder> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.FloatHolder]

    @Override
    public Class<FloatHolder> createNewSUT() {
        return FloatHolder.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link org.omg.CORBA.FloatHolder#FloatHolder(float)
     * public org.omg.CORBA.FloatHolder(float)}.
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
    public void create_FloatHolder_float()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final FloatHolder sut = null; // = new FloatHolder(float);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link org.omg.CORBA.FloatHolder#FloatHolder() public
     * org.omg.CORBA.FloatHolder()}.
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
    public void create_FloatHolder()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final FloatHolder sut = new FloatHolder();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CORBA.FloatHolder]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.FloatHolder]

}
