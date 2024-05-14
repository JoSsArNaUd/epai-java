package ict.epai.m526;

import java.lang.reflect.Array;

/**
 * The <code>PointImpl</code> class implements the {@link Point} interface and
 * represents a point in a
 * two-dimensional Cartesian coordinate system.
 * <p>
 * This class provides methods to manipulate and retrieve the x and y
 * coordinates of a point, as well
 * as a method to compute the norme (magnitude) of the point.
 * </p>
 * 
 * @author Josselin Arnaud
 * @version 1.0
 * @since 1.0
 */
public class PointImpl implements Point {

    /**
     * The x-coordinate of the point.
     */
    private double x;

    /**
     * The y-coordinate of the point.
     */
    private double y;

    /**
     * Constructs a <code>PointImpl</code> object with specified x and y
     * coordinates.
     * 
     * @param x the x-coordinate of the point
     * @param y the y-coordinate of the point
     */
    PointImpl(double x, double y) {
        setX(x);
        setY(y);
    }

    /**
     * Computes the norme (magnitude) of the point.
     * <p>
     * The norme is computed as the distance of the point from the origin (0,0) in
     * the
     * two-dimensional Cartesian coordinate system.
     * </p>
     * 
     * @return the norme (magnitude) of the point
     */
    @Override
    public double norme() {
        double res = Math.sqrt((this.x * this.x) + (this.y * this.y)); 
        return res;
    }

    /**
     * Retrieves the x-coordinate of the point.
     * 
     * @return the x-coordinate of the point
     */
    public double getX() {
        return x;
    }

    /**
     * Sets the x-coordinate of the point.
     * 
     * @param x the new x-coordinate value
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * Retrieves the y-coordinate of the point.
     * 
     * @return the y-coordinate of the point
     */
    public double getY() {
        return y;
    }

    /**
     * Sets the y-coordinate of the point.
     * 
     * @param y the new y-coordinate value
     */
    public void setY(double y) {
        this.y = y;
    }
}
