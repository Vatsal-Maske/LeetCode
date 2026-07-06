import java.util.Arrays;

class Solution {
    public boolean containsDuplicate(int[] arr) {

        Arrays.sort(arr);

        int n = arr.length;
        int i = 0;
        int j = 1;

        while (j < n) {

            if (arr[i] == arr[j]) {
                return true;
            }

            i++;
            j++;
        }

        return false;
    }
}