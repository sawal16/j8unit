package org.j8unit.repository.java.util.logging;

import java.util.logging.LogRecord;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link LogRecord} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.util.logging.LogRecordClassTests}).
 */
@RunWith(J8Unit4.class)
public class LogRecordClassTest
implements LogRecordClassTests<LogRecord> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.logging.LogRecord]

    @Override
    public Class<LogRecord> createNewSUT() {
        return LogRecord.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.util.logging.LogRecord#LogRecord(java.util.logging.Level, String) public
     * java.util.logging.LogRecord(java.util.logging.Level,java.lang.String)}.
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
    public void create_LogRecord_Level_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final LogRecord sut = null; // = new LogRecord(java.util.logging.Level, String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.logging.LogRecord]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.logging.LogRecord]

}
