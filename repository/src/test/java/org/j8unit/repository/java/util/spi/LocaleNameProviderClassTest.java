package org.j8unit.repository.java.util.spi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LocaleNameProviderClassTest
implements org.j8unit.repository.java.util.spi.LocaleNameProviderClassTests<java.util.spi.LocaleNameProvider> {

    @Override
    public Class<java.util.spi.LocaleNameProvider> createNewSUT() {
        return java.util.spi.LocaleNameProvider.class;
    }

}
