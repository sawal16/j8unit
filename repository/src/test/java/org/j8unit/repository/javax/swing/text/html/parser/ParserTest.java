package org.j8unit.repository.javax.swing.text.html.parser;

import javax.swing.text.html.parser.Parser;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ParserTest
implements org.j8unit.repository.javax.swing.text.html.parser.ParserTests<Parser> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.html.parser.Parser]

    @Override
    public Parser createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.text.html.parser.Parser], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.html.parser.Parser]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.html.parser.Parser]

}
