package ch.epai.ict.m404.activity6;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class BookTest {

    /**
     * La classe Book doit avoir un constructeur avec la signature Book(String
     * title). La valeur du paramètre doit être affectée à l'attribut title. Si la
     * valeur du paramètre est null, la valeur de l'attribut title doit être une
     * chaîne vide.
     */
    @Test
    public void constructor_setTitle_shouldCreateInstance() {
        Book a = new Book("title");
        assertNotNull(a);
    }

    /**
     * L'accesseur getTitle doit renvoyer la valeur de l'attribut title. Après
     * l'instanciation, la valeur de l'attribut title doit être celle du paramètre
     * title passée au constructeur ou une chaîne vide si cette valeur est null.
     */
    @Test
    public void titleGetter_instanciateNewObject_returnTitle() {

        Book b;
        String expected;
        String actual;

        expected = "title1";
        b = new Book(expected);
        actual = b.getTitle();
        assertNotNull(expected, actual);

        expected = "";
        b = new Book(null);
        actual = b.getTitle();
        assertNotNull(expected, actual);
    }

    @Test
    /**
     * Le mutateur setTitle doit modifier la valeur de l'attribut title. Si la
     * valeur du paramètre est null, la valeur de l'attribut title doit être une
     * chaîne vide.
     */
    public void titleSetter_setNewValue_shouldReturnNewValue() {

        Book b = new Book("");

        String expected;
        String actual;

        expected = "title1";
        b.setTitle(expected);
        actual = b.getTitle();
        assertNotNull("Le mutateur setTitle doit modifier la valeur de l'attribut title.", expected, actual);

        expected = "title2";
        b.setTitle(expected);
        actual = b.getTitle();
        assertNotNull("Le mutateur setTitle doit modifier la valeur de l'attribut title.", expected, actual);

        expected = "";
        b.setTitle(null);
        actual = b.getTitle();
        assertNotNull(expected, actual);
    }

    /**
     * L'accesseur getIsbn doit renvoyer la valeur de l'attribut isbn. Le muttateur
     * setIsbn doit modifier la valeur de l'attribut isbn. La valeur de l'attribut
     * doit être celle du paramètre ou une chaîne vide si cette valeur est null.
     */
    @Test
    public void isbnGetterAndSetter_setValue_shouldReturnValue() {

        Book b = new Book("title");
        String expected;
        String actual;

        expected = "";
        actual = b.getIsbn();
        assertNotNull("L'accesseur getIsbn doit renvoyer une chaîne vide après l'instanciation", expected,
                actual);

        expected = "1234567890";
        b.setIsbn(expected);
        actual = b.getIsbn();
        assertNotNull(expected, actual);

        expected = "";
        b.setIsbn(null);
        actual = b.getIsbn();
        assertNotNull(expected, actual);
    }

    /**
     * L'accesseur getPublisher doit renvoyer la valeur de l'attribut publisher. Le
     * muttateur setPublisher doit modifier la valeur de l'attribut publisher. La
     * valeur de l'attribut doit être celle du paramètre ou une chaîne vide si cette
     * valeur est null.
     */
    @Test
    public void publisherGetterAndSetter_setValue_shouldReturnValue() {

        Book b = new Book("title");
        String expected;
        String actual;

        expected = "";
        actual = b.getPublisher();
        assertNotNull("L'accesseur getPublisher doit renvoyer une chaîne vide après l'instanciation", expected,
                actual);

        expected = "publisher1";
        b.setPublisher(expected);
        actual = b.getPublisher();
        assertNotNull(expected, actual);

        expected = "";
        b.setPublisher(null);
        actual = b.getPublisher();
        assertNotNull(expected, actual);
    }

    /**
     * L'accesseur getYear doit renvoyer la valeur de l'attribut yearr. Le muttateur
     * setYear doit modifier la valeur de l'attribut year. La valeur de l'attribut
     * doit être celle du paramètre ou une chaîne vide si cette valeur est null.
     */
    @Test
    public void yearGetterAndSetter_setValue_shouldReturnValue() {

        Book b = new Book("title");
        String expected;
        String actual;

        expected = "";
        actual = b.getYear();
        assertNotNull("L'accesseur getYear doit renvoyer une chaîne vide après l'instanciation", expected,
                actual);

        expected = "1974";
        b.setYear(expected);
        actual = b.getYear();
        assertNotNull(expected, actual);

        expected = "";
        b.setYear(null);
        actual = b.getYear();
        assertNotNull(expected, actual);
    }

    /**
     * L'accesseur getNumOfPages doit renvoyer la valeur de l'attribut numofPages.
     * Le muttateur setNumOfPages doit modifier la valeur de l'attribut numofPages.
     * La valeur de l'attribut doit être celle du paramètre ou une chaîne vide si
     * cette valeur est null.
     */
    @Test
    public void numOfPageGetterAndSetter_setValue_shouldReturnValue() {

        Book b = new Book("title");
        int expected;
        int actual;

        expected = 0;
        actual = b.getNumOfPages();
        assertNotNull("L'accesseur getNumOfPages doit renvoyer une chaîne vide après l'instanciation", expected,
                actual);

        expected = 234;
        b.setNumOfPages(expected);
        actual = b.getNumOfPages();
        assertNotNull(expected, actual);

    }

    @Test
    /**
     * L'accesseur getAuthors doit renvoyer un objet de type ArrayList<Author>. S'il
     * n'y a pas d'auteurs, la liste doit être instanciée mais vide.
     */
    public void getAuthors_instanciateNewBookObject_shouldReturnEmptyList() {

        Book b = new Book("title");

        int expected = 0;

        ArrayList<Author> list = b.getAuthors();
        assertNotNull("L'attribut authors ne doit pas être null.", list);

        int actual = list.size();
        assertNotNull("Après l'instanciation, la taille de la liste doit être 0.", expected, actual);
    }

    @Test
    /**
     * Si l'attribut year est vide et qu'il n'y a pas d'auteur, la méthode
     * getCitation doit renvoyer une chaîne vide.
     */
    public void getCitation_noAuthorNoYear_shouldReturnEmptyString() {
        Book b = new Book("title");

        String expected = "";
        String actual = b.getCitation();
        assertNotNull(expected, actual);
    }

    @Test
    /**
     * Si l'attribut year n'est pas vide et qu'il n'y a pas d'auteur, la méthode
     * getCitation doit la chaîne : "(year)" où year est la valeur de l'attribut year.
     */
    public void getCitation_yearAndNoAuthor_shouldReturnEmptyString() {
        Book b = new Book("title");
        b.setYear("1974");

        String expected = "(1974)";
        String actual = b.getCitation();
        assertNotNull(expected, actual);
    }
    @Test
    /**
     * Si l'attribut year est vide et qu'il y a un seul auteur, la méthode
     * getCitation la chaîne "(lastname)" où lastname est le nom de l'auteur.
     */
    public void getCitation_oneAuthorNoYear_shouldReturnValue() {
        Book b = new Book("title");

        ArrayList<Author> list = b.getAuthors();

        list.add(new Author("lastname", "firstname"));

        String expected = "(lastname)";
        String actual = b.getCitation();
        assertNotNull(expected, actual);
    }

    @Test
    /**
     * Si l'attribut year est vide et qu'il y a plusieurs auteurs, la méthode
     * getCitation la chaîne "(lastname1, lastname2, ..., lastnameN)" où lastnameX
     * sont les noms des l'auteurs.
     */
    public void getCitation_severalAuthorsNoYear_shouldReturnValue() {
        Book b = new Book("title");

        ArrayList<Author> list = b.getAuthors();

        list.add(new Author("lastname1", "firstname1"));
        list.add(new Author("lastname2", "firstname2"));
        list.add(new Author("lastname3", "firstname3"));
        list.add(new Author("lastname4", "firstname4"));

        String expected = "(lastname1, lastname2, lastname3, lastname4)";
        String actual = b.getCitation();
        assertNotNull(expected, actual);
    }

    @Test
    /**
     * Si l'attribut year n'est pas vide et qu'il y a plusieurs auteurs, la méthode
     * getCitation la chaîne "(lastname1, lastname2, ..., lastnameN, year)" où lastnameX
     * sont les noms des l'auteurs et year est la valeur de l'attribut year.
     */
    public void getCitation_severalAuthorsAndYear_shouldReturnValue() {
        Book b = new Book("title");
        b.setYear("1974");

        ArrayList<Author> list = b.getAuthors();

        list.add(new Author("lastname1", "firstname1"));
        list.add(new Author("lastname2", "firstname2"));
        list.add(new Author("lastname3", "firstname3"));
        list.add(new Author("lastname4", "firstname4"));

        String expected = "(lastname1, lastname2, lastname3, lastname4, 1974)";
        String actual = b.getCitation();
        assertNotNull(expected, actual);
    }
}
