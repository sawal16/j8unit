package org.j8unit.repository.org.omg.CORBA_2_3.portable;

import static org.junit.Assert.fail;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.CORBA_2_3.portable.OutputStream;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link OutputStream} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.omg.CORBA_2_3.portable.OutputStreamClassTests}).
 */
@RunWith(J8Unit4.class)
public class OutputStreamClassTest
implements OutputStreamClassTests<OutputStream> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA_2_3.portable.OutputStream]

    @Override
    public Class<OutputStream> createNewSUT() {
        return OutputStream.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.CORBA_2_3.portable.OutputStream#OutputStream() public org.omg.CORBA_2_3.portable.OutputStream()}.
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
    public void create_OutputStream()
    throws Exception {
        fail("Cannot construct an abstract class!");
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CORBA_2_3.portable.OutputStream]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA_2_3.portable.OutputStream]

}
