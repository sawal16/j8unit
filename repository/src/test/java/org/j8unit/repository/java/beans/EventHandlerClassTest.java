package org.j8unit.repository.java.beans;

import java.beans.EventHandler;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link EventHandler} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.beans.EventHandlerClassTests}).
 */
@RunWith(J8Unit4.class)
public class EventHandlerClassTest
implements EventHandlerClassTests<EventHandler> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.beans.EventHandler]

    @Override
    public Class<EventHandler> createNewSUT() {
        return EventHandler.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.beans.EventHandler#EventHandler(Object, String, String, String) public
     * java.beans.EventHandler(java.lang.Object,java.lang.String,java.lang.String,java.lang.String)}.
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
    public void create_EventHandler_Object_String_String_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final EventHandler sut = null; // = new EventHandler(Object, String, String, String);
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.beans.EventHandler#create(Class, Object, String, String, String) public static <T> T
     * java.beans.EventHandler.create(java.lang.Class<T>,java.lang.Object,java.lang.String,java.lang.String,java.lang.String)}.
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
    public void test_create_Class_Object_String_String_String()
    throws Exception {
        // write some test for {@link java.beans.EventHandler#create(Class, Object, String, String, String)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.beans.EventHandler#create(Class, Object, String, String) public static <T> T
     * java.beans.EventHandler.create(java.lang.Class<T>,java.lang.Object,java.lang.String,java.lang.String)}.
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
    public void test_create_Class_Object_String_String()
    throws Exception {
        // write some test for {@link java.beans.EventHandler#create(Class, Object, String, String)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.beans.EventHandler#create(Class, Object, String) public static <T> T
     * java.beans.EventHandler.create(java.lang.Class<T>,java.lang.Object,java.lang.String)}.
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
    public void test_create_Class_Object_String()
    throws Exception {
        // write some test for {@link java.beans.EventHandler#create(Class, Object, String)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.beans.EventHandler]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.beans.EventHandler]

}
