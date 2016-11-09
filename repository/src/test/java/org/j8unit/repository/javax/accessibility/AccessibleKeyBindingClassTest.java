package org.j8unit.repository.javax.accessibility;

import javax.accessibility.AccessibleKeyBinding;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link AccessibleKeyBinding} (by simply reusing
 * the J8Unit test interface {@link AccessibleKeyBindingClassTests}).
 */

@RunWith(J8Unit4.class)
public class AccessibleKeyBindingClassTest
implements AccessibleKeyBindingClassTests<AccessibleKeyBinding> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.accessibility.AccessibleKeyBinding]

    @Override
    public Class<AccessibleKeyBinding> createNewSUT() {
        return AccessibleKeyBinding.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.accessibility.AccessibleKeyBinding]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.accessibility.AccessibleKeyBinding]

}
