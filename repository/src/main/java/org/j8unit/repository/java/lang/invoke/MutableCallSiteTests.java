package org.j8unit.repository.java.lang.invoke;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link java.lang.invoke.MutableCallSite class java.lang.invoke.MutableCallSite},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.lang.invoke.MutableCallSiteClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface MutableCallSiteTests<SUT extends java.lang.invoke.MutableCallSite>
extends org.j8unit.repository.java.lang.invoke.CallSiteTests<SUT>
{

    /**
     * <p>
     * Test method for {@link java.lang.invoke.MutableCallSite#setTarget(java.lang.invoke.MethodHandle) public void java.lang.invoke.MutableCallSite.setTarget(java.lang.invoke.MethodHandle)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_setTarget_MethodHandle() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.invoke.MutableCallSite#dynamicInvoker() public final java.lang.invoke.MethodHandle java.lang.invoke.MutableCallSite.dynamicInvoker()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_dynamicInvoker() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.invoke.MutableCallSite#getTarget() public final java.lang.invoke.MethodHandle java.lang.invoke.MutableCallSite.getTarget()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getTarget() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}