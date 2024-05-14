package ch.epai.ict.m404.book_catalog;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BookTest {

    /**
     * Le constructeur de la classe Book affecte la valeur passée en paramètre à
     * la variable membre title et initialise toutes les autres variables membres
     * de type chaîne avec une chaîne vide.
     */
    @Test
    public void constructor_GivenIdAndValue_AllValuesShouldBeInitialized() {
        Book b;
        long id;
        String title;

        id = 1;
        title = "La programmation orientée objet";
        b = new Book(id, title);

        assertEquals(
            id, b.id,
            "La variable membre id devrait être initialisée avec la valeur du paramètre id.");

        assertEquals(
            title, b.title,
            "La variable membre title devrait être initialisée avec la valeur du paramète title.");

        id = 2;
        title = "Architecture de l'ordinateur";
        b = new Book(id, title);

        assertEquals(
            id, b.id,
            "La variable membre id devrait être initialisée avec la valeur du paramètre id.");

        assertEquals(
            title, b.title,
            "La variable membre title devrait être initialisée avec la valeur du paramète title.");

        // Prénom de l'auteur
        assertEquals(
            "", b.authorFirstname,
            "La variable membre authorFirstname devrait être initialisée avec une chaîne vide.");

        // Nom de famille de l'auteur
        assertEquals(
            "", b.authorLastname,
            "La variable membre authorLastname devrait être initialisée avec une chaîne vide.");

        // ISBN (International Standard Book Number)
        assertEquals(
            "", b.isbn,
            "La variable membre isbn devrait être initialisée avec une chaîne vide.");

        // Nombre de page du livre
        assertEquals(
            0, b.numOfPages,
            "La variable membre numOfPages devrait être initialisée avec la valeur 0.");

        // Nom de l'éditeur
        assertEquals(
            "", b.publisher,
            "La variable membre publisher devrait être initialisée avec une chaîne vide.");

        // Année de publication
        assertEquals(
            "", b.year,
            "La variable membre year devrait être initialisée avec une chaîne vide.");
    }
}
