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
 * Test class for {@link java.nio.channels.Channel interface java.nio.channels.Channel},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.nio.channels.ChannelClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface ChannelTests<SUT extends java.nio.channels.Channel>
extends org.j8unit.repository.java.io.CloseableTests<SUT>
{

    /**
     * <p>
     * Test method for {@link java.nio.channels.Channel#close() public abstract void java.nio.channels.Channel.close() throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_close() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.Channel#isOpen() public abstract boolean java.nio.channels.Channel.isOpen()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isOpen() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}