package org.j8unit.repository.javax.swing;

import javax.swing.JSpinner;
import javax.swing.JSpinner.DateEditor;
import javax.swing.JSpinner.DefaultEditor;
import javax.swing.JSpinner.ListEditor;
import javax.swing.JSpinner.NumberEditor;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link JSpinner} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.swing.JSpinnerClassTests}).
 */
@RunWith(J8Unit4.class)
public class JSpinnerClassTest
implements JSpinnerClassTests<JSpinner> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.JSpinner]

    @Override
    public Class<JSpinner> createNewSUT() {
        return JSpinner.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link javax.swing.JSpinner#JSpinner() public
     * javax.swing.JSpinner()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_JSpinner()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final JSpinner sut = new JSpinner();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.JSpinner#JSpinner(javax.swing.SpinnerModel) public
     * javax.swing.JSpinner(javax.swing.SpinnerModel)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_JSpinner_SpinnerModel()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final JSpinner sut = null; // = new JSpinner(javax.swing.SpinnerModel);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.JSpinner]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.JSpinner]

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link DateEditor} (by simply reusing the
     * J8Unit test interface {@link org.j8unit.repository.javax.swing.JSpinnerClassTests.DateEditorClassTests}).
     */
    @RunWith(J8Unit4.class)
    public static class DateEditorClassTest
    implements DateEditorClassTests<DateEditor> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.JSpinner$DateEditor]

        @Override
        public Class<DateEditor> createNewSUT() {
            return DateEditor.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.swing.JSpinner.DateEditor#DateEditor(javax.swing.JSpinner, String) public
         * javax.swing.JSpinner$DateEditor(javax.swing.JSpinner,java.lang.String)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public void create_DateEditor_JSpinner_String()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final DateEditor sut = null; // = new DateEditor(javax.swing.JSpinner, String);
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.swing.JSpinner.DateEditor#DateEditor(javax.swing.JSpinner) public
         * javax.swing.JSpinner$DateEditor(javax.swing.JSpinner)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public void create_DateEditor_JSpinner()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final DateEditor sut = null; // = new DateEditor(javax.swing.JSpinner);
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.JSpinner$DateEditor]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.JSpinner$DateEditor]

    }

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link NumberEditor} (by simply reusing the
     * J8Unit test interface {@link org.j8unit.repository.javax.swing.JSpinnerClassTests.NumberEditorClassTests}).
     */
    @RunWith(J8Unit4.class)
    public static class NumberEditorClassTest
    implements NumberEditorClassTests<NumberEditor> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.JSpinner$NumberEditor]

        @Override
        public Class<NumberEditor> createNewSUT() {
            return NumberEditor.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.swing.JSpinner.NumberEditor#NumberEditor(javax.swing.JSpinner, String) public
         * javax.swing.JSpinner$NumberEditor(javax.swing.JSpinner,java.lang.String)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public void create_NumberEditor_JSpinner_String()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final NumberEditor sut = null; // = new NumberEditor(javax.swing.JSpinner, String);
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.swing.JSpinner.NumberEditor#NumberEditor(javax.swing.JSpinner) public
         * javax.swing.JSpinner$NumberEditor(javax.swing.JSpinner)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public void create_NumberEditor_JSpinner()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final NumberEditor sut = null; // = new NumberEditor(javax.swing.JSpinner);
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.JSpinner$NumberEditor]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.JSpinner$NumberEditor]

    }

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link DefaultEditor} (by simply reusing the
     * J8Unit test interface {@link org.j8unit.repository.javax.swing.JSpinnerClassTests.DefaultEditorClassTests}).
     */
    @RunWith(J8Unit4.class)
    public static class DefaultEditorClassTest
    implements DefaultEditorClassTests<DefaultEditor> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.JSpinner$DefaultEditor]

        @Override
        public Class<DefaultEditor> createNewSUT() {
            return DefaultEditor.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.swing.JSpinner.DefaultEditor#DefaultEditor(javax.swing.JSpinner) public
         * javax.swing.JSpinner$DefaultEditor(javax.swing.JSpinner)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public void create_DefaultEditor_JSpinner()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final DefaultEditor sut = null; // = new DefaultEditor(javax.swing.JSpinner);
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.JSpinner$DefaultEditor]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.JSpinner$DefaultEditor]

    }

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link ListEditor} (by simply reusing the
     * J8Unit test interface {@link org.j8unit.repository.javax.swing.JSpinnerClassTests.ListEditorClassTests}).
     */
    @RunWith(J8Unit4.class)
    public static class ListEditorClassTest
    implements ListEditorClassTests<ListEditor> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.JSpinner$ListEditor]

        @Override
        public Class<ListEditor> createNewSUT() {
            return ListEditor.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.swing.JSpinner.ListEditor#ListEditor(javax.swing.JSpinner) public
         * javax.swing.JSpinner$ListEditor(javax.swing.JSpinner)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public void create_ListEditor_JSpinner()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final ListEditor sut = null; // = new ListEditor(javax.swing.JSpinner);
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.JSpinner$ListEditor]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.JSpinner$ListEditor]

    }

}
