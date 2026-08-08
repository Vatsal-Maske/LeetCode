class Solution {

    public boolean isValid(int mid, int n, int[] quantities) {

        int stores = 0;

        for (int q : quantities) {
            stores += (q + mid - 1) / mid;
        }

        return stores <= n;
    }

    public int minimizedMaximum(int n, int[] quantities) {

        int low = 1;
        int high = 0;

        for (int q : quantities) {
            high = Math.max(high, q);
        }

        int ans = high;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (isValid(mid, n, quantities)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }
}