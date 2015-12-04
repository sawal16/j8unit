package org.j8unit.repository.java.awt.print;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link java.awt.print.Book class java.awt.print.Book},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.awt.print.BookClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface BookTests<SUT extends java.awt.print.Book>
extends org.j8unit.repository.java.awt.print.PageableTests<SUT>,
        org.j8unit.repository.java.lang.ObjectTests<SUT>
{

    /**
     * <p>
     * Test method for {@link java.awt.print.Book#getNumberOfPages() public int java.awt.print.Book.getNumberOfPages()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getNumberOfPages() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.print.Book#getPrintable(int) public java.awt.print.Printable java.awt.print.Book.getPrintable(int) throws java.lang.IndexOutOfBoundsException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getPrintable_int() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.print.Book#getPageFormat(int) public java.awt.print.PageFormat java.awt.print.Book.getPageFormat(int) throws java.lang.IndexOutOfBoundsException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getPageFormat_int() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.print.Book#setPage(int,java.awt.print.Printable,java.awt.print.PageFormat) public void java.awt.print.Book.setPage(int,java.awt.print.Printable,java.awt.print.PageFormat) throws java.lang.IndexOutOfBoundsException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setPage_int_Printable_PageFormat() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.print.Book#append(java.awt.print.Printable,java.awt.print.PageFormat,int) public void java.awt.print.Book.append(java.awt.print.Printable,java.awt.print.PageFormat,int)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_append_Printable_PageFormat_int() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.print.Book#append(java.awt.print.Printable,java.awt.print.PageFormat) public void java.awt.print.Book.append(java.awt.print.Printable,java.awt.print.PageFormat)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_append_Printable_PageFormat() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}