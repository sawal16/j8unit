package org.j8unit.repository.java.util;

import java.util.MissingResourceException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link MissingResourceException} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.java.util.MissingResourceExceptionClassTests}).
 */
@RunWith(J8Unit4.class)
public class MissingResourceExceptionClassTest
implements MissingResourceExceptionClassTests<MissingResourceException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.MissingResourceException]

    @Override
    public Class<MissingResourceException> createNewSUT() {
        return MissingResourceException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.util.MissingResourceException#MissingResourceException(String, String, String) public
     * java.util.MissingResourceException(java.lang.String,java.lang.String,java.lang.String)}.
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
    public void create_MissingResourceException_String_String_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final MissingResourceException sut = null; // = new MissingResourceException(String, String, String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.MissingResourceException]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.MissingResourceException]

}
