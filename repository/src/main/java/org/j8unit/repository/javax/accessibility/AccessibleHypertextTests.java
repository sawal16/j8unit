package org.j8unit.repository.javax.accessibility;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.accessibility.AccessibleHypertext interface javax.accessibility.AccessibleHypertext},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.accessibility.AccessibleHypertextClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface AccessibleHypertextTests<SUT extends javax.accessibility.AccessibleHypertext>
extends org.j8unit.repository.javax.accessibility.AccessibleTextTests<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.accessibility.AccessibleHypertext#getLinkCount() public abstract int javax.accessibility.AccessibleHypertext.getLinkCount()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getLinkCount() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.accessibility.AccessibleHypertext#getLink(int) public abstract javax.accessibility.AccessibleHyperlink javax.accessibility.AccessibleHypertext.getLink(int)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getLink_int() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.accessibility.AccessibleHypertext#getLinkIndex(int) public abstract int javax.accessibility.AccessibleHypertext.getLinkIndex(int)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getLinkIndex_int() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}