package ch.epai.ict.m404.book;

import java.util.Locale;
import java.util.Scanner;

public class Cli implements View {
    private Book book;

    @Override
    public void insertBook() {
        Scanner s = new Scanner(System.in).useLocale(Locale.US);
            System.out.printf("Donner le titre : ");
            String title = s.nextLine();
            System.out.printf("Donner l'auteur : ");
            String author = s.nextLine();
            System.out.printf("Donner le prix : ");
            double price = s.nextDouble();
            book = new BookImpl(title, author, price);
    }

    @Override
    public void displayBook() {
        System.out.println(book.toString());
    }
}
