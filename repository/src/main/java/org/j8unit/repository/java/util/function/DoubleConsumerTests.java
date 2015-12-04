package org.j8unit.repository.java.util.function;

import org.j8unit.J8UnitTest;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.util.function.DoubleConsumer interface java.util.function.DoubleConsumer}, containing all
 * instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.util.function.DoubleConsumerClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DoubleConsumerTests<SUT extends java.util.function.DoubleConsumer>
extends J8UnitTest<SUT> {

    /**
     * <p>
     * Test method for {@link java.util.function.DoubleConsumer#accept(double) public abstract void
     * java.util.function.DoubleConsumer.accept(double)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_accept_double()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.function.DoubleConsumer#andThen(java.util.function.DoubleConsumer) public
     * default java.util.function.DoubleConsumer
     * java.util.function.DoubleConsumer.andThen(java.util.function.DoubleConsumer)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_andThen_DoubleConsumer()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
