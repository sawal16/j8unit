package org.j8unit.repository.java.nio.file.attribute;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AclEntryPermissionClassTest
implements org.j8unit.repository.java.nio.file.attribute.AclEntryPermissionClassTests<java.nio.file.attribute.AclEntryPermission> {

    @Override
    public Class<java.nio.file.attribute.AclEntryPermission> createNewSUT() {
        return java.nio.file.attribute.AclEntryPermission.class;
    }

}
