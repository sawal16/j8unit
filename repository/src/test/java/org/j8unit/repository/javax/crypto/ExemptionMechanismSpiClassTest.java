package org.j8unit.repository.javax.crypto;

import static org.junit.Assert.fail;
import javax.crypto.ExemptionMechanismSpi;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ExemptionMechanismSpi} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.crypto.ExemptionMechanismSpiClassTests}).
 */
@RunWith(J8Unit4.class)
public class ExemptionMechanismSpiClassTest
implements ExemptionMechanismSpiClassTests<ExemptionMechanismSpi> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.crypto.ExemptionMechanismSpi]

    @Override
    public Class<ExemptionMechanismSpi> createNewSUT() {
        return ExemptionMechanismSpi.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.crypto.ExemptionMechanismSpi#ExemptionMechanismSpi() public javax.crypto.ExemptionMechanismSpi()}.
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
    public void create_ExemptionMechanismSpi()
    throws Exception {
        fail("Cannot construct an abstract class!");
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.crypto.ExemptionMechanismSpi]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.crypto.ExemptionMechanismSpi]

}
