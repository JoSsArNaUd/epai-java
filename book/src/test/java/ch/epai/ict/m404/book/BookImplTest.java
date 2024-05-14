package ch.epai.ict.m404.book;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BookImplTest {

    @Test
    public void BookImplTitleTest() {
        String expected = "Programmer en C";
        Book book = new BookImpl(expected, "Josselin Arnaud", 29.95);
        String actual = book.getTitle();
        assertEquals(expected, actual);
    }

    @Test
    public void BookImplAuthorTest() {
        String expected = "Josselin Arnaud";
        Book book = new BookImpl("Programmer en C", expected, 29.95);
        String actual = book.getAuthor();
        assertEquals(expected, actual);
    }

    @Test
    public void BookImplPriceTest() {
        double expected = 29.95;
        Book book = new BookImpl("Programmer", "Josselin Arnaud", expected);
        double actual = book.getPrice();
        assertEquals(expected, actual);
    }

    @Test
    public void BookImplTitleSetterTest () {
        String expected = "Programmer en C";
        String falseTitle = "Programmer en Java";
        Book book = new BookImpl(falseTitle, "Josselin Arnaud", 29.95);
        book.setTitle(expected);
        String actual = book.getTitle();
        assertEquals(expected, actual);
    }

    @Test
    public void BookImplAuthorSetterTest () {
        String expected = "Josselin Arnaud";
        String falseAuthor = "Chantal Gilliand";
        Book book = new BookImpl("Programmer en C",falseAuthor, 29.95);
        book.setAuthor(expected);
        String actual = book.getAuthor();
        assertEquals(expected, actual);
    }

    @Test
    public void BookImplPriceSetterTest () {
        double expected = 29.99;
        double falsePrice = 30.00;
        Book book = new BookImpl("Programmer en C", "Chantal Gilliand", falsePrice);
        book.setPrice(expected);
        double actual = book.getPrice();
        assertEquals(expected, actual);
    }

    @Test
    public void BookImplPriceSetterTestNull () {
        double expected = 0.00;
        double nullPrice = (Double) null;
        Book book = new BookImpl("Programmer en C", "Chantal Gilliand", (Double) null);
        double actual = book.getPrice();
        assertEquals(expected, actual);
    }
}
