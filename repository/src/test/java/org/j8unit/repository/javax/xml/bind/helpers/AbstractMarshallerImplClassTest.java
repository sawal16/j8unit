package org.j8unit.repository.javax.xml.bind.helpers;

import static org.junit.Assert.fail;
import javax.xml.bind.helpers.AbstractMarshallerImpl;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link AbstractMarshallerImpl} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.javax.xml.bind.helpers.AbstractMarshallerImplClassTests}).
 */
@RunWith(J8Unit4.class)
public class AbstractMarshallerImplClassTest
implements AbstractMarshallerImplClassTests<AbstractMarshallerImpl> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.bind.helpers.AbstractMarshallerImpl]

    @Override
    public Class<AbstractMarshallerImpl> createNewSUT() {
        return AbstractMarshallerImpl.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.xml.bind.helpers.AbstractMarshallerImpl#AbstractMarshallerImpl() public
     * javax.xml.bind.helpers.AbstractMarshallerImpl()}.
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
    public void create_AbstractMarshallerImpl()
    throws Exception {
        fail("Cannot construct an abstract class!");
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.bind.helpers.AbstractMarshallerImpl]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.bind.helpers.AbstractMarshallerImpl]

}
