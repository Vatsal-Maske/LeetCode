class Solution {
    public String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();

        solve(arr, 0, k);

        return new String(arr);
    }

    static void solve(char[] arr, int start, int k) {

        // Base case
        if (start >= arr.length) {
            return;
        }

        // Reverse first k characters
        int left = start;
        int right = Math.min(start + k - 1, arr.length - 1);

        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        // Move to next 2k block
        solve(arr, start + 2 * k, k);
    }
}