package org.j8unit.repository.javax.sound.sampled;

import javax.sound.sampled.LineListener;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link LineListener} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.sound.sampled.LineListenerClassTests}).
 */
@RunWith(J8Unit4.class)
public class LineListenerClassTest
implements LineListenerClassTests<LineListener> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sound.sampled.LineListener]

    @Override
    public Class<LineListener> createNewSUT() {
        return LineListener.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.sound.sampled.LineListener]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.sound.sampled.LineListener]

}
