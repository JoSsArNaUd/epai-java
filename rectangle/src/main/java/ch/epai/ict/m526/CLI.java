package ch.epai.ict.m526;

import java.util.Scanner;
import java.math.RoundingMode;
import java.text.DecimalFormat;

/**
 * The <code>CLI</code> class implements the {@link View} interface and serves
 * as a Command-Line Interface view
 * for interacting with the user and displaying information.
 * <p>
 * This class provides methods to capture user input for a point and display the
 * norme (magnitude) of a point
 * on the command-line interface.
 * </p>
 * <p>
 * Currently, the methods are placeholders, and specific functionalities such as
 * capturing a point and
 * displaying the norme need to be implemented.
 * </p>
 * 
 * @author Josselin Arnaud
 * @version 1.0
 * @since 1.0
 */
public class CLI implements View {
    private static final DecimalFormat df = new DecimalFormat("0.00");

    @Override
    public RectangleImpl insertDimensions() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Donner la longueur du rectangle : ");
        double length = scanner.nextInt();
        System.out.printf("Donner la largeur du rectangle : ");
        double width = scanner.nextDouble();
        return new RectangleImpl(length, width);
    }



    @Override
    public String displayRectangle(RectangleImpl arg) {
        return arg.toString();
    }
}