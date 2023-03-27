package GCD;

/**
 * Greatest Common Divisor
 */
public class Solution {
    /** initialise */
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
            System.out.println(a + " " + b + "\n");
            if (a % b == 0) {
                return b;
            }

            int c = a;
            a = b;
            b = c % b;
        }

        return b;
    }
}
