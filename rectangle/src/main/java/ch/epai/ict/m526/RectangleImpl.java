package ch.epai.ict.m526;

public class RectangleImpl implements Rectangle {
    private double length;
    private double width;

    public RectangleImpl(double length, double width) {
        setLength(length);
        setWidth(width);
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public boolean isASquare() {
        return length == width;
    }

    @Override
    public double perimeter() {
        return (2 * length) + (2 * width);
    }

    @Override
    public String toString() {
        String base = "Longueur : " + length + " - Largeur : " + width + " - Périmètre : " + perimeter() + " - Aire : " + area() + " - ";
        if (isASquare()) {
            return base + "Il s'agit d'un carré";
        } else {
            return base + "Il ne s'agit pas d'un carré";
        }
    }

    public double getLength() {
        return length;
    }

    public void setLength(double longueur) {
        this.length = longueur;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double largeur) {
        this.width = largeur;
    }

}