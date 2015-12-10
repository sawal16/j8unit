package org.j8unit.repository.java.nio.file.attribute;

import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class AclEntryFlagTest
implements org.j8unit.repository.java.nio.file.attribute.AclEntryFlagTests<java.nio.file.attribute.AclEntryFlag> {

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOfEnumClass(java.nio.file.attribute.AclEntryFlag.class);
    }

    @Parameter(0)
    public java.nio.file.attribute.AclEntryFlag sut;

    @Override
    public java.nio.file.attribute.AclEntryFlag createNewSUT() {
        return this.sut;
    }

}
