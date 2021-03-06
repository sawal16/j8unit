package org.j8unit.repository.java.util;

import static java.util.Collections.emptyList;
import java.util.Collection;
import java.util.Collections;
import org.j8unit.repository.categories.J8UnitRepository;
import org.j8unit.repository.categories.TimeLinear;
import org.j8unit.repository.java.lang.UnmodifiableIterableTests;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * @since 0.9.5
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public interface UnmodifiableCollectionTests<SUT extends Collection<E>, E>
extends UnmodifiableIterableTests<SUT, E>, CollectionTests<SUT, E> {

    @Test(expected = UnsupportedOperationException.class)
    public default void addAllMustThrowUOE() {
        final SUT sut = this.createNewSUT();
        assert sut != null;
        sut.addAll(emptyList());
    }

    @Test(expected = UnsupportedOperationException.class)
    public default void addMustThrowUOE() {
        final SUT sut = this.createNewSUT();
        assert sut != null;
        sut.add(sut.size() > 0 ? sut.iterator().next() : null);
    }

    @Test(expected = UnsupportedOperationException.class)
    public default void clearMustThrowUOE() {
        final SUT sut = this.createNewSUT();
        assert sut != null;
        sut.clear();
    }

    @Test(expected = UnsupportedOperationException.class)
    public default void removeAllMustThrowUOE() {
        final SUT sut = this.createNewSUT();
        assert sut != null;
        sut.removeAll(Collections.emptyList());
    }

    @Test(expected = UnsupportedOperationException.class)
    @Category(TimeLinear.class)
    public default void removeIfMustThrowUOE() {
        final SUT sut = this.createNewSUT();
        assert sut != null;
        sut.removeIf(e -> false);
    }

    @Test(expected = UnsupportedOperationException.class)
    public default void removeMustThrowUOE() {
        final SUT sut = this.createNewSUT();
        assert sut != null;
        sut.remove(new Object());
    }

    @Test(expected = UnsupportedOperationException.class)
    @Category(TimeLinear.class)
    public default void retainAllMustThrowUOE() {
        final SUT sut = this.createNewSUT();
        assert sut != null;
        sut.retainAll(sut);
    }

}
