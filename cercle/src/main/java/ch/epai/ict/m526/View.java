package ch.epai.ict.m526;

/**
 * The <code>View</code> interface defines the contract for implementing various views in the 
 * application. Classes implementing this interface are expected to provide methods for capturing 
 * user input related to points and displaying relevant information such as the norme (magnitude) 
 * of a point.
 * <p>
 * Implementing classes must define the behavior for the <code>saisirPoint()</code> and 
 * <code>afficherNorme(double value)</code> methods based on the specific view requirements.
 * </p>
 * <p>
 * This interface serves as a blueprint for creating different views, such as Command-Line Interface 
 * (CLI), Graphical User Interface (GUI), or Web-based interfaces, depending on the application's needs.
 * </p>
 * 
 * @author Josselin Arnaud
 * @version 1.0
 * @since 1.0
 */
public interface View {

    /**
     * Captures the dimensions of a circle based on the specific view implementation.
     * <p>
     * Implementing classes should define the behavior of capturing circle dimensions 
     * based on the type of view, such as CLI, GUI, or Web-based interfaces.
     * </p>
     * 
     * @return a {@link Cercle} object representing the captured dimensions
     */
    public Cercle insertDimensionsCercle();

    /**
     * Captures the coordinates of a point based on the specific view implementation.
     * <p>
     * Implementing classes should define the behavior of capturing point coordinates 
     * based on the type of view, such as CLI, GUI, or Web-based interfaces.
     * </p>
     * 
     * @return a {@link Point} object representing the captured coordinates
     */
    public Point insertDimensionsPoint();

    /**
     * Displays information about the given circle based on the specific view.
     * <p>
     * Implementing classes should define how information about the circle is displayed 
     * to the user based on the type of view, such as CLI, GUI, or Web-based interfaces.
     * </p>
     * 
     * @param cercle the circle to display
     */
    public void displayCercle(Cercle cercle);

    /**
     * Displays information about the given point based on the specific view.
     * <p>
     * Implementing classes should define how information about the point is displayed 
     * to the user based on the type of view, such as CLI, GUI, or Web-based interfaces.
     * </p>
     * 
     * @param point the point to display
     * @param cercle the circle associated with the point
     */
    public void displayPoint(Point point, Cercle cercle);
}
