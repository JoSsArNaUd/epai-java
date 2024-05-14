package ict.epai.m526;

/**
 * The <code>Ctl</code> class represents the controller in the MVC
 * (Model-View-Controller) architecture.
 * This class is responsible for controlling the flow and interacting with the
 * user interface.
 * <p>
 * The controller initializes a {@link View} object upon instantiation and
 * provides methods
 * to manage the application's behavior.
 * </p>
 * <p>
 * Currently, the controller uses a {@link CLI} object as its default view.
 * </p>
 * 
 * @author Josselin Arnaud
 * @version 1.0
 * @since 1.0
 */
public class Ctl {

    /**
     * The view associated with this controller.
     */
    private View view;

    /**
     * Constructs a new <code>Ctl</code> object and initializes the view with a
     * default CLI view.
     */
    public Ctl() {
        this.view = new CLI();
    }

    /**
     * Starts the controller's operation.
     * <p>
     * This method is intended to begin the flow of the application. However, the
     * specific
     * functionality of this method is not yet implemented.
     * </p>
     * <p>
     * To be extended with the actual logic for controlling the application.
     * </p>
     */
    public void start() {
        Point point = view.saisirPoint();
        double norme = point.norme();
        view.afficherNorme(norme, point);
    }
}
