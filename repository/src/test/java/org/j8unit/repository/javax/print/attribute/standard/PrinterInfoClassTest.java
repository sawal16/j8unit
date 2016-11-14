package org.j8unit.repository.javax.print.attribute.standard;

import javax.print.attribute.standard.PrinterInfo;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link PrinterInfo} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.print.attribute.standard.PrinterInfoClassTests}).
 */

@RunWith(J8Unit4.class)
public class PrinterInfoClassTest
implements PrinterInfoClassTests<PrinterInfo> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.print.attribute.standard.PrinterInfo]

    @Override
    public Class<PrinterInfo> createNewSUT() {
        return PrinterInfo.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.print.attribute.standard.PrinterInfo#PrinterInfo(String, java.util.Locale) public
     * javax.print.attribute.standard.PrinterInfo(java.lang.String,java.util.Locale)}.
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
    public void create_PrinterInfo_String_Locale()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final PrinterInfo sut = null; // = new PrinterInfo(String, java.util.Locale);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.print.attribute.standard.PrinterInfo]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.print.attribute.standard.PrinterInfo]

}
