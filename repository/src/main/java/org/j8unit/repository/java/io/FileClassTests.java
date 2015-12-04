package org.j8unit.repository.java.io;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link java.io.File class java.io.File},
 * containing all class relevant test methods (at least the test methods of accessible constructors and
 * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
 * methods is {@link org.j8unit.repository.java.io.FileTests}.
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
 * @see org.j8unit.repository.java.io.FileTests
 */
@Category(J8UnitRepository.class)
public abstract interface FileClassTests<SUT extends Class<? extends java.io.File>>
extends org.j8unit.repository.java.io.SerializableClassTests<SUT>,
        org.j8unit.repository.java.lang.ComparableClassTests<SUT,java.io.File>,
        org.j8unit.repository.java.lang.ObjectClassTests<SUT>
{

    /**
     * Test method for {@link java.io.File#File(java.lang.String,java.lang.String) public java.io.File(java.lang.String,java.lang.String)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_File_String_String() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        java.io.File sut = null; // = new File(java.lang.String,java.lang.String);
    }

    /**
     * Test method for {@link java.io.File#File(java.lang.String) public java.io.File(java.lang.String)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_File_String() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        java.io.File sut = null; // = new File(java.lang.String);
    }

    /**
     * Test method for {@link java.io.File#File(java.io.File,java.lang.String) public java.io.File(java.io.File,java.lang.String)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_File_File_String() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        java.io.File sut = null; // = new File(java.io.File,java.lang.String);
    }

    /**
     * Test method for {@link java.io.File#File(java.net.URI) public java.io.File(java.net.URI)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_File_URI() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        java.io.File sut = null; // = new File(java.net.URI);
    }

    @Test
    public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
        // create new instance
        Class<? extends java.io.File> sut = createNewSUT();
        // assert assignability
        assertTrue(java.io.File.class.isAssignableFrom(sut));
    }

    /**
     * <p>
     * Test method for {@link java.io.File#createTempFile(java.lang.String,java.lang.String,java.io.File) public static java.io.File java.io.File.createTempFile(java.lang.String,java.lang.String,java.io.File) throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createTempFile_String_String_File() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.io.File#createTempFile(java.lang.String,java.lang.String) public static java.io.File java.io.File.createTempFile(java.lang.String,java.lang.String) throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createTempFile_String_String() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.io.File#listRoots() public static java.io.File[] java.io.File.listRoots()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_listRoots() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}