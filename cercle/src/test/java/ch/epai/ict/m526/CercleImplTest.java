package ch.epai.ict.m526;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * This class provides unit tests for the {@link CercleImpl} class.
 * 
 * @author Josselin Arnaud
 */
public class CercleImplTest {

    /**
     * Tests the {@link CercleImpl#getCenter()} method.
     * It creates a Cercle object with a specific center and radius, then asserts
     * that the center obtained
     * from the Cercle object matches the expected center.
     */
    @Test
    public void testGetCenter() {
        Point center = new PointImpl(1, 2);
        double rayon = 5;
        Cercle cercle = new CercleImpl(center, rayon);

        assertEquals(center, cercle.getCenter());
    }

    /**
     * Tests the {@link CercleImpl#setCenter(Point)} method.
     * It creates a Cercle object with a specific center and radius, then sets a new
     * center to the Cercle object
     * and asserts that the new center obtained from the Cercle object matches the
     * expected new center.
     */
    @Test
    public void testSetCenter() {
        Point center = new PointImpl(1, 2);
        double rayon = 5;
        Cercle cercle = new CercleImpl(center, rayon);

        Point newCenter = new PointImpl(3, 4);
        cercle.setCenter(newCenter);

        assertEquals(newCenter, cercle.getCenter());
    }

    /**
     * Tests the {@link CercleImpl#getRayon()} method.
     * It creates a Cercle object with a specific center and radius, then asserts
     * that the radius obtained
     * from the Cercle object matches the expected radius.
     */
    @Test
    public void testGetRayon() {
        Point center = new PointImpl(1, 2);
        double rayon = 5;
        Cercle cercle = new CercleImpl(center, rayon);

        assertEquals(rayon, cercle.getRayon());
    }

    /**
     * Tests the {@link CercleImpl#setRayon(double)} method.
     * It creates a Cercle object with a specific center and radius, then sets a new
     * radius to the Cercle object
     * and asserts that the new radius obtained from the Cercle object matches the
     * expected new radius.
     */
    @Test
    public void testSetRayon() {
        Point center = new PointImpl(1, 2);
        double rayon = 5;
        Cercle cercle = new CercleImpl(center, rayon);

        double newRayon = 8;

        cercle.setRayon(newRayon);

        assertEquals(newRayon, cercle.getRayon());
    }

    /**
     * Tests the {@link CercleImpl#toString()} method.
     * It creates a Cercle object with a specific center and radius, then asserts
     * that the string representation
     * obtained from the Cercle object matches the expected string representation.
     */
    @Test
    public void testToString() {
        Point center = new PointImpl(1, 2);
        double rayon = 5;
        Cercle cercle = new CercleImpl(center, rayon);

        assertEquals("CERCLE(1.0,2.0,5.0)", cercle.toString());
    }

    /**
     * Tests the {@link CercleImpl#belong(Point)} method.
     * It creates a Cercle object with a specific center and radius, then checks
     * whether two points belong
     * to the Cercle or not, and asserts that the expected results match the actual
     * results.
     */
    @Test
    public void testBelong() {
        Point center = new PointImpl(0, 0);
        double rayon = 5;
        Cercle cercle = new CercleImpl(center, rayon);

        Point pointInside = new PointImpl(3, 4);
        Point pointOutside = new PointImpl(8, 8);

        assertTrue(cercle.belong(pointInside));
        assertFalse(cercle.belong(pointOutside));
    }

    /**
     * Tests the {@link CercleImpl#getPerimeter()} method.
     * It creates a Cercle object with a specific center and radius, then asserts
     * that the perimeter
     * obtained from the Cercle object matches the expected perimeter.
     */
    @Test
    public void testGetPerimeter() {
        Point center = new PointImpl(0, 0);
        double rayon = 5;
        Cercle cercle = new CercleImpl(center, rayon);

        assertEquals(2 * Math.PI * rayon, cercle.getPerimeter());
    }

    /**
     * Tests the {@link CercleImpl#getSurface()} method.
     * It creates a Cercle object with a specific center and radius, then asserts
     * that the surface area
     * obtained from the Cercle object matches the expected surface area.
     */
    @Test
    public void testGetSurface() {
        Point center = new PointImpl(0, 0);
        double rayon = 5;
        Cercle cercle = new CercleImpl(center, rayon);

        assertEquals(Math.PI * Math.pow(rayon, 2), cercle.getSurface());
    }
}
