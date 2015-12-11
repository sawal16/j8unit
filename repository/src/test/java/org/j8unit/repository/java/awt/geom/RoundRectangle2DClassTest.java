package org.j8unit.repository.java.awt.geom;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RoundRectangle2DClassTest
implements org.j8unit.repository.java.awt.geom.RoundRectangle2DClassTests<java.awt.geom.RoundRectangle2D> {

    @RunWith(J8Unit4.class)
    public static class DoubleClassTest
    implements org.j8unit.repository.java.awt.geom.RoundRectangle2DClassTests.DoubleClassTests<java.awt.geom.RoundRectangle2D.Double> {

        @Override
        public Class<java.awt.geom.RoundRectangle2D.Double> createNewSUT() {
            return java.awt.geom.RoundRectangle2D.Double.class;
        }

    }

    @RunWith(J8Unit4.class)
    public static class FloatClassTest
    implements org.j8unit.repository.java.awt.geom.RoundRectangle2DClassTests.FloatClassTests<java.awt.geom.RoundRectangle2D.Float> {

        @Override
        public Class<java.awt.geom.RoundRectangle2D.Float> createNewSUT() {
            return java.awt.geom.RoundRectangle2D.Float.class;
        }

    }

    @Override
    public Class<java.awt.geom.RoundRectangle2D> createNewSUT() {
        return java.awt.geom.RoundRectangle2D.class;
    }

}