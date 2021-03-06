package org.j8unit;

import static org.junit.Assert.assertNotNull;
import org.junit.Test;

/**
 * <p>
 * Base interface of subject-under-test (SUT) based J8Unit tests. It straightforwardly specifies
 * {@linkplain #createNewSUT() a SUT factory method} to query fresh SUT instances.
 * </p>
 *
 * <p>
 * There is no technical requirement to use this interface, but its usage is strongly recommend. Using this interface
 * allows seamless combination of different J8Unit tests interfaces (even if specified by programmers of different
 * APIs).
 * </p>
 *
 * <p>
 * The implementation of {@link #createNewSUT()} can be stand-alone, but it perfectly fits to {@link org.junit.Before}
 * scenarios. Both scenarios are shown below (whereas {@code FoobarTests extends J8UnitTest<Foobar>}); Just adopt the
 * examples to your custom needs:
 * </p>
 *
 * <dl>
 * <dt>Stand-alone implementation</dt>
 * <dd>
 *
 * <pre class="brush:java">
 * import org.j8unit.runners.J8Unit4;
 * import org.j8unit.usage.Foobar;
 * import org.junit.runner.RunWith;
 *
 * &#64;RunWith(J8Unit4.class)
 * public class FoobarTestCase
 * implements FoobarTests {
 *
 *     &#64;Override
 *     public Foobar createNewSUT() {
 *         return new Foobar();
 *     }
 *
 * }
 * </pre>
 *
 * </dd>
 * <dt>{@linkplain org.junit.Before}-based implementation</dt>
 * <dd>
 *
 * <pre class="brush:java">
 * import org.j8unit.runners.J8Unit4;
 * import org.j8unit.usage.Foobar;
 * import org.junit.runner.RunWith;
 *
 * &#64;RunWith(J8Unit4.class)
 * public class FoobarTestCase
 * implements FoobarTests {
 *
 *     private Foobar foobar;
 *
 *     &#64;Before
 *     public void clear() {
 *         this.foobar = new Foobar();
 *     }
 *
 *     &#64;Override
 *     public Foobar createNewSUT() {
 *         return this.foobar;
 *     }
 *
 * }
 * </pre>
 *
 * </dd>
 * </dl>
 *
 * <p>
 * In case the SUT is not created directly but derived from an according SUT factory, {@link FactoryBasedJ8UnitTest}
 * should be used in preference. (Most often, this is the case when running parameterised tests.)
 * </p>
 *
 * @see FactoryBasedJ8UnitTest
 *
 * @param <SUT>
 *            the type of the subject-under-test
 * @since 4.12
 */
@FunctionalInterface
public abstract interface J8UnitTest<SUT> {

    /**
     * <p>
     * Factory method to create a new subject-under-test (of type {@code SUT}).
     * </p>
     *
     * <p>
     * If the specific SUT is deeply immutable (and, thus, cannot be altered in any circumstance), it is absolutely
     * allowed to return the same SUT instance each time this method is called. If, otherwise, the SUT is mutable, a
     * fresh instance must be returned to prevent any strange side-effect when asserting specific behaviour during the
     * unit tests.
     * </p>
     *
     * <p>
     * To say it clear: <em>You do not know what specific usage will be executed on the SUT instance afterwards!</em>
     * So, think twice before carelessly returning a single instance again and again! Keep in mind internal caches,
     * states, buffers, and further prevent SUT instances from being immutable; Immutability cannot be detected by
     * looking at the visible elements only.
     * </p>
     *
     * TODO: {@link java.util.concurrent.Callable}?: JavaDoc reference to {@link FactoryBasedJ8UnitTest} in case of an
     * exception throwing factory.
     *
     * @return a new subject-under-test
     */
    public abstract SUT createNewSUT();

    /**
     * <p>
     * If this test fails, the creation of the subject-under-test instance failed by returning {@code null}!
     * </p>
     */
    @Test
    public default void subjectUnderTestMustBeNotNull() {
        assertNotNull("The subject-under-test must be a valid non-null instance!", this.createNewSUT());
    }

}
