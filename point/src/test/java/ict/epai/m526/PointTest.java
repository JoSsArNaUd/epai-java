package ict.epai.m526;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PointTest {

    @Test
    public void constructorPointImpl() {
        double x = 3;
        double y = 4;
        PointImpl p;
        p = new PointImpl(x, y);
        assertEquals(x, p.getX());
        assertEquals(y, p.getY());
    }

    @Test
    public void normePointImpl() {
        double x = 2;
        double y = 4;
        PointImpl p = new PointImpl(x, y);
        assertEquals(Math.sqrt(Math.pow(2, x) + Math.pow(2, y)), p.norme());
    }

    @Test
    public void getXPointImpl() {
        double x = 3;
        double y = 7;
        PointImpl p = new PointImpl(x, y);
        assertEquals(p.getX(), x);
    }

    @Test
    public void getYPointImpl() {
        double x = 5;
        double y = 3;
        PointImpl p = new PointImpl(x, y);
        assertEquals(p.getY(), y);
    }

    @Test
    public void setXPointImpl() {
        double x = 5;
        double y = 3;
        PointImpl p = new PointImpl(x, y);
        p.setX(9);
        assertEquals(p.getX(), 9);
    }

    @Test
    public void setYPointImpl() {
        double x = 5;
        double y = 3;
        PointImpl p = new PointImpl(x, y);
        p.setY(9);
        assertEquals(p.getY(), 9);
    }
}