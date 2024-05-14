package ch.epai.ict.m404.activity6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AuthorTest {

    /**
     * La classe Book doit avoir un constructeur avec la signature Book(String
     * title). La valeur du paramètre doit être affectée à l'attribut title. Si la
     * valeur du paramètre est null, la valeur de l'attribut title doit être une
     * chaîne vide.
     */
    @Test
    public void constructor_setFirstname_shouldCreateInstance() {
        Author a = new Author();
        a.setLastname("lastname");
        assertNotNull(a);
    }

    /**
     * La classe Book doit avoir un constructeur avec la signature Book(String
     * title). La valeur du paramètre doit être affectée à l'attribut title. Si la
     * valeur du paramètre est null, la valeur de l'attribut title doit être une
     * chaîne vide.
     */
    @Test
    public void constructor_setFirstnameAndLastname_shouldCreateInstance() {
        Author a = new Author();
        a.setLastname("firstname");
        a.setFirstname("firstname");
        assertNotNull(a);
    }

    /**
     * L'accesseur getLastname doit renvoyer la valeur de l'attribut lastname. Après
     * l'instanciation, la valeur de l'attribut lastname doit être celle du
     * paramètre lastname passée au constructeur ou une chaîne vide si cette valeur
     * est null.
     */
    @Test
    public void lastnameGetter_instanciateNewObject_returnLastname() {

        Author a;
        String expected;
        String actual;

        expected = "lastname1";
        a = new Author(expected);
        actual = a.getLastname();
        assertEquals(expected, actual);

        expected = "";
        a = new Author(null);
        actual = a.getLastname();
        assertEquals(
                expected, actual);

        expected = "lastname2";
        a = new Author(expected, "");
        actual = a.getLastname();
        assertEquals(
                expected, actual);

        expected = "";
        a = new Author(null, "");
        actual = a.getLastname();
        assertEquals(
                expected, actual);
    }

    @Test
    /**
     * Le mutateur setLastname doit modifier la valeur de l'attribut lastname. Si la
     * valeur du paramètre est null, la valeur de l'attribut lastname doit être une
     * chaîne vide.
     */
    public void lastnameSetter_setNewValue_shouldReturnNewValue() {

        Author a = new Author("");

        String expected;
        String actual;

        expected = "lastname1";
        a.setLastname(expected);
        actual = a.getLastname();
        assertEquals(expected,
                actual);

        expected = "lastname2";
        a.setLastname(expected);
        actual = a.getLastname();
        assertEquals(expected,
                actual);

        expected = "";
        a.setLastname(null);
        actual = a.getLastname();
        assertEquals(
                expected, actual);
    }

    /**
     * L'accesseur getFirstname doit renvoyer la valeur de l'attribut firstname.
     * Après l'instanciation, la valeur de l'attribut firstname doit être celle du
     * paramètre firstname passée au constructeur ou une chaîne vide si cette valeur
     * est null.
     */
    @Test
    public void firstnameGetter_instanciateNewObject_shouldReturnFirstname() {

        Author a;
        String expected;
        String actual;

        expected = "";
        a = new Author("lastname");
        actual = a.getFirstname();
        assertEquals(expected,
                actual);

        expected = "firstname";
        a = new Author("lastname", expected);
        actual = a.getFirstname();
        assertEquals(
                expected, actual);

        expected = "";
        a = new Author("lastname", null);
        actual = a.getFirstname();
        assertEquals(
                expected, actual);
    }

    @Test
    /**
     * Le mutateur setFirstname doit modifier la valeur de l'attribut firstname.
     * Sila valeur du paramètre est null, la valeur de l'attribut firstname doit
     * être une chaîne vide.
     */
    public void firstnameSetter_setNewValue_shouldReturnNewValue() {

        Author a = new Author("");

        String expected;
        String actual;

        expected = "firstname1";
        a.setFirstname(expected);
        actual = a.getFirstname();
        assertEquals(expected,
                actual);

        expected = "firstname2";
        a.setFirstname(expected);
        actual = a.getFirstname();
        assertEquals(expected,
                actual);

        expected = "";
        a.setLastname(null);
        actual = a.getLastname();
        assertEquals(
                expected, actual);
    }

    @Test
    /**
     * Si l'attribut firstname est une chaîne vide, la méthode getFullName doit
     * renvoyer la valeur de l'attribut lastname.
     */
    public void getFullName_setLastname_shouldReturnLastname() {

        Author a = new Author("lastname1");

        String expected;
        String actual;

        expected = "lastname1";
        actual = a.getFullName();
        assertEquals(
                expected, actual);

        expected = "lastname2";
        a.setLastname(expected);
        actual = a.getFullName();
        assertEquals(expected,
                actual);
    }

    @Test
    /**
     * Si l'attribut lastname est une chaîne vide, la méthode getFullName doit
     * renvoyer la valeur de l'attribut firstname.
     */
    public void getFullName_setFirstname_shouldReturnLastname() {

        Author a = new Author("");

        String expected;
        String actual;

        expected = "firstname1";
        a.setFirstname(expected);
        actual = a.getFullName();
        assertEquals(
                expected, actual);

        expected = "firstname2";
        a.setFirstname(expected);
        actual = a.getFullName();
        assertEquals(
                expected, actual);
    }

    @Test
    /**
     * Si l'attribut firstname et l'attribut lastname ont une valeur, la méthode
     * getFullName doit renvoyer une chaîne composée du nom suivi d'une virgule et
     * de l'initiale du prénom.
     */
    public void getFullName_setLastnameAndFirstname_shouldReturnLastname() {

        Author a = new Author("lastname", "firstname");

        String expected = "lastname, f.";
        String actual = a.getFullName();

        assertEquals(
                expected, actual);
    }
}
