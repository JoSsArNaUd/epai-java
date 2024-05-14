package ict.epai.m526;

import java.util.Scanner;
import java.math.RoundingMode;
import java.text.DecimalFormat;

/**
 * The <code>CLI</code> class implements the {@link View} interface and serves
 * as a Command-Line Interface view for interacting with the user and displaying information.
 * <p>
 * This class provides methods to capture user input for a point and display the
 * norm (magnitude) of a point on the command-line interface.
 * </p>
 * <p>
 * Currently, the methods are placeholders, and specific functionalities such as
 * capturing a point and displaying the norm need to be implemented.
 * </p>
 * 
 * @author Josselin Arnaud
 * @version 1.0
 * @since 1.0
 */
public class CLI implements View {
    private static final DecimalFormat df = new DecimalFormat("0.00");

    /**
     * Captures the coordinates of a point from the user.
     * 
     * @return a {@link Point} object representing the user-input coordinates
     */
    @Override
    public Point saisirPoint() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter the abscissa: ");
        int x = scanner.nextInt();
        System.out.printf("Enter the ordinate: ");
        double y = scanner.nextDouble();
        return new PointImpl(x, y);
    }

    /**
     * Displays the norm (magnitude) value of a point on the command-line interface.
     * <p>
     * The norm value is printed in the format: "The norm of the point (1,2) is: [value]".
     * </p>
     * 
     * @param value the norm (magnitude) value to display
     */
    @Override
    public void afficherNorme(double value, Point p) {
        df.setRoundingMode(RoundingMode.HALF_UP);
        PointImpl point = (PointImpl) p;
        System.out.println("La norme du point " + point.getX() + ", " + point.getY() + " est " + df.format(value));
    }
}
