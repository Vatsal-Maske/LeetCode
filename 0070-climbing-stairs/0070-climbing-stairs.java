class Solution {
    public int climbStairs(int n) {

        // if(n<=1){
        //     return 1;
        // }if(n==2){
        //     return 2;
        // }
        // return climbStairs(n-1)+climbStairs(n-2);


        //isko dp se bad me karege

        if (n <= 2) {
            return n;
        }

        int a = 1;
        int b = 2;

        for (int i = 3; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }

        return b;


        
    }
}