package org.j8unit.repository.javax.swing.text;

import javax.swing.text.DateFormatter;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DateFormatter} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.swing.text.DateFormatterClassTests}).
 */
@RunWith(J8Unit4.class)
public class DateFormatterClassTest
implements DateFormatterClassTests<DateFormatter> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.DateFormatter]

    @Override
    public Class<DateFormatter> createNewSUT() {
        return DateFormatter.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.text.DateFormatter#DateFormatter(java.text.DateFormat) public
     * javax.swing.text.DateFormatter(java.text.DateFormat)}.
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
    public void create_DateFormatter_DateFormat()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final DateFormatter sut = null; // = new DateFormatter(java.text.DateFormat);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link javax.swing.text.DateFormatter#DateFormatter()
     * public javax.swing.text.DateFormatter()}.
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
    public void create_DateFormatter()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final DateFormatter sut = new DateFormatter();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.text.DateFormatter]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.DateFormatter]

}
