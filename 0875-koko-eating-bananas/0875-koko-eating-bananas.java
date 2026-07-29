import java.util.Arrays;

class Solution {

    static boolean isValid(int piles[], int h, int speed) {

        int time = 0;

        for(int i = 0; i < piles.length; i++) {

            if(piles[i] > speed) {

                time += piles[i] / speed;

                if(piles[i] % speed != 0) {
                    time++;
                }

            } else {
                time++;
            }

            if(time > h)
                return false;
        }

        return true;
    }


    public int minEatingSpeed(int[] piles, int h) {

        int start = 1;

        int maxPile = -1;

        for(int i=0;i<piles.length;i++){
            if(maxPile < piles[i]){
                maxPile = piles[i];
            }
        }

        int end = maxPile;

        int ans = 0;

        while(start <= end) {

            int mid = start + (end-start)/2;

            if(isValid(piles, h, mid)) {

                ans = mid;
                end = mid - 1;   // minimum speed chahiye

            } else {

                start = mid + 1; // speed badhao
            }
        }

        return ans;
    }
}