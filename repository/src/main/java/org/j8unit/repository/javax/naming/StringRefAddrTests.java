package org.j8unit.repository.javax.naming;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.naming.StringRefAddr class javax.naming.StringRefAddr}, containing all instance relevant
 * test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.naming.StringRefAddrClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface StringRefAddrTests<SUT extends javax.naming.StringRefAddr>
extends org.j8unit.repository.javax.naming.RefAddrTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.naming.StringRefAddr#getContent() public java.lang.Object
     * javax.naming.StringRefAddr.getContent()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getContent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
