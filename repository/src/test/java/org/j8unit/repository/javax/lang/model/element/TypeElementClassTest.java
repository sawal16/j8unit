package org.j8unit.repository.javax.lang.model.element;

import javax.lang.model.element.TypeElement;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link TypeElement} (by simply reusing the
 * J8Unit test interface {@link TypeElementClassTests}).
 */

@RunWith(J8Unit4.class)
public class TypeElementClassTest
implements TypeElementClassTests<TypeElement> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.lang.model.element.TypeElement]

    @Override
    public Class<TypeElement> createNewSUT() {
        return TypeElement.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.lang.model.element.TypeElement]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.lang.model.element.TypeElement]

}
