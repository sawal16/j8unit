package org.j8unit.repository.java.lang;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import org.j8unit.J8UnitTest;
import org.junit.Test;

@FunctionalInterface
public abstract interface ObjectTests<SUT extends Object>
extends J8UnitTest<SUT> {

    @Test
    public default void equalsMustBeReflexive() {
        final SUT sut = this.createNewSUT();
        assert sut != null;
        assertTrue(sut.equals(sut));
    }

    @Test
    public default void equalsMustReturnNotNull() {
        final SUT sut = this.createNewSUT();
        assert sut != null;
        assertFalse(sut.equals(null));
    }

    @Test
    public default void getClassMustMatchIsInstance() {
        final SUT sut = this.createNewSUT();
        assert sut != null;
        final Class<? extends Object> clazz = sut.getClass();
        assert clazz != null;
        assertTrue(clazz.isInstance(sut));
    }

    @Test
    public default void getClassMustReturnNotNull() {
        final SUT sut = this.createNewSUT();
        assert sut != null;
        assertNotNull(sut.getClass());
    }

    @Test
    public default void toStringMustReturnNotNull() {
        final SUT sut = this.createNewSUT();
        assert sut != null;
        assertNotNull(sut.toString());
    }

}
