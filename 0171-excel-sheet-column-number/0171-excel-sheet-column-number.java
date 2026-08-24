class Solution {

    public int titleToNumber(String columnTitle) {

        int ans = 0;
        int i = 0;

        while (i < columnTitle.length()) {

            char ch = columnTitle.charAt(i);

            ans = ans * 26 + (ch - 'A' + 1);

            i++;
        }

        return ans;
    }
}