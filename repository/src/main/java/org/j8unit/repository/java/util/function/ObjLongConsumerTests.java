package org.j8unit.repository.java.util.function;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link java.util.function.ObjLongConsumer interface java.util.function.ObjLongConsumer},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.util.function.ObjLongConsumerClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface ObjLongConsumerTests<SUT extends java.util.function.ObjLongConsumer<T>, T>
extends J8UnitTest<SUT>
{

    /**
     * <p>
     * Test method for {@link java.util.function.ObjLongConsumer#accept(java.lang.Object,long) public abstract void java.util.function.ObjLongConsumer.accept(java.lang.Object,long)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_accept_Object_long() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}