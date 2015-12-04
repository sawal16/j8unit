package org.j8unit.repository.java.util.logging;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link java.util.logging.SocketHandler class java.util.logging.SocketHandler},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.util.logging.SocketHandlerClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface SocketHandlerTests<SUT extends java.util.logging.SocketHandler>
extends org.j8unit.repository.java.util.logging.StreamHandlerTests<SUT>
{

    /**
     * <p>
     * Test method for {@link java.util.logging.SocketHandler#close() public synchronized void java.util.logging.SocketHandler.close() throws java.lang.SecurityException}.
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
     * Test method for {@link java.util.logging.SocketHandler#publish(java.util.logging.LogRecord) public synchronized void java.util.logging.SocketHandler.publish(java.util.logging.LogRecord)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_publish_LogRecord() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}