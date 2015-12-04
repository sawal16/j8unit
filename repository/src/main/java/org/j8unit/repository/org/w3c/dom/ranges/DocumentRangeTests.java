package org.j8unit.repository.org.w3c.dom.ranges;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link org.w3c.dom.ranges.DocumentRange interface org.w3c.dom.ranges.DocumentRange},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.org.w3c.dom.ranges.DocumentRangeClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface DocumentRangeTests<SUT extends org.w3c.dom.ranges.DocumentRange>
extends J8UnitTest<SUT>
{

    /**
     * <p>
     * Test method for {@link org.w3c.dom.ranges.DocumentRange#createRange() public abstract org.w3c.dom.ranges.Range org.w3c.dom.ranges.DocumentRange.createRange()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createRange() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}