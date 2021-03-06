package org.j8unit.repository.java.beans;

import java.beans.PropertyEditorSupport;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link PropertyEditorSupport} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.beans.PropertyEditorSupportClassTests}).
 */
@RunWith(J8Unit4.class)
public class PropertyEditorSupportClassTest
implements PropertyEditorSupportClassTests<PropertyEditorSupport> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.beans.PropertyEditorSupport]

    @Override
    public Class<PropertyEditorSupport> createNewSUT() {
        return PropertyEditorSupport.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.beans.PropertyEditorSupport#PropertyEditorSupport() public java.beans.PropertyEditorSupport()}.
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
    public void create_PropertyEditorSupport()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final PropertyEditorSupport sut = new PropertyEditorSupport();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.beans.PropertyEditorSupport#PropertyEditorSupport(Object) public
     * java.beans.PropertyEditorSupport(java.lang.Object)}.
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
    public void create_PropertyEditorSupport_Object()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final PropertyEditorSupport sut = null; // = new PropertyEditorSupport(Object);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.beans.PropertyEditorSupport]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.beans.PropertyEditorSupport]

}
