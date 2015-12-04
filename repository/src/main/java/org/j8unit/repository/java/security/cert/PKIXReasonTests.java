package org.j8unit.repository.java.security.cert;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link java.security.cert.PKIXReason class java.security.cert.PKIXReason},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.security.cert.PKIXReasonClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface PKIXReasonTests<SUT extends java.security.cert.PKIXReason>
extends org.j8unit.repository.java.security.cert.CertPathValidatorExceptionTests.ReasonTests<SUT>,
        org.j8unit.repository.java.lang.EnumTests<SUT,java.security.cert.PKIXReason>
{

}