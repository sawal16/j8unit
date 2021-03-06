package org.j8unit.repository.javax.lang.model.type;

import javax.lang.model.type.ExecutableType;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ExecutableType} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.lang.model.type.ExecutableTypeClassTests}).
 */
@RunWith(J8Unit4.class)
public class ExecutableTypeClassTest
implements ExecutableTypeClassTests<ExecutableType> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.lang.model.type.ExecutableType]

    @Override
    public Class<ExecutableType> createNewSUT() {
        return ExecutableType.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.lang.model.type.ExecutableType]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.lang.model.type.ExecutableType]

}
