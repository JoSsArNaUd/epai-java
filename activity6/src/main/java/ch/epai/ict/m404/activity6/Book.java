package ch.epai.ict.m404.activity6;

public class Book {
    private String title;
    
    public Book(String title) {
        setTitle(title);
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle(){
        return title;
    }
}
