package org.j8unit.repository.org.omg.IOP;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;
import org.omg.IOP.TAG_ORB_TYPE;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
 * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test {@link TAG_ORB_TYPE
 * public abstract interface org.omg.IOP.TAG_ORB_TYPE}.
 * </p>
 *
 * <p>
 * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints. For
 * this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects (see
 * {@link TAG_ORB_TYPEClassTests}).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */

@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface TAG_ORB_TYPETests<SUT extends TAG_ORB_TYPE>
extends RepositoryTests<SUT> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.IOP.TAG_ORB_TYPE]

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.IOP.TAG_ORB_TYPE]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.IOP.TAG_ORB_TYPE]
}
