package org.j8unit.repository.javax.security.sasl;

import javax.security.sasl.RealmChoiceCallback;
import org.j8unit.repository.categories.J8UnitRepository;
import org.j8unit.repository.javax.security.auth.callback.ChoiceCallbackTests;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
 * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test
 * {@link RealmChoiceCallback public class javax.security.sasl.RealmChoiceCallback}.
 * </p>
 *
 * <p>
 * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints. For
 * this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects (see
 * {@link org.j8unit.repository.javax.security.sasl.RealmChoiceCallbackClassTests}).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface RealmChoiceCallbackTests<SUT extends RealmChoiceCallback>
extends ChoiceCallbackTests<SUT> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.security.sasl.RealmChoiceCallback]

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.security.sasl.RealmChoiceCallback]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.security.sasl.RealmChoiceCallback]

}
