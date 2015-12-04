package org.j8unit.repository.javax.xml.bind.annotation;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.xml.bind.annotation.DomHandler interface javax.xml.bind.annotation.DomHandler},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.xml.bind.annotation.DomHandlerClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface DomHandlerTests<SUT extends javax.xml.bind.annotation.DomHandler<ElementT,ResultT>, ElementT, ResultT extends javax.xml.transform.Result>
extends J8UnitTest<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.xml.bind.annotation.DomHandler#marshal(java.lang.Object,javax.xml.bind.ValidationEventHandler) public abstract javax.xml.transform.Source javax.xml.bind.annotation.DomHandler.marshal(java.lang.Object,javax.xml.bind.ValidationEventHandler)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_marshal_Object_ValidationEventHandler() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.bind.annotation.DomHandler#getElement(javax.xml.transform.Result) public abstract java.lang.Object javax.xml.bind.annotation.DomHandler.getElement(javax.xml.transform.Result)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getElement_Result() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.bind.annotation.DomHandler#createUnmarshaller(javax.xml.bind.ValidationEventHandler) public abstract javax.xml.transform.Result javax.xml.bind.annotation.DomHandler.createUnmarshaller(javax.xml.bind.ValidationEventHandler)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createUnmarshaller_ValidationEventHandler() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}