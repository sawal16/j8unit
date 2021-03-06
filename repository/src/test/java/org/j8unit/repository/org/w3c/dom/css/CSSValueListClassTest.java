package org.j8unit.repository.org.w3c.dom.css;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.css.CSSValueList;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link CSSValueList} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.w3c.dom.css.CSSValueListClassTests}).
 */
@RunWith(J8Unit4.class)
public class CSSValueListClassTest
implements CSSValueListClassTests<CSSValueList> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.css.CSSValueList]

    @Override
    public Class<CSSValueList> createNewSUT() {
        return CSSValueList.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.css.CSSValueList]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.css.CSSValueList]

}
