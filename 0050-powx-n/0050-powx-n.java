class Solution {
    public double myPow(double x, int n) {
        long N = n;  // long because n can be Integer.MIN_VALUE

        if (N < 0) {
            x = 1 / x;
            N = -N;
        }

        double ans = 1;

        while (N > 0) {
            if (N % 2 == 1) {
                ans = ans * x;
            }

            x = x * x;
            N = N / 2;
        }

        return ans;
    }
}