package org.j8unit.repository.javax.xml.ws.spi;

import static org.junit.Assert.fail;
import javax.xml.ws.spi.Invoker;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Invoker} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.xml.ws.spi.InvokerClassTests}).
 */
@RunWith(J8Unit4.class)
public class InvokerClassTest
implements InvokerClassTests<Invoker> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.ws.spi.Invoker]

    @Override
    public Class<Invoker> createNewSUT() {
        return Invoker.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link javax.xml.ws.spi.Invoker#Invoker() public
     * javax.xml.ws.spi.Invoker()}.
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
    public void create_Invoker()
    throws Exception {
        fail("Cannot construct an abstract class!");
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.ws.spi.Invoker]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.ws.spi.Invoker]

}
