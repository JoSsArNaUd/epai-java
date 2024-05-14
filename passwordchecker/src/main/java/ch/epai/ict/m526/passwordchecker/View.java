package ch.epai.ict.m526.passwordchecker;

/**
 * The View interface defines methods for interacting with the user interface.
 * Classes implementing this interface are responsible for handling user input
 * and displaying validation results.
 */
public interface View {

    /**
     * Prompts the user to input a password.
     *
     * @return the password entered by the user
     */
    public String inputPassword();

    /**
     * Displays a message indicating that the password is valid.
     */
    public void isValid();

    /**
     * Displays a message indicating that the password is not valid.
     */
    public void isNotValid();
}
