package org.j8unit.repository.java.nio.file.attribute;

import java.nio.file.attribute.FileAttribute;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link FileAttribute} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.nio.file.attribute.FileAttributeClassTests}).
 */
@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class FileAttributeClassTest
implements FileAttributeClassTests<FileAttribute> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.file.attribute.FileAttribute]

    @Override
    public Class<FileAttribute> createNewSUT() {
        return FileAttribute.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.nio.file.attribute.FileAttribute]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.file.attribute.FileAttribute]

}
