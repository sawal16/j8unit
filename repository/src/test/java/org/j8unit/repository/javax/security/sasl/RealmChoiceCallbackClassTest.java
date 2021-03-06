package org.j8unit.repository.javax.security.sasl;

import javax.security.sasl.RealmChoiceCallback;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link RealmChoiceCallback} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.security.sasl.RealmChoiceCallbackClassTests}).
 */
@RunWith(J8Unit4.class)
public class RealmChoiceCallbackClassTest
implements RealmChoiceCallbackClassTests<RealmChoiceCallback> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.security.sasl.RealmChoiceCallback]

    @Override
    public Class<RealmChoiceCallback> createNewSUT() {
        return RealmChoiceCallback.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.security.sasl.RealmChoiceCallback#RealmChoiceCallback(String, String[], int, boolean) public
     * javax.security.sasl.RealmChoiceCallback(java.lang.String,java.lang.String[],int,boolean)}.
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
    public void create_RealmChoiceCallback_String_StringArray_int_boolean()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final RealmChoiceCallback sut = null; // = new RealmChoiceCallback(String, String[], int, boolean);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.security.sasl.RealmChoiceCallback]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.security.sasl.RealmChoiceCallback]

}
