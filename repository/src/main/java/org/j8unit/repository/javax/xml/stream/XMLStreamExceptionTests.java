package org.j8unit.repository.javax.xml.stream;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.xml.stream.XMLStreamException class javax.xml.stream.XMLStreamException},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.xml.stream.XMLStreamExceptionClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface XMLStreamExceptionTests<SUT extends javax.xml.stream.XMLStreamException>
extends org.j8unit.repository.java.lang.ExceptionTests<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.xml.stream.XMLStreamException#getNestedException() public java.lang.Throwable javax.xml.stream.XMLStreamException.getNestedException()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getNestedException() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.stream.XMLStreamException#getLocation() public javax.xml.stream.Location javax.xml.stream.XMLStreamException.getLocation()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getLocation() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}