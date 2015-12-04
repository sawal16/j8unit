package org.j8unit.repository.java.security;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link java.security.InvalidKeyException class java.security.InvalidKeyException},
 * containing all class relevant test methods (at least the test methods of accessible constructors and
 * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
 * methods is {@link org.j8unit.repository.java.security.InvalidKeyExceptionTests}.
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
 * @see org.j8unit.repository.java.security.InvalidKeyExceptionTests
 */
@Category(J8UnitRepository.class)
public abstract interface InvalidKeyExceptionClassTests<SUT extends Class<? extends java.security.InvalidKeyException>>
extends org.j8unit.repository.java.security.KeyExceptionClassTests<SUT>
{

    /**
     * Test method for {@link java.security.InvalidKeyException#InvalidKeyException(java.lang.Throwable) public java.security.InvalidKeyException(java.lang.Throwable)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_InvalidKeyException_Throwable() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        java.security.InvalidKeyException sut = null; // = new InvalidKeyException(java.lang.Throwable);
    }

    /**
     * Test method for {@link java.security.InvalidKeyException#InvalidKeyException(java.lang.String,java.lang.Throwable) public java.security.InvalidKeyException(java.lang.String,java.lang.Throwable)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_InvalidKeyException_String_Throwable() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        java.security.InvalidKeyException sut = null; // = new InvalidKeyException(java.lang.String,java.lang.Throwable);
    }

    /**
     * Test method for {@link java.security.InvalidKeyException#InvalidKeyException(java.lang.String) public java.security.InvalidKeyException(java.lang.String)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_InvalidKeyException_String() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        java.security.InvalidKeyException sut = null; // = new InvalidKeyException(java.lang.String);
    }

    /**
     * Test method for {@link java.security.InvalidKeyException#InvalidKeyException() public java.security.InvalidKeyException()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_InvalidKeyException() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        java.security.InvalidKeyException sut = null; // = new InvalidKeyException();
    }

    @Test
    public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
        // create new instance
        Class<? extends java.security.InvalidKeyException> sut = createNewSUT();
        // assert assignability
        assertTrue(java.security.InvalidKeyException.class.isAssignableFrom(sut));
    }

}