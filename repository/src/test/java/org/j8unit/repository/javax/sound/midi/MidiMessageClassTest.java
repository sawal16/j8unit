package org.j8unit.repository.javax.sound.midi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MidiMessageClassTest
implements org.j8unit.repository.javax.sound.midi.MidiMessageClassTests<javax.sound.midi.MidiMessage> {

    @Override
    public Class<javax.sound.midi.MidiMessage> createNewSUT() {
        return javax.sound.midi.MidiMessage.class;
    }

}
