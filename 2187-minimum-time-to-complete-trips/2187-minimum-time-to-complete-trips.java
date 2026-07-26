class Solution {

    public boolean isValid(int[] time, int totalTrips, long maxTime) {

        long tripCount = 0;
        long currentBusTrips = 0;

        for (int i = 0; i < time.length; i++) {

            currentBusTrips = maxTime / time[i];

            tripCount += currentBusTrips;

            if (tripCount >= totalTrips) {
                return true;
            }
        }

        return false;
    }

    public long minimumTime(int[] time, int totalTrips) {

        int minTime = Integer.MAX_VALUE;

        for (int t : time) {
            minTime = Math.min(minTime, t);
        }

        long start = 1;
        long end = (long) minTime * totalTrips;

        long ans = -1;

        while (start <= end) {

            long mid = start + (end - start) / 2;

            if (isValid(time, totalTrips, mid)) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return ans;
    }
}