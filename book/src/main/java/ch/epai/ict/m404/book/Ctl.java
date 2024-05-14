package ch.epai.ict.m404.book;

public class Ctl {
    private View view;

    public Ctl() {
        this.view = new Cli();
    }

    public void start() {
        int x = 1;
        while (true) {
            System.out.println("Livre " + x);
            view.insertBook();
            view.displayBook();
            x += 1;
        }
    }
}
