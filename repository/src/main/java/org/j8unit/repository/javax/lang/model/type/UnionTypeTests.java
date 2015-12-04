package org.j8unit.repository.javax.lang.model.type;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.lang.model.type.UnionType interface javax.lang.model.type.UnionType},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.lang.model.type.UnionTypeClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface UnionTypeTests<SUT extends javax.lang.model.type.UnionType>
extends org.j8unit.repository.javax.lang.model.type.TypeMirrorTests<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.lang.model.type.UnionType#getAlternatives() public abstract java.util.List javax.lang.model.type.UnionType.getAlternatives()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAlternatives() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}