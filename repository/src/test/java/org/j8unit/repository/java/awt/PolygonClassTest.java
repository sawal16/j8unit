package org.j8unit.repository.java.awt;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PolygonClassTest
implements org.j8unit.repository.java.awt.PolygonClassTests<java.awt.Polygon> {

    @Override
    public Class<java.awt.Polygon> createNewSUT() {
        return java.awt.Polygon.class;
    }

}