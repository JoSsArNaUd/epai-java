package ch.epai.ict.m404.stock;



public interface StockArticle {
    public int getQuantity();

    public void setQuantity(int quantity);

    public Article getArticle();

    public void setArticle(Article article);

    public String getLocation();

    public void setLocation(String location);
}
