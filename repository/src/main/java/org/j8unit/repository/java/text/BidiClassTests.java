package org.j8unit.repository.java.text;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link java.text.Bidi class java.text.Bidi},
 * containing all class relevant test methods (at least the test methods of accessible constructors and
 * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
 * methods is {@link org.j8unit.repository.java.text.BidiTests}.
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
 * @see org.j8unit.repository.java.text.BidiTests
 */
@Category(J8UnitRepository.class)
public abstract interface BidiClassTests<SUT extends Class<? extends java.text.Bidi>>
extends org.j8unit.repository.java.lang.ObjectClassTests<SUT>
{

    /**
     * Test method for {@link java.text.Bidi#Bidi(char[],int,byte[],int,int,int) public java.text.Bidi(char[],int,byte[],int,int,int)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_Bidi_charArray_int_byteArray_int_int_int() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        java.text.Bidi sut = null; // = new Bidi(char[],int,byte[],int,int,int);
    }

    /**
     * Test method for {@link java.text.Bidi#Bidi(java.text.AttributedCharacterIterator) public java.text.Bidi(java.text.AttributedCharacterIterator)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_Bidi_AttributedCharacterIterator() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        java.text.Bidi sut = null; // = new Bidi(java.text.AttributedCharacterIterator);
    }

    /**
     * Test method for {@link java.text.Bidi#Bidi(java.lang.String,int) public java.text.Bidi(java.lang.String,int)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_Bidi_String_int() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        java.text.Bidi sut = null; // = new Bidi(java.lang.String,int);
    }

    @Test
    public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
        // create new instance
        Class<? extends java.text.Bidi> sut = createNewSUT();
        // assert assignability
        assertTrue(java.text.Bidi.class.isAssignableFrom(sut));
    }

    /**
     * <p>
     * Test method for {@link java.text.Bidi#reorderVisually(byte[],int,java.lang.Object[],int,int) public static void java.text.Bidi.reorderVisually(byte[],int,java.lang.Object[],int,int)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_reorderVisually_byteArray_int_ObjectArray_int_int() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.text.Bidi#requiresBidi(char[],int,int) public static boolean java.text.Bidi.requiresBidi(char[],int,int)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_requiresBidi_charArray_int_int() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}