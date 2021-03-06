package org.j8unit.repository.java.util;

import java.util.Locale;
import java.util.Locale.Builder;
import java.util.Locale.FilteringMode;
import java.util.Locale.LanguageRange;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Locale} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.util.LocaleClassTests}).
 */
@RunWith(J8Unit4.class)
public class LocaleClassTest
implements LocaleClassTests<Locale> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.Locale]

    @Override
    public Class<Locale> createNewSUT() {
        return Locale.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.util.Locale#Locale(String) public
     * java.util.Locale(java.lang.String)}.
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
    public void create_Locale_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final Locale sut = null; // = new Locale(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.util.Locale#Locale(String, String) public
     * java.util.Locale(java.lang.String,java.lang.String)}.
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
    public void create_Locale_String_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final Locale sut = null; // = new Locale(String, String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.util.Locale#Locale(String, String, String)
     * public java.util.Locale(java.lang.String,java.lang.String,java.lang.String)}.
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
    public void create_Locale_String_String_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final Locale sut = null; // = new Locale(String, String, String);
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.util.Locale#getISOCountries() public static
     * java.lang.String[] java.util.Locale.getISOCountries()}.
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
    public void test_getISOCountries()
    throws Exception {
        // write some test for {@link java.util.Locale#getISOCountries()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.util.Locale#filter(java.util.List, java.util.Collection) public static
     * java.util.List<java.util.Locale>
     * java.util.Locale.filter(java.util.List<java.util.Locale$LanguageRange>,java.util.Collection<java.util.Locale>)}.
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
    public void test_filter_List_Collection()
    throws Exception {
        // write some test for {@link java.util.Locale#filter(java.util.List, java.util.Collection)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.util.Locale#filter(java.util.List, java.util.Collection, java.util.Locale.FilteringMode) public
     * static java.util.List<java.util.Locale>
     * java.util.Locale.filter(java.util.List<java.util.Locale$LanguageRange>,java.util.Collection<java.util.Locale>,java.util.Locale$FilteringMode)}.
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
    public void test_filter_List_Collection_FilteringMode()
    throws Exception {
        // write some test for {@link java.util.Locale#filter(java.util.List, java.util.Collection,
        // java.util.Locale.FilteringMode)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.util.Locale#lookupTag(java.util.List, java.util.Collection) public static java.lang.String
     * java.util.Locale.lookupTag(java.util.List<java.util.Locale$LanguageRange>,java.util.Collection<java.lang.String>)}.
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
    public void test_lookupTag_List_Collection()
    throws Exception {
        // write some test for {@link java.util.Locale#lookupTag(java.util.List, java.util.Collection)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.util.Locale#getAvailableLocales() public static
     * java.util.Locale[] java.util.Locale.getAvailableLocales()}.
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
    public void test_getAvailableLocales()
    throws Exception {
        // write some test for {@link java.util.Locale#getAvailableLocales()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.util.Locale#filterTags(java.util.List, java.util.Collection) public static
     * java.util.List<java.lang.String>
     * java.util.Locale.filterTags(java.util.List<java.util.Locale$LanguageRange>,java.util.Collection<java.lang.String>)}.
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
    public void test_filterTags_List_Collection()
    throws Exception {
        // write some test for {@link java.util.Locale#filterTags(java.util.List, java.util.Collection)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.util.Locale#filterTags(java.util.List, java.util.Collection, java.util.Locale.FilteringMode) public
     * static java.util.List<java.lang.String>
     * java.util.Locale.filterTags(java.util.List<java.util.Locale$LanguageRange>,java.util.Collection<java.lang.String>,java.util.Locale$FilteringMode)}.
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
    public void test_filterTags_List_Collection_FilteringMode()
    throws Exception {
        // write some test for {@link java.util.Locale#filterTags(java.util.List, java.util.Collection,
        // java.util.Locale.FilteringMode)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.util.Locale#getISOLanguages() public static
     * java.lang.String[] java.util.Locale.getISOLanguages()}.
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
    public void test_getISOLanguages()
    throws Exception {
        // write some test for {@link java.util.Locale#getISOLanguages()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.util.Locale#forLanguageTag(String) public
     * static java.util.Locale java.util.Locale.forLanguageTag(java.lang.String)}.
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
    public void test_forLanguageTag_String()
    throws Exception {
        // write some test for {@link java.util.Locale#forLanguageTag(String)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.util.Locale#lookup(java.util.List, java.util.Collection) public static java.util.Locale
     * java.util.Locale.lookup(java.util.List<java.util.Locale$LanguageRange>,java.util.Collection<java.util.Locale>)}.
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
    public void test_lookup_List_Collection()
    throws Exception {
        // write some test for {@link java.util.Locale#lookup(java.util.List, java.util.Collection)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.util.Locale#setDefault(java.util.Locale.Category, java.util.Locale) public static synchronized void
     * java.util.Locale.setDefault(java.util.Locale$Category,java.util.Locale)}.
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
    public void test_setDefault_Category_Locale()
    throws Exception {
        // write some test for {@link java.util.Locale#setDefault(java.util.Locale.Category, java.util.Locale)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.util.Locale#setDefault(java.util.Locale) public
     * static synchronized void java.util.Locale.setDefault(java.util.Locale)}.
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
    public void test_setDefault_Locale()
    throws Exception {
        // write some test for {@link java.util.Locale#setDefault(java.util.Locale)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.util.Locale#getDefault(java.util.Locale.Category) public static java.util.Locale
     * java.util.Locale.getDefault(java.util.Locale$Category)}.
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
    public void test_getDefault_Category()
    throws Exception {
        // write some test for {@link java.util.Locale#getDefault(java.util.Locale.Category)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.util.Locale#getDefault() public static
     * java.util.Locale java.util.Locale.getDefault()}.
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
    public void test_getDefault()
    throws Exception {
        // write some test for {@link java.util.Locale#getDefault()}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.Locale]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.Locale]

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link LanguageRange} (by simply reusing the
     * J8Unit test interface {@link org.j8unit.repository.java.util.LocaleClassTests.LanguageRangeClassTests}).
     */
    @RunWith(J8Unit4.class)
    public static class LanguageRangeClassTest
    implements LanguageRangeClassTests<LanguageRange> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.Locale$LanguageRange]

        @Override
        public Class<LanguageRange> createNewSUT() {
            return LanguageRange.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link java.util.Locale.LanguageRange#LanguageRange(String, double) public
         * java.util.Locale$LanguageRange(java.lang.String,double)}.
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
        public void create_LanguageRange_String_double()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final LanguageRange sut = null; // = new LanguageRange(String, double);
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link java.util.Locale.LanguageRange#LanguageRange(String) public
         * java.util.Locale$LanguageRange(java.lang.String)}.
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
        public void create_LanguageRange_String()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final LanguageRange sut = null; // = new LanguageRange(String);
        }

        /**
         * <p>
         * Test method for the hereby targeted method-under-test
         * {@link java.util.Locale.LanguageRange#mapEquivalents(java.util.List, java.util.Map) public static
         * java.util.List<java.util.Locale$LanguageRange>
         * java.util.Locale$LanguageRange.mapEquivalents(java.util.List<java.util.Locale$LanguageRange>,java.util.Map<java.lang.String,
         * java.util.List<java.lang.String>>)}.
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
        public void test_mapEquivalents_List_Map()
        throws Exception {
            // write some test for {@link java.util.Locale.LanguageRange#mapEquivalents(java.util.List, java.util.Map)}
        }

        /**
         * <p>
         * Test method for the hereby targeted method-under-test {@link java.util.Locale.LanguageRange#parse(String)
         * public static java.util.List<java.util.Locale$LanguageRange>
         * java.util.Locale$LanguageRange.parse(java.lang.String)}.
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
        public void test_parse_String()
        throws Exception {
            // write some test for {@link java.util.Locale.LanguageRange#parse(String)}
        }

        /**
         * <p>
         * Test method for the hereby targeted method-under-test
         * {@link java.util.Locale.LanguageRange#parse(String, java.util.Map) public static
         * java.util.List<java.util.Locale$LanguageRange>
         * java.util.Locale$LanguageRange.parse(java.lang.String,java.util.Map<java.lang.String,
         * java.util.List<java.lang.String>>)}.
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
        public void test_parse_String_Map()
        throws Exception {
            // write some test for {@link java.util.Locale.LanguageRange#parse(String, java.util.Map)}
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.Locale$LanguageRange]

        // J8UNIT-MARKER-[END]-[CLASS]-[java.util.Locale$LanguageRange]

    }

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link java.util.Locale.Category} (by simply
     * reusing the J8Unit test interface {@link org.j8unit.repository.java.util.LocaleClassTests.CategoryClassTests}).
     */
    @RunWith(J8Unit4.class)
    public static class CategoryClassTest
    implements CategoryClassTests<java.util.Locale.Category> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.Locale$Category]

        @Override
        public Class<java.util.Locale.Category> createNewSUT() {
            return java.util.Locale.Category.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted method-under-test {@link java.util.Locale.Category#valueOf(String) public
         * static java.util.Locale$Category java.util.Locale$Category.valueOf(java.lang.String)}.
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
        public void test_valueOf_String()
        throws Exception {
            // write some test for {@link java.util.Locale.Category#valueOf(String)}
        }

        /**
         * <p>
         * Test method for the hereby targeted method-under-test {@link java.util.Locale.Category#values() public static
         * java.util.Locale$Category[] java.util.Locale$Category.values()}.
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
        public void test_values()
        throws Exception {
            // write some test for {@link java.util.Locale.Category#values()}
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.Locale$Category]

        // J8UNIT-MARKER-[END]-[CLASS]-[java.util.Locale$Category]

    }

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link FilteringMode} (by simply reusing the
     * J8Unit test interface {@link org.j8unit.repository.java.util.LocaleClassTests.FilteringModeClassTests}).
     */
    @RunWith(J8Unit4.class)
    public static class FilteringModeClassTest
    implements FilteringModeClassTests<FilteringMode> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.Locale$FilteringMode]

        @Override
        public Class<FilteringMode> createNewSUT() {
            return FilteringMode.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted method-under-test {@link java.util.Locale.FilteringMode#valueOf(String)
         * public static java.util.Locale$FilteringMode java.util.Locale$FilteringMode.valueOf(java.lang.String)}.
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
        public void test_valueOf_String()
        throws Exception {
            // write some test for {@link java.util.Locale.FilteringMode#valueOf(String)}
        }

        /**
         * <p>
         * Test method for the hereby targeted method-under-test {@link java.util.Locale.FilteringMode#values() public
         * static java.util.Locale$FilteringMode[] java.util.Locale$FilteringMode.values()}.
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
        public void test_values()
        throws Exception {
            // write some test for {@link java.util.Locale.FilteringMode#values()}
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.Locale$FilteringMode]

        // J8UNIT-MARKER-[END]-[CLASS]-[java.util.Locale$FilteringMode]

    }

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link Builder} (by simply reusing the
     * J8Unit test interface {@link org.j8unit.repository.java.util.LocaleClassTests.BuilderClassTests}).
     */
    @RunWith(J8Unit4.class)
    public static class BuilderClassTest
    implements org.j8unit.repository.java.util.LocaleClassTests.BuilderClassTests<Builder> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.Locale$Builder]

        @Override
        public Class<Builder> createNewSUT() {
            return Builder.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test {@link java.util.Locale.Builder#Builder() public
         * java.util.Locale$Builder()}.
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
        public void create_Builder()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final Builder sut = new Builder();
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.Locale$Builder]

        // J8UNIT-MARKER-[END]-[CLASS]-[java.util.Locale$Builder]

    }

}
