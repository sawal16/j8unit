package org.j8unit.repository.javax.swing.event;

import javax.swing.event.MenuListener;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link MenuListener} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.swing.event.MenuListenerClassTests}).
 */
@RunWith(J8Unit4.class)
public class MenuListenerClassTest
implements MenuListenerClassTests<MenuListener> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.event.MenuListener]

    @Override
    public Class<MenuListener> createNewSUT() {
        return MenuListener.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.event.MenuListener]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.event.MenuListener]

}
