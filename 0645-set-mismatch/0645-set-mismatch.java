import java.util.HashMap;

class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        // count[i] will store the frequency of the number 'i'
        int[] count = new int[n + 1]; 

        // Step 1: Count occurrences of each number
        for (int num : nums) {
            count[num]++;
        }

        int duplicate = -1;
        int missing = -1;

        // Step 2: Look through numbers 1 to n to find the anomalies
        for (int i = 1; i <= n; i++) {
            if (count[i] == 2) {
                duplicate = i;
            } else if (count[i] == 0) {
                missing = i;
            }
        }

        return new int[]{duplicate, missing};
    }
}