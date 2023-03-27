package Fraction;
public class Solution {

    private int numerator;
    private int denominator = 1;

    /** Please pass me. */
    public int getNumerator() {
        return numerator;
    }

    /** Please pass me. */
    public void setNumerator(int tu) {
        this.numerator = tu;
    }

    /** Please pass me. */
    public int getDenominator() {
        return denominator;
    }

    /** Please pass me. */
    public void setDenominator(int mau) {
        if (mau == 0) {
            denominator = 1;
        } else {
            denominator = mau;
        }
//        this.denominator = mau;
    }

    /** Please pass me. */
    public Solution(int tu, int mau) {
        this.numerator = tu;
        if (mau == 0) {
            denominator = 1;
        } else {
            denominator = mau;
        }
    }

    /** Please pass me. */
    public int gcd(int a, int b) {
        int gcd = 1;
        if (a == 0 || b == 0 || Integer.MAX_VALUE - a == 0 || Integer.MAX_VALUE - b == 0) {
            return gcd;
        }
        if (a < 0) {
            a = -a;
        }
        if (b < 0) {
            b = -b;
        }
        while (a != b) {
            if (a % b == 0) {
                return b;
            }
            int c = a;
            a = b;
            b = c % b;
        }
        return b;
    }

    /** Please pass me. */
    public Solution reduce() {
        int gcd = gcd(this.numerator, this.denominator);
        this.denominator = this.denominator / gcd;
        this.numerator = this.numerator / gcd;
        return new Solution(this.numerator, this.denominator);
    }

    /** Please pass me. */
    public Solution add(Solution x) {
        this.numerator = this.numerator * x.denominator + this.denominator * x.numerator;
        this.denominator = this.denominator * x.denominator;
        return new Solution(this.numerator, this.denominator);
    }

    /** Please pass me. */
    public Solution subtract(Solution x) {
        this.numerator = this.numerator * x.denominator - this.denominator * x.numerator;
        this.denominator = this.denominator * x.denominator;
        return new Solution(this.numerator, this.denominator);
    }

    /** Please pass me. */
    public Solution multiply(Solution x) {
        this.numerator = this.numerator * x.numerator;
        this.denominator = this.denominator * x.denominator;
        return new Solution(this.numerator, this.denominator);
    }

    /** Please pass me. */
    public Solution divide(Solution x) {
        this.numerator = this.numerator * x.denominator;
        this.denominator = this.denominator * x.numerator;
        return new Solution(this.numerator, this.denominator);
    }

    /** Please pass me. */
    public boolean equals(Object obj) {
        if (obj instanceof Solution) {
            Solution other = (Solution) obj;
            other = other.reduce();
            Solution x = new Solution(this.numerator, this.denominator);
            x = x.reduce();
            if (other.numerator == x.numerator && other.denominator == x.denominator) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Solution a = new Solution(1,0);
        System.out.println(a.getDenominator());
    }
}
