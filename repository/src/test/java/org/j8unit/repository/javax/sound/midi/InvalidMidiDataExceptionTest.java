package org.j8unit.repository.javax.sound.midi;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.sound.midi.InvalidMidiDataException;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class InvalidMidiDataExceptionTest
implements FactoryBasedJ8UnitTest<InvalidMidiDataException>, org.j8unit.repository.javax.sound.midi.InvalidMidiDataExceptionTests<InvalidMidiDataException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.sound.midi.InvalidMidiDataException]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(InvalidMidiDataException::new);
    }

    @Parameter(0)
    public Callable<InvalidMidiDataException> sutFactory;

    @Override
    public Callable<InvalidMidiDataException> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.sound.midi.InvalidMidiDataException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.sound.midi.InvalidMidiDataException]

}
