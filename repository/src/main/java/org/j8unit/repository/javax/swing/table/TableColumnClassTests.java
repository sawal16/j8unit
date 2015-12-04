package org.j8unit.repository.javax.swing.table;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.swing.table.TableColumn class javax.swing.table.TableColumn},
 * containing all class relevant test methods (at least the test methods of accessible constructors and
 * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
 * methods is {@link org.j8unit.repository.javax.swing.table.TableColumnTests}.
 * </p>
 *
 * <p>
 * In addition, there may be assertions concerning the class itself.
 * For example, <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1"><q>by
 * virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
 * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS, Sec.&thinsp;9.6.1</a>
 * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests}
 * provides a corresponding, inheritable test method:
 * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
 * Similarly, this class is not only intended to assert some static method's behaviour but also to verify
 * runtime constraints and further class specific requirements.
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.swing.table.TableColumnTests
 */
@Category(J8UnitRepository.class)
public abstract interface TableColumnClassTests<SUT extends Class<? extends javax.swing.table.TableColumn>>
extends org.j8unit.repository.java.io.SerializableClassTests<SUT>,
        org.j8unit.repository.java.lang.ObjectClassTests<SUT>
{

    /**
     * Test method for {@link javax.swing.table.TableColumn#TableColumn(int,int,javax.swing.table.TableCellRenderer,javax.swing.table.TableCellEditor) public javax.swing.table.TableColumn(int,int,javax.swing.table.TableCellRenderer,javax.swing.table.TableCellEditor)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_TableColumn_int_int_TableCellRenderer_TableCellEditor() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        javax.swing.table.TableColumn sut = null; // = new TableColumn(int,int,javax.swing.table.TableCellRenderer,javax.swing.table.TableCellEditor);
    }

    /**
     * Test method for {@link javax.swing.table.TableColumn#TableColumn(int,int) public javax.swing.table.TableColumn(int,int)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_TableColumn_int_int() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        javax.swing.table.TableColumn sut = null; // = new TableColumn(int,int);
    }

    /**
     * Test method for {@link javax.swing.table.TableColumn#TableColumn(int) public javax.swing.table.TableColumn(int)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_TableColumn_int() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        javax.swing.table.TableColumn sut = null; // = new TableColumn(int);
    }

    /**
     * Test method for {@link javax.swing.table.TableColumn#TableColumn() public javax.swing.table.TableColumn()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_TableColumn() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        javax.swing.table.TableColumn sut = null; // = new TableColumn();
    }

    @Test
    public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
        // create new instance
        Class<? extends javax.swing.table.TableColumn> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.swing.table.TableColumn.class.isAssignableFrom(sut));
    }

}