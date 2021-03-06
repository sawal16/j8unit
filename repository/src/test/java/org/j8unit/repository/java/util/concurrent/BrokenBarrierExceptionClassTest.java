package org.j8unit.repository.java.util.concurrent;

import java.util.concurrent.BrokenBarrierException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link BrokenBarrierException} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.java.util.concurrent.BrokenBarrierExceptionClassTests}).
 */
@RunWith(J8Unit4.class)
public class BrokenBarrierExceptionClassTest
implements BrokenBarrierExceptionClassTests<BrokenBarrierException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.concurrent.BrokenBarrierException]

    @Override
    public Class<BrokenBarrierException> createNewSUT() {
        return BrokenBarrierException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.util.concurrent.BrokenBarrierException#BrokenBarrierException() public
     * java.util.concurrent.BrokenBarrierException()}.
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
    public void create_BrokenBarrierException()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final BrokenBarrierException sut = new BrokenBarrierException();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.util.concurrent.BrokenBarrierException#BrokenBarrierException(String) public
     * java.util.concurrent.BrokenBarrierException(java.lang.String)}.
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
    public void create_BrokenBarrierException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final BrokenBarrierException sut = null; // = new BrokenBarrierException(String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.concurrent.BrokenBarrierException]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.concurrent.BrokenBarrierException]

}
