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
 * Test class for {@link java.util.function.ObjIntConsumer interface java.util.function.ObjIntConsumer},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.util.function.ObjIntConsumerClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface ObjIntConsumerTests<SUT extends java.util.function.ObjIntConsumer<T>, T>
extends J8UnitTest<SUT>
{

    /**
     * <p>
     * Test method for {@link java.util.function.ObjIntConsumer#accept(java.lang.Object,int) public abstract void java.util.function.ObjIntConsumer.accept(java.lang.Object,int)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_accept_Object_int() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}