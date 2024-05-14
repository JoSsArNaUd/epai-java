package ch.epai.ict.m526;

/**
 * The <code>Cercle</code> interface defines methods for calculating the
 * perimeter and surface
 * of a circle, as well as checking if a given point belongs to the circle.
 * <p>
 * Classes implementing this interface should provide concrete implementations
 * for these methods.
 * </p>
 * 
 * @author [Author Name]
 * @version 1.0
 * @since 1.0
 */
public interface Cercle {
    /**
     * Calculates and returns the perimeter of the circle.
     * 
     * @return the perimeter of the circle
     */
    public double getPerimeter();

    /**
     * Calculates and returns the surface area of the circle.
     * 
     * @return the surface area of the circle
     */
    public double getSurface();

    /**
     * Checks if the given point belongs to the circle.
     * 
     * @param arg the point to check
     * @return <code>true</code> if the point belongs to the circle,
     *         <code>false</code> otherwise
     */
    public boolean belong(Point arg);

    public Point getCenter();

    /**
     * Sets the center of the circle.
     * 
     * @param center the new center of the circle
     */
    public void setCenter(Point center);

    /**
     * Gets the radius of the circle.
     * 
     * @return the radius of the circle
     */
    public double getRayon();

    /**
     * Sets the radius of the circle.
     * 
     * @param rayon the new radius of the circle
     */
    public void setRayon(double rayon);
}
