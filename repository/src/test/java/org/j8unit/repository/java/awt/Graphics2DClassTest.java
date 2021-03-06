package org.j8unit.repository.java.awt;

import java.awt.Graphics2D;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Graphics2D} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.awt.Graphics2DClassTests}).
 */
@RunWith(J8Unit4.class)
public class Graphics2DClassTest
implements Graphics2DClassTests<Graphics2D> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.Graphics2D]

    @Override
    public Class<Graphics2D> createNewSUT() {
        return Graphics2D.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.Graphics2D]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.Graphics2D]

}
