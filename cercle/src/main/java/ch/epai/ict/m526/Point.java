package ch.epai.ict.m526;

/**
 * The <code>Point</code> interface defines the contract for objects representing points in a 
 * two-dimensional Cartesian coordinate system. Classes implementing this interface must provide 
 * a method to compute the norme (magnitude) of the point.
 * <p>
 * Implementing classes should encapsulate the behavior related to computing the norme value 
 * based on the specific requirements and calculations related to the point's coordinates.
 * </p>
 * <p>
 * This interface serves as a blueprint for creating various point representations, allowing 
 * flexibility in defining the calculations and properties associated with points.
 * </p>
 * 
 * @author Josselin Arnaud
 * @version 1.0
 * @since 1.0
 */
public interface Point {

    /**
     * Computes the norme (magnitude) of the point in the two-dimensional Cartesian coordinate system.
     * <p>
     * The norme value represents the distance of the point from the origin (0,0) in the Cartesian 
     * coordinate system. Implementing classes should define the specific calculation method 
     * based on the point's coordinates and relevant mathematical formulas.
     * </p>
     * 
     * @return the norme (magnitude) value of the point
     */
    double norme();

    /**
     * Computes the norme (magnitude) of the point relative to another point.
     * <p>
     * The norme value represents the distance between two points in the Cartesian coordinate system.
     * Implementing classes should define the specific calculation method based on the 
     * coordinates of the two points and relevant mathematical formulas.
     * </p>
     * 
     * @param center the point to compute the norme relative to
     * @return the norme (magnitude) value relative to the specified point
     */
    double norme(Point center);

        /**
     * Retrieves the x-coordinate of the point.
     * 
     * @return the x-coordinate of the point
     */
    public double getX();

    /**
     * Sets the x-coordinate of the point.
     * 
     * @param x the new x-coordinate value
     */
    public void setX(double x);

    /**
     * Retrieves the y-coordinate of the point.
     * 
     * @return the y-coordinate of the point
     */
    public double getY();

    /**
     * Sets the y-coordinate of the point.
     * 
     * @param y the new y-coordinate value
     */
    public void setY(double y);
}
