package ch.epai.ict.m404.stock;


public class StockArticleImpl implements StockArticle {
    private int quantity;
    private Article article;
    private String location;

    public StockArticleImpl(int quantity, String location, Article article) {
        setQuantity(quantity);
        setLocation(location);
        setArticle(article);
    }

    @Override
    public int getQuantity() {
        return quantity;
    }

    @Override
    public void setQuantity(int quantity) {
        this.quantity = (quantity < 0) ? 0 : quantity;
    }

    @Override
    public Article getArticle() {
        return article;
    }

    @Override
    public void setArticle(Article article) {
        this.article = article;
    }

    @Override
    public String getLocation() {
        return location;
    }

    @Override
    public void setLocation(String location) {
        this.location = StringUtils.emptyStringIfNull(location.trim());
    }

    @Override
    public String toString() {
        return "quantité : " + this.quantity + "\nEntrepot : " + location +"\nIdentifiant de l'article : " + article.getId() + "\nNom de l'article : " + article.getName() + "\nPrix de l'article : " + article.getPrice();
    }

}
