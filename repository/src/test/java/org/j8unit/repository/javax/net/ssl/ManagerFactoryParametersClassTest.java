package org.j8unit.repository.javax.net.ssl;

import javax.net.ssl.ManagerFactoryParameters;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ManagerFactoryParameters} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.net.ssl.ManagerFactoryParametersClassTests}).
 */
@RunWith(J8Unit4.class)
public class ManagerFactoryParametersClassTest
implements ManagerFactoryParametersClassTests<ManagerFactoryParameters> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.net.ssl.ManagerFactoryParameters]

    @Override
    public Class<ManagerFactoryParameters> createNewSUT() {
        return ManagerFactoryParameters.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.net.ssl.ManagerFactoryParameters]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.net.ssl.ManagerFactoryParameters]

}
