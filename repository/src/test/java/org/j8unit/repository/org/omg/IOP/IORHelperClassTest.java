package org.j8unit.repository.org.omg.IOP;

import static org.junit.Assert.fail;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.IOP.IORHelper;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link IORHelper} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.org.omg.IOP.IORHelperClassTests}).
 */
@RunWith(J8Unit4.class)
public class IORHelperClassTest
implements IORHelperClassTests<IORHelper> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.IOP.IORHelper]

    @Override
    public Class<IORHelper> createNewSUT() {
        return IORHelper.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link org.omg.IOP.IORHelper#IORHelper() public
     * org.omg.IOP.IORHelper()}.
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
    public void create_IORHelper()
    throws Exception {
        fail("Cannot construct an abstract class!");
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link org.omg.IOP.IORHelper#extract(org.omg.CORBA.Any)
     * public static org.omg.IOP.IOR org.omg.IOP.IORHelper.extract(org.omg.CORBA.Any)}.
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
    public void test_extract_Any()
    throws Exception {
        // write some test for {@link org.omg.IOP.IORHelper#extract(org.omg.CORBA.Any)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link org.omg.IOP.IORHelper#read(org.omg.CORBA.portable.InputStream) public static org.omg.IOP.IOR
     * org.omg.IOP.IORHelper.read(org.omg.CORBA.portable.InputStream)}.
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
    public void test_read_InputStream()
    throws Exception {
        // write some test for {@link org.omg.IOP.IORHelper#read(org.omg.CORBA.portable.InputStream)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link org.omg.IOP.IORHelper#id() public static
     * java.lang.String org.omg.IOP.IORHelper.id()}.
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
    public void test_id()
    throws Exception {
        // write some test for {@link org.omg.IOP.IORHelper#id()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link org.omg.IOP.IORHelper#insert(org.omg.CORBA.Any, org.omg.IOP.IOR) public static void
     * org.omg.IOP.IORHelper.insert(org.omg.CORBA.Any,org.omg.IOP.IOR)}.
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
    public void test_insert_Any_IOR()
    throws Exception {
        // write some test for {@link org.omg.IOP.IORHelper#insert(org.omg.CORBA.Any, org.omg.IOP.IOR)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link org.omg.IOP.IORHelper#write(org.omg.CORBA.portable.OutputStream, org.omg.IOP.IOR) public static void
     * org.omg.IOP.IORHelper.write(org.omg.CORBA.portable.OutputStream,org.omg.IOP.IOR)}.
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
    public void test_write_OutputStream_IOR()
    throws Exception {
        // write some test for {@link org.omg.IOP.IORHelper#write(org.omg.CORBA.portable.OutputStream, org.omg.IOP.IOR)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link org.omg.IOP.IORHelper#type() public static
     * synchronized org.omg.CORBA.TypeCode org.omg.IOP.IORHelper.type()}.
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
    public void test_type()
    throws Exception {
        // write some test for {@link org.omg.IOP.IORHelper#type()}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.IOP.IORHelper]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.IOP.IORHelper]

}
