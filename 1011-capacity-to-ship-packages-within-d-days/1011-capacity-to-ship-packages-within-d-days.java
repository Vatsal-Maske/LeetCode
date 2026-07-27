class Solution {

    public boolean isValid(int[] weights, int days, int maxWeight) {

        int dayCount = 1;
        int currentWeight = 0;

        for (int i = 0; i < weights.length; i++) {

            if (currentWeight + weights[i] <= maxWeight) {
                currentWeight += weights[i];
            } else {

                dayCount++;
                currentWeight = weights[i];

                if (dayCount > days || weights[i] > maxWeight) {
                    return false;
                }
            }
        }

        return true;
    }

    public int shipWithinDays(int[] weights, int days) {

        int sum = 0;
        int max = 0;

        for (int w : weights) {
            sum += w;
            max = Math.max(max, w);
        }

        int start = max;
        int end = sum;
        int ans = -1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (isValid(weights, days, mid)) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return ans;
    }
}