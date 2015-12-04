package org.j8unit.repository.org.omg.IOP;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link org.omg.IOP.MultipleComponentProfileHolder class org.omg.IOP.MultipleComponentProfileHolder},
 * containing all class relevant test methods (at least the test methods of accessible constructors and
 * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
 * methods is {@link org.j8unit.repository.org.omg.IOP.MultipleComponentProfileHolderTests}.
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
 * @see org.j8unit.repository.org.omg.IOP.MultipleComponentProfileHolderTests
 */
@Category(J8UnitRepository.class)
public abstract interface MultipleComponentProfileHolderClassTests<SUT extends Class<? extends org.omg.IOP.MultipleComponentProfileHolder>>
extends org.j8unit.repository.org.omg.CORBA.portable.StreamableClassTests<SUT>,
        org.j8unit.repository.java.lang.ObjectClassTests<SUT>
{

    /**
     * Test method for {@link org.omg.IOP.MultipleComponentProfileHolder#MultipleComponentProfileHolder() public org.omg.IOP.MultipleComponentProfileHolder()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_MultipleComponentProfileHolder() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        org.omg.IOP.MultipleComponentProfileHolder sut = null; // = new MultipleComponentProfileHolder();
    }

    /**
     * Test method for {@link org.omg.IOP.MultipleComponentProfileHolder#MultipleComponentProfileHolder(org.omg.IOP.TaggedComponent[]) public org.omg.IOP.MultipleComponentProfileHolder(org.omg.IOP.TaggedComponent[])}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_MultipleComponentProfileHolder_TaggedComponentArray() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        org.omg.IOP.MultipleComponentProfileHolder sut = null; // = new MultipleComponentProfileHolder(org.omg.IOP.TaggedComponent[]);
    }

    @Test
    public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
        // create new instance
        Class<? extends org.omg.IOP.MultipleComponentProfileHolder> sut = createNewSUT();
        // assert assignability
        assertTrue(org.omg.IOP.MultipleComponentProfileHolder.class.isAssignableFrom(sut));
    }

}