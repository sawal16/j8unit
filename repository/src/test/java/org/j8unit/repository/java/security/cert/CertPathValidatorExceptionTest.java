package org.j8unit.repository.java.security.cert;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertPathValidatorException.BasicReason;
import java.security.cert.CertPathValidatorException.Reason;
import java.util.concurrent.Callable;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.J8Unit4;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class CertPathValidatorExceptionTest
implements FactoryBasedJ8UnitTest<CertPathValidatorException>, CertPathValidatorExceptionTests<CertPathValidatorException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.cert.CertPathValidatorException]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(CertPathValidatorException::new);
    }

    @Parameter(0)
    public Callable<CertPathValidatorException> sutFactory;

    @Override
    public Callable<CertPathValidatorException> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.security.cert.CertPathValidatorException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.security.cert.CertPathValidatorException]

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link Reason} (by simply reusing the
     * J8Unit test interface
     * {@link org.j8unit.repository.java.security.cert.CertPathValidatorExceptionTests.ReasonTests}).
     */
    @RunWith(J8Unit4.class)
    public static class ReasonTest
    implements ReasonTests<Reason> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.cert.CertPathValidatorException$Reason]

        @Override
        public Reason createNewSUT() {
            throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.security.cert.CertPathValidatorException.Reason], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.security.cert.CertPathValidatorException$Reason]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[java.security.cert.CertPathValidatorException$Reason]

    }

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link BasicReason} (by simply reusing
     * the J8Unit test interface
     * {@link org.j8unit.repository.java.security.cert.CertPathValidatorExceptionTests.BasicReasonTests}).
     */
    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class BasicReasonTest
    implements BasicReasonTests<BasicReason> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.cert.CertPathValidatorException$BasicReason]

        @Parameters(name = "{index}: {0}")
        public static Iterable<? extends Object> sutData() {
            return testParametersOfEnumClass(BasicReason.class);
        }

        @Parameter(0)
        public BasicReason sut;

        @Override
        public BasicReason createNewSUT() {
            return this.sut;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.security.cert.CertPathValidatorException$BasicReason]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[java.security.cert.CertPathValidatorException$BasicReason]

    }

}
