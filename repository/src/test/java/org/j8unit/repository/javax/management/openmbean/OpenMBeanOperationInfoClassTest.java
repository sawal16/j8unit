package org.j8unit.repository.javax.management.openmbean;

import javax.management.openmbean.OpenMBeanOperationInfo;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link OpenMBeanOperationInfo} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.javax.management.openmbean.OpenMBeanOperationInfoClassTests}).
 */
@RunWith(J8Unit4.class)
public class OpenMBeanOperationInfoClassTest
implements OpenMBeanOperationInfoClassTests<OpenMBeanOperationInfo> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.openmbean.OpenMBeanOperationInfo]

    @Override
    public Class<OpenMBeanOperationInfo> createNewSUT() {
        return OpenMBeanOperationInfo.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.management.openmbean.OpenMBeanOperationInfo]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.openmbean.OpenMBeanOperationInfo]

}
