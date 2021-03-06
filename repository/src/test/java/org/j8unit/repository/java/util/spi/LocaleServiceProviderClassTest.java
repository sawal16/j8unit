package org.j8unit.repository.java.util.spi;

import java.util.spi.LocaleServiceProvider;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link LocaleServiceProvider} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.util.spi.LocaleServiceProviderClassTests}).
 */
@RunWith(J8Unit4.class)
public class LocaleServiceProviderClassTest
implements LocaleServiceProviderClassTests<LocaleServiceProvider> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.spi.LocaleServiceProvider]

    @Override
    public Class<LocaleServiceProvider> createNewSUT() {
        return LocaleServiceProvider.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.spi.LocaleServiceProvider]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.spi.LocaleServiceProvider]

}
