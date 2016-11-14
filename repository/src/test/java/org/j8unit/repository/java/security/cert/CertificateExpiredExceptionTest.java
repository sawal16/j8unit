package org.j8unit.repository.java.security.cert;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.security.cert.CertificateExpiredException;
import java.util.concurrent.Callable;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class CertificateExpiredExceptionTest
implements FactoryBasedJ8UnitTest<CertificateExpiredException>, CertificateExpiredExceptionTests<CertificateExpiredException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.cert.CertificateExpiredException]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(CertificateExpiredException::new);
    }

    @Parameter(0)
    public Callable<CertificateExpiredException> sutFactory;

    @Override
    public Callable<CertificateExpiredException> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.security.cert.CertificateExpiredException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.security.cert.CertificateExpiredException]

}
