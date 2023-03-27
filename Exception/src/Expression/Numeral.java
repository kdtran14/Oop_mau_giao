package abc;

/**
 * Created by CCNE on 20/03/2023.
 */
public class Numeral extends Expression {
    private double value;

    /** . */
    public Numeral(double value) {
        this.value = value;
    }

    /** . */
    public Numeral() {
    }

    @Override
    public String toString() {
        return "";
    }

    @Override
    public double evaluate() {
        return 0;
    }
}
