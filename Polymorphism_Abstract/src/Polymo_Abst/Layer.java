package Polymo_Abst;

public class Layer {
    private java.util.List<Shape> shapes = new java.util.ArrayList<>();

    /** Constructor. */
    public void addShape(Shape s) {
        shapes.add(s);
    }

    /** Constructor. */
    public void removeCircles() {
        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) instanceof Circle) {
                shapes.remove(i);
            }
        }
    }

    /** Constructor. */
    public String getInfo() {
        String s = new String();
        for (int i  = 0; i < shapes.size(); i++) {
            s += shapes.get(i).toString() + "\n";
        };
        return "Layer of crazy shapes:\n" + s;
    }

    /** Constructor. */
    public void removeDuplicates() {
        for (int i = 0; i < shapes.size(); i++) {
            for (int j = i + 1; j < shapes.size(); j++) {
                if (shapes.get(j).equals(shapes.get(i))) {
                    shapes.remove(j);
                }
            }
        }
    }

    public static void main(String[] args) {
        Point p = new Point(10,5);
        Circle c = new Circle(p, 8, "RED", true);
        Rectangle r = new Rectangle(p, 8, 6, "RED", true);
        Rectangle r2 = new Rectangle(p, 8, 6, "BLUE", true);
        Square s = new Square(p, 8.0, "RED", true);

        Layer l = new Layer();
        l.addShape(c);
        l.addShape(r);
        l.addShape(r2);
        l.addShape(s);

        System.out.println(l.getInfo());
        l.removeDuplicates();
        System.out.println(l.getInfo());
    }
}
