package org.j8unit.repository.javax.sound.sampled;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.sound.sampled.Port interface javax.sound.sampled.Port},
 * containing all class relevant test methods (at least the test methods of accessible constructors and
 * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
 * methods is {@link org.j8unit.repository.javax.sound.sampled.PortTests}.
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
 * @see org.j8unit.repository.javax.sound.sampled.PortTests
 */
@Category(J8UnitRepository.class)
public abstract interface PortClassTests<SUT extends Class<? extends javax.sound.sampled.Port>>
extends org.j8unit.repository.javax.sound.sampled.LineClassTests<SUT>
{

    @Test
    public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
        // create new instance
        Class<? extends javax.sound.sampled.Port> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.sound.sampled.Port.class.isAssignableFrom(sut));
    }

    /**
     * <p>
     * Test class for {@link javax.sound.sampled.Port$Info class javax.sound.sampled.Port$Info},
     * containing all class relevant test methods (at least the test methods of accessible constructors and
     * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
     * methods is {@link org.j8unit.repository.javax.sound.sampled.PortTests.InfoTests}.
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
     * @see org.j8unit.repository.javax.sound.sampled.PortTests.InfoTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface InfoClassTests<SUT extends Class<? extends javax.sound.sampled.Port.Info>>
    extends org.j8unit.repository.javax.sound.sampled.LineClassTests.InfoClassTests<SUT>
    {

        /**
         * Test method for {@link javax.sound.sampled.Port.Info#Info(java.lang.Class,java.lang.String,boolean) public javax.sound.sampled.Port$Info(java.lang.Class,java.lang.String,boolean)}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_Info_Class_String_boolean() throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            javax.sound.sampled.Port.Info sut = null; // = new Info(java.lang.Class,java.lang.String,boolean);
        }

        @Test
        public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
            // create new instance
            Class<? extends javax.sound.sampled.Port.Info> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.sound.sampled.Port.Info.class.isAssignableFrom(sut));
        }

    }

}