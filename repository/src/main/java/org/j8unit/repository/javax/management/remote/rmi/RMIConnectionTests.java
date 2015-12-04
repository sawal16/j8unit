package org.j8unit.repository.javax.management.remote.rmi;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.management.remote.rmi.RMIConnection interface javax.management.remote.rmi.RMIConnection},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.management.remote.rmi.RMIConnectionClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface RMIConnectionTests<SUT extends javax.management.remote.rmi.RMIConnection>
extends org.j8unit.repository.java.io.CloseableTests<SUT>, org.j8unit.repository.java.rmi.RemoteTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link javax.management.remote.rmi.RMIConnection#addNotificationListener(javax.management.ObjectName,javax.management.ObjectName,java.rmi.MarshalledObject,java.rmi.MarshalledObject,javax.security.auth.Subject)
     * public abstract void
     * javax.management.remote.rmi.RMIConnection.addNotificationListener(javax.management.ObjectName,javax.management.ObjectName,java.rmi.MarshalledObject,java.rmi.MarshalledObject,javax.security.auth.Subject)
     * throws javax.management.InstanceNotFoundException,java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_addNotificationListener_ObjectName_ObjectName_MarshalledObject_MarshalledObject_Subject()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.management.remote.rmi.RMIConnection#addNotificationListeners(javax.management.ObjectName[],java.rmi.MarshalledObject[],javax.security.auth.Subject[])
     * public abstract java.lang.Integer[]
     * javax.management.remote.rmi.RMIConnection.addNotificationListeners(javax.management.ObjectName[],java.rmi.MarshalledObject[],javax.security.auth.Subject[])
     * throws javax.management.InstanceNotFoundException,java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_addNotificationListeners_ObjectNameArray_MarshalledObjectArray_SubjectArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.remote.rmi.RMIConnection#close() public abstract void
     * javax.management.remote.rmi.RMIConnection.close() throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_close()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.management.remote.rmi.RMIConnection#createMBean(java.lang.String,javax.management.ObjectName,java.rmi.MarshalledObject,java.lang.String[],javax.security.auth.Subject)
     * public abstract javax.management.ObjectInstance
     * javax.management.remote.rmi.RMIConnection.createMBean(java.lang.String,javax.management.ObjectName,java.rmi.MarshalledObject,java.lang.String[],javax.security.auth.Subject)
     * throws
     * javax.management.ReflectionException,javax.management.InstanceAlreadyExistsException,javax.management.MBeanRegistrationException,javax.management.MBeanException,javax.management.NotCompliantMBeanException,java.io.IOException}
     * .
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createMBean_String_ObjectName_MarshalledObject_StringArray_Subject()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.management.remote.rmi.RMIConnection#createMBean(java.lang.String,javax.management.ObjectName,javax.management.ObjectName,java.rmi.MarshalledObject,java.lang.String[],javax.security.auth.Subject)
     * public abstract javax.management.ObjectInstance
     * javax.management.remote.rmi.RMIConnection.createMBean(java.lang.String,javax.management.ObjectName,javax.management.ObjectName,java.rmi.MarshalledObject,java.lang.String[],javax.security.auth.Subject)
     * throws
     * javax.management.ReflectionException,javax.management.InstanceAlreadyExistsException,javax.management.MBeanRegistrationException,javax.management.MBeanException,javax.management.NotCompliantMBeanException,javax.management.InstanceNotFoundException,java.io.IOException}
     * .
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createMBean_String_ObjectName_ObjectName_MarshalledObject_StringArray_Subject()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.management.remote.rmi.RMIConnection#createMBean(java.lang.String,javax.management.ObjectName,javax.management.ObjectName,javax.security.auth.Subject)
     * public abstract javax.management.ObjectInstance
     * javax.management.remote.rmi.RMIConnection.createMBean(java.lang.String,javax.management.ObjectName,javax.management.ObjectName,javax.security.auth.Subject)
     * throws
     * javax.management.ReflectionException,javax.management.InstanceAlreadyExistsException,javax.management.MBeanRegistrationException,javax.management.MBeanException,javax.management.NotCompliantMBeanException,javax.management.InstanceNotFoundException,java.io.IOException}
     * .
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createMBean_String_ObjectName_ObjectName_Subject()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.management.remote.rmi.RMIConnection#createMBean(java.lang.String,javax.management.ObjectName,javax.security.auth.Subject)
     * public abstract javax.management.ObjectInstance
     * javax.management.remote.rmi.RMIConnection.createMBean(java.lang.String,javax.management.ObjectName,javax.security.auth.Subject)
     * throws
     * javax.management.ReflectionException,javax.management.InstanceAlreadyExistsException,javax.management.MBeanRegistrationException,javax.management.MBeanException,javax.management.NotCompliantMBeanException,java.io.IOException}
     * .
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createMBean_String_ObjectName_Subject()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.remote.rmi.RMIConnection#fetchNotifications(long,int,long) public
     * abstract javax.management.remote.NotificationResult
     * javax.management.remote.rmi.RMIConnection.fetchNotifications(long,int,long) throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_fetchNotifications_long_int_long()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.management.remote.rmi.RMIConnection#getAttribute(javax.management.ObjectName,java.lang.String,javax.security.auth.Subject)
     * public abstract java.lang.Object
     * javax.management.remote.rmi.RMIConnection.getAttribute(javax.management.ObjectName,java.lang.String,javax.security.auth.Subject)
     * throws
     * javax.management.MBeanException,javax.management.AttributeNotFoundException,javax.management.InstanceNotFoundException,javax.management.ReflectionException,java.io.IOException}
     * .
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAttribute_ObjectName_String_Subject()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.management.remote.rmi.RMIConnection#getAttributes(javax.management.ObjectName,java.lang.String[],javax.security.auth.Subject)
     * public abstract javax.management.AttributeList
     * javax.management.remote.rmi.RMIConnection.getAttributes(javax.management.ObjectName,java.lang.String[],javax.security.auth.Subject)
     * throws javax.management.InstanceNotFoundException,javax.management.ReflectionException,java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAttributes_ObjectName_StringArray_Subject()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.remote.rmi.RMIConnection#getConnectionId() public abstract
     * java.lang.String javax.management.remote.rmi.RMIConnection.getConnectionId() throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getConnectionId()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.remote.rmi.RMIConnection#getDefaultDomain(javax.security.auth.Subject)
     * public abstract java.lang.String
     * javax.management.remote.rmi.RMIConnection.getDefaultDomain(javax.security.auth.Subject) throws
     * java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getDefaultDomain_Subject()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.remote.rmi.RMIConnection#getDomains(javax.security.auth.Subject) public
     * abstract java.lang.String[] javax.management.remote.rmi.RMIConnection.getDomains(javax.security.auth.Subject)
     * throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getDomains_Subject()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.remote.rmi.RMIConnection#getMBeanCount(javax.security.auth.Subject)
     * public abstract java.lang.Integer
     * javax.management.remote.rmi.RMIConnection.getMBeanCount(javax.security.auth.Subject) throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getMBeanCount_Subject()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.management.remote.rmi.RMIConnection#getMBeanInfo(javax.management.ObjectName,javax.security.auth.Subject)
     * public abstract javax.management.MBeanInfo
     * javax.management.remote.rmi.RMIConnection.getMBeanInfo(javax.management.ObjectName,javax.security.auth.Subject)
     * throws
     * javax.management.InstanceNotFoundException,javax.management.IntrospectionException,javax.management.ReflectionException,java.io.IOException}
     * .
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getMBeanInfo_ObjectName_Subject()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.management.remote.rmi.RMIConnection#getObjectInstance(javax.management.ObjectName,javax.security.auth.Subject)
     * public abstract javax.management.ObjectInstance
     * javax.management.remote.rmi.RMIConnection.getObjectInstance(javax.management.ObjectName,javax.security.auth.Subject)
     * throws javax.management.InstanceNotFoundException,java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getObjectInstance_ObjectName_Subject()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.management.remote.rmi.RMIConnection#invoke(javax.management.ObjectName,java.lang.String,java.rmi.MarshalledObject,java.lang.String[],javax.security.auth.Subject)
     * public abstract java.lang.Object
     * javax.management.remote.rmi.RMIConnection.invoke(javax.management.ObjectName,java.lang.String,java.rmi.MarshalledObject,java.lang.String[],javax.security.auth.Subject)
     * throws
     * javax.management.InstanceNotFoundException,javax.management.MBeanException,javax.management.ReflectionException,java.io.IOException}
     * .
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_invoke_ObjectName_String_MarshalledObject_StringArray_Subject()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.management.remote.rmi.RMIConnection#isInstanceOf(javax.management.ObjectName,java.lang.String,javax.security.auth.Subject)
     * public abstract boolean
     * javax.management.remote.rmi.RMIConnection.isInstanceOf(javax.management.ObjectName,java.lang.String,javax.security.auth.Subject)
     * throws javax.management.InstanceNotFoundException,java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isInstanceOf_ObjectName_String_Subject()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.management.remote.rmi.RMIConnection#isRegistered(javax.management.ObjectName,javax.security.auth.Subject)
     * public abstract boolean
     * javax.management.remote.rmi.RMIConnection.isRegistered(javax.management.ObjectName,javax.security.auth.Subject)
     * throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isRegistered_ObjectName_Subject()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.management.remote.rmi.RMIConnection#queryMBeans(javax.management.ObjectName,java.rmi.MarshalledObject,javax.security.auth.Subject)
     * public abstract java.util.Set
     * javax.management.remote.rmi.RMIConnection.queryMBeans(javax.management.ObjectName,java.rmi.MarshalledObject,javax.security.auth.Subject)
     * throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_queryMBeans_ObjectName_MarshalledObject_Subject()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.management.remote.rmi.RMIConnection#queryNames(javax.management.ObjectName,java.rmi.MarshalledObject,javax.security.auth.Subject)
     * public abstract java.util.Set
     * javax.management.remote.rmi.RMIConnection.queryNames(javax.management.ObjectName,java.rmi.MarshalledObject,javax.security.auth.Subject)
     * throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_queryNames_ObjectName_MarshalledObject_Subject()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.management.remote.rmi.RMIConnection#removeNotificationListener(javax.management.ObjectName,javax.management.ObjectName,java.rmi.MarshalledObject,java.rmi.MarshalledObject,javax.security.auth.Subject)
     * public abstract void
     * javax.management.remote.rmi.RMIConnection.removeNotificationListener(javax.management.ObjectName,javax.management.ObjectName,java.rmi.MarshalledObject,java.rmi.MarshalledObject,javax.security.auth.Subject)
     * throws javax.management.InstanceNotFoundException,javax.management.ListenerNotFoundException,java.io.IOException}
     * .
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_removeNotificationListener_ObjectName_ObjectName_MarshalledObject_MarshalledObject_Subject()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.management.remote.rmi.RMIConnection#removeNotificationListener(javax.management.ObjectName,javax.management.ObjectName,javax.security.auth.Subject)
     * public abstract void
     * javax.management.remote.rmi.RMIConnection.removeNotificationListener(javax.management.ObjectName,javax.management.ObjectName,javax.security.auth.Subject)
     * throws javax.management.InstanceNotFoundException,javax.management.ListenerNotFoundException,java.io.IOException}
     * .
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_removeNotificationListener_ObjectName_ObjectName_Subject()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.management.remote.rmi.RMIConnection#removeNotificationListeners(javax.management.ObjectName,java.lang.Integer[],javax.security.auth.Subject)
     * public abstract void
     * javax.management.remote.rmi.RMIConnection.removeNotificationListeners(javax.management.ObjectName,java.lang.Integer[],javax.security.auth.Subject)
     * throws javax.management.InstanceNotFoundException,javax.management.ListenerNotFoundException,java.io.IOException}
     * .
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_removeNotificationListeners_ObjectName_IntegerArray_Subject()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.management.remote.rmi.RMIConnection#setAttribute(javax.management.ObjectName,java.rmi.MarshalledObject,javax.security.auth.Subject)
     * public abstract void
     * javax.management.remote.rmi.RMIConnection.setAttribute(javax.management.ObjectName,java.rmi.MarshalledObject,javax.security.auth.Subject)
     * throws
     * javax.management.InstanceNotFoundException,javax.management.AttributeNotFoundException,javax.management.InvalidAttributeValueException,javax.management.MBeanException,javax.management.ReflectionException,java.io.IOException}
     * .
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setAttribute_ObjectName_MarshalledObject_Subject()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.management.remote.rmi.RMIConnection#setAttributes(javax.management.ObjectName,java.rmi.MarshalledObject,javax.security.auth.Subject)
     * public abstract javax.management.AttributeList
     * javax.management.remote.rmi.RMIConnection.setAttributes(javax.management.ObjectName,java.rmi.MarshalledObject,javax.security.auth.Subject)
     * throws javax.management.InstanceNotFoundException,javax.management.ReflectionException,java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setAttributes_ObjectName_MarshalledObject_Subject()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.management.remote.rmi.RMIConnection#unregisterMBean(javax.management.ObjectName,javax.security.auth.Subject)
     * public abstract void
     * javax.management.remote.rmi.RMIConnection.unregisterMBean(javax.management.ObjectName,javax.security.auth.Subject)
     * throws
     * javax.management.InstanceNotFoundException,javax.management.MBeanRegistrationException,java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_unregisterMBean_ObjectName_Subject()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
