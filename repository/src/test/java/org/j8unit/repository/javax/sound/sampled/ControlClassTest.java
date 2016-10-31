package org.j8unit.repository.javax.sound.sampled;

import javax.sound.sampled.Control;
import javax.sound.sampled.Control.Type;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ControlClassTest
implements org.j8unit.repository.javax.sound.sampled.ControlClassTests<Control> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sound.sampled.Control]

    @Override
    public Class<Control> createNewSUT() {
        return Control.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.sound.sampled.Control]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.sound.sampled.Control]

    @RunWith(J8Unit4.class)
    public static class TypeClassTest
    implements org.j8unit.repository.javax.sound.sampled.ControlClassTests.TypeClassTests<Type> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sound.sampled.Control$Type]

        @Override
        public Class<Type> createNewSUT() {
            return Type.class;
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.sound.sampled.Control$Type]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.sound.sampled.Control$Type]

    }

}
