package ch.epai.ict.m526.passwordchecker;

import java.util.Scanner;  // Import the Scanner class

/**
 * The Cli class implements the View interface and provides a command-line interface (CLI)
 * for interacting with the user to input passwords and display validation results.
 */
public class Cli implements View {

    private Scanner s = new Scanner(System.in);

    /**
     * Prompts the user to input a password via the command line.
     *
     * @return the password entered by the user
     */
    @Override
    public String inputPassword() {
        System.out.printf("Entrez le mot de passe : ");
        String password = s.nextLine();
        return password;
    }

    /**
     * Displays a message indicating that the password is valid.
     */
    @Override
    public void isValid() {
        System.out.println("Le mot de passe est valide");
    }

    /**
     * Displays a message indicating that the password is invalid.
     */
    @Override
    public void isNotValid() {
        System.out.println("Le mot de passe est invalide");
    }
}
