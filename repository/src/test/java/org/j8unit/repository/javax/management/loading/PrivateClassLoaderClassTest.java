package org.j8unit.repository.javax.management.loading;

import javax.management.loading.PrivateClassLoader;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link PrivateClassLoader} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.management.loading.PrivateClassLoaderClassTests}).
 */
@RunWith(J8Unit4.class)
public class PrivateClassLoaderClassTest
implements PrivateClassLoaderClassTests<PrivateClassLoader> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.loading.PrivateClassLoader]

    @Override
    public Class<PrivateClassLoader> createNewSUT() {
        return PrivateClassLoader.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.management.loading.PrivateClassLoader]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.loading.PrivateClassLoader]

}
