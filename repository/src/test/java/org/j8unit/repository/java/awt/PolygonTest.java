package org.j8unit.repository.java.awt;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PolygonTest
implements org.j8unit.repository.java.awt.PolygonTests<java.awt.Polygon> {

    @Override
    public java.awt.Polygon createNewSUT() {
        return new java.awt.Polygon();
    }

}
