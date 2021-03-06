package org.j8unit.repository.javax.sound.midi.spi;

import javax.sound.midi.spi.MidiFileReader;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link MidiFileReader} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.sound.midi.spi.MidiFileReaderTests}).
 */
@RunWith(J8Unit4.class)
public class MidiFileReaderTest
implements MidiFileReaderTests<MidiFileReader> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.sound.midi.spi.MidiFileReader]

    @Override
    public MidiFileReader createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.sound.midi.spi.MidiFileReader], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.sound.midi.spi.MidiFileReader]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.sound.midi.spi.MidiFileReader]

}
