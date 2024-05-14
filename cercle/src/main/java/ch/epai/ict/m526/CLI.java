package ch.epai.ict.m526;

import java.util.Locale;
import java.util.Scanner;
import java.math.RoundingMode;
import java.text.DecimalFormat;

/**
 * The <code>CLI</code> class implements the {@link View} interface and serves
 * as a Command-Line Interface view for interacting with the user and displaying information.
 * <p>
 * This class provides methods to capture user input for a point and display the
 * norme (magnitude) of a point on the command-line interface.
 * </p>
 * <p>
 * Currently, the methods are placeholders, and specific functionalities such as
 * capturing a point and displaying the norme need to be implemented.
 * </p>
 * 
 * @author Josselin Arnaud
 * @version 1.0
 * @since 1.0
 */
public class CLI implements View {
    private static final DecimalFormat df = new DecimalFormat("0.00");
    private Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    
    /**
     * Displays information about the given circle, including its string representation,
     * perimeter, and surface area.
     * 
     * @param cercle the circle to display
     */
    @Override
    public void displayCercle(Cercle cercle) {
        df.setRoundingMode(RoundingMode.HALF_UP);
        System.out.println(cercle.toString());
        System.out.println("Le périmètre est : " + df.format(cercle.getPerimeter()));
        System.out.println("La surface est : " + df.format(cercle.getSurface()));
    }

    /**
     * Displays information about the given point, including its string representation,
     * and whether it belongs to the specified circle.
     * 
     * @param point the point to display
     * @param cercle the circle to check against
     */
    @Override
    public void displayPoint(Point point, Cercle cercle) {
        System.out.println(point.toString());
        if (cercle.belong((PointImpl) point)) {
            System.out.println("Le point est dans le cercle");
        } else {
            System.out.println("Le point est pas dans le cercle");
        }
    }

    /**
     * Captures user input to create and return a circle with specified dimensions.
     * 
     * @return a new circle with user-input dimensions
     */
    @Override
    public Cercle insertDimensionsCercle() {
        System.out.printf("Donner l'abscisse du centre : ");
        double centreX = scanner.nextDouble();
        System.out.printf("Donner l'ordonné du centre : ");
        double centreY = scanner.nextDouble();
        System.out.printf("Donner le rayon : ");
        double rayon = scanner.nextDouble();
        Point centre = new PointImpl(centreX, centreY);
        return new CercleImpl(centre, rayon);
    }

    /**
     * Captures user input to create and return a point with specified coordinates.
     * 
     * @return a new point with user-input coordinates
     */
    @Override
    public Point insertDimensionsPoint() {
        System.out.println("Donner un point : ");
        System.out.printf("X : ");
        double X = scanner.nextDouble();
        System.out.printf("Y : ");
        double Y = scanner.nextDouble();
        return new PointImpl(X, Y);
    }

    /*
     * Placeholder methods for future functionalities.
     * Uncomment and implement as needed.

    @Override
    public RectangleImpl insertDimensions() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Donner la longueur du rectangle : ");
        double length = scanner.nextDouble();
        System.out.printf("Donner la largeur du rectangle : ");
        double width = scanner.nextDouble();
        return new RectangleImpl(length, width);
    }

    @Override
    public String displayRectangle(RectangleImpl arg) {
        return arg.toString();
    }
    */

}
