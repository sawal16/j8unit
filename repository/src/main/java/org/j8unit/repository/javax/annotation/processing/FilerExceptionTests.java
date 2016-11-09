package org.j8unit.repository.javax.annotation.processing;

import javax.annotation.processing.FilerException;
import org.j8unit.repository.categories.J8UnitRepository;
import org.j8unit.repository.java.io.IOExceptionTests;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
 * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test {@link FilerException
 * public class javax.annotation.processing.FilerException}.
 * </p>
 *
 * <p>
 * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints. For
 * this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects (see
 * {@link FilerExceptionClassTests}).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */

@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface FilerExceptionTests<SUT extends FilerException>
extends IOExceptionTests<SUT> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.annotation.processing.FilerException]

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.annotation.processing.FilerException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.annotation.processing.FilerException]
}
