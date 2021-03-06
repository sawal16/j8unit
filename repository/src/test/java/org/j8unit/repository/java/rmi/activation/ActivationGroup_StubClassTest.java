package org.j8unit.repository.java.rmi.activation;

import java.rmi.activation.ActivationGroup_Stub;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ActivationGroup_Stub} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.rmi.activation.ActivationGroup_StubClassTests}).
 */
@RunWith(J8Unit4.class)
public class ActivationGroup_StubClassTest
implements ActivationGroup_StubClassTests<ActivationGroup_Stub> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.rmi.activation.ActivationGroup_Stub]

    @Override
    public Class<ActivationGroup_Stub> createNewSUT() {
        return ActivationGroup_Stub.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.rmi.activation.ActivationGroup_Stub#ActivationGroup_Stub(java.rmi.server.RemoteRef) public
     * java.rmi.activation.ActivationGroup_Stub(java.rmi.server.RemoteRef)}.
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
    public void create_ActivationGroup_Stub_RemoteRef()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ActivationGroup_Stub sut = null; // = new ActivationGroup_Stub(java.rmi.server.RemoteRef);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.rmi.activation.ActivationGroup_Stub]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.rmi.activation.ActivationGroup_Stub]

}
