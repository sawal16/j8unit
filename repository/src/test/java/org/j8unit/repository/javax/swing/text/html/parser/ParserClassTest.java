package org.j8unit.repository.javax.swing.text.html.parser;

import javax.swing.text.html.parser.Parser;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ParserClassTest
implements org.j8unit.repository.javax.swing.text.html.parser.ParserClassTests<Parser> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.html.parser.Parser]

    @Override
    public Class<Parser> createNewSUT() {
        return Parser.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.text.html.parser.Parser#Parser(javax.swing.text.html.parser.DTD) public
     * javax.swing.text.html.parser.Parser(javax.swing.text.html.parser.DTD)}.
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
    public void create_Parser_DTD()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final Parser sut = null; // = new Parser(javax.swing.text.html.parser.DTD);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.text.html.parser.Parser]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.html.parser.Parser]

}
