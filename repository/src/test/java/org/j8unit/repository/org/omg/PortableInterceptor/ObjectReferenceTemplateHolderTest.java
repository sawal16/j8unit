package org.j8unit.repository.org.omg.PortableInterceptor;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;
import org.omg.PortableInterceptor.ObjectReferenceTemplateHolder;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class ObjectReferenceTemplateHolderTest
implements FactoryBasedJ8UnitTest<ObjectReferenceTemplateHolder>, ObjectReferenceTemplateHolderTests<ObjectReferenceTemplateHolder> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.PortableInterceptor.ObjectReferenceTemplateHolder]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(ObjectReferenceTemplateHolder::new);
    }

    @Parameter(0)
    public Callable<ObjectReferenceTemplateHolder> sutFactory;

    @Override
    public Callable<ObjectReferenceTemplateHolder> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.PortableInterceptor.ObjectReferenceTemplateHolder]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.PortableInterceptor.ObjectReferenceTemplateHolder]

}
