package ch.epai.ict.m404.book;

public class BookImpl implements Book {
    private String title;
    private String author;
    private Double price;

    public BookImpl(String title, String author, double price) {
        setTitle(title);
        setAuthor(author);
        setPrice(price);
    }

    @Override
    public void setTitle(String title) {
        this.title = (title != null) ? title.trim() : "";
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void setAuthor(String author) {
        this.author = (author != null) ? author.trim() : "";
    }

    @Override
    public String getAuthor() {
        return author;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        if (price == (double)price) return price;
        return 0.0;
    }

    @Override
    public String toString() {
        return "Le titre est \"" + this.title + "\"\nL'auteur est " + this.author + "\nLe prix est de " + this.price + " francs\nTitre : " + this.title + ", Auteur : " + this.author + ", Prix : "+ this.price;
    }
}
