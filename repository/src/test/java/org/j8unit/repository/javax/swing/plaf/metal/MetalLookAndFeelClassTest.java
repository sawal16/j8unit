package org.j8unit.repository.javax.swing.plaf.metal;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MetalLookAndFeelClassTest
implements org.j8unit.repository.javax.swing.plaf.metal.MetalLookAndFeelClassTests<javax.swing.plaf.metal.MetalLookAndFeel> {

    @Override
    public Class<javax.swing.plaf.metal.MetalLookAndFeel> createNewSUT() {
        return javax.swing.plaf.metal.MetalLookAndFeel.class;
    }

}
