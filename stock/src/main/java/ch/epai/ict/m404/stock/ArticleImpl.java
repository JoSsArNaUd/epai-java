package ch.epai.ict.m404.stock;

public class ArticleImpl implements Article {
    int id;
    String name;
    double price;

    public ArticleImpl(int id, String name, double price) {
        setId(id);
        setName(name);
        setPrice(price);
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = (id < 0) ? 0 : id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = StringUtils.emptyStringIfNull(name.trim());
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = (price < 0) ? 0 : price;
    }
}
