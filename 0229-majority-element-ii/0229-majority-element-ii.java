class Solution {
    public List<Integer> majorityElement(int[] nums) {

        int n = nums.length;

        HashMap<Integer,Integer>freq = new HashMap<>();
        for(int num :nums){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }

        List<Integer> ans = new ArrayList<>();



        int maxFreq = n/3;

        for (int key : freq.keySet()){
            int currentKeyValue= freq.get(key);

            if(currentKeyValue>maxFreq){
               ans.add(key);
            }
        }
        return ans;

       
        
    }
}