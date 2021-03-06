package org.j8unit.repository.javax.jws;

import javax.jws.WebMethod;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link WebMethod} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.jws.WebMethodTests}).
 */
@RunWith(J8Unit4.class)
public class WebMethodTest
implements WebMethodTests<WebMethod> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.jws.WebMethod]

    @Override
    public WebMethod createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.jws.WebMethod], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.jws.WebMethod]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.jws.WebMethod]

}
