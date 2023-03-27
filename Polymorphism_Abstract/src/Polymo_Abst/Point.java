package Polymo_Abst;

public class Point {
    private double pointX;
    private double pointY;

    /** Constructor. */
    public Point(double x, double y) {
        pointX = x;
        pointY = y;
    }

    /** Constructor. */
    public double getPointX() {
        return pointX;
    }

    /** Constructor. */
    public void setPointX(double x) {
        pointX = x;
    }

    /** Constructor. */
    public double getPointY() {
        return pointY;
    }

    /** Constructor. */
    public void setPointY(double y) {
        pointY = y;
    }

    /** Constructor. */
    public double distance(Point a) {
        double d = Math.sqrt(Math.pow(a.pointX - this.pointX, 2)
                + Math.pow(a.pointY - this.pointY, 2));
        return Math.round(d * 10) / 10.0;
    }

    /** Constructor. */
    public boolean equals(Object obj) {
        if (obj instanceof Point) {
            if (((Point) obj).pointX >= this.pointX - 0.001
                    && ((Point) obj).pointX <= this.pointX + 0.001
                    && ((Point) obj).pointY >= this.pointY - 0.001
                    && ((Point) obj).pointY <= this.pointY + 0.001) {
                return true;
            }
        }
        return false;
    }

    /** HashCode. */
    public int hashCode() {
        return super.hashCode();
    }

    /** Constructor. */
    public String toString() {
        return "(" + getPointX() + "," + getPointY() + ")";
    }
}
