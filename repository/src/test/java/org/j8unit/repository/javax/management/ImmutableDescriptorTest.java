package org.j8unit.repository.javax.management;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import javax.management.ImmutableDescriptor;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ImmutableDescriptor} (by simply
 * reusing the J8Unit test interface {@link ImmutableDescriptorTests}).
 */

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class ImmutableDescriptorTest
implements ImmutableDescriptorTests<ImmutableDescriptor> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.ImmutableDescriptor]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(ImmutableDescriptor.EMPTY_DESCRIPTOR);
    }

    @Parameter(0)
    public ImmutableDescriptor sut;

    @Override
    public ImmutableDescriptor createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.management.ImmutableDescriptor]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.management.ImmutableDescriptor]

}
