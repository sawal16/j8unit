package org.j8unit.repository.java.nio.file;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link java.nio.file.FileSystemNotFoundException class java.nio.file.FileSystemNotFoundException},
 * containing all class relevant test methods (at least the test methods of accessible constructors and
 * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
 * methods is {@link org.j8unit.repository.java.nio.file.FileSystemNotFoundExceptionTests}.
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
 * @see org.j8unit.repository.java.nio.file.FileSystemNotFoundExceptionTests
 */
@Category(J8UnitRepository.class)
public abstract interface FileSystemNotFoundExceptionClassTests<SUT extends Class<? extends java.nio.file.FileSystemNotFoundException>>
extends org.j8unit.repository.java.lang.RuntimeExceptionClassTests<SUT>
{

    /**
     * Test method for {@link java.nio.file.FileSystemNotFoundException#FileSystemNotFoundException() public java.nio.file.FileSystemNotFoundException()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_FileSystemNotFoundException() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        java.nio.file.FileSystemNotFoundException sut = null; // = new FileSystemNotFoundException();
    }

    /**
     * Test method for {@link java.nio.file.FileSystemNotFoundException#FileSystemNotFoundException(java.lang.String) public java.nio.file.FileSystemNotFoundException(java.lang.String)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_FileSystemNotFoundException_String() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        java.nio.file.FileSystemNotFoundException sut = null; // = new FileSystemNotFoundException(java.lang.String);
    }

    @Test
    public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
        // create new instance
        Class<? extends java.nio.file.FileSystemNotFoundException> sut = createNewSUT();
        // assert assignability
        assertTrue(java.nio.file.FileSystemNotFoundException.class.isAssignableFrom(sut));
    }

}