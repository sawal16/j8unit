package org.j8unit.repository.java.security.spec;

import static org.junit.Assert.fail;
import java.security.spec.EncodedKeySpec;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link EncodedKeySpec} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.security.spec.EncodedKeySpecClassTests}).
 */
@RunWith(J8Unit4.class)
public class EncodedKeySpecClassTest
implements EncodedKeySpecClassTests<EncodedKeySpec> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.spec.EncodedKeySpec]

    @Override
    public Class<EncodedKeySpec> createNewSUT() {
        return EncodedKeySpec.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.security.spec.EncodedKeySpec#EncodedKeySpec(byte[]) public
     * java.security.spec.EncodedKeySpec(byte[])}.
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
    public void create_EncodedKeySpec_byteArray()
    throws Exception {
        fail("Cannot construct an abstract class!");
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.security.spec.EncodedKeySpec]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.spec.EncodedKeySpec]

}
