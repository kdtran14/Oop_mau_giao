package Polymo_Abst;

public class Square extends Rectangle {
    /** Constructor. */
    public Square() {
    }

    /** Constructor. */
    public Square(double side) {
        super(side, side);
    }

    /** Constructor. */
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    /** Constructor. */
    public Square(Point topLeft, double side, String color, boolean filled) {
        super(topLeft, side, side, color, filled);
    }

    /** Constructor. */
    public double getSide() {
        return getLength();
    }

    /** Constructor. */
    public void setSide(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    @Override
    public void setWidth(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Square) {
            if (((Square) obj).topLeft.getPointX() >= this.topLeft.getPointX() - 0.001
                    && ((Square) obj).topLeft.getPointX() <= this.topLeft.getPointX() + 0.001
                    && ((Square) obj).topLeft.getPointY() >= this.topLeft.getPointY() - 0.001
                    && ((Square) obj).topLeft.getPointY() <= this.topLeft.getPointY() + 0.001) {
                if (((Square) obj).getSide() >= this.getSide() - 0.001
                        && ((Square) obj).getSide() <= this.getSide() + 0.001) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Square[topLeft=" + getTopLeft()
                + ",side=" + getSide()
                + ",color=" + getColor()
                + ",filled=" + isFilled() + "]";
    }
}
