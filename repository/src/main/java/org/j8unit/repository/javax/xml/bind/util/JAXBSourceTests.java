package org.j8unit.repository.javax.xml.bind.util;

import javax.xml.bind.util.JAXBSource;
import org.j8unit.repository.categories.J8UnitRepository;
import org.j8unit.repository.javax.xml.transform.sax.SAXSourceTests;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
 * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test {@link JAXBSource
 * public class javax.xml.bind.util.JAXBSource}.
 * </p>
 *
 * <p>
 * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints. For
 * this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects (see
 * {@link org.j8unit.repository.javax.xml.bind.util.JAXBSourceClassTests}).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface JAXBSourceTests<SUT extends JAXBSource>
extends SAXSourceTests<SUT> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.bind.util.JAXBSource]

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.bind.util.JAXBSource]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.bind.util.JAXBSource]

}
