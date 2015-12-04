package org.j8unit.repository.java.nio.channels;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link java.nio.channels.SelectableChannel class java.nio.channels.SelectableChannel},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.nio.channels.SelectableChannelClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface SelectableChannelTests<SUT extends java.nio.channels.SelectableChannel>
extends org.j8unit.repository.java.nio.channels.ChannelTests<SUT>,
        org.j8unit.repository.java.nio.channels.spi.AbstractInterruptibleChannelTests<SUT>
{

    /**
     * <p>
     * Test method for {@link java.nio.channels.SelectableChannel#provider() public abstract java.nio.channels.spi.SelectorProvider java.nio.channels.SelectableChannel.provider()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_provider() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.SelectableChannel#isBlocking() public abstract boolean java.nio.channels.SelectableChannel.isBlocking()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isBlocking() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.SelectableChannel#keyFor(java.nio.channels.Selector) public abstract java.nio.channels.SelectionKey java.nio.channels.SelectableChannel.keyFor(java.nio.channels.Selector)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_keyFor_Selector() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.SelectableChannel#blockingLock() public abstract java.lang.Object java.nio.channels.SelectableChannel.blockingLock()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_blockingLock() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.SelectableChannel#register(java.nio.channels.Selector,int) public final java.nio.channels.SelectionKey java.nio.channels.SelectableChannel.register(java.nio.channels.Selector,int) throws java.nio.channels.ClosedChannelException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_register_Selector_int() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.SelectableChannel#register(java.nio.channels.Selector,int,java.lang.Object) public abstract java.nio.channels.SelectionKey java.nio.channels.SelectableChannel.register(java.nio.channels.Selector,int,java.lang.Object) throws java.nio.channels.ClosedChannelException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_register_Selector_int_Object() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.SelectableChannel#configureBlocking(boolean) public abstract java.nio.channels.SelectableChannel java.nio.channels.SelectableChannel.configureBlocking(boolean) throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_configureBlocking_boolean() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.SelectableChannel#validOps() public abstract int java.nio.channels.SelectableChannel.validOps()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_validOps() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.SelectableChannel#isRegistered() public abstract boolean java.nio.channels.SelectableChannel.isRegistered()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isRegistered() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

 /**
  * <p>
  * The method-under-test covered by this test method is inherited duplicatedly within
  * the declaring class-under-test. In result, there are duplicated according test
  * method within the super test classes. To solve this situation, this method must be
  * overriden. Dont't worry, there will be meaningful test methods soon and, thus,
  * overriding becomes unnecessary.
  * </p>
  */
 @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
 @Test
 @Category(Draft.class)
 @Override
 public default void test_close() throws Exception {
 }

 /**
  * <p>
  * The method-under-test covered by this test method is inherited duplicatedly within
  * the declaring class-under-test. In result, there are duplicated according test
  * method within the super test classes. To solve this situation, this method must be
  * overriden. Dont't worry, there will be meaningful test methods soon and, thus,
  * overriding becomes unnecessary.
  * </p>
  */
 @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
 @Test
 @Category(Draft.class)
 @Override
 public default void test_isOpen() throws Exception {
 }

}