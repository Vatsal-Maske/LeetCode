// class Solution {
//     static int solve(int sum,int target,int mat[][],int row){

//         if(row>=mat.length){

//             // jab pure rows kahatam hojaye tab pura sum ready hai or fir usko return kardena ka


//            return Math.abs(target-sum);
            
//         }


//         int min = Integer.MAX_VALUE;

//         for(int num:mat[row]){
//             int ans = solve(sum+num,target,mat,row+1);


//             min = Math.min(min,ans);
//         }

//         return min;
//     }
//     public int minimizeTheDifference(int[][] mat, int target) {
//         int row = 0;
//         int sum =0;
//         int ans =solve(sum ,target,mat,row);
//         return ans;


        
//     }
// }

class Solution {

    static int solve(int sum, int target, int mat[][], int row, int dp[][]) {

        if(row == mat.length)
            return Math.abs(target - sum);

        if(dp[row][sum] != -1)
            return dp[row][sum];

        int min = Integer.MAX_VALUE;

        for(int num : mat[row]) {
            int ans = solve(sum + num, target, mat, row + 1, dp);
            min = Math.min(min, ans);
        }

        return dp[row][sum] = min;
    }

    public int minimizeTheDifference(int[][] mat, int target) {

        int maxSum = 0;

        for(int i = 0; i < mat.length; i++) {
            int max = 0;

            for(int num : mat[i])
                max = Math.max(max, num);

            maxSum += max;
        }

        int dp[][] = new int[mat.length][maxSum + 1];

        for(int i = 0; i < mat.length; i++)
            Arrays.fill(dp[i], -1);

        return solve(0, target, mat, 0, dp);
    }
}