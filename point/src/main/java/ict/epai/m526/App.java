package ict.epai.m526;

/**
 * The <code>App</code> class serves as the entry point for the application and contains the main 
 * method to initiate the application's execution.
 * <p>
 * This class creates an instance of the {@link Ctl} class and invokes its <code>start()</code> method 
 * to initiate the application's process.
 * </p>
 * <p>
 * Additionally, the class provides a static method <code>test()</code> that returns an integer value. 
 * This method serves as a placeholder and can be utilized for testing or demonstration purposes.
 * </p>
 * 
 * @author Josselin Arnaud
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
        Ctl process = new Ctl();
        process.start();
    }
}
