package org.j8unit.repository.java.net;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link java.net.SocketOptions interface java.net.SocketOptions},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.net.SocketOptionsClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface SocketOptionsTests<SUT extends java.net.SocketOptions>
extends J8UnitTest<SUT>
{

    /**
     * <p>
     * Test method for {@link java.net.SocketOptions#setOption(int,java.lang.Object) public abstract void java.net.SocketOptions.setOption(int,java.lang.Object) throws java.net.SocketException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setOption_int_Object() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.net.SocketOptions#getOption(int) public abstract java.lang.Object java.net.SocketOptions.getOption(int) throws java.net.SocketException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getOption_int() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}