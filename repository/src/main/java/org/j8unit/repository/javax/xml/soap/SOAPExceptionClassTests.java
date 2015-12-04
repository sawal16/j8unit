package org.j8unit.repository.javax.xml.soap;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.xml.soap.SOAPException class javax.xml.soap.SOAPException},
 * containing all class relevant test methods (at least the test methods of accessible constructors and
 * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
 * methods is {@link org.j8unit.repository.javax.xml.soap.SOAPExceptionTests}.
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
 * @see org.j8unit.repository.javax.xml.soap.SOAPExceptionTests
 */
@Category(J8UnitRepository.class)
public abstract interface SOAPExceptionClassTests<SUT extends Class<? extends javax.xml.soap.SOAPException>>
extends org.j8unit.repository.java.lang.ExceptionClassTests<SUT>
{

    /**
     * Test method for {@link javax.xml.soap.SOAPException#SOAPException(java.lang.Throwable) public javax.xml.soap.SOAPException(java.lang.Throwable)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_SOAPException_Throwable() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        javax.xml.soap.SOAPException sut = null; // = new SOAPException(java.lang.Throwable);
    }

    /**
     * Test method for {@link javax.xml.soap.SOAPException#SOAPException(java.lang.String,java.lang.Throwable) public javax.xml.soap.SOAPException(java.lang.String,java.lang.Throwable)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_SOAPException_String_Throwable() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        javax.xml.soap.SOAPException sut = null; // = new SOAPException(java.lang.String,java.lang.Throwable);
    }

    /**
     * Test method for {@link javax.xml.soap.SOAPException#SOAPException(java.lang.String) public javax.xml.soap.SOAPException(java.lang.String)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_SOAPException_String() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        javax.xml.soap.SOAPException sut = null; // = new SOAPException(java.lang.String);
    }

    /**
     * Test method for {@link javax.xml.soap.SOAPException#SOAPException() public javax.xml.soap.SOAPException()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_SOAPException() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        javax.xml.soap.SOAPException sut = null; // = new SOAPException();
    }

    @Test
    public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
        // create new instance
        Class<? extends javax.xml.soap.SOAPException> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.xml.soap.SOAPException.class.isAssignableFrom(sut));
    }

}