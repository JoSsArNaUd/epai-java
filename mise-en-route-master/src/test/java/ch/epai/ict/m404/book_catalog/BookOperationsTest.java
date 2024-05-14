package ch.epai.ict.m404.book_catalog;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BookOperationsTest {

    /**
     * La méthode getId doit renvoyer la valeur de la variable membre id.
     */
    @Test
    public void getId_ReturnId() {
        Book b = new Book(3, "The Java Language Specification");

        Long actual = BookOperations.getId(b);
        Long expected = 3L;

        assertEquals(
            expected, actual,
            "La méthode getTitle ne renvoie pas la bonne valeur.");
    }
    
    /**
     * La méthode getTitle doit renvoyer la valeur de la variable membre title.
     */
    @Test
    public void getTitle_ReturnTitle() {
        Book b = new Book(3, "The Java Language Specification");

        String actual = BookOperations.getTitle(b);
        String expected = "The Java Language Specification";

        assertEquals(
            expected, actual,
            "La méthode getTitle ne renvoie pas la bonne valeur.");
    }

    /**
     * La méthode getNumOfPages doit renvoyer la valeur de la variable membre
     * numOfPages.
     */
    @Test
    public void getNumOfPages_ReturnValue() {
        Book b = new Book(3, "The Java Language Specification");

        int actual;
        int expected;

        b.numOfPages = 792;
        actual = BookOperations.getNumOfPages(b);
        expected = 792;

        assertEquals(expected, actual);

        b.numOfPages = 798;
        actual = BookOperations.getNumOfPages(b);
        expected = 798;

        assertEquals(expected, actual);
    }

    /**
     * La méthode setNumOfPages doit affecter la valeur du paramètre à la variable
     * membre numOfPages.
     */
    @Test
    public void setNumOfPages_SetValue() {
        Book b = new Book(3, "The Java Language Specification");

        BookOperations.setNumOfPages(b, 798);
        int actual = b.numOfPages;
        int expected = 798;

        assertEquals(expected, actual);
    }

    /**
     * La méthode getYear doit renvoyer la valeur de la variable membre year.
     */
    @Test
    public void getYear_ReturnYear() {
        Book b = new Book(3, "The Java Language Specification");
        String actual;
        String expected;

        b.year = "2014";
        actual = BookOperations.getYear(b);
        expected = "2014";

        assertEquals(expected, actual);

        b.year = "2015";
        actual = BookOperations.getYear(b);
        expected = "2015";

        assertEquals(expected, actual);
    }

    /**
     * La méthode setYear doit affecter la valeur du paramètre à la variable
     * membre year.
     */
    @Test
    public void setYear_NonNullValues_SetValue() {

        Book b = new Book(3, "The Java Language Specification");

        BookOperations.setYear(b, "2014");
        String actual = b.year;
        String expected = "2014";

        assertEquals(expected, actual);
    }

    /**
     * La méthode setYear doit affecter une chaîne vide à la variable membre year
     * si le paramètre a la valeur null.
     */
    @Test
    public void setYear_Null_SetEmptyString() {
        Book b = new Book(3, "The Java Language Specification");

        BookOperations.setYear(b, null);
        String actual = b.year;
        String expected = "";

        assertEquals(expected, actual);
    }

    /**
     * La méthode getPublisher doit renvoyer la valeur de la variable membre
     * publisher.
     */
    @Test
    public void getPublisher_ReturnPublisher() {
        Book b = new Book(3, "The Java Language Specification");

        String actual;
        String expected;

        b.publisher = "Addison-Wesley Professional";
        actual = BookOperations.getPublisher(b);
        expected = "Addison-Wesley Professional";

        assertEquals(expected, actual);

        b.publisher = "Addison-Wesley";
        actual = BookOperations.getPublisher(b);
        expected = "Addison-Wesley";

        assertEquals(expected, actual);
    }

    /**
     * La méthode setPublisher doit affecter la valeur du paramètre à la variable
     * membre publisher.
     */
    @Test
    public void setPublisher_NonNullValues_SetValue() {
        Book b = new Book(3, "The Java Language Specification");

        BookOperations.setPublisher(b, "Addison-Wesley Professional");
        String actual = b.publisher;
        String expected = "Addison-Wesley Professional";

        assertEquals(expected, actual);
    }

    /**
     * La méthode setPublisher doit affecter une chaîne vide à la variable membre
     * publisher si le paramètre a la valeur null.
     */
    @Test
    public void setPublisher_Null_SetEmptyString() {
        Book b = new Book(3, "The Java Language Specification");

        BookOperations.setPublisher(b, null);
        String actual = b.publisher;
        String expected = "";

        assertEquals(expected, actual);
    }

    /**
     * La méthode getIsbn doit renvoyer la valeur de la variable membre isbn.
     */
    @Test
    public void getIsbn_ReturnIsbn() {
        Book b = new Book(3, "The Java Language Specification");

        String actual;
        String expected;

        b.isbn = "978-0133900699";
        actual = BookOperations.getIsbn(b);
        expected = "978-0133900699";

        assertEquals(expected, actual);

        b.isbn = "978-0133900698";
        actual = BookOperations.getIsbn(b);
        expected = "978-0133900698";

        assertEquals(expected, actual);
    }

    /**
     * La méthode setIsbn doit affecter la valeur du paramètre à la variable
     * membre isbn.
     */
    @Test
    public void setIsbn_NonNullValues_SetValue() {
        Book b = new Book(3, "The Java Language Specification");

        BookOperations.setIsbn(b, "978-0133900699");
        String actual = b.isbn;
        String expected = "978-0133900699";

        assertEquals(expected, actual);
    }

    /**
     * La méthode setIsbn doit affecter une chaîne vide à la variable membre isbn
     * si le paramètre a la valeur null.
     */
    @Test
    public void setIsbn_Null_SetEmptyString() {
        Book b = new Book(3, "The Java Language Specification");

        BookOperations.setIsbn(b, null);
        String actual = b.isbn;
        String expected = "";

        assertEquals(expected, actual);
    }

    /**
     * La méthode getAuthor doit renvoyer l'initiale du prénom suivi du nom.
     */
    @Test
    public void getAuthor_FirstnameAndLastname_ReturnFirstnameInitialAndLastname() {
        Book b = new Book(3, "The Java Language Specification");

        b.authorFirstname = "James";
        b.authorLastname = "Gosling";

        String actual = BookOperations.getAuthor(b);
        String expected = "J. Gosling";

        assertEquals(
            expected, actual,
            "La méthode getAuthor ne renvoie pas la bonne valeur.");
    }

    /**
     * La méthode getAuthor doit renvoyer uniquement le nom de l'autheur si le
     * prénom est vide.
     */
    @Test
    public void getAuthor_NoFirstname_ReturnLastname() {
        Book b = new Book(3, "The Java Language Specification");

        b.authorLastname = "Gosling";
        String actual = BookOperations.getAuthor(b);
        String expected = "Gosling";

        assertEquals(
            expected, actual,
            "La méthode getAuthor ne renvoie pas la bonne valeur.");
    }

    /**
     * La méthode setAuthor doit affecter la valeur de chaque paramètre à la
     * variable membre correspondante.
     */
    @Test
    public void setAuthor_NonNullValues_SetValue() {
        Book b = new Book(3, "The Java Language Specification");

        BookOperations.setAuthor(b, "James", "Gosling");

        assertEquals(
            "James", b.authorFirstname,
            "La variable membre authorFirstname n'a pas la bonne valeur.");

        assertEquals(
            "Gosling", b.authorLastname,
            "La variable membre authorLastname n'a pas la bonne valeur.");
    }

    /**
     * La méthode setAuthor doit affecter la valeur de chaque paramètre à la
     * variable membre correspondante. Si un paramètre a la valeur null, la
     * méthode doit affecter une chaîne vide à la variable membre correspondante.
     */
    @Test
    public void setAuthor_FirstnameNull_SetFirstNameEmptyString() {
        Book b = new Book(3, "The Java Language Specification");

        BookOperations.setAuthor(b, null, "Gosling");

        assertEquals(
            "", b.authorFirstname,
            "La variable membre authorFirstname n'a pas la bonne valeur.");

        assertEquals(
            "Gosling", b.authorLastname,
            "La variable membre authorLastname n'a pas la bonne valeur.");
    }

    /**
     * Si un paramètre a la valeur null, la méthode setAuthor doit affecter une chaîne vide
     * à la variable membre correspondante.
     */
    @Test
    public void setAuthor_Null_SetEmptyString() {
        Book b = new Book(3, "The Java Language Specification");

        BookOperations.setAuthor(b, null, null);

        assertEquals(
            "", b.authorFirstname,
            "Si la valeur du paramètre pr est null, la valeur de authorFirstname doit être une chaîne vide.");

        assertEquals(
            "", b.authorLastname,
            "Si la valeur du paramètre nom est null, la valeur de authorFirstname doit être une chaîne vide.");
    }
}

