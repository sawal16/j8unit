package org.j8unit.repository.javax.management.relation;

import javax.management.relation.RoleInfoNotFoundException;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
 * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test
 * {@link RoleInfoNotFoundException public class javax.management.relation.RoleInfoNotFoundException}.
 * </p>
 *
 * <p>
 * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints. For
 * this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects (see
 * {@link RoleInfoNotFoundExceptionClassTests}).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */

@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface RoleInfoNotFoundExceptionTests<SUT extends RoleInfoNotFoundException>
extends RelationExceptionTests<SUT> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.relation.RoleInfoNotFoundException]

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.management.relation.RoleInfoNotFoundException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.management.relation.RoleInfoNotFoundException]
}
