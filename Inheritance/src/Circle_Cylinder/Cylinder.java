package Circle_Cylinder;

public class Cylinder extends Circle {
    private double height = 1.0;

    /** Constructor. */
    public Cylinder() {};

    /** Constructor with r. */
    public Cylinder(double radius) {
        setRadius(radius);
    }

    /** Constructor with r anh h. */
    public Cylinder(double radius, double height) {
        setRadius(radius);
        this.height = height;
    }

    /** Constructor with r, h and c. */
    public Cylinder(double radius, double height, String color) {
        setRadius(radius);
        this.height = height;
        setColor(color);
    }

    /** get h.*/
    public double getHeight() {
        return this.height;
    }

    /** set h. */
    public void  setHeight(double height) {
        this.height = height;
    }

    /** get volume. */
    public double getVolume(double radius, double height) {
        double v = radius * radius * PI * height;
        return v;
    }

    @Override
    public String toString() {
        String s;
        s = "Cylinder[" + super.toString() + ",height=" + getHeight() + "]";
        return s;
    }

    @Override
    public double getArea() {
        return 2 * super.getArea();
    }
}
