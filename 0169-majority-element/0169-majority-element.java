class Solution {
    public int majorityElement(int[] nums) {

        int n = nums.length;
        HashMap<Integer,Integer> freq = new HashMap<>();

        for(int num: nums){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }


        int maxfreq = n/2;
        int maxFreqKey = -1;

        for(int key: freq.keySet()){
            int currentKey = key;
            int currentKeyValue = freq.get(key);

            if(currentKeyValue>maxfreq){
                maxfreq = currentKeyValue;
                maxFreqKey = currentKey;
            }

        }

        return maxFreqKey;
        
    }
}