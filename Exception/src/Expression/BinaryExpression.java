package abc;

/**
 * Created by CCNE on 20/03/2023.
 */
public class BinaryExpression extends Expression {
    @Override
    public String toString() {
        return "";
    }

    @Override
    public double evaluate() {
        return 0;
    }

    protected Expression left;
    protected Expression right;

    /** . */
    public BinaryExpression(Expression left, Expression  right) {
        this.left = left;
        this.right = right;
    }
}
