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
 * Test class for {@link javax.xml.stream.XMLEventReader interface javax.xml.stream.XMLEventReader},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.xml.stream.XMLEventReaderClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface XMLEventReaderTests<SUT extends javax.xml.stream.XMLEventReader>
extends org.j8unit.repository.java.util.IteratorTests<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.xml.stream.XMLEventReader#nextTag() public abstract javax.xml.stream.events.XMLEvent javax.xml.stream.XMLEventReader.nextTag() throws javax.xml.stream.XMLStreamException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_nextTag() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.stream.XMLEventReader#getProperty(java.lang.String) public abstract java.lang.Object javax.xml.stream.XMLEventReader.getProperty(java.lang.String) throws java.lang.IllegalArgumentException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getProperty_String() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.stream.XMLEventReader#getElementText() public abstract java.lang.String javax.xml.stream.XMLEventReader.getElementText() throws javax.xml.stream.XMLStreamException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getElementText() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.stream.XMLEventReader#nextEvent() public abstract javax.xml.stream.events.XMLEvent javax.xml.stream.XMLEventReader.nextEvent() throws javax.xml.stream.XMLStreamException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_nextEvent() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.stream.XMLEventReader#hasNext() public abstract boolean javax.xml.stream.XMLEventReader.hasNext()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_hasNext() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.stream.XMLEventReader#close() public abstract void javax.xml.stream.XMLEventReader.close() throws javax.xml.stream.XMLStreamException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_close() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.stream.XMLEventReader#peek() public abstract javax.xml.stream.events.XMLEvent javax.xml.stream.XMLEventReader.peek() throws javax.xml.stream.XMLStreamException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_peek() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}