package org.j8unit.repository.javax.swing.text;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.DefaultStyledDocument.AttributeUndoableEdit;
import javax.swing.text.DefaultStyledDocument.ElementBuffer;
import javax.swing.text.DefaultStyledDocument.ElementSpec;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.J8Unit4;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class DefaultStyledDocumentTest
implements FactoryBasedJ8UnitTest<DefaultStyledDocument>, DefaultStyledDocumentTests<DefaultStyledDocument> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.DefaultStyledDocument]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(DefaultStyledDocument::new);
    }

    @Parameter(0)
    public Callable<DefaultStyledDocument> sutFactory;

    @Override
    public Callable<DefaultStyledDocument> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.DefaultStyledDocument]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.DefaultStyledDocument]

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link AttributeUndoableEdit} (by simply
     * reusing the J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.text.DefaultStyledDocumentTests.AttributeUndoableEditTests}).
     */
    @RunWith(J8Unit4.class)
    public static class AttributeUndoableEditTest
    implements AttributeUndoableEditTests<AttributeUndoableEdit> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.DefaultStyledDocument$AttributeUndoableEdit]

        @Override
        public AttributeUndoableEdit createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.text.DefaultStyledDocument.AttributeUndoableEdit], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.DefaultStyledDocument$AttributeUndoableEdit]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.DefaultStyledDocument$AttributeUndoableEdit]

    }

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link ElementSpec} (by simply reusing
     * the J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.text.DefaultStyledDocumentTests.ElementSpecTests}).
     */
    @RunWith(J8Unit4.class)
    public static class ElementSpecTest
    implements ElementSpecTests<ElementSpec> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.DefaultStyledDocument$ElementSpec]

        @Override
        public ElementSpec createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.text.DefaultStyledDocument.ElementSpec], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.DefaultStyledDocument$ElementSpec]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.DefaultStyledDocument$ElementSpec]

    }

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link ElementBuffer} (by simply reusing
     * the J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.text.DefaultStyledDocumentTests.ElementBufferTests}).
     */
    @RunWith(J8Unit4.class)
    public static class ElementBufferTest
    implements ElementBufferTests<ElementBuffer> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.DefaultStyledDocument$ElementBuffer]

        @Override
        public ElementBuffer createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.text.DefaultStyledDocument.ElementBuffer], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.DefaultStyledDocument$ElementBuffer]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.DefaultStyledDocument$ElementBuffer]

    }

}
