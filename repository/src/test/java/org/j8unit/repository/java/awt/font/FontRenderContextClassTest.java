package org.j8unit.repository.java.awt.font;

import java.awt.font.FontRenderContext;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link FontRenderContext} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.awt.font.FontRenderContextClassTests}).
 */
@RunWith(J8Unit4.class)
public class FontRenderContextClassTest
implements FontRenderContextClassTests<FontRenderContext> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.font.FontRenderContext]

    @Override
    public Class<FontRenderContext> createNewSUT() {
        return FontRenderContext.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.awt.font.FontRenderContext#FontRenderContext(java.awt.geom.AffineTransform, boolean, boolean) public
     * java.awt.font.FontRenderContext(java.awt.geom.AffineTransform,boolean,boolean)}.
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
    public void create_FontRenderContext_AffineTransform_boolean_boolean()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final FontRenderContext sut = null; // = new FontRenderContext(java.awt.geom.AffineTransform, boolean, boolean);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.awt.font.FontRenderContext#FontRenderContext(java.awt.geom.AffineTransform, Object, Object) public
     * java.awt.font.FontRenderContext(java.awt.geom.AffineTransform,java.lang.Object,java.lang.Object)}.
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
    public void create_FontRenderContext_AffineTransform_Object_Object()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final FontRenderContext sut = null; // = new FontRenderContext(java.awt.geom.AffineTransform, Object, Object);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.font.FontRenderContext]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.font.FontRenderContext]

}
