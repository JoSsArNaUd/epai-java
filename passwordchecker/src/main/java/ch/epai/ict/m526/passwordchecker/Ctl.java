package ch.epai.ict.m526.passwordchecker;

/**
 * The Ctl class serves as a controller for the password checking process.
 * It interacts with the user interface and the password checking logic to
 * validate passwords.
 */
public class Ctl {

    private View view;

    /**
     * Constructs a new Ctl instance with a default view implementation.
     */
    public Ctl() {
        this.view = new Cli();
    }

    /**
     * Starts the password checking process.
     * The method continuously prompts the user for a password,
     * validates it, and displays the validation result until a valid
     * password is entered.
     */
    public void start() {
        while (true) {
            String password = view.inputPassword();
            PasswordChecker checker = new PasswordCheckerImpl(password);
            if (checker.isPasswordValid()) {
                view.isValid();
                break;
            }
            view.isNotValid();
        }
    }
}
