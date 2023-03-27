package Polymo_Abst;

public class Circle extends Shape {
    protected double radius;
    protected Point center;

    /** Constructor. */
    public Circle() {
    }

    /** Constructor. */
    public Circle(double radius) {
        this.radius = radius;
    }

    /** Constructor. */
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    /** Constructor. */
    public Circle(Point center, double radius, String color, boolean filled) {
        super(color, filled);
        this.center = center;
        this.radius = radius;
    }

    /** Constructor. */
    public Point getCenter() {
        return center;
    }

    /** Constructor. */
    public void setCenter(Point center) {
        this.center = center;
    }

    /** Constructor. */
    public double getRadius() {
        return radius;
    }

    /** Constructor. */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Circle) {
            if (((Circle) obj).center.getPointX() >= this.center.getPointX() - 0.001
                    && ((Circle) obj).center.getPointX() <= this.center.getPointX() + 0.001
                    && ((Circle) obj).center.getPointY() >= this.center.getPointY() - 0.001
                    && ((Circle) obj).center.getPointY() <= this.center.getPointY() + 0.001) {
                if (((Circle) obj).radius >= this.radius - 0.001
                        && ((Circle) obj).radius <= this.radius + 0.001) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle[" + "center=" + getCenter()
                + ",radius=" + getRadius()
                + ",color=" + getColor()
                + ",filled=" + isFilled() + "]";
    }
}
