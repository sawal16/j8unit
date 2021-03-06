package org.j8unit.repository.javax.xml.transform.sax;

import javax.xml.transform.sax.SAXSource;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link SAXSource} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.xml.transform.sax.SAXSourceClassTests}).
 */
@RunWith(J8Unit4.class)
public class SAXSourceClassTest
implements SAXSourceClassTests<SAXSource> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.transform.sax.SAXSource]

    @Override
    public Class<SAXSource> createNewSUT() {
        return SAXSource.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link javax.xml.transform.sax.SAXSource#SAXSource()
     * public javax.xml.transform.sax.SAXSource()}.
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
    public void create_SAXSource()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final SAXSource sut = new SAXSource();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.xml.transform.sax.SAXSource#SAXSource(org.xml.sax.InputSource) public
     * javax.xml.transform.sax.SAXSource(org.xml.sax.InputSource)}.
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
    public void create_SAXSource_InputSource()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final SAXSource sut = null; // = new SAXSource(org.xml.sax.InputSource);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.xml.transform.sax.SAXSource#SAXSource(org.xml.sax.XMLReader, org.xml.sax.InputSource) public
     * javax.xml.transform.sax.SAXSource(org.xml.sax.XMLReader,org.xml.sax.InputSource)}.
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
    public void create_SAXSource_XMLReader_InputSource()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final SAXSource sut = null; // = new SAXSource(org.xml.sax.XMLReader, org.xml.sax.InputSource);
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.xml.transform.sax.SAXSource#sourceToInputSource(javax.xml.transform.Source) public static
     * org.xml.sax.InputSource javax.xml.transform.sax.SAXSource.sourceToInputSource(javax.xml.transform.Source)}.
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
    public void test_sourceToInputSource_Source()
    throws Exception {
        // write some test for {@link javax.xml.transform.sax.SAXSource#sourceToInputSource(javax.xml.transform.Source)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.transform.sax.SAXSource]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.transform.sax.SAXSource]

}
