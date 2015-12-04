package org.j8unit.repository.javax.swing.plaf;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.swing.plaf.IconUIResource class javax.swing.plaf.IconUIResource},
 * containing all class relevant test methods (at least the test methods of accessible constructors and
 * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
 * methods is {@link org.j8unit.repository.javax.swing.plaf.IconUIResourceTests}.
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
 * @see org.j8unit.repository.javax.swing.plaf.IconUIResourceTests
 */
@Category(J8UnitRepository.class)
public abstract interface IconUIResourceClassTests<SUT extends Class<? extends javax.swing.plaf.IconUIResource>>
extends org.j8unit.repository.javax.swing.IconClassTests<SUT>,
        org.j8unit.repository.javax.swing.plaf.UIResourceClassTests<SUT>,
        org.j8unit.repository.java.io.SerializableClassTests<SUT>,
        org.j8unit.repository.java.lang.ObjectClassTests<SUT>
{

    /**
     * Test method for {@link javax.swing.plaf.IconUIResource#IconUIResource(javax.swing.Icon) public javax.swing.plaf.IconUIResource(javax.swing.Icon)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_IconUIResource_Icon() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        javax.swing.plaf.IconUIResource sut = null; // = new IconUIResource(javax.swing.Icon);
    }

    @Test
    public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
        // create new instance
        Class<? extends javax.swing.plaf.IconUIResource> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.swing.plaf.IconUIResource.class.isAssignableFrom(sut));
    }

}