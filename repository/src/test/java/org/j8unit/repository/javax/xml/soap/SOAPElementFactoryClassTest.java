package org.j8unit.repository.javax.xml.soap;

import javax.xml.soap.SOAPElementFactory;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link SOAPElementFactory} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.xml.soap.SOAPElementFactoryClassTests}).
 */
@RunWith(J8Unit4.class)
@SuppressWarnings("deprecation")
public class SOAPElementFactoryClassTest
implements SOAPElementFactoryClassTests<SOAPElementFactory> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.soap.SOAPElementFactory]

    @Override
    public Class<SOAPElementFactory> createNewSUT() {
        return SOAPElementFactory.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link javax.xml.soap.SOAPElementFactory#newInstance()
     * public static javax.xml.soap.SOAPElementFactory javax.xml.soap.SOAPElementFactory.newInstance() throws
     * javax.xml.soap.SOAPException}.
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
    public void test_newInstance()
    throws Exception {
        // write some test for {@link javax.xml.soap.SOAPElementFactory#newInstance()}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.soap.SOAPElementFactory]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.soap.SOAPElementFactory]

}
