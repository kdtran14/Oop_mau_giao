package Polymo_Abst;

public abstract class Shape {
    protected String color;
    protected boolean filled;

    /** Constructor. */
    public Shape() {
    }

    /** Constructor. */
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    /** Constructor. */
    public String getColor() {
        return this.color;
    }

    /** Constructor. */
    public void setColor(String color) {
        this.color = color;
    }

    /** Constructor. */
    public boolean isFilled() {
        return this.filled;
    }

    /** Constructor. */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /** Constructor. */
    public abstract double getArea();

    /** Constructor. */
    public abstract double getPerimeter();

    /** Constructor. */
    public abstract String toString();
}
