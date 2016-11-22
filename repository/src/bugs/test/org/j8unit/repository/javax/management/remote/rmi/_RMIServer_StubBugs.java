package org.j8unit.repository.javax.management.remote.rmi;

import java.util.HashSet;
import java.util.Set;
import javax.management.remote.rmi._RMIServer_Stub;
import javax.rmi.CORBA.Stub;
import org.junit.Test;
import org.omg.CORBA.BAD_OPERATION;

public class _RMIServer_StubBugs {

    @Test(expected = BAD_OPERATION.class /* because there is a bug! */)
    public void hashCodeThrowsAnException() {
        final Stub instance = new _RMIServer_Stub();
        instance.hashCode();
    }

    @Test(expected = BAD_OPERATION.class /* because there is a bug! */)
    public void hashSetAddCrashes() {
        final Set<Stub> set = new HashSet<>();
        final Stub instance = new _RMIServer_Stub();
        set.add(instance);
    }

}