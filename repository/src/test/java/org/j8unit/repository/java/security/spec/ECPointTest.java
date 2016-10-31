package org.j8unit.repository.java.security.spec;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.security.spec.ECPoint;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class ECPointTest
implements org.j8unit.repository.java.security.spec.ECPointTests<ECPoint> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.spec.ECPoint]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(ECPoint.POINT_INFINITY);
    }

    @Parameter(0)
    public ECPoint sut;

    @Override
    public ECPoint createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.security.spec.ECPoint]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.security.spec.ECPoint]

}
