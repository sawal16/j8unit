package org.j8unit.repository.java.util.concurrent.atomic;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link AtomicReferenceFieldUpdater} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.java.util.concurrent.atomic.AtomicReferenceFieldUpdaterClassTests}).
 */
@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class AtomicReferenceFieldUpdaterClassTest
implements AtomicReferenceFieldUpdaterClassTests<AtomicReferenceFieldUpdater> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.concurrent.atomic.AtomicReferenceFieldUpdater]

    @Override
    public Class<AtomicReferenceFieldUpdater> createNewSUT() {
        return AtomicReferenceFieldUpdater.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.util.concurrent.atomic.AtomicReferenceFieldUpdater#newUpdater(Class, Class, String) public static
     * <U,W> java.util.concurrent.atomic.AtomicReferenceFieldUpdater<U, W>
     * java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(java.lang.Class<U>,java.lang.Class<W>,java.lang.String)}.
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
    public void test_newUpdater_Class_Class_String()
    throws Exception {
        // write some test for {@link java.util.concurrent.atomic.AtomicReferenceFieldUpdater#newUpdater(Class, Class,
        // String)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.concurrent.atomic.AtomicReferenceFieldUpdater]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.concurrent.atomic.AtomicReferenceFieldUpdater]

}
