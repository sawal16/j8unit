package org.j8unit.repository.java.awt;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LabelTest
implements org.j8unit.repository.java.awt.LabelTests<java.awt.Label> {

    @Override
    public java.awt.Label createNewSUT() {
        return new java.awt.Label();
    }

}