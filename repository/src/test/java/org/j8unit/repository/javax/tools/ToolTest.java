package org.j8unit.repository.javax.tools;

import javax.tools.Tool;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ToolTest
implements org.j8unit.repository.javax.tools.ToolTests<Tool> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.tools.Tool]

    @Override
    public Tool createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.tools.Tool], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.tools.Tool]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.tools.Tool]

}
