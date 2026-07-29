import java.util.Arrays;
class Solution {
    static boolean isValid(int position[],int m ,int maxForce){
        int n = position.length;
        int ForceCount =1;
        int prevForce =0;
        for(int i=1;i<n;i++){
            if(position[i]-position[prevForce]>=maxForce){
                ForceCount++;
                prevForce =i;
                if(ForceCount==m){
                    return true;
                }
            }
        }
        return false;

    }
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int n = position.length;
        int ans = 0;
        int start =0;
        int end = position[n-1]-position[0];
        while(start<=end){
            int mid = start+(end -start)/2;
            if(isValid(position,m,mid)){
                ans = mid;
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return ans;
    }
}