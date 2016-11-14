package org.j8unit.repository.java.beans;

import java.beans.FeatureDescriptor;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link FeatureDescriptor} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.beans.FeatureDescriptorClassTests}).
 */

@RunWith(J8Unit4.class)
public class FeatureDescriptorClassTest
implements FeatureDescriptorClassTests<FeatureDescriptor> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.beans.FeatureDescriptor]

    @Override
    public Class<FeatureDescriptor> createNewSUT() {
        return FeatureDescriptor.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.beans.FeatureDescriptor#FeatureDescriptor() public java.beans.FeatureDescriptor()}.
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
    public void create_FeatureDescriptor()
    throws Exception {
        // create new instance
        final FeatureDescriptor sut = new FeatureDescriptor();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.beans.FeatureDescriptor]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.beans.FeatureDescriptor]

}
