package org.j8unit.repository.javax.lang.model.util;

import javax.lang.model.util.SimpleTypeVisitor8;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link SimpleTypeVisitor8} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.lang.model.util.SimpleTypeVisitor8ClassTests}).
 */
@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class SimpleTypeVisitor8ClassTest
implements SimpleTypeVisitor8ClassTests<SimpleTypeVisitor8> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.lang.model.util.SimpleTypeVisitor8]

    @Override
    public Class<SimpleTypeVisitor8> createNewSUT() {
        return SimpleTypeVisitor8.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.lang.model.util.SimpleTypeVisitor8]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.lang.model.util.SimpleTypeVisitor8]

}
