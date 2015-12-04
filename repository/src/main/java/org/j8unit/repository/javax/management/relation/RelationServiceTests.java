package org.j8unit.repository.javax.management.relation;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.management.relation.RelationService class javax.management.relation.RelationService},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.management.relation.RelationServiceClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface RelationServiceTests<SUT extends javax.management.relation.RelationService>
extends org.j8unit.repository.javax.management.relation.RelationServiceMBeanTests<SUT>,
        org.j8unit.repository.javax.management.MBeanRegistrationTests<SUT>,
        org.j8unit.repository.javax.management.NotificationListenerTests<SUT>,
        org.j8unit.repository.javax.management.NotificationBroadcasterSupportTests<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.management.relation.RelationService#isRelation(javax.management.ObjectName) public java.lang.String javax.management.relation.RelationService.isRelation(javax.management.ObjectName) throws java.lang.IllegalArgumentException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_isRelation_ObjectName() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.relation.RelationService#createRelation(java.lang.String,java.lang.String,javax.management.relation.RoleList) public void javax.management.relation.RelationService.createRelation(java.lang.String,java.lang.String,javax.management.relation.RoleList) throws javax.management.relation.RelationServiceNotRegisteredException,java.lang.IllegalArgumentException,javax.management.relation.RoleNotFoundException,javax.management.relation.InvalidRelationIdException,javax.management.relation.RelationTypeNotFoundException,javax.management.relation.InvalidRoleValueException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_createRelation_String_String_RoleList() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.relation.RelationService#getRole(java.lang.String,java.lang.String) public java.util.List javax.management.relation.RelationService.getRole(java.lang.String,java.lang.String) throws javax.management.relation.RelationServiceNotRegisteredException,java.lang.IllegalArgumentException,javax.management.relation.RelationNotFoundException,javax.management.relation.RoleNotFoundException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getRole_String_String() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.relation.RelationService#getRoleCardinality(java.lang.String,java.lang.String) public java.lang.Integer javax.management.relation.RelationService.getRoleCardinality(java.lang.String,java.lang.String) throws java.lang.IllegalArgumentException,javax.management.relation.RelationNotFoundException,javax.management.relation.RoleNotFoundException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getRoleCardinality_String_String() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.relation.RelationService#checkRoleReading(java.lang.String,java.lang.String) public java.lang.Integer javax.management.relation.RelationService.checkRoleReading(java.lang.String,java.lang.String) throws java.lang.IllegalArgumentException,javax.management.relation.RelationTypeNotFoundException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_checkRoleReading_String_String() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.relation.RelationService#getAllRelationIds() public java.util.List javax.management.relation.RelationService.getAllRelationIds()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getAllRelationIds() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.relation.RelationService#sendRoleUpdateNotification(java.lang.String,javax.management.relation.Role,java.util.List) public void javax.management.relation.RelationService.sendRoleUpdateNotification(java.lang.String,javax.management.relation.Role,java.util.List) throws java.lang.IllegalArgumentException,javax.management.relation.RelationNotFoundException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_sendRoleUpdateNotification_String_Role_List() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.relation.RelationService#preDeregister() public void javax.management.relation.RelationService.preDeregister() throws java.lang.Exception}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_preDeregister() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.relation.RelationService#setPurgeFlag(boolean) public void javax.management.relation.RelationService.setPurgeFlag(boolean)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_setPurgeFlag_boolean() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.relation.RelationService#getReferencedMBeans(java.lang.String) public java.util.Map javax.management.relation.RelationService.getReferencedMBeans(java.lang.String) throws java.lang.IllegalArgumentException,javax.management.relation.RelationNotFoundException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getReferencedMBeans_String() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.relation.RelationService#createRelationType(java.lang.String,javax.management.relation.RoleInfo[]) public void javax.management.relation.RelationService.createRelationType(java.lang.String,javax.management.relation.RoleInfo[]) throws java.lang.IllegalArgumentException,javax.management.relation.InvalidRelationTypeException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_createRelationType_String_RoleInfoArray() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.relation.RelationService#findReferencingRelations(javax.management.ObjectName,java.lang.String,java.lang.String) public java.util.Map javax.management.relation.RelationService.findReferencingRelations(javax.management.ObjectName,java.lang.String,java.lang.String) throws java.lang.IllegalArgumentException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_findReferencingRelations_ObjectName_String_String() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.relation.RelationService#sendRelationCreationNotification(java.lang.String) public void javax.management.relation.RelationService.sendRelationCreationNotification(java.lang.String) throws java.lang.IllegalArgumentException,javax.management.relation.RelationNotFoundException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_sendRelationCreationNotification_String() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.relation.RelationService#handleNotification(javax.management.Notification,java.lang.Object) public void javax.management.relation.RelationService.handleNotification(javax.management.Notification,java.lang.Object)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_handleNotification_Notification_Object() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.relation.RelationService#hasRelation(java.lang.String) public java.lang.Boolean javax.management.relation.RelationService.hasRelation(java.lang.String) throws java.lang.IllegalArgumentException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_hasRelation_String() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.relation.RelationService#postRegister(java.lang.Boolean) public void javax.management.relation.RelationService.postRegister(java.lang.Boolean)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_postRegister_Boolean() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.relation.RelationService#setRole(java.lang.String,javax.management.relation.Role) public void javax.management.relation.RelationService.setRole(java.lang.String,javax.management.relation.Role) throws javax.management.relation.RelationServiceNotRegisteredException,java.lang.IllegalArgumentException,javax.management.relation.RelationNotFoundException,javax.management.relation.RoleNotFoundException,javax.management.relation.InvalidRoleValueException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_setRole_String_Role() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.relation.RelationService#findRelationsOfType(java.lang.String) public java.util.List javax.management.relation.RelationService.findRelationsOfType(java.lang.String) throws java.lang.IllegalArgumentException,javax.management.relation.RelationTypeNotFoundException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_findRelationsOfType_String() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.relation.RelationService#removeRelationType(java.lang.String) public void javax.management.relation.RelationService.removeRelationType(java.lang.String) throws javax.management.relation.RelationServiceNotRegisteredException,java.lang.IllegalArgumentException,javax.management.relation.RelationTypeNotFoundException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_removeRelationType_String() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.relation.RelationService#isActive() public void javax.management.relation.RelationService.isActive() throws javax.management.relation.RelationServiceNotRegisteredException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_isActive() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.relation.RelationService#purgeRelations() public void javax.management.relation.RelationService.purgeRelations() throws javax.management.relation.RelationServiceNotRegisteredException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_purgeRelations() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.relation.RelationService#getNotificationInfo() public javax.management.MBeanNotificationInfo[] javax.management.relation.RelationService.getNotificationInfo()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getNotificationInfo() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.relation.RelationService#getRoleInfo(java.lang.String,java.lang.String) public javax.management.relation.RoleInfo javax.management.relation.RelationService.getRoleInfo(java.lang.String,java.lang.String) throws java.lang.IllegalArgumentException,javax.management.relation.RelationTypeNotFoundException,javax.management.relation.RoleInfoNotFoundException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getRoleInfo_String_String() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.relation.RelationService#removeRelation(java.lang.String) public void javax.management.relation.RelationService.removeRelation(java.lang.String) throws javax.management.relation.RelationServiceNotRegisteredException,java.lang.IllegalArgumentException,javax.management.relation.RelationNotFoundException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_removeRelation_String() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.relation.RelationService#getRoleInfos(java.lang.String) public java.util.List javax.management.relation.RelationService.getRoleInfos(java.lang.String) throws java.lang.IllegalArgumentException,javax.management.relation.RelationTypeNotFoundException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getRoleInfos_String() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.relation.RelationService#sendRelationRemovalNotification(java.lang.String,java.util.List) public void javax.management.relation.RelationService.sendRelationRemovalNotification(java.lang.String,java.util.List) throws java.lang.IllegalArgumentException,javax.management.relation.RelationNotFoundException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_sendRelationRemovalNotification_String_List() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.relation.RelationService#addRelationType(javax.management.relation.RelationType) public void javax.management.relation.RelationService.addRelationType(javax.management.relation.RelationType) throws java.lang.IllegalArgumentException,javax.management.relation.InvalidRelationTypeException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_addRelationType_RelationType() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.relation.RelationService#getPurgeFlag() public boolean javax.management.relation.RelationService.getPurgeFlag()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getPurgeFlag() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.relation.RelationService#postDeregister() public void javax.management.relation.RelationService.postDeregister()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_postDeregister() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.relation.RelationService#getAllRoles(java.lang.String) public javax.management.relation.RoleResult javax.management.relation.RelationService.getAllRoles(java.lang.String) throws java.lang.IllegalArgumentException,javax.management.relation.RelationNotFoundException,javax.management.relation.RelationServiceNotRegisteredException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getAllRoles_String() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.relation.RelationService#setRoles(java.lang.String,javax.management.relation.RoleList) public javax.management.relation.RoleResult javax.management.relation.RelationService.setRoles(java.lang.String,javax.management.relation.RoleList) throws javax.management.relation.RelationServiceNotRegisteredException,java.lang.IllegalArgumentException,javax.management.relation.RelationNotFoundException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_setRoles_String_RoleList() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.relation.RelationService#addRelation(javax.management.ObjectName) public void javax.management.relation.RelationService.addRelation(javax.management.ObjectName) throws java.lang.IllegalArgumentException,javax.management.relation.RelationServiceNotRegisteredException,java.lang.NoSuchMethodException,javax.management.relation.InvalidRelationIdException,javax.management.InstanceNotFoundException,javax.management.relation.InvalidRelationServiceException,javax.management.relation.RelationTypeNotFoundException,javax.management.relation.RoleNotFoundException,javax.management.relation.InvalidRoleValueException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_addRelation_ObjectName() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.relation.RelationService#getRelationTypeName(java.lang.String) public java.lang.String javax.management.relation.RelationService.getRelationTypeName(java.lang.String) throws java.lang.IllegalArgumentException,javax.management.relation.RelationNotFoundException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getRelationTypeName_String() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.relation.RelationService#getRoles(java.lang.String,java.lang.String[]) public javax.management.relation.RoleResult javax.management.relation.RelationService.getRoles(java.lang.String,java.lang.String[]) throws javax.management.relation.RelationServiceNotRegisteredException,java.lang.IllegalArgumentException,javax.management.relation.RelationNotFoundException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getRoles_String_StringArray() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.relation.RelationService#preRegister(javax.management.MBeanServer,javax.management.ObjectName) public javax.management.ObjectName javax.management.relation.RelationService.preRegister(javax.management.MBeanServer,javax.management.ObjectName) throws java.lang.Exception}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_preRegister_MBeanServer_ObjectName() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.relation.RelationService#updateRoleMap(java.lang.String,javax.management.relation.Role,java.util.List) public void javax.management.relation.RelationService.updateRoleMap(java.lang.String,javax.management.relation.Role,java.util.List) throws java.lang.IllegalArgumentException,javax.management.relation.RelationServiceNotRegisteredException,javax.management.relation.RelationNotFoundException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_updateRoleMap_String_Role_List() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.relation.RelationService#getAllRelationTypeNames() public java.util.List javax.management.relation.RelationService.getAllRelationTypeNames()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getAllRelationTypeNames() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.relation.RelationService#checkRoleWriting(javax.management.relation.Role,java.lang.String,java.lang.Boolean) public java.lang.Integer javax.management.relation.RelationService.checkRoleWriting(javax.management.relation.Role,java.lang.String,java.lang.Boolean) throws java.lang.IllegalArgumentException,javax.management.relation.RelationTypeNotFoundException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_checkRoleWriting_Role_String_Boolean() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.relation.RelationService#isRelationMBean(java.lang.String) public javax.management.ObjectName javax.management.relation.RelationService.isRelationMBean(java.lang.String) throws java.lang.IllegalArgumentException,javax.management.relation.RelationNotFoundException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_isRelationMBean_String() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.relation.RelationService#findAssociatedMBeans(javax.management.ObjectName,java.lang.String,java.lang.String) public java.util.Map javax.management.relation.RelationService.findAssociatedMBeans(javax.management.ObjectName,java.lang.String,java.lang.String) throws java.lang.IllegalArgumentException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_findAssociatedMBeans_ObjectName_String_String() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}