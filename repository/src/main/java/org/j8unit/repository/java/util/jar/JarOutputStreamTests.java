package org.j8unit.repository.java.util.jar;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link java.util.jar.JarOutputStream class java.util.jar.JarOutputStream},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.util.jar.JarOutputStreamClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface JarOutputStreamTests<SUT extends java.util.jar.JarOutputStream>
extends org.j8unit.repository.java.util.zip.ZipOutputStreamTests<SUT>
{

    /**
     * <p>
     * Test method for {@link java.util.jar.JarOutputStream#putNextEntry(java.util.zip.ZipEntry) public void java.util.jar.JarOutputStream.putNextEntry(java.util.zip.ZipEntry) throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_putNextEntry_ZipEntry() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}