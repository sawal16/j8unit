package org.j8unit.repository.java.awt;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TextFieldClassTest
implements org.j8unit.repository.java.awt.TextFieldClassTests<java.awt.TextField> {

    @Override
    public Class<java.awt.TextField> createNewSUT() {
        return java.awt.TextField.class;
    }

}
