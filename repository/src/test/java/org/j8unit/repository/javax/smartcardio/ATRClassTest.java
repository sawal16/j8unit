package org.j8unit.repository.javax.smartcardio;

import javax.smartcardio.ATR;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ATR} (by simply reusing the J8Unit test
 * interface {@link org.j8unit.repository.javax.smartcardio.ATRClassTests}).
 */
@RunWith(J8Unit4.class)
@SuppressWarnings("restriction")
public class ATRClassTest
implements ATRClassTests<ATR> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.smartcardio.ATR]

    @Override
    public Class<ATR> createNewSUT() {
        return ATR.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link javax.smartcardio.ATR#ATR(byte[]) public
     * javax.smartcardio.ATR(byte[])}.
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
    public void create_ATR_byteArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ATR sut = null; // = new ATR(byte[]);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.smartcardio.ATR]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.smartcardio.ATR]

}
