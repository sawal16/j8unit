package org.j8unit.repository.java.security;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link java.security.SecureClassLoader class java.security.SecureClassLoader},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.security.SecureClassLoaderClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface SecureClassLoaderTests<SUT extends java.security.SecureClassLoader>
extends org.j8unit.repository.java.lang.ClassLoaderTests<SUT>
{

}