package org.j8unit.repository.javax.swing.tree;

import javax.swing.tree.VariableHeightLayoutCache;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link VariableHeightLayoutCache} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.javax.swing.tree.VariableHeightLayoutCacheClassTests}).
 */

@RunWith(J8Unit4.class)
public class VariableHeightLayoutCacheClassTest
implements VariableHeightLayoutCacheClassTests<VariableHeightLayoutCache> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.tree.VariableHeightLayoutCache]

    @Override
    public Class<VariableHeightLayoutCache> createNewSUT() {
        return VariableHeightLayoutCache.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.tree.VariableHeightLayoutCache#VariableHeightLayoutCache() public
     * javax.swing.tree.VariableHeightLayoutCache()}.
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
    public void create_VariableHeightLayoutCache()
    throws Exception {
        // create new instance
        final VariableHeightLayoutCache sut = new VariableHeightLayoutCache();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.tree.VariableHeightLayoutCache]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.tree.VariableHeightLayoutCache]

}