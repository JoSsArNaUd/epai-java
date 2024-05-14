package ch.epai.ict.m526.passwordchecker;

/**
 * The PasswordCheckerImpl class implements the PasswordChecker interface and provides
 * functionality to validate passwords based on certain criteria.
 */
public class PasswordCheckerImpl implements PasswordChecker {

    private String password;

    /**
     * Constructs a new PasswordCheckerImpl instance with the specified password.
     *
     * @param password the password to be validated
     */
    public PasswordCheckerImpl(String password) {
        setPassword(password);
    }

    /**
     * Gets the current password.
     *
     * @return the current password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the password to be validated.
     *
     * @param password the password to be set
     */
    public void setPassword(String password) {
        this.password = (password != null) ? password : "";
    }

    /**
     * Checks whether the current password meets the specified criteria.
     * The criteria are :
     * 1. More than 7 characters
     * 2. Not only in uppercase or lowercase
     * 3. have at least one number
     *
     * @return true if the password is considered valid, false otherwise
     */
    @Override
    public boolean isPasswordValid() {
        String lowerPassword = this.password.toLowerCase();
        String upperPassword = this.password.toUpperCase();
        if (this.password.length() < 7 || lowerPassword.equals(this.password) || upperPassword.equals(this.password)) {
            return false;
        }
        boolean isHereDigits = false;
        for (int i = 0; i < this.password.length(); i++) {
            char currentChar = this.password.charAt(i);
            if (Character.isDigit(currentChar)) {
                isHereDigits = true;
            }
        }
        return isHereDigits;
    }
}
