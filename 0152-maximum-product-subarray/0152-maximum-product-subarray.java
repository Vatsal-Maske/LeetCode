class Solution {
    public int maxProduct(int[] nums) {


        int n = nums.length;

        int prefix = 1;
        int sufix = 1;

        int maxValue = Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            prefix = prefix *nums[i];
            sufix = sufix*nums[n-1-i];

            maxValue = Math.max(maxValue,Math.max(prefix,sufix));

            if(prefix==0){
                prefix = 1;
            }
            if(sufix==0){
                sufix =1;
            }
        }

        return maxValue;


    }
}