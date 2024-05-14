package ch.epai.ict.m404.book_catalog;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Représente l'application.
 *
 */
public class App {
    public static final String DB_URL = "jdbc:mariadb://localhost/book_catalog";
    public static final String DB_USER = "root";
    public static final String DB_PASSWORD = "epai123";

    /**
     * Point d'entrée du programme (procédure principale).
     *
     * @param args paramètres de la ligne de commande
     * @throws SQLException
     */
    public static void main(String[] args) throws SQLException {
        String selectAuthorQuery = "SELECT * FROM simple_book;";

        Connection connection = DriverManager.getConnection(
            App.DB_URL, 
            App.DB_USER,
            App.DB_PASSWORD);

        Statement statement = connection.createStatement();
        ResultSet recordSet = statement.executeQuery(selectAuthorQuery);
    
        while (recordSet.next()) {
            printBook(
                    recordSet.getLong("id"), 
                    recordSet.getString("title"), 
                    recordSet.getInt("number_of_pages"),
                    recordSet.getString("publication_year"),
                    recordSet.getString("publisher_name"),
                    recordSet.getString("isbn"),
                    recordSet.getString("author_firstname"),
                    recordSet.getString("author_lastname"));
        }
    }

    public static void printBook(long id, String title, long numberOfPages, String year, String publisher, String isbn, String authorFirstName, String authorLastName) {
        System.out.println("-------------------------------");

        String authorName;
        if (authorFirstName != null && authorFirstName.length() > 0) {
            authorName = authorFirstName.substring(0, 1) + ". " + authorLastName;
        } else {
            authorName = authorLastName;
        }

        System.out.printf(
            "ID:        %d%nTitle:     %s%nYear:      %s%nPublisher: %s%nISBN:      %s%nAuthor:    %s%nNumber of pages: %d%n", 
            id, title, year, publisher, isbn, authorName, numberOfPages);
    }
}
