package org.j8unit.repository.javax.swing.text.html;

import javax.swing.text.html.HTMLWriter;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link HTMLWriter} (by simply reusing the
 * J8Unit test interface {@link HTMLWriterTests}).
 */

@RunWith(J8Unit4.class)
public class HTMLWriterTest
implements HTMLWriterTests<HTMLWriter> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.html.HTMLWriter]

    @Override
    public HTMLWriter createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.text.html.HTMLWriter], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.html.HTMLWriter]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.html.HTMLWriter]

}
