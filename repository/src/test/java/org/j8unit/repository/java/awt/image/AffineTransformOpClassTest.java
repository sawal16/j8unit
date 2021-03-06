package org.j8unit.repository.java.awt.image;

import java.awt.image.AffineTransformOp;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link AffineTransformOp} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.awt.image.AffineTransformOpClassTests}).
 */
@RunWith(J8Unit4.class)
public class AffineTransformOpClassTest
implements AffineTransformOpClassTests<AffineTransformOp> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.image.AffineTransformOp]

    @Override
    public Class<AffineTransformOp> createNewSUT() {
        return AffineTransformOp.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.awt.image.AffineTransformOp#AffineTransformOp(java.awt.geom.AffineTransform, java.awt.RenderingHints)
     * public java.awt.image.AffineTransformOp(java.awt.geom.AffineTransform,java.awt.RenderingHints)}.
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
    public void create_AffineTransformOp_AffineTransform_RenderingHints()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final AffineTransformOp sut = null; // = new AffineTransformOp(java.awt.geom.AffineTransform,
                                            // java.awt.RenderingHints);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.awt.image.AffineTransformOp#AffineTransformOp(java.awt.geom.AffineTransform, int) public
     * java.awt.image.AffineTransformOp(java.awt.geom.AffineTransform,int)}.
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
    public void create_AffineTransformOp_AffineTransform_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final AffineTransformOp sut = null; // = new AffineTransformOp(java.awt.geom.AffineTransform, int);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.image.AffineTransformOp]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.image.AffineTransformOp]

}
