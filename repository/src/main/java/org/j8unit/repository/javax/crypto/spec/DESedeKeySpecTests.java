package org.j8unit.repository.javax.crypto.spec;

import javax.crypto.spec.DESedeKeySpec;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.j8unit.repository.java.lang.ObjectTests;
import org.j8unit.repository.java.security.spec.KeySpecTests;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
 * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test {@link DESedeKeySpec
 * public class javax.crypto.spec.DESedeKeySpec}.
 * </p>
 *
 * <p>
 * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints. For
 * this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects (see
 * {@link org.j8unit.repository.javax.crypto.spec.DESedeKeySpecClassTests}).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DESedeKeySpecTests<SUT extends DESedeKeySpec>
extends KeySpecTests<SUT>, ObjectTests<SUT> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.crypto.spec.DESedeKeySpec]

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link javax.crypto.spec.DESedeKeySpec#getKey() public
     * byte[] javax.crypto.spec.DESedeKeySpec.getKey()}.
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
    public default void test_getKey()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.crypto.spec.DESedeKeySpec]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.crypto.spec.DESedeKeySpec]

}
