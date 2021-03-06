package org.j8unit.repository.java.util.zip;

import java.util.zip.DeflaterInputStream;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DeflaterInputStream} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.util.zip.DeflaterInputStreamClassTests}).
 */
@RunWith(J8Unit4.class)
public class DeflaterInputStreamClassTest
implements DeflaterInputStreamClassTests<DeflaterInputStream> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.zip.DeflaterInputStream]

    @Override
    public Class<DeflaterInputStream> createNewSUT() {
        return DeflaterInputStream.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.util.zip.DeflaterInputStream#DeflaterInputStream(java.io.InputStream, java.util.zip.Deflater, int)
     * public java.util.zip.DeflaterInputStream(java.io.InputStream,java.util.zip.Deflater,int)}.
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
    public void create_DeflaterInputStream_InputStream_Deflater_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final DeflaterInputStream sut = null; // = new DeflaterInputStream(java.io.InputStream, java.util.zip.Deflater,
                                              // int);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.util.zip.DeflaterInputStream#DeflaterInputStream(java.io.InputStream) public
     * java.util.zip.DeflaterInputStream(java.io.InputStream)}.
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
    public void create_DeflaterInputStream_InputStream()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final DeflaterInputStream sut = null; // = new DeflaterInputStream(java.io.InputStream);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.util.zip.DeflaterInputStream#DeflaterInputStream(java.io.InputStream, java.util.zip.Deflater) public
     * java.util.zip.DeflaterInputStream(java.io.InputStream,java.util.zip.Deflater)}.
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
    public void create_DeflaterInputStream_InputStream_Deflater()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final DeflaterInputStream sut = null; // = new DeflaterInputStream(java.io.InputStream, java.util.zip.Deflater);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.zip.DeflaterInputStream]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.zip.DeflaterInputStream]

}
