package org.j8unit.repository.javax.xml.crypto;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.xml.crypto.URIDereferencer interface javax.xml.crypto.URIDereferencer},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.xml.crypto.URIDereferencerClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface URIDereferencerTests<SUT extends javax.xml.crypto.URIDereferencer>
extends J8UnitTest<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.xml.crypto.URIDereferencer#dereference(javax.xml.crypto.URIReference,javax.xml.crypto.XMLCryptoContext) public abstract javax.xml.crypto.Data javax.xml.crypto.URIDereferencer.dereference(javax.xml.crypto.URIReference,javax.xml.crypto.XMLCryptoContext) throws javax.xml.crypto.URIReferenceException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_dereference_URIReference_XMLCryptoContext() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}