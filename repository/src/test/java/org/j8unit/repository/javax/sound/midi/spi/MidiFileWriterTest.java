package org.j8unit.repository.javax.sound.midi.spi;

import javax.sound.midi.spi.MidiFileWriter;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MidiFileWriterTest
implements org.j8unit.repository.javax.sound.midi.spi.MidiFileWriterTests<MidiFileWriter> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.sound.midi.spi.MidiFileWriter]

    @Override
    public MidiFileWriter createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.sound.midi.spi.MidiFileWriter], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.sound.midi.spi.MidiFileWriter]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.sound.midi.spi.MidiFileWriter]

}
