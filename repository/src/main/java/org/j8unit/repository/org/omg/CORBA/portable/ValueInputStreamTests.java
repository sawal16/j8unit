package org.j8unit.repository.org.omg.CORBA.portable;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link org.omg.CORBA.portable.ValueInputStream interface org.omg.CORBA.portable.ValueInputStream},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.org.omg.CORBA.portable.ValueInputStreamClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface ValueInputStreamTests<SUT extends org.omg.CORBA.portable.ValueInputStream>
extends J8UnitTest<SUT>
{

    /**
     * <p>
     * Test method for {@link org.omg.CORBA.portable.ValueInputStream#end_value() public abstract void org.omg.CORBA.portable.ValueInputStream.end_value()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_end_value() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.CORBA.portable.ValueInputStream#start_value() public abstract void org.omg.CORBA.portable.ValueInputStream.start_value()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_start_value() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}