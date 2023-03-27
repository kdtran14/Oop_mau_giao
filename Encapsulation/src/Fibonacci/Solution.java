package Fibonacci;

public class Solution {

    /**
     * Tinh so fibonacci thu n trong day.
     */
    public long fibonacci(long n) {

        if (n < 0) {
            return -1;
        } else if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            long a0 = 0;
            long a1 = 1;
            long an = 0;
            int i = 2;
            while (i <= n) {
                if (Long.MAX_VALUE - a1 < a0) {
                    return Long.MAX_VALUE;
                }
                an = a1 + a0;
                a0 = a1;
                a1 = an;
                i++;
            }
            return an;
        }
    }

    public static void main(String[] args) {
        Solution n = new Solution();
        System.out.println(n.fibonacci(100));
    }
}
