package org.j8unit.repository.org.w3c.dom.css;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.css.CSSImportRule;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link CSSImportRule} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.w3c.dom.css.CSSImportRuleClassTests}).
 */
@RunWith(J8Unit4.class)
public class CSSImportRuleClassTest
implements CSSImportRuleClassTests<CSSImportRule> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.css.CSSImportRule]

    @Override
    public Class<CSSImportRule> createNewSUT() {
        return CSSImportRule.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.css.CSSImportRule]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.css.CSSImportRule]

}
