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
 * Test class for {@link javax.sound.sampled.Control class javax.sound.sampled.Control},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.sound.sampled.ControlClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface ControlTests<SUT extends javax.sound.sampled.Control>
extends org.j8unit.repository.java.lang.ObjectTests<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.sound.sampled.Control#toString() public java.lang.String javax.sound.sampled.Control.toString()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_toString() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sound.sampled.Control#getType() public javax.sound.sampled.Control$Type javax.sound.sampled.Control.getType()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getType() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test class for {@link javax.sound.sampled.Control$Type class javax.sound.sampled.Control$Type},
     * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
     * </p>
     *
     * @param SUT the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.javax.sound.sampled.ControlClassTests.TypeClassTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface TypeTests<SUT extends javax.sound.sampled.Control.Type>
    extends org.j8unit.repository.java.lang.ObjectTests<SUT>
    {

        /**
         * <p>
         * Test method for {@link javax.sound.sampled.Control.Type#toString() public final java.lang.String javax.sound.sampled.Control$Type.toString()}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_toString() throws Exception {
            // query fresh subject-under-test
            SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.sound.sampled.Control.Type#hashCode() public final int javax.sound.sampled.Control$Type.hashCode()}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_hashCode() throws Exception {
            // query fresh subject-under-test
            SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.sound.sampled.Control.Type#equals(java.lang.Object) public final boolean javax.sound.sampled.Control$Type.equals(java.lang.Object)}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_equals_Object() throws Exception {
            // query fresh subject-under-test
            SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

}