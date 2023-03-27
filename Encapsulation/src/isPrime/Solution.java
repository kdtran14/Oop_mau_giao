package isPrime;

import static java.lang.Math.sqrt;

public class Solution {

    public boolean isPrime(int n) {
        if (n < 2)
            return false;
        for (int i = 2; i <= sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 5;
        Solution x = new Solution();
        System.out.println(x.isPrime(n));
    }
}
