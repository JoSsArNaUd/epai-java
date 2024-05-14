package ch.epai.ict.m404.stock;

public interface Article {
    int getId();
    String getName();
    double getPrice();

    void setId(int id);
    void setName(String name);
    void setPrice(double price);
}
