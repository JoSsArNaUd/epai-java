package ch.epai.ict.m526.passwordchecker;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PasswordCheckerImplTest {
    private PasswordCheckerImpl passwordChecker;

    @BeforeEach
    public void setUp() {
        passwordChecker = new PasswordCheckerImpl("");
    }

    @Test
    public void testPasswordValid() {
        passwordChecker.setPassword("Abcdefg1");
        assertTrue(passwordChecker.isPasswordValid());
    }

    @Test
    public void testPasswordTooShort() {
        passwordChecker.setPassword("Short1");
        assertFalse(passwordChecker.isPasswordValid());
    }

    @Test
    public void testPasswordOnlyUppercase() {
        passwordChecker.setPassword("ONLYUPPERCASE1");
        assertFalse(passwordChecker.isPasswordValid());
    }

    @Test
    public void testPasswordOnlyLowercase() {
        passwordChecker.setPassword("onlylowercase1");
        assertFalse(passwordChecker.isPasswordValid());
    }

    @Test
    public void testPasswordWithoutDigits() {
        passwordChecker.setPassword("Abcdefgh");
        assertFalse(passwordChecker.isPasswordValid());
    }

    @Test
    public void testPasswordEmpty() {
        passwordChecker.setPassword("");
        assertFalse(passwordChecker.isPasswordValid());
    }

    @Test
    public void testPasswordNull() {
        passwordChecker.setPassword(null);
        assertFalse(passwordChecker.isPasswordValid());
    }

    @Test
    public void testPasswordMissing() {
        assertFalse(passwordChecker.isPasswordValid());
    }
}
