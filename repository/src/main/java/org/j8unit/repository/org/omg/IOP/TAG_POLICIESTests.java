package org.j8unit.repository.org.omg.IOP;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;
import org.omg.IOP.TAG_POLICIES;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
 * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test {@link TAG_POLICIES
 * public abstract interface org.omg.IOP.TAG_POLICIES}.
 * </p>
 *
 * <p>
 * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints. For
 * this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects (see
 * {@link org.j8unit.repository.org.omg.IOP.TAG_POLICIESClassTests}).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface TAG_POLICIESTests<SUT extends TAG_POLICIES>
extends RepositoryTests<SUT> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.IOP.TAG_POLICIES]

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.IOP.TAG_POLICIES]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.IOP.TAG_POLICIES]

}
