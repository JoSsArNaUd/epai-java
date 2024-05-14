package ch.epai.ict.m526;


/**
 * The <code>App</code> class serves as the entry point for the application and contains the main 
 * method to initiate the application's execution.
 * <p>
 * This class creates an instance of the {@link Ctl} class and invokes its <code>start()</code> method 
 * to initiate the application's process.
 * </p>
 * 
 * @author [Author Name]
 * @version 1.0
 * @since 1.0
 */
public class App {

    /**
     * The main method serves as the entry point for the application.
     * <p>
     * It creates an instance of the {@link Ctl} class and invokes its <code>start()</code> method 
     * to initiate the application's process.
     * </p>
     * 
     * @param args the command-line arguments (unused in this implementation)
     */
    public static void main(String[] args) {
        new Ctl().start();
    }
}
