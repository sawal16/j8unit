package org.j8unit.repository.java.nio.file.attribute;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AclEntryTest
implements org.j8unit.repository.java.nio.file.attribute.AclEntryTests<java.nio.file.attribute.AclEntry> {

    @RunWith(J8Unit4.class)
    public static class BuilderTest
    implements org.j8unit.repository.java.nio.file.attribute.AclEntryTests.BuilderTests<java.nio.file.attribute.AclEntry.Builder> {

        @Override
        public java.nio.file.attribute.AclEntry.Builder createNewSUT() {
            throw new AssertionError("There is no default constructor for [java.nio.file.attribute.AclEntry.Builder] available.");
        }

    }

    @Override
    public java.nio.file.attribute.AclEntry createNewSUT() {
        throw new AssertionError("There is no default constructor for [java.nio.file.attribute.AclEntry] available.");
    }

}
