package org.j8unit.repository.java.security.spec;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class EllipticCurveClassTest
implements org.j8unit.repository.java.security.spec.EllipticCurveClassTests<java.security.spec.EllipticCurve> {

    @Override
    public Class<java.security.spec.EllipticCurve> createNewSUT() {
        return java.security.spec.EllipticCurve.class;
    }

}
