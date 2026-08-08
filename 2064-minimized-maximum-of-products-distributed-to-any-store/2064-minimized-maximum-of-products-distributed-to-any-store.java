class Solution {
    private boolean canDistribute(int maxPerStore, int n, int[] quantities) {

        int storesNeeded = 0;

        for (int q : quantities) {
            storesNeeded += (q + maxPerStore - 1) / maxPerStore;
        }

        return storesNeeded <= n;
    }

    public int minimizedMaximum(int n, int[] quantities) {

        int low = 1;
        int high = 1;

        for (int q : quantities) {
            high = Math.max(high, q);
        }

        int ans = high;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (canDistribute(mid, n, quantities)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

}