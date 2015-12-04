package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link org.omg.PortableInterceptor.PolicyFactory interface org.omg.PortableInterceptor.PolicyFactory},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.org.omg.PortableInterceptor.PolicyFactoryClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface PolicyFactoryTests<SUT extends org.omg.PortableInterceptor.PolicyFactory>
extends org.j8unit.repository.org.omg.PortableInterceptor.PolicyFactoryOperationsTests<SUT>,
        org.j8unit.repository.org.omg.CORBA.ObjectTests<SUT>,
        org.j8unit.repository.org.omg.CORBA.portable.IDLEntityTests<SUT>
{

}