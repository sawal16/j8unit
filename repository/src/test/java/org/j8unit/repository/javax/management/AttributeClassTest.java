package org.j8unit.repository.javax.management;

import javax.management.Attribute;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Attribute} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.management.AttributeClassTests}).
 */
@RunWith(J8Unit4.class)
public class AttributeClassTest
implements org.j8unit.repository.javax.management.AttributeClassTests<Attribute> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.Attribute]

    @Override
    public Class<Attribute> createNewSUT() {
        return Attribute.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.Attribute#Attribute(String, Object) public
     * javax.management.Attribute(java.lang.String,java.lang.Object)}.
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
    public void create_Attribute_String_Object()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final Attribute sut = null; // = new Attribute(String, Object);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.management.Attribute]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.Attribute]

}
