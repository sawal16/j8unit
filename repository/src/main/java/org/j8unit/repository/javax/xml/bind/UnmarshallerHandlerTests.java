package org.j8unit.repository.javax.xml.bind;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.xml.bind.UnmarshallerHandler interface javax.xml.bind.UnmarshallerHandler},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.xml.bind.UnmarshallerHandlerClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface UnmarshallerHandlerTests<SUT extends javax.xml.bind.UnmarshallerHandler>
extends org.j8unit.repository.org.xml.sax.ContentHandlerTests<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.xml.bind.UnmarshallerHandler#getResult() public abstract java.lang.Object javax.xml.bind.UnmarshallerHandler.getResult() throws javax.xml.bind.JAXBException,java.lang.IllegalStateException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getResult() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}