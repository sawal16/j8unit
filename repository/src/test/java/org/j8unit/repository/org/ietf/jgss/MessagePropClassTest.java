package org.j8unit.repository.org.ietf.jgss;

import org.ietf.jgss.MessageProp;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link MessageProp} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.ietf.jgss.MessagePropClassTests}).
 */
@RunWith(J8Unit4.class)
public class MessagePropClassTest
implements MessagePropClassTests<MessageProp> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.ietf.jgss.MessageProp]

    @Override
    public Class<MessageProp> createNewSUT() {
        return MessageProp.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.ietf.jgss.MessageProp#MessageProp(int, boolean) public org.ietf.jgss.MessageProp(int,boolean)}.
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
    public void create_MessageProp_int_boolean()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final MessageProp sut = null; // = new MessageProp(int, boolean);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link org.ietf.jgss.MessageProp#MessageProp(boolean)
     * public org.ietf.jgss.MessageProp(boolean)}.
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
    public void create_MessageProp_boolean()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final MessageProp sut = null; // = new MessageProp(boolean);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.ietf.jgss.MessageProp]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.ietf.jgss.MessageProp]

}
