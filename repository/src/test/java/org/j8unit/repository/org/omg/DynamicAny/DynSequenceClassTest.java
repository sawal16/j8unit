package org.j8unit.repository.org.omg.DynamicAny;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DynSequenceClassTest
implements org.j8unit.repository.org.omg.DynamicAny.DynSequenceClassTests<org.omg.DynamicAny.DynSequence> {

    @Override
    public Class<org.omg.DynamicAny.DynSequence> createNewSUT() {
        return org.omg.DynamicAny.DynSequence.class;
    }

}
