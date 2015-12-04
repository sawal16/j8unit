package org.j8unit.repository.javax.naming;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.naming.NameParser interface javax.naming.NameParser},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.naming.NameParserClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface NameParserTests<SUT extends javax.naming.NameParser>
extends J8UnitTest<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.naming.NameParser#parse(java.lang.String) public abstract javax.naming.Name javax.naming.NameParser.parse(java.lang.String) throws javax.naming.NamingException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_parse_String() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}