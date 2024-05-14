package ch.epai.ict.m404.stock;

public interface StockManager {

    public void generate();

    public StockArticle getArticleById(int id);

    public void addArticle(StockArticle article);

    public void deleteArticle(int id);
}
