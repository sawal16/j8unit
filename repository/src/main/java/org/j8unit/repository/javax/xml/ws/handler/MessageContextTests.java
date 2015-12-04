package org.j8unit.repository.javax.xml.ws.handler;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.xml.ws.handler.MessageContext interface javax.xml.ws.handler.MessageContext},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.xml.ws.handler.MessageContextClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface MessageContextTests<SUT extends javax.xml.ws.handler.MessageContext>
extends org.j8unit.repository.java.util.MapTests<SUT,java.lang.String,java.lang.Object>
{

    /**
     * <p>
     * Test method for {@link javax.xml.ws.handler.MessageContext#getScope(java.lang.String) public abstract javax.xml.ws.handler.MessageContext$Scope javax.xml.ws.handler.MessageContext.getScope(java.lang.String)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getScope_String() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.ws.handler.MessageContext#setScope(java.lang.String,javax.xml.ws.handler.MessageContext.Scope) public abstract void javax.xml.ws.handler.MessageContext.setScope(java.lang.String,javax.xml.ws.handler.MessageContext$Scope)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setScope_String_Scope() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test class for {@link javax.xml.ws.handler.MessageContext$Scope class javax.xml.ws.handler.MessageContext$Scope},
     * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
     * </p>
     *
     * @param SUT the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.javax.xml.ws.handler.MessageContextClassTests.ScopeClassTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface ScopeTests<SUT extends javax.xml.ws.handler.MessageContext.Scope>
    extends org.j8unit.repository.java.lang.EnumTests<SUT,javax.xml.ws.handler.MessageContext.Scope>
    {

    }

}