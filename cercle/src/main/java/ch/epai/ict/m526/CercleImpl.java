package ch.epai.ict.m526;

/**
 * The <code>CercleImpl</code> class implements the {@link Cercle} interface and represents a circle
 * in a two-dimensional space. It defines methods for getting and setting the center and radius of the circle,
 * calculating the perimeter and surface area, checking if a point belongs to the circle, and providing
 * a string representation of the circle.
 * 
 * @author [Author Name]
 * @version 1.0
 * @since 1.0
 */
public class CercleImpl implements Cercle {
    private Point center;
    private double rayon;

    /**
     * Constructs a circle with the specified center and radius.
     * 
     * @param center2 the center of the circle
     * @param rayon the radius of the circle
     */
    public CercleImpl(Point center2, double rayon) {
        this.center = center2;
        this.rayon = rayon;
    }

    /**
     * Gets the center of the circle.
     * 
     * @return the center of the circle
     */
    @Override
    public Point getCenter() {
        return center;
    }

    /**
     * Sets the center of the circle.
     * 
     * @param center the new center of the circle
     */
    @Override
    public void setCenter(Point center) {
        this.center = center;
    }

    /**
     * Gets the radius of the circle.
     * 
     * @return the radius of the circle
     */
    @Override
    public double getRayon() {
        return rayon;
    }

    /**
     * Sets the radius of the circle.
     * 
     * @param rayon the new radius of the circle
     */
    @Override
    public void setRayon(double rayon) {
        this.rayon = rayon;
    }

    /**
     * Returns a string representation of the circle.
     * 
     * @return a string representation of the circle
     */
    @Override
    public String toString() {
        return "CERCLE(" + this.center.getX() + "," + this.center.getY() + "," + this.rayon + ")";
    }

    /**
     * Checks if the specified point belongs to the circle.
     * 
     * @param arg the point to check
     * @return <code>true</code> if the point belongs to the circle, <code>false</code> otherwise
     */
    @Override
    public boolean belong(Point arg) {
        return arg.norme(this.center) <= this.rayon;
    }

    /**
     * Calculates and returns the perimeter of the circle.
     * 
     * @return the perimeter of the circle
     */
    @Override
    public double getPerimeter() {
        return Math.PI * 2 * rayon;
    }

    /**
     * Calculates and returns the surface area of the circle.
     * 
     * @return the surface area of the circle
     */
    @Override
    public double getSurface() {
        return Math.PI * Math.pow(rayon, 2);
    }
}
