package Circle_Cylinder;

public class Circle {
    protected static final double PI = 3.14;
    private double radius = 1;
    private String color = "red";

    /** Constructor .*/
    public Circle() {};

    /** Constructor with 1 arg .*/
    public Circle(double radius) {
        this.radius = radius;
    }

    /** Constructor with 2 args .*/
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    /** get radius.*/
    public double getRadius() {
        return this.radius;
    }

    /** Set radius .*/
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**  get color.*/
    public String getColor() {
        return this.color;
    }

    /**  set color.*/
    public void setColor(String color) {
        this.color = color;
    }

    /**  get area.*/
    public double getArea() {
        return this.radius*this.radius*PI;
    }

    /**  print circle.*/
    public String toString() {
        String s = "Circle[radius=" + getRadius() + ",color=" + getColor() + "]";
        return s;
    }
}
