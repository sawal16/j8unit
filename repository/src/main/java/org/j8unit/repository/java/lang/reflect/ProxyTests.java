package org.j8unit.repository.java.lang.reflect;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link java.lang.reflect.Proxy class java.lang.reflect.Proxy},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.lang.reflect.ProxyClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface ProxyTests<SUT extends java.lang.reflect.Proxy>
extends org.j8unit.repository.java.io.SerializableTests<SUT>,
        org.j8unit.repository.java.lang.ObjectTests<SUT>
{

}