package ch.epai.ict.m404.stock;

import java.util.ArrayList;

public class StockManagerImpl implements StockManager {
    ArrayList<StockArticle> s = new ArrayList<StockArticle>();

    @Override
    public void generate() {
        s.add(new StockArticleImpl(2, "Fribourg", new ArticleImpl(12, "Chaise", 34)));
        s.add(new StockArticleImpl(40, "Lausanne", new ArticleImpl(56, "Livre", 18)));
        s.add(new StockArticleImpl(20, "Jura", new ArticleImpl(41, "Ordinateur HP", 899)));
    }

    @Override
    public StockArticle getArticleById(int id) {
        for (StockArticle article : s) {
            if (article.getArticle().getId() == id) {
                return article;
            }
        }
        ArrayList<String> tmp = new ArrayList<String>();
        tmp.add("0");
        tmp.add("");
        tmp.add("0");
        return new StockArticleImpl(20, "Jura", new ArticleImpl(0, "", 0));
    }

    @Override
    public void addArticle(StockArticle article) {
        boolean alreadyExist = false;
        for (StockArticle a : s) {
            if (a.getArticle().getId() == article.getArticle().getId()) {
                alreadyExist = true;
            }
        }
        if (!alreadyExist) {
            s.add(article);
        }
    }

    @Override
    public void deleteArticle(int id) {
        for (int i = 0; i < s.size(); i++) {
            if (s.get(i).getArticle().getId() == id) {
                s.remove(i);
            }
        }
    }
}
