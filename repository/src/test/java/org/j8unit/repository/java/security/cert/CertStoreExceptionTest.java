package org.j8unit.repository.java.security.cert;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.security.cert.CertStoreException;
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
public class CertStoreExceptionTest
implements FactoryBasedJ8UnitTest<CertStoreException>, CertStoreExceptionTests<CertStoreException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.cert.CertStoreException]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(CertStoreException::new);
    }

    @Parameter(0)
    public Callable<CertStoreException> sutFactory;

    @Override
    public Callable<CertStoreException> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.security.cert.CertStoreException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.security.cert.CertStoreException]

}
