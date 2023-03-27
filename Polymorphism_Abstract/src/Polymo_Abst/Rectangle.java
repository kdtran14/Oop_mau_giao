package Polymo_Abst;

public class Rectangle extends Shape {
    protected double width;
    protected double length;
    protected Point topLeft;

    /** Constructor. */
    public Rectangle() {
    }

    /** Constructor. */
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    /** Constructor. */
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    /** Constructor. */
    public Rectangle(Point topLeft, double width, double length, String color, boolean filled) {
        super(color, filled);
        this.topLeft = topLeft;
        this.width = width;
        this.length = length;
    }

    /** Constructor. */
    public Point getTopLeft() {
        return topLeft;
    }

    /** Constructor. */
    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    /** Constructor. */
    public double getWidth() {
        return width;
    }

    /** Constructor. */
    public void setWidth(double width) {
        this.width = width;
    }

    /** Constructor. */
    public double getLength() {
        return length;
    }

    /** Constructor. */
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Rectangle) {
            if (((Rectangle) obj).topLeft.getPointX() >= this.topLeft.getPointX() - 0.001
                    && ((Rectangle) obj).topLeft.getPointX() <= this.topLeft.getPointX() + 0.001
                    && ((Rectangle) obj).topLeft.getPointY() >= this.topLeft.getPointY() - 0.001
                    && ((Rectangle) obj).topLeft.getPointY() <= this.topLeft.getPointY() + 0.001) {
                if (((Rectangle) obj).length >= this.length - 0.001
                        && ((Rectangle) obj).length <= this.length + 0.001
                        && ((Rectangle) obj).width >= this.width - 0.001
                        && ((Rectangle) obj).width <= this.width + 0.001) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public String toString() {
        return "Rectangle[topLeft=" + getTopLeft()
                + ",width=" + getWidth()
                + ",length=" + getLength()
                + ",color=" + getColor()
                + ",filled=" + isFilled() + "]";
    }
}
