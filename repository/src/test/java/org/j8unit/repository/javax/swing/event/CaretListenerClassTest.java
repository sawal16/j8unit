package org.j8unit.repository.javax.swing.event;

import javax.swing.event.CaretListener;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link CaretListener} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.swing.event.CaretListenerClassTests}).
 */
@RunWith(J8Unit4.class)
public class CaretListenerClassTest
implements CaretListenerClassTests<CaretListener> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.event.CaretListener]

    @Override
    public Class<CaretListener> createNewSUT() {
        return CaretListener.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.event.CaretListener]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.event.CaretListener]

}
