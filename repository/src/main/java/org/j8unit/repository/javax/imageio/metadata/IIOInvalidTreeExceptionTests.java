package org.j8unit.repository.javax.imageio.metadata;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.imageio.metadata.IIOInvalidTreeException class javax.imageio.metadata.IIOInvalidTreeException},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.imageio.metadata.IIOInvalidTreeExceptionClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface IIOInvalidTreeExceptionTests<SUT extends javax.imageio.metadata.IIOInvalidTreeException>
extends org.j8unit.repository.javax.imageio.IIOExceptionTests<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.imageio.metadata.IIOInvalidTreeException#getOffendingNode() public org.w3c.dom.Node javax.imageio.metadata.IIOInvalidTreeException.getOffendingNode()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getOffendingNode() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}