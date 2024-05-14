/**
 * The PasswordChecker interface defines a contract for classes that implement password validation logic.
 * Implementations of this interface should provide a method to check if a password meets certain criteria.
 */
package ch.epai.ict.m526.passwordchecker;

public interface PasswordChecker {

    /**
     * Checks whether a password is valid according to specific criteria.
     *
     * @return true if the password is considered valid, false otherwise.
     */
    public boolean isPasswordValid();
}
