package ch.epai.ict.m526;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PointImplTest {

    @Test
    public void testConstructor() {
        double expectedX = 3.0;
        double expectedY = 4.0;
        PointImpl point = new PointImpl(expectedX, expectedY);

        assertEquals(expectedX, point.getX());
        assertEquals(expectedY, point.getY());
    }

    @Test

    public void testNorme() {
        PointImpl point = new PointImpl(3, 4);
        double norme = point.norme();

        assertEquals(5.0, norme, 0.0001); // We expect the norme to be 5 for a 3-4-5 right triangle
    }

    @Test
    public void testNormeWithCenter() {
        PointImpl point = new PointImpl(3, 4);
        PointImpl center = new PointImpl(0, 0);
        double norme = point.norme(center);

        assertEquals(5.0, norme, 0.0001); // We expect the norme to be 5 for a 3-4-5 right triangle
    }

    @Test
    public void testToString() {
        PointImpl point = new PointImpl(3, 4);
        String stringRepresentation = point.toString();

        assertEquals("POINT(3.0,4.0)", stringRepresentation);
    }

    @Test
    public void testGetX() {
        PointImpl point = new PointImpl(3, 4);
        double x = point.getX();

        assertEquals(3.0, x);
    }+6

    @Test
    public void testSetX() {
        PointImpl point = new PointImpl(3, 4);
        point.setX(5);

        assertEquals(5.0, point.getX());
    }

    @Test
    public void testGetY() {
        PointImpl point = new PointImpl(3, 4);
        double y = point.getY();

        assertEquals(4.0, y);
    }

    @Test
    public void testSetY() {
        PointImpl point = new PointImpl(3, 4);
        point.setY(6);

        assertEquals(6.0, point.getY());
    }
}
