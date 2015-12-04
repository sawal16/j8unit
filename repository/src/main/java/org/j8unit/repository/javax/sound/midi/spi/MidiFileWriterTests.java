package org.j8unit.repository.javax.sound.midi.spi;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.sound.midi.spi.MidiFileWriter class javax.sound.midi.spi.MidiFileWriter},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.sound.midi.spi.MidiFileWriterClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface MidiFileWriterTests<SUT extends javax.sound.midi.spi.MidiFileWriter>
extends org.j8unit.repository.java.lang.ObjectTests<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.sound.midi.spi.MidiFileWriter#getMidiFileTypes() public abstract int[] javax.sound.midi.spi.MidiFileWriter.getMidiFileTypes()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getMidiFileTypes() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sound.midi.spi.MidiFileWriter#getMidiFileTypes(javax.sound.midi.Sequence) public abstract int[] javax.sound.midi.spi.MidiFileWriter.getMidiFileTypes(javax.sound.midi.Sequence)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getMidiFileTypes_Sequence() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sound.midi.spi.MidiFileWriter#write(javax.sound.midi.Sequence,int,java.io.OutputStream) public abstract int javax.sound.midi.spi.MidiFileWriter.write(javax.sound.midi.Sequence,int,java.io.OutputStream) throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_write_Sequence_int_OutputStream() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sound.midi.spi.MidiFileWriter#write(javax.sound.midi.Sequence,int,java.io.File) public abstract int javax.sound.midi.spi.MidiFileWriter.write(javax.sound.midi.Sequence,int,java.io.File) throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_write_Sequence_int_File() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sound.midi.spi.MidiFileWriter#isFileTypeSupported(int,javax.sound.midi.Sequence) public boolean javax.sound.midi.spi.MidiFileWriter.isFileTypeSupported(int,javax.sound.midi.Sequence)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isFileTypeSupported_int_Sequence() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sound.midi.spi.MidiFileWriter#isFileTypeSupported(int) public boolean javax.sound.midi.spi.MidiFileWriter.isFileTypeSupported(int)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isFileTypeSupported_int() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}