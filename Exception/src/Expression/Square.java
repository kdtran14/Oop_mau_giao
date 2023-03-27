package abc;

/**
 * Created by CCNE on 20/03/2023.
 */
public class Square extends Expression {
    @Override
    public String toString() {
        return "";
    }

    @Override
    public double evaluate() {
        return 0;
    }

    private Expression expression;

    /** . */
    public Square(Expression expression) {
        this.expression = expression;
    }
}
