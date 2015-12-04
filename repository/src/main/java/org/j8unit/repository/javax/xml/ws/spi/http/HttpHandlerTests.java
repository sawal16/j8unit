package org.j8unit.repository.javax.xml.ws.spi.http;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.xml.ws.spi.http.HttpHandler class javax.xml.ws.spi.http.HttpHandler},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.xml.ws.spi.http.HttpHandlerClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface HttpHandlerTests<SUT extends javax.xml.ws.spi.http.HttpHandler>
extends org.j8unit.repository.java.lang.ObjectTests<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.xml.ws.spi.http.HttpHandler#handle(javax.xml.ws.spi.http.HttpExchange) public abstract void javax.xml.ws.spi.http.HttpHandler.handle(javax.xml.ws.spi.http.HttpExchange) throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_handle_HttpExchange() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}