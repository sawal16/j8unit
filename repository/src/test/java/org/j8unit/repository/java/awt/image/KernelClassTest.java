package org.j8unit.repository.java.awt.image;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class KernelClassTest
implements org.j8unit.repository.java.awt.image.KernelClassTests<java.awt.image.Kernel> {

    @Override
    public Class<java.awt.image.Kernel> createNewSUT() {
        return java.awt.image.Kernel.class;
    }

}