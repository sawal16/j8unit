package org.j8unit.repository.java.rmi.server;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SkeletonClassTest
implements org.j8unit.repository.java.rmi.server.SkeletonClassTests<java.rmi.server.Skeleton> {

    @Override
    public Class<java.rmi.server.Skeleton> createNewSUT() {
        return java.rmi.server.Skeleton.class;
    }

}
