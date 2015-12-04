package org.j8unit.repository.java.beans.beancontext;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link java.beans.beancontext.BeanContextServices interface java.beans.beancontext.BeanContextServices},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.beans.beancontext.BeanContextServicesClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface BeanContextServicesTests<SUT extends java.beans.beancontext.BeanContextServices>
extends org.j8unit.repository.java.beans.beancontext.BeanContextTests<SUT>,
        org.j8unit.repository.java.beans.beancontext.BeanContextServicesListenerTests<SUT>
{

    /**
     * <p>
     * Test method for {@link java.beans.beancontext.BeanContextServices#hasService(java.lang.Class) public abstract boolean java.beans.beancontext.BeanContextServices.hasService(java.lang.Class)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_hasService_Class() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.beans.beancontext.BeanContextServices#getService(java.beans.beancontext.BeanContextChild,java.lang.Object,java.lang.Class,java.lang.Object,java.beans.beancontext.BeanContextServiceRevokedListener) public abstract java.lang.Object java.beans.beancontext.BeanContextServices.getService(java.beans.beancontext.BeanContextChild,java.lang.Object,java.lang.Class,java.lang.Object,java.beans.beancontext.BeanContextServiceRevokedListener) throws java.util.TooManyListenersException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getService_BeanContextChild_Object_Class_Object_BeanContextServiceRevokedListener() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.beans.beancontext.BeanContextServices#addBeanContextServicesListener(java.beans.beancontext.BeanContextServicesListener) public abstract void java.beans.beancontext.BeanContextServices.addBeanContextServicesListener(java.beans.beancontext.BeanContextServicesListener)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_addBeanContextServicesListener_BeanContextServicesListener() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.beans.beancontext.BeanContextServices#releaseService(java.beans.beancontext.BeanContextChild,java.lang.Object,java.lang.Object) public abstract void java.beans.beancontext.BeanContextServices.releaseService(java.beans.beancontext.BeanContextChild,java.lang.Object,java.lang.Object)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_releaseService_BeanContextChild_Object_Object() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.beans.beancontext.BeanContextServices#addService(java.lang.Class,java.beans.beancontext.BeanContextServiceProvider) public abstract boolean java.beans.beancontext.BeanContextServices.addService(java.lang.Class,java.beans.beancontext.BeanContextServiceProvider)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_addService_Class_BeanContextServiceProvider() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.beans.beancontext.BeanContextServices#removeBeanContextServicesListener(java.beans.beancontext.BeanContextServicesListener) public abstract void java.beans.beancontext.BeanContextServices.removeBeanContextServicesListener(java.beans.beancontext.BeanContextServicesListener)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_removeBeanContextServicesListener_BeanContextServicesListener() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.beans.beancontext.BeanContextServices#getCurrentServiceSelectors(java.lang.Class) public abstract java.util.Iterator java.beans.beancontext.BeanContextServices.getCurrentServiceSelectors(java.lang.Class)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getCurrentServiceSelectors_Class() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.beans.beancontext.BeanContextServices#getCurrentServiceClasses() public abstract java.util.Iterator java.beans.beancontext.BeanContextServices.getCurrentServiceClasses()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getCurrentServiceClasses() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.beans.beancontext.BeanContextServices#revokeService(java.lang.Class,java.beans.beancontext.BeanContextServiceProvider,boolean) public abstract void java.beans.beancontext.BeanContextServices.revokeService(java.lang.Class,java.beans.beancontext.BeanContextServiceProvider,boolean)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_revokeService_Class_BeanContextServiceProvider_boolean() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}