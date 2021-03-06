package org.j8unit.repository.java.time;

import java.time.Instant;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Instant} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.time.InstantClassTests}).
 */
@RunWith(J8Unit4.class)
public class InstantClassTest
implements InstantClassTests<Instant> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.time.Instant]

    @Override
    public Class<Instant> createNewSUT() {
        return Instant.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.time.Instant#ofEpochMilli(long) public static
     * java.time.Instant java.time.Instant.ofEpochMilli(long)}.
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
    public void test_ofEpochMilli_long()
    throws Exception {
        // write some test for {@link java.time.Instant#ofEpochMilli(long)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.time.Instant#from(java.time.temporal.TemporalAccessor) public static java.time.Instant
     * java.time.Instant.from(java.time.temporal.TemporalAccessor)}.
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
    public void test_from_TemporalAccessor()
    throws Exception {
        // write some test for {@link java.time.Instant#from(java.time.temporal.TemporalAccessor)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.time.Instant#parse(CharSequence) public static
     * java.time.Instant java.time.Instant.parse(java.lang.CharSequence)}.
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
    public void test_parse_CharSequence()
    throws Exception {
        // write some test for {@link java.time.Instant#parse(CharSequence)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.time.Instant#now() public static
     * java.time.Instant java.time.Instant.now()}.
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
    public void test_now()
    throws Exception {
        // write some test for {@link java.time.Instant#now()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.time.Instant#now(java.time.Clock) public static
     * java.time.Instant java.time.Instant.now(java.time.Clock)}.
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
    public void test_now_Clock()
    throws Exception {
        // write some test for {@link java.time.Instant#now(java.time.Clock)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.time.Instant#ofEpochSecond(long) public static
     * java.time.Instant java.time.Instant.ofEpochSecond(long)}.
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
    public void test_ofEpochSecond_long()
    throws Exception {
        // write some test for {@link java.time.Instant#ofEpochSecond(long)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.time.Instant#ofEpochSecond(long, long) public
     * static java.time.Instant java.time.Instant.ofEpochSecond(long,long)}.
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
    public void test_ofEpochSecond_long_long()
    throws Exception {
        // write some test for {@link java.time.Instant#ofEpochSecond(long, long)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.time.Instant]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.time.Instant]

}
