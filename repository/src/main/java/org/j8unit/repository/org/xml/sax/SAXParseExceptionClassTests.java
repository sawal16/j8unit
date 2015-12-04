package org.j8unit.repository.org.xml.sax;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link org.xml.sax.SAXParseException class org.xml.sax.SAXParseException},
 * containing all class relevant test methods (at least the test methods of accessible constructors and
 * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
 * methods is {@link org.j8unit.repository.org.xml.sax.SAXParseExceptionTests}.
 * </p>
 *
 * <p>
 * In addition, there may be assertions concerning the class itself.
 * For example, <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1"><q>by
 * virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
 * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS, Sec.&thinsp;9.6.1</a>
 * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests}
 * provides a corresponding, inheritable test method:
 * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
 * Similarly, this class is not only intended to assert some static method's behaviour but also to verify
 * runtime constraints and further class specific requirements.
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.org.xml.sax.SAXParseExceptionTests
 */
@Category(J8UnitRepository.class)
public abstract interface SAXParseExceptionClassTests<SUT extends Class<? extends org.xml.sax.SAXParseException>>
extends org.j8unit.repository.org.xml.sax.SAXExceptionClassTests<SUT>
{

    /**
     * Test method for {@link org.xml.sax.SAXParseException#SAXParseException(java.lang.String,java.lang.String,java.lang.String,int,int,java.lang.Exception) public org.xml.sax.SAXParseException(java.lang.String,java.lang.String,java.lang.String,int,int,java.lang.Exception)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_SAXParseException_String_String_String_int_int_Exception() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        org.xml.sax.SAXParseException sut = null; // = new SAXParseException(java.lang.String,java.lang.String,java.lang.String,int,int,java.lang.Exception);
    }

    /**
     * Test method for {@link org.xml.sax.SAXParseException#SAXParseException(java.lang.String,java.lang.String,java.lang.String,int,int) public org.xml.sax.SAXParseException(java.lang.String,java.lang.String,java.lang.String,int,int)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_SAXParseException_String_String_String_int_int() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        org.xml.sax.SAXParseException sut = null; // = new SAXParseException(java.lang.String,java.lang.String,java.lang.String,int,int);
    }

    /**
     * Test method for {@link org.xml.sax.SAXParseException#SAXParseException(java.lang.String,org.xml.sax.Locator,java.lang.Exception) public org.xml.sax.SAXParseException(java.lang.String,org.xml.sax.Locator,java.lang.Exception)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_SAXParseException_String_Locator_Exception() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        org.xml.sax.SAXParseException sut = null; // = new SAXParseException(java.lang.String,org.xml.sax.Locator,java.lang.Exception);
    }

    /**
     * Test method for {@link org.xml.sax.SAXParseException#SAXParseException(java.lang.String,org.xml.sax.Locator) public org.xml.sax.SAXParseException(java.lang.String,org.xml.sax.Locator)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_SAXParseException_String_Locator() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        org.xml.sax.SAXParseException sut = null; // = new SAXParseException(java.lang.String,org.xml.sax.Locator);
    }

    @Test
    public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
        // create new instance
        Class<? extends org.xml.sax.SAXParseException> sut = createNewSUT();
        // assert assignability
        assertTrue(org.xml.sax.SAXParseException.class.isAssignableFrom(sut));
    }

}