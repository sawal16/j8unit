package org.j8unit.repository.java.nio.file;

import java.nio.file.SecureDirectoryStream;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link SecureDirectoryStream} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.nio.file.SecureDirectoryStreamClassTests}).
 */
@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class SecureDirectoryStreamClassTest
implements SecureDirectoryStreamClassTests<SecureDirectoryStream> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.file.SecureDirectoryStream]

    @Override
    public Class<SecureDirectoryStream> createNewSUT() {
        return SecureDirectoryStream.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.nio.file.SecureDirectoryStream]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.file.SecureDirectoryStream]

}
