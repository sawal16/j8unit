package org.j8unit.repository.java.awt;

import java.awt.Rectangle;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.JavaBug;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Rectangle} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.awt.RectangleClassTests}).
 */
@RunWith(J8Unit4.class)
public class RectangleClassTest
implements RectangleClassTests<Rectangle> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.Rectangle]

    @Override
    public Class<Rectangle> createNewSUT() {
        return Rectangle.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.awt.Rectangle#Rectangle(java.awt.Dimension) public java.awt.Rectangle(java.awt.Dimension)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_Rectangle_Dimension()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final Rectangle sut = null; // = new Rectangle(java.awt.Dimension);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.awt.Rectangle#Rectangle(java.awt.Rectangle) public java.awt.Rectangle(java.awt.Rectangle)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_Rectangle_Rectangle()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final Rectangle sut = null; // = new Rectangle(java.awt.Rectangle);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.awt.Rectangle#Rectangle() public
     * java.awt.Rectangle()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_Rectangle()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final Rectangle sut = new Rectangle();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.awt.Rectangle#Rectangle(int, int, int, int) public java.awt.Rectangle(int,int,int,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_Rectangle_int_int_int_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final Rectangle sut = null; // = new Rectangle(int, int, int, int);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.awt.Rectangle#Rectangle(java.awt.Point)
     * public java.awt.Rectangle(java.awt.Point)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_Rectangle_Point()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final Rectangle sut = null; // = new Rectangle(java.awt.Point);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.awt.Rectangle#Rectangle(java.awt.Point, java.awt.Dimension) public
     * java.awt.Rectangle(java.awt.Point,java.awt.Dimension)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_Rectangle_Point_Dimension()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final Rectangle sut = null; // = new Rectangle(java.awt.Point, java.awt.Dimension);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.awt.Rectangle#Rectangle(int, int) public
     * java.awt.Rectangle(int,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_Rectangle_int_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final Rectangle sut = null; // = new Rectangle(int, int);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.Rectangle]
    /**
     * @see RectangleClassBugs#equalsWithoutHashCode() Overridden {@code #equals(Object)} method without corresponding
     *      overridden {@code #hashCode()}!
     *
     * @since 0.9.7
     */
    @Test
    @Category(JavaBug.class)
    @Override
    public void wheneverEqualsIsOverriddenItIsGenerallyNecessaryToOverrideHashCode() {
        RectangleClassTests.super.wheneverEqualsIsOverriddenItIsGenerallyNecessaryToOverrideHashCode();
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.Rectangle]

}
