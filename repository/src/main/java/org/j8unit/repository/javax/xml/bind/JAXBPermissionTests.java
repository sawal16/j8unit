package org.j8unit.repository.javax.xml.bind;

import javax.xml.bind.JAXBPermission;
import org.j8unit.repository.categories.J8UnitRepository;
import org.j8unit.repository.java.security.BasicPermissionTests;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
 * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test {@link JAXBPermission
 * public final class javax.xml.bind.JAXBPermission}.
 * </p>
 *
 * <p>
 * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints. For
 * this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects (see
 * {@link JAXBPermissionClassTests}).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */

@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface JAXBPermissionTests<SUT extends JAXBPermission>
extends BasicPermissionTests<SUT> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.bind.JAXBPermission]

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.bind.JAXBPermission]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.bind.JAXBPermission]
}
